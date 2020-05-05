package cn.xpbootcamp.refactor.movies;

public abstract class Movie {
    private String title;

    public String getTitle() {
        return title;
    }

    public abstract double calculateCharging(int rentDays);

    public abstract int calculateCredit(int rentDays);

    public Movie(String title) {
        this.title = title;
    }
}
