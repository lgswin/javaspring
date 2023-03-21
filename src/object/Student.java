package object;

public class Student {
    public int studentNumber;
    public String studenName;
    public int grade;

     public Student(int studentNumber, String studenName, int grade) {
         this.studentNumber = studentNumber;
         this.studenName = studenName;
         this.grade = grade;
     }

     public String showStudentInfo() {
         return studenName + "학생의 학번은 " + "이고 " + grade + "학년 입니다.";
     }
}
