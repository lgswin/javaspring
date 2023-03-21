package Cooperation;

public class CommuteTest {
    public static void main(String[] args) {
        People people = new People("Edward", 20000);
        Taxi taxi = new Taxi("잘 간다", 0);

        people.takeTaxi(taxi);
        people.showInfo();
        taxi.showInfo();
    }
}
