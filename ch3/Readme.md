## Spring DI 흉내내기
(변경에 유리한 코드 구성)
Main1.java
```java

class Car {}
class SportCar extends Car {}
class Truck extends Car {}
public class Main1 {
    public static void main(String[] args) throws Exception {
        Car car = getCar();
        System.out.println("car" + car);
    }

    static Car getCar() throws Exception {
        Properties p = new Properties();
        p.load(new FileReader("config.txt"));
        Class clazz = Class.forName(p.getProperty("car"));
        return (Car)clazz.newInstance();
    }
}
```
이렇게 class를 구성하고 Property  file에서 속성을 구성하면 
코드 수정없이 config.txt파일로 객체의 속성?을 변경할수 있다.
config.txt
```
car=com.fastcampus.ch3.diCopy1.Truck
```

추가 및 변경 (key값으로 범용성 확보)
```java

class Car {}
class SportCar extends Car {}
class Truck extends Car {}
class Engine{}
public class Main1 {
    public static void main(String[] args) throws Exception {
        Car car = (Car)getObject("car");
        Engine engine = (Engine)getObject("engine");
        System.out.println("car" + car);
        System.out.println("Engine" + engine);
    }

    static Object getObject(String key) throws Exception {
        Properties p = new Properties();
        p.load(new FileReader("config.txt"));
        Class clazz = Class.forName(p.getProperty(key));
        return clazz.newInstance();
    } 
```
config.txt
```
car=com.fastcampus.ch3.diCopy1.SportCar
engine=com.fastcampus.ch3.diCopy1.Engine
```

## Guava 라이브러리를 이용해서 class 자동 검색 추가 방법을 위해.<br>
Guava library import <br>
pom.xml
```xml
		<!-- https://mvnrepository.com/artifact/com.google.guava/guava -->
		<dependency>
			<groupId>com.google.guava</groupId>
			<artifactId>guava</artifactId>
			<version>31.1-jre</version>
		</dependency>
```
@Component 붙은 클래스를 찾아서 map에 저장한다.
```java
@Component class Car {}
@Component class SportCar extends Car {}
@Component class Truck extends Car {}
class Engine{}
```
```java
ClassLoader classLoader = AppContext.class.getClassLoader();
ClassPath classPath = ClassPath.from(classLoader);

Set<ClassPath.ClassInfo> set = classPath.getTopLevelClasses("com.fastcampus.ch3.diCopy3");
for (ClassPath.ClassInfo classInfo: set) {
    Class clazz = classInfo.load();
    Component component = (Component) clazz.getAnnotation(Component.class);
    if (component != null) {
        String id = StringUtils.uncapitalize(classInfo.getSimpleName());
        map.put(id, clazz.newInstance());
    }
}
```
4. 객체 찾기 - by Name, by Type
```java
    Object getBean(Class clazz) {
        for (Object obj: map.values()) {
            if (clazz.isInstance(obj))
                return obj;
        }
        return null;
    }
```
```java
Car car2 = (Car) ac.getBean(Car.class);
```

5. 객체 자동 연결하기 - @Autowired (by Type)

```java
import org.springframework.beans.factory.annotation.Autowired;

class Car {
    @Autowired Engine engine;
    @Autowired Door door;
}
```
```java
    private void doAutowireted() {
        // map에 저장된 객체에 iv중에 @Autowired가 붙어 있으면
        // map에서 iv의 타입에 맞는 객체를 찾아서 연결 (객체의 주소를 iv 저장)
        for (Object bean : map.values()) {
            for (Field fld : bean.getClass().getDeclaredFields())
                if (fld.getAnnotation(Autowired.class) != null) {
                    try {
                        fld.set(bean, getBean((fld.getType())));
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                }
        }
    }
```
5. 객체 자동연결하기 - @Resource (by Name) - Project structure -> Library -> + (java) -> Tocat > lib 추가 필요
```java
class Car {
    @Resource Engine engine; // 첫글자 소문자인 engine을 찾아 찾아지면 테이블에 저장
    @Resource Door door;
}
```
```java
class Car {
    @Resource(name="engine2") Engine engine; // 찾고 싶은 class명을 지정할수 있음
    @Resource Door door;
```
