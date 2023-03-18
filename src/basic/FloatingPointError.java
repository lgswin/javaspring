package basic;

import java.math.BigDecimal;

public class FloatingPointError {
    public static void main(String[] args) {
        double dnum = 1;

        for(int i = 0; i<10000; i++) {
            dnum = dnum + 0.1;
        }
        System.out.println(dnum);

        // 부동소수점 해결 BigDecimal을 이용해서 계산
        // a.add(b)
        // a.subtract(b)
        // a.multiply(b);
        // a.divide(b);
        BigDecimal a = new BigDecimal("1");
        BigDecimal b = new BigDecimal("0.1");
        for (int i = 0; i < 10000; i++) {
            a = a.add(b);
        }
        System.out.println(a.add(b));
    }
}
