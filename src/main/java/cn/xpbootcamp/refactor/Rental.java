package cn.xpbootcamp.refactor;

import cn.xpbootcamp.refactor.movies.Movie;

public class Rental {

    private Movie movie;
    private int daysRented;

    Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    double getAmount() {
        return movie.calculateCharging(daysRented);
    }

    int getCredit() {
        return movie.calculateCredit(daysRented);
    }

    Movie getMovie() {
        return movie;
    }

    int getDaysRented() {
        return daysRented;
    }

}
