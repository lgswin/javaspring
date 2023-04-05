package ObjectInheritance;

public class CustomerTest {
    public static void main(String[] args) {
        // child class가 생성될때 자동으로 parent class의 constructor가 자동으로 호출된다.
        // 만약 default constructor가 없다면 명시적으로 호출해주어야한다.
        Customer customerlee = new Customer(100100, "이순신");
//        customerlee.setCustomerName("이순신");
//        customerlee.setCustomerID(100100);
        customerlee.bonusPoint = 1000;
        System.out.println(customerlee.showCustomerInfo());

        VIPCustomer customerkim = new VIPCustomer(100200, "김유신");
//        customerkim.setCustomerName("김유신");
//        customerkim.setCustomerID(100200);
        customerkim.bonusPoint = 10000;
        System.out.println(customerkim.showCustomerInfo());

        // Parent로는 묵시적 형변환 가능
        // 그러나 결국 접근가능한 member는 Parent 의 member만 가능
        // method는 child 가능
        Customer vc = new VIPCustomer(1234, "For upCasting");
    }
}
