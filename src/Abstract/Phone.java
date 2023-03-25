package Abstract;

public class Phone {

    // 필드(멤버변수), 외부로부터 접근을 못하게 막는다.
    private String model;
    private String color;
    private String company;

    public Phone(String model, String color, String company) {
        this.model = model;
        this.color = color;
        this.company = company;
    }

    //  getter mothod 제공
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        String str = "model : " + this.getModel() + " , color : " + this.getColor() + ", company : " + this.getCompany();
        return str;
    }
}
