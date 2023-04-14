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