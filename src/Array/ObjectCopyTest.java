package Array;

public class ObjectCopyTest {
    public static void main(String[] args) {
        Book[] library = new Book[5]; // 객체배열만 메모리 영역에 생성
        Book[] copyLibrary = new Book[5];
        // 실제 객체의 생성
        library[0] = new Book("태백산맥1", "조정래");
        library[1] = new Book("태백산맥2", "조정래");
        library[2] = new Book("태백산맥3", "조정래");
        library[3] = new Book("태백산맥4", "조정래");
        library[4] = new Book("태백산맥5", "조정래");

        // 복사할 객체를 별도로 다 생성해줌
        copyLibrary[0] = new Book();
        copyLibrary[1] = new Book();
        copyLibrary[2] = new Book();
        copyLibrary[3] = new Book();
        copyLibrary[4] = new Book();

        // 새로 생성된 객체(주소)에 따로 따로 값을 복사해줌
        for (int i = 0; i < library.length; i++) {
            copyLibrary[i].setAuthor(library[i].getAuthor());
            copyLibrary[i].setTitle(library[i].getTitle());
        }
        // 이렇게 생성된 객체는 다른쪽에 영향을 주지 않음.
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
