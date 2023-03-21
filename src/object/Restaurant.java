package object;

public class Restaurant {
    public String orderNumber;
    public String phoneNumber;
    public String orderAddress;
    public String orderDate;
    public String orderTime;
    public int orderPrice;
    public String menuId;

    public Restaurant(String orderNumber, String phoneNumber, String orderAddress, String orderDate, String orderTime, int orderPrice, String menuId) {
        this.orderNumber = orderNumber;
        this.phoneNumber = phoneNumber;
        this.orderAddress = orderAddress;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.menuId = menuId;
    }

    public void showOrderDetail() {
        System.out.println("주문 접수 번호 : " + this.orderNumber);
        System.out.println("주문 핸드폰 번호 : " + this.phoneNumber);
        System.out.println("주문 집 주소 : " + this.orderAddress);
        System.out.println("주문 날짜 : " + this.orderDate);
        System.out.println("주문 시간 : " + this.orderTime);
        System.out.println("주문 가격 : " + this.orderPrice);
        System.out.println("메뉴 번호 : " + this.menuId);
    }
}
