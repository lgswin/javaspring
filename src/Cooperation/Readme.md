# 객체의 협력관계 (cooperation)
- Bus : 번호, 승객수, 수입, take(money)를 받고 승객수와 수입을 관리
- Subway : 라인넘버, 승객수, 수입, take(money)를 받고 승객수와 수입을 관리
- Student : 이름, money를 가지고 takeBus(bus), takeSubway(subway)를 타서 money가 줄어든다.
- 이렇게 각각의 객체는 각의 역할만 자기고 서로 매개변수를 전달하면서 서로 상호작용하도록 코딩함
- [Bus.java](Bus.java)
- [Subway.java](Subway.java)
- [Student.java](Student.java)
- [TakeTransTest.java](TakeTransTest.java)

# 객체협력 복습
- 앞의 예제에서 Edward는 지각을 해서 택시를 타야 했습니다.
- 20000원을 가지고 있었는데 10000원을 택시비로 사용했습니다.
- 택시는 '잘나간다 운수' 회사 택시를 탔습니다.
- Edward님의 남은 돈은 10000원 입니다.
- 잘간다 운수택시 수입은 10000원 입니다.
- [People.java](People.java)
- [Taxi.java](Taxi.java)
- [CommuteTest.java](CommuteTest.java)