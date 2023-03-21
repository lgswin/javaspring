package object;

public class StudentTest {
    public static void main(String[] args) {
        Student studentKim = new Student(12345, "Kim", 3);
        System.out.println(studentKim.showStudentInfo());
    }
}
