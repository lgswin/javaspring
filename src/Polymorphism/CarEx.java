package Polymorphism;

public class CarEx {
    public static void main(String[] args) {
        Car car = null;
        SportCar sportCar = new SportCar();
        SportCar sportCar1 = null;
        PoliceCar policeCar = new PoliceCar();

        sportCar.speedUp();
        car = sportCar; // up-casting (자손 -> 조상), 조작할수 있는 멤버가 줄어든다.
        //  car.speedUp(); // up-casting되어 멤버가 줄어들기때문에 speedUp이 없어짐.
        // 다운캐스팅할 때, 명시적으로 형변환 코드를 작성해야한다.
        sportCar1 = (SportCar)car; // down-casting (조상 -> 자손 ), 조작할수 있는 멤버가 늘어난다.
        sportCar1.speedUp(); // SportCar에는 speedUp()을 지원하므로 사용 가능

        // 아래 코드는 서로 상속관계가 아니기때문에 형변환이 절대 이루어지지 않음.
        // sportCar = (SportCar)policeCar; // 자손끼리는 캐스팅이 불가하다,
    }
}
