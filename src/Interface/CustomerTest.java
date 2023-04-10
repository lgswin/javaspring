package Interface;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.hello();

        Buy buyer = customer; // 상위 class로 묵시적 형변환
        buyer.buy();;
        buyer.order();

        Sell seller = customer;
        seller.sell();
        seller.order();
    }
}
