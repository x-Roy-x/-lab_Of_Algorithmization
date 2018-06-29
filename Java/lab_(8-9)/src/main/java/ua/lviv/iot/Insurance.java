package ua.lviv.iot;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Insurance {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private Integer id;

    @Column
    private int age;

    @Column
    private double income;

    @Column
    private double price;

    public Insurance() {
    }

    public Insurance(Integer id, int age, double income, double price) {
        this.age = age;
        this.price = price;
        this.income = income;
        this.id = id;
    }

    @Override
    public String toString() {
        return "\n\nInsurance:" +
                "\nage = " + age +
                "\nprice = " + price +
                "\nincome = " + income;
    }

    public Integer getId() {
        return id;
    }


    public int getAge() {
        return age;
    }

    public double getIncome() {
        return income;
    }

    public double getPrice() {
        return price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}



