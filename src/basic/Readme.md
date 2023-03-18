# data 표현 & 변환
   - 컴퓨터는 기본적으로 2진수로 표현
   - 그러나 사람은 10진수를 사용하므로 두 개념을 모두 이해하고 있어야 코딩이 쉬워짐
   - 까끔 16진수도 씀
   - 따러사 각 진수의 표현법과 변환법을 알아두면 좋을듯
   ``` 
    // 10진수를 2진수로 변환
    System.out.println("10진수 "+num+"을 2진수로 변환 : " + Integer.toBinaryString(num));
    // 2진수를 10진수로 변환하는 메서드
    System.out.println("2진수 1010을 10진수로 변환하려면 parseInt에 입력된 값이 2진수임을 명시하면 됨 : " +Integer.parseInt("1010", 2));
   ```
   - [Code sample](BinaryTest.java)

# data type
   - primative data type

|        | integer | string | float  | boolean |
|--------|---------|--------|--------|---------|
| 1byte  | byte    |        |        | boolean |
| 2bytes | short   | char   |        |         |
| 4bytes | int     |        | float  |         |
| 8bytes | long    |        | double |         |

  - 범위

| type  | size | range          |
|-------|------|----------------|
| byte  | 1    | -2^7 ~ 2^7-1   |
| short | 2    | -2^15 ~ 2^15-1 |
| int   | 4    | -2^31 ~ 2^31-1 |
| long  | 8    | -2^63 ~ 2^63-1 |

   - long type
```
// long 형은 l or L로 명시해줘야함
long lnumber = 12345678900l;
```

# floating point & error
![img_1.png](img_1.png)

   - 수를 (가수)×(밑수)^(지수)와 같이 유효숫자를 사용한 곱셈 형태로 표현
   - [floating point error and its solution](FloatingPointError.java)


# 지역 변수 자료형 없이 사용하기 (  자바 10 지원 됨 )
   - Local variable type inference
   - 추론 가능한 변수에 대한 자료형을 선언하지 않음
   - 한번 선언하여 추론 된 변수는 다른 타입의 값을 대입 할 수 없음
   - 지역 변수만 사용 가능
   - [Sample code](LocalVariableType.java)



