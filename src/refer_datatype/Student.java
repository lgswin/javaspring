package refer_datatype;

public class Student {
    int studentId;
    String studentName;

    Subject korea;
    Subject math;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String name, int score) {
        korea.subjectname = name;
        korea.score = score;
    }

    public void setMathSubject(String name, int score) {
        math.subjectname = name;
        math.score = score;
    }

    public void showScore() {
        int total = korea.score + math.score;

        System.out.println(this.studentName + "님의 총점은 " + total + "입니다.");
    }
}
