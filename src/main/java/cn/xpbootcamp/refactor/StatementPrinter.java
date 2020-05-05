package cn.xpbootcamp.refactor;

import java.util.Enumeration;

public class StatementPrinter implements IPrinter {

    @Override
    public String getStatement(Customer customer) {
        double totalAmount = 0d;
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = customer.getRentals().elements();
        StringBuilder result = new StringBuilder("Rental Record for " + customer.getName() + "：\n");

        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();
            result.append("\t")
                    .append(each.getMovie().getTitle())
                    .append("\t")
                    .append(each.getAmount()).append("\n");
            totalAmount += each.getAmount();
            frequentRenterPoints += each.getCredit();
        }
        //add footer lines
        result.append("Amount owed is ").append(totalAmount).append("\n");
        result.append("You earned ").append(frequentRenterPoints).append(" frequent renter points");

        return result.toString();
    }
}
