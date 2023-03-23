package Array;

public class MySubject {
    private String name;
    private int score;

    public MySubject(String subjectName, int score) {
        this.name = subjectName;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
