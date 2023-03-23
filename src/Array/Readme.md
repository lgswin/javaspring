# 객체 배열
- 객체의 생성 (배열 선언과 별도로 실제 객체는 각각 생성해주어야함)
```
Book[] library = new Book[5]; // 객체배열만 메모리 영역에 생성

// 실제 객체의 생성
library[0] = new Book("태백산맥1", "조정래");
library[1] = new Book("태백산맥2", "조정래");
library[2] = new Book("태백산맥3", "조정래");
library[3] = new Book("태백산맥4", "조정래");
library[4] = new Book("태백산맥5", "조정래");
```

- 객체의 복사
1) 객체의 주소만 복사하는 경우 : 참조하는 다른 인스턴스에서 값을 변경하면 같이 영향을 받음
- [Book.java](Book.java)
- [BookTest.java](BookTest.java)
2) 객체를 새로 생성하여 복사 (깊은 복사)
- [ObjectCopyTest.java](ObjectCopyTest.java)

## ArrayList
- ArrayList에서 제공하는 api들을 이용해서 간단히 객체 배열을 관리할 수 있다.
```java
ArrayList<Book> library = new ArrayList<>();
library.add(new Book("태백산맥1", "조정래"));
library.add(new Book("태백산맥2", "조정래"));
library.add(new Book("태백산맥3", "조정래"));
library.add(new Book("태백산맥4", "조정래"));
library.add(new Book("태백산맥5", "조정래"));
```
- [ArrayListTest.java](ArrayListTest.java)
- 
- ArrayList 예제
```
1001학번 Lee와 1002학번 Kim, 두 학생이 있습니다.
Lee 학생은 국어와 수학 2과목을 수강했고, Kim학생은 국어, 수학, 영어 3과목을 수강했습니다.
Lee 학생은 국어 100점, 수학 50점 입니다.
Kim 학생은 국어 70점, 수학 85점, 영어 100점입니다.
Student와 Subject 클래스를 만들고 ArrayList를 활용하여 두 학생의 과목 성적과 총점을 출력하세요.
```
- [MyStudent.java](MyStudent.java)
- [MySubject.java](MySubject.java)
- [StudentTest.java](StudentTest.java)