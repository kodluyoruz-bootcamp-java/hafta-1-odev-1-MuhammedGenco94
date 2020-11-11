package org.kodluyoruz.homework1.question2;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car("Mercedes", "2010", "Black");
        System.out.println("My car Properties: ");
        System.out.printf("Brand: %s, Model: %s, Color: %s\n", myCar.getBrand(), myCar.getModel(), myCar.getColor());

        Car myNewCar = new Car();
        myNewCar.setBrand("BMW");
        myNewCar.setModel("2015");
        myNewCar.setColor("Blue");
        System.out.println("My car Properties: ");
        System.out.printf("Brand: %s, Model: %s, Color: %s\n", myNewCar.getBrand(), myNewCar.getModel(), myNewCar.getColor());
    }
}
