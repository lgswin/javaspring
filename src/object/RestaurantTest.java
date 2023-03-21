package object;

public class RestaurantTest {
    public static void main(String[] args) {
        Restaurant order = new Restaurant("202011020003", "01023450001", "서울시 강남구 역삼동 111-333",
                "20201102", "130258", 35000, "0003");
        order.showOrderDetail();
    }
}
