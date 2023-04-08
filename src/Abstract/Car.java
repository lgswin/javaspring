package Abstract;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void startCar() {
        System.out.println("시동을 겁니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    // abstract가 아니지만 재정의를 위해서 빈 method로 추가할수 있다.
    public void wash() {

    }
    public void run() {
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
        wash();
    }
}
