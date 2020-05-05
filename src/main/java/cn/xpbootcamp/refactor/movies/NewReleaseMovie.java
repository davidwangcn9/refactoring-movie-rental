package cn.xpbootcamp.refactor.movies;

public class NewReleaseMovie extends Movie {
    public NewReleaseMovie(String title) {
        super(title);
    }

    @Override
    public double calculateCharging(int rentDays) {
        return rentDays * 3;
    }

    @Override
    public int calculateCredit(int rentDays) {
        return rentDays > 1 ? 2 : 1;
    }
}
