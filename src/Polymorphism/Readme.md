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