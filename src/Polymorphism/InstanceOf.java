package Polymorphism;

public class InstanceOf {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar();

        // 상속계층도 : Object <- Car <- SportCar
        if (sportCar instanceof SportCar) {
            System.out.println("SportCar로 타입변환이 가능합니다.");
        }

        if (sportCar instanceof Car) {
            System.out.println("Car 로 타입변환이 가능합니다.");
        }

        if (sportCar instanceof Object) {
            System.out.println("Object 로 타입변환이 가능합니다.");
        }
        // instanceof연산자의 결과가 true라는 것은 실제 형변환이 가능하다는 것을 의미하며,
        // 아울러 상속관계에 있는 것이다.
    }
}
