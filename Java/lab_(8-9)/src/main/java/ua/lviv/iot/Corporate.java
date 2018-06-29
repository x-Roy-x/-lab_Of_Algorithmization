package ua.lviv.iot;

public class Corporate extends Insurance {
    private int quantityPerson;

    public Corporate(Integer id, int quantityPerson,int age, double income, double price) {
      super(id,  age, income, price);
        this.quantityPerson = quantityPerson;
    }

    @Override
    public String toString() {
        return "\n\nApartment:" +
                "\nquantityPerson = " + quantityPerson +
                "\nage = " +super.getAge() +
                "\nprice = " + super.getPrice() +
                "\nincome = " + super.getIncome();
    }

    public int getQuantityPerson() {
        return quantityPerson;
    }

    public void setQuantityPerson(int quantityPerson) {
        this.quantityPerson = quantityPerson;
    }
}
