# 다형성(Polymorphism)
- 하나의 참조변수로 여러 타입의 객체를 참조할 수 있는것, 조상의 참조변수로 자손의 타입의 객체를 다를수 있는것!

```java
import com.sun.jdi.connect.spi.TransportService;

class TV {
    1;
    2;
    3;
    4;
}

class CaptionTV extends TV {
    5;
    6;
}

TV t = new TV();
CaptionTV c = new CaptionTV();

TV t = new CaptionTV();
```
- 다형성의 가치 : 다양한 매개변수가 필요한 메서드를 효율적으로 구현할수 있다.  다양한 제품이 입력될때 Product 참조변수 하나로 대체 가능
- 조상타입의 참조변수는 자손 타입을 다룰 수는 있지만 절대 근본(자신의 타입)은 벗어나지 못한다.
- TV t는 멤버변수가 4개, Caption c는 매개변수 6개
- 자손클래스의 메서드가 오버라이딩 된다면 오버라이딩된 메서드가 호출된다.
- [PlayerEx.java](PlayerEx.java)
- [Player.java](Player.java)
- [Striker.java](Striker.java)
- [MidFielder.java](MidFielder.java)
- [Defender.java](Defender.java)

### 다형성으로인한 형변환
- 형변환의 전제조건 : 상속, 구현관계에 있는 것만 객체타입 변환이 가능
- 자손 타입ㅁ에서 조상타입으로 형변환은 생략가능하지만, 반대는 명시적 형변환을 반드시 해야한다.
```java
자손타입 -> 조상타입 (up-casting) : 형변환 생략가능 (조작 멤버갯수가 줄어듬)
자손타입 <- 조상타입 (down-casting) : 형변환 생략불가 (조작 멤버갯수가 많아짐)
자손끼리는 casting 안됨!
```

### instanceof 연산자
- 참조변수가 참조하는 인스턴스의 실제 타입을 체크하는데 사용한다.
- 이항연산자, 연산결과는 boolean값이 된다.
- instanceof의 연산결과가 true이면, 해당 타입으로 형변환이 가능하다.
```java
SportCar sportCar = new SportCar();

if (sportCar instanceof SportCar) {
    System.out.println("SportCar로 타입변환이 가능합니다."
}
if (sportCar instanceof Car) {
System.out.println("Car로 타입변환이 가능합니다."
}
if (sportCar instanceof Object) {
System.out.println("Object로 타입변환이 가능합니다."
}
if (sportCar instanceof PoliceCar) {
System.out.println("PoliceCar로 타입변환이 가능합니다."
}
```
- instanceof 연산자는 실제 형변환이 가능한지 알아볼때  쓰는것이 유용하다.



