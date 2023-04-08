package Abstract;

public class CarTest {
    public static void main(String[] args) {
        Car aicar = new AICar();
        aicar.run();

        System.out.println();
        Car mcar = new ManualCar();
        mcar.run();
    }
}
