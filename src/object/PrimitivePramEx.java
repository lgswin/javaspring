package object;

class A {
    int data;
}
public class PrimitivePramEx {
    public static void main(String[] args) {
        A a = new A();
        a.data = 77;
        System.out.println("main method 내 data 값 : " + a.data);
        // 아래 메서드 호출은 실제 값을 넘기고 있다. (call by value)
        // 즉, dataChange(int data)의 매개변수로 복사가 되어 지고 있다.
        PrimitivePramEx.dataChange(a.data);
        System.out.println("dataChange()호출 후 ");
        System.out.println("main() 메서드 내 data 값 : " + a.data);
    }

    private static void dataChange(int data) {
        data = 44; // main 에서 넘겨준 a.data 에는 영향이 없음.
        System.out.println("dataChange() 메서드 내 data값 : " + data);
    }
}
