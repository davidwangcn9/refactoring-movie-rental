package cn.xpbootcamp.refactor.movies;

public class CampusMovie extends Movie {

    @Override
    public double calculateCharging(int rentDays) {
        double totalCharging = 1.5;
        if (rentDays > 3)
            totalCharging += (rentDays - 3) * 1.5;
        return totalCharging;
    }

    @Override
    public int calculateCredit(int rentDays) {
        return 1;
    }

    public CampusMovie(String title) {
        super(title);
    }
}
