package basic;

import java.math.BigDecimal;

public class LocalVariableType {
    public static void main(String[] args) {

        var i = 10;
        var j = 10.0;
        var str = "hello";
        var bl = true;
        var ccc = 2147483647; // 이 숫자까지 오류 없음;;
        var ddd = 10.0000000111;
        BigDecimal ddd1 = new BigDecimal(ddd);

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);
        System.out.println(bl);
        System.out.println(ccc);
        System.out.println(ddd); // 역시 부동소수점 오류 발생
        System.out.println(ddd1); // BigDecimal도 정확한 값을 표현해주는것은 아님, 추가 확인 필요

        str = "test";
        //str = 3; // 다른 타입으로 변경할 수 없음!
    }

}
