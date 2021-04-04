package product;

public class MyDate {
    private final int day;
    private final int month;
    private final int year;

    public MyDate(int day, int mount, int year) {
        this.day = day;
        this.month = mount;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int dayOfYear() {
        int days = 0;
        int arrayOfMonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((year % 400) == 0 || ((year % 4) == 0 && (year % 100) != 0)) {

            arrayOfMonth[2] = 29;
            for (int i = 0; i < month; i++) {
                days = days + arrayOfMonth[i];
            }
            days = days + day;
            return days;

        } else {

            for (int i = 0; i < month; i++) {
                days = days + arrayOfMonth[i];
            }
            days = days + day;
            return days;

        }
    }

    @Override
    public String toString() {
        return day + "." + month + "." + year;
    }
}
