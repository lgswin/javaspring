
# 1. Modifier
### - 개념 
#### * 클래스, 멤버변수, 생성자, 메서드의 선언부에 사용, 부가적 의미 부여
### - 종류
#### * 접근제어자 : public, protected, default, private (정보은닉)
#### * 기타제어자 : static, final, abstract, synchronized, transient

* private : 같은 클래스 내에서만 접근 가능
* default : 클래스를 선언할 때, public을 생략한 경우, 다른 패키지에서는 사용 불가
* protected : 같은 패키지에서만 접근가능, 상속 받지 않은 클래스도 접근 가능함. 단 다른 패키지에서는 접근 불가함
* public : 어떤 클래스든 접근 가능(다른 개발자가 사용하도록 라이브러리 클래스 만들때 유용)

- [Birthday.java](Birthday.java)
- [BirthdayTest.java](BirthdayTest.java)


# 2. Encapsulation
- 꼭 필요한 정보와 기능만 외부에 오픈
- 대부분의 멤버 변수와 메서드를 감추고 외부에 통합된 인터페이스만을 제공하여 일관된 기능을 구현
- 각가의 메서드나 멤버 변수를 접근함으로써 발생하는 오류 최소화

- [MakeReport.java](MakeReport.java)
- [MakeReportTest.java](MakeReportTest.java)
