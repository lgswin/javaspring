package object01;

public class Birthday {
    // 외부에서 함부러 접근하거나 제어하면 안되는 값들은
    // private으로 내부에서만 변경할 수 있도록 숨김
    private int day;
    private int month;
    private int year;
    private boolean isValid;

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12)
            isValid = false;
        else
            isValid = true;

        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showDate() {
        if (isValid) {
            System.out.println(this.year + "년 "  + this.month + "월 " + this.day + "일 입니다.");
        }
        else {
            System.out.println("유효하지 않은 날짜입니다.");
        }
    }
}
