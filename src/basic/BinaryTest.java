package basic;

public class BinaryTest {
    public static void main(String[] args) {
        int num = 10;
        int bNum = 0B1010;
        int oNum = 012;
        int xNum = 0XA;

        System.out.println(num);
        System.out.println(bNum);
        System.out.println(oNum);
        System.out.println(xNum);

        // 10진수를 2진수로 변환
        System.out.println("10진수 "+num+"을 2진수로 변환 : " + Integer.toBinaryString(num));
        // 2진수를 10진수로 변환하는 메서드
        System.out.println("2진수 1010을 10진수로 변환하려면 parseInt에 입력된 값이 2진수임을 명시하면 됨 : " +Integer.parseInt("1010", 2));

        // 10진수를 8진수로 변환
        System.out.println(Integer.toOctalString(num));
        // 8진수를 10진수로 변환
        System.out.println(Integer.parseInt("012", 8));

        // 10진수를 16진수로 변환
        System.out.println(Integer.toHexString(num));
        // 16진수를 10진수로 변환
        System.out.println(Integer.parseInt("A", 16));

    }
}
