package StaticVariables;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        // static으로 선언된 같은 인스턴스를 받아온것이기때문에 같은 주소가 반환된다.
        System.out.println(company1);
        System.out.println(company2);

        // Calendar 객체가 싱글턴의 예임.
        Calendar cal = Calendar.getInstance();
    }
}
