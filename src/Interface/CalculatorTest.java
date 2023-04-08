package Interface;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        Calc calc = new CompleteCalc(); // type 상속?
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));

        // CompleteCalc로 선언되어 있으면 showInfo()까지 호출할수 있다.
        CompleteCalc calc2 = new CompleteCalc();
        calc2.showInfo();
    }
}
