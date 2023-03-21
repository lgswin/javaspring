package Cooperation;

public class TakeTransTest {
    public static void main(String[] args) {
        Student stJ = new Student("James", 5000);
        Student stT = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);
        stJ.takeBus(bus100);
        // James는 버스 100번을 타고 1000원을 냄

        Subway greenSubway = new Subway(2);
        stT.takeSubway(greenSubway);
        // Tomas는 2호선 지하철을 타고 1200원을 냄

        stJ.showInfo();
        stT.showInfo();

        bus100.showBusinfo();
        greenSubway.showBusinfo();
    }
}
