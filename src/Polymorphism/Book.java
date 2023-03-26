package Polymorphism;

public class Book extends NewProduct{

    private int ISBN;
    private String title;
    private String author;

    public Book(int productID, String description, String maker, int price, int ISBN, String title, String author) {
        super(productID, description, maker, price);
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void showInfo() {
        super.showInfo(); // to call the parent call method
        System.out.println("ISBN >>  " + this.getISBN());
        System.out.println("Book title >>  "+ this.getTitle());
        System.out.println("Author >> " + this.getAuthor());
    }
}
