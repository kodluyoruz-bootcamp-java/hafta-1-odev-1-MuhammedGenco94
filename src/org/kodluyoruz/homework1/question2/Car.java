package org.kodluyoruz.homework1.question2;
/*
    2- 	Bir araba nesnesi oluşturup
	    bu arabaya ait özellikleri
	    kurucu methodlar sayesinde
	    tanımlayabildiğimiz bir sınıf yazınız.
*/
public class Car {
    private String brand;
    private String model;
    private String color;

    public Car() {
    }

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
