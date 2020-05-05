package cn.xpbootcamp.refactor.movies;

public class HistoryMovie extends Movie {
    public HistoryMovie(String title) {
        super(title);
    }

    @Override
    public double calculateCharging(int rentDays) {
        int totalCharging = 2;
        if (rentDays > 2)
            totalCharging += (rentDays - 2) * 1.5;
        return totalCharging;
    }

    @Override
    public int calculateCredit(int rentDays) {
        return 1;
    }
}
