# Java의 객체

## 1. java 메모리에 클래스가 로드되는 순서
   1) 클래스가 메모리로 로드되어 클래즈(clazz)
       형태로 static영역에 위치<br>
       [ 클래즈의 구성요소 : 필드, 생성자, 메소드 ]
   2) 클래즈의 생성자(new연산자 활용)로부터
      인스턴스를 heap에 생성<br>
      [ 인스턴스의 요소 : 클래스, 필드 (메소드 없음!) ] <br>
         이때 필드는 주로 은닉화 처리 → 접근 불가능<br>
         따라서 인스턴스가 접근가능한 부분은 오직<br>
         클래스(클래스의 생성자로부터 호출된 것)<br>
   3) 인스턴스의 필드와 메소드를 변경 및 실행<br>
      하기 위해 stack영역에 참조변수 생성<br>
      참조변수는 Heap의 필드에 접근할 수 없기에 클래스에 접근!<br>
      클래스로 static메소드를 호출하여 명령을 실행하고 필드변경도 가능<br>

## 2. java 변수의 범위
| 종류                | 선언위치   | 생성시기                                                         |
|-------------------|--------|--------------------------------------------------------------|
| 클래스, 정적(static)변수 | 클래스 영역 | 클래스가 메모리에 올라갈때<br/>(인스턴스 생성하지 않아도 사용 가능                      |
| 인스턴스 변수           | 클래스 영역 | 무조건, new 연사자로 인스턴스 생성시                                       |
| 지역 변수             | 메서드 영역 | 메서드가 호출될때, 생겨나고 메서드 종료시 소멸됨<br/>(초기화가 반드시 필요함, static변수 사용못함 |

## 3. JVM 메모리 구조
| Method area<br/>(클래스)             |
|-----------------------------------|
| Call stack<br/>(main)             |
| Heap<br/>(instance, instance,..)_ |

## 4. call by value, call by reference
   1) call by value : read only
      - 메서드 호출시 매개변수로 넘겨주는 값, 지역변수로 복사
      - 수정을 해도 호출한 메서드의 값에는 전혀 영향이 없다.
      - [sample code](PrimitivePramEx.java)
   2) call by reference : read & write
      - 메서드 호출시에 매개변수로 넘겨주는 주소값
      - 호출된 메서드에서 수정하면 호출된 메서드의 값에도 직접적인 영향
      - [sample code](CallbyReference.java)
   
## 객체 02-08 복습 및 숙제 
   - [Student.java](Student.java)
   - [StudentTest.java](StudentTest.java)
   - [Person.java](Person.java)
   - [PersonTest.java](PersonTest.java)
   - [Restaurant.java](Restaurant.java)
   - [RestaurantTest.java](RestaurantTest.java)

