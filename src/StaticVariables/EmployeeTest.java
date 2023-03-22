package StaticVariables;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("이순신");

        System.out.println(employee1.serialNum);
        Employee employee2 = new Employee();
        employee2.setName("김유신");
        employee2.serialNum++;

        System.out.println(employee1.serialNum);
        System.out.println(employee2.serialNum);
    }
}
