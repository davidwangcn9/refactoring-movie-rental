package cn.xpbootcamp.refactor;

import java.util.Vector;

public class Customer {

    private final String name;
    private final IFormater formater;
    private Vector<Rental> rentals = new Vector<>();

    Customer(String name, IFormater formater) {
        this.name = name;
        this.formater = formater;
    }


    public Vector<Rental> getRentals() {
        return rentals;
    }

    void addRental(Rental rental) {
        rentals.addElement(rental);
    }

    public String getName() {
        return name;
    }

    String statement() {
        return formater.getStatement(this);
    }

}
