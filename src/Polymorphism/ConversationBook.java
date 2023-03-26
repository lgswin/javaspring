package Polymorphism;

public class ConversationBook extends Book{

    private String language;

    public ConversationBook(int productID, String description, String maker, int price, int ISBN, String title, String author, String language) {
        super(productID, description, maker, price, ISBN, title, author);
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Language >> " + this.getLanguage());
    }
}
