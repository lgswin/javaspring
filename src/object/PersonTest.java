package object;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("Tomas", 180, 78, 37, "남성");
        System.out.println(person.showPersonInfo());
    }
}
