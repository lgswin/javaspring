package object;

public class Person {
    public String name;
    public int height;
    public int weight;
    public int age;
    public String gender;

    public Person(String name, int height, int weight, int age, String gender) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
    }

    public String showPersonInfo() {
        return "키가 " + this.height + " 이고 몸무게가 " + this.weight + " 킬로인 " + this.gender + "이 있습니다. "
                + "이름은 " + this.name + " 이고 나이는 " +this.age+ "세 입니다.";
    }
}
