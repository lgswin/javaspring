package object;

class B {
    int data;
}
public class CallbyReference {
    public static void main(String[] args) {
        B b = new B();
        b.data = 77;
        System.out.println("main method 내 data 값 : " + b.data);
        // 아래 메서드 호출은 인스턴스의 주소 값을 넘기고 있다. (call by reference)
        // 즉, dataChange(b)의 매개변수로 주소값이 넘어가고 있다.
        CallbyReference.dataChange(b);
        System.out.println("dataChange()호출 후 ");
        System.out.println("main() 메서드 내 data 값 : " + b.data);
    }

    private static void dataChange(B b) {
        b.data = 44; // 해당 주소의 값을 바꾸므로 인스턴스의 값이 바뀜
        System.out.println("dataChange() 메서드 내 data값 : " + b.data);
    }
}
