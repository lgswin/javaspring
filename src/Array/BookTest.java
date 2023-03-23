package Array;

public class BookTest {
    public static void main(String[] args) {
        Book[] library = new Book[5]; // 객체배열만 메모리 영역에 생성
        Book[] copyLibrary = new Book[5];
        // 실제 객체의 생성
        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        // 객체의 주소만 복사하는 것임
        System.arraycopy(library, 0, copyLibrary, 0, 5);
        System.out.println("=== library ===");
        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("=== copy library ===");
        for (Book book : copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }

        // 그래서 이렇게 어디 한쪽에서 변경을 하면 같은 주소의 각각의 객체가 다 영향을 받음.
        library[0].setAuthor("박완서");
        library[0].setTitle("나목");

        System.out.println("=== library ===");
        for (Book book : library) {
            System.out.println(book);
            book.showInfo();
        }

        System.out.println("=== copy library ===");
        for (Book book : copyLibrary) {
            System.out.println(book);
            book.showInfo();
        }
    }
}
