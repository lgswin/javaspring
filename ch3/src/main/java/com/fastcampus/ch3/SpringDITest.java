//package com.fastcampus.ch3;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.GenericXmlApplicationContext;
//
//import java.util.Arrays;
//
//class Car{
//    String color;
//    int oil;
//    Engine engine;
//    Door[] doors;
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public void setOil(int oil) {
//        this.oil = oil;
//    }
//
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }
//
//    public void setDoors(Door[] doors) {
//        this.doors = doors;
//    }
//
//    @Override
//    public String toString() {
//        return "Car{" +
//                "color='" + color + '\'' +
//                ", oil=" + oil +
//                ", engine=" + engine +
//                ", doors=" + Arrays.toString(doors) +
//                '}';
//    }
//}
//class Engine{}
//class Door{}
//
//public class SpringDITest {
//    public static void main(String[] args) {
//        ApplicationContext ac = new GenericXmlApplicationContext("config.xml");
//        Car car = (Car) ac.getBean("car"); // by name
//        Engine engine = (Engine) ac.getBean("engine"); // by name
//        Door door = (Door) ac.getBean("door"); // by name
//        Car car2 = (Car) ac.getBean(Car.class); // by type
//
//        System.out.println("car = " + car);
//        System.out.println("engine = " + engine);
//        System.out.println("door = " + door);
//        System.out.println("car2 = " + car2);
//
//        car.setColor("red");
//        car.setOil(100);
//        car.setEngine(engine);
//        car.setDoors(new Door[] {ac.getBean("door", Door.class), (Door)ac.getBean("door")});
//        System.out.println("car = " + car);
//
//    }
//}
