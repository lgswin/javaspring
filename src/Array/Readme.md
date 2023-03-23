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