package Array;

import java.util.ArrayList;

public class MyStudent {
    private int studentId;
    private String name;
    ArrayList<MySubject> subject = new ArrayList<>();
    private int total=0;

    public MyStudent(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void addSubject(String subjectName, int score) {
        this.subject.add(new MySubject(subjectName, score));
        this.total += score;
    }

    public void showStudentInfo() {
        for (int i = 0; i < this.subject.size(); i++) {
            System.out.println("학생 " + this.name + "의 "
                    + this.subject.get(i).getName() + " 과목 성적은 "
                    + this.subject.get(i).getScore() + "입니다.");
        }
        System.out.println("학생 " + this.name + "의 총점은 " + total + " 입니다.");
    }
}
