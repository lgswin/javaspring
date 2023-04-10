package Interface;

public interface Buy {
    void buy();

    default void order() {
        System.out.println("Buy order");
    }
}
