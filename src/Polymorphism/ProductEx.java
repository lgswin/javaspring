package Polymorphism;

import java.util.Scanner;

public class ProductEx {

    static int productID = 0;
    static int numberOfProduct = 0;
    static NewProduct[] p = new NewProduct[10];

    static Scanner sin = new Scanner(System.in);
    public static void main(String[] args) {

        int choice = 0;

        while (choice != 3) {
            int type = 0;
            System.out.println("Product Searching...");
            System.out.print("Add product(1), Search product(2), End(3) >>  ");
            choice = sin.nextInt();

            switch (choice) {
            case 1 :
                if (numberOfProduct >= p.length)
                {
                    System.out.println("No more products can be added!");
                    break;
                }
                System.out.print("Book(1), Music CD(2), Conversation Book(3) >> ");
                type = sin.nextInt();
                if (type < 1 || type > 3) {
                    System.out.println("Input Error!");
                    break;
                }
                addProduct(type);
                break;

            case 2:
                for (int i = 0; i < numberOfProduct; i++) {
                    p[i].showInfo();
                }
                break;

            case 3 :
                System.out.println("End programe");
                break;
            }
        }

        sin.close();
    }

    private static void addProduct(int type) {
        sin.nextLine(); // Enter 키 버퍼를 비워주기위해
        System.out.print("Input Product detail >> ");
        String desc = sin.nextLine();
        System.out.print("Producer >> ");
        String maker = sin.nextLine();
        System.out.print("Price >> ");
        int price = sin.nextInt();
        sin.nextLine(); // Enter 키 버퍼를 비워주기위해

        switch (type) {
            case 1:
                System.out.print("Normal book title >> ");
                String title = sin.nextLine();
                System.out.print("Author >> ");
                String author = sin.nextLine();
                System.out.print("ISBN >> ");
                int isbn = sin.nextInt();
                // 필드의 다형성(조상객체배열에 자손의 인스턴스를 붙이고 있다)
                p[numberOfProduct] = new Book(productID++, desc, maker, price, isbn, title, author);
                break;
            case 2:
                System.out.print("Album title >> ");
                String albumTitle = sin.nextLine();
                System.out.print("Artist >> ");
                String artist = sin.nextLine();
                // 필드의 다형성(조상객체배열에 자손의 인스턴스를 붙이고 있다)
                p[numberOfProduct] = new CompactDisk(productID++, desc, maker, price, albumTitle,artist);
                break;
            case 3:
                System.out.print("Book title >> ");
                String bookTitle = sin.nextLine();
                System.out.print("Author >> ");
                String author2 = sin.nextLine();
                System.out.print("Language >> ");
                String language = sin.nextLine();
                System.out.print("ISBN >> ");
                int isbn2 = sin.nextInt();
                // 필드의 다형성(조상객체배열에 자손의 인스턴스를 붙이고 있다)
                p[numberOfProduct] = new ConversationBook(productID++, desc, maker, price, isbn2, bookTitle, author2, language);
                break;
        }
        numberOfProduct++;
    }
}
