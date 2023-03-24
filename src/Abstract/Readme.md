# abstract
- class 앞 : class 내에 추상 메서드가 존재함을 의미
- method 앞 : 선언부만 존재하고 구현부가 없는 추상 메서드를 의미
```
abstract class Car {
    public abstract void method();
}
```
- 추상 클래스는 실제 구현부가 될 곳에서 상속받아 각 메서드를 오버라이딩해서 구현해주기 위한것
- abstract class는 인스턴스를 생성할 수 없다.
- abstract class는 상속에 의해 완성되지어야지만 인스턴스를 생성하여 사용할수 있다.

# access modifier
### &nbsp;&nbsp;&nbsp;- &nbsp;사용하는 이유 : 외부로부터 데이터를 보호하기위하여, 외부에서 불필요한 접근, 내부적으로만 사용되는 부분을 감추기위해서.(getter,setter로 제공)
- class, 멤버변수, method, contructor에서 사용
- private : 같은 클래스 내에서만 접근 가능
- default : 클래스 선언할때, public 을 생략한 경우, 다른 패키지에서 사용 불가
- protected : 같은 패키지 내 자손 클래스에서만 접근 가능
- public : 어떤 클래스든 접근 가능 (다른 개발자가 사용할수 있도록 라이브러리 클래스 만들때 유용함)

