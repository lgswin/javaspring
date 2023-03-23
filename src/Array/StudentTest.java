package Array;

import Cooperation.Student;

public class StudentTest {
    public static void main(String[] args) {
        MyStudent studentLee = new MyStudent(1001, "Lee");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 50);

        MyStudent studentKim = new MyStudent(1002, "Kim");
        studentKim.addSubject("국어", 70);
        studentKim.addSubject("수학", 85);
        studentKim.addSubject("영어", 100);

        studentLee.showStudentInfo();
        System.out.println("================================");
        studentKim.showStudentInfo();
    }
}
