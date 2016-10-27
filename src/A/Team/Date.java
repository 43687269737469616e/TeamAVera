package A.Team;

/**
 * Created by Christian on 10/18/2016.
 */
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int month, int day, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        if (month == 4 || month == 6 || month == 9 || month == 11)
            do {
                System.out.println("INVALID DAY INPUT");
            } while (day < 1 || day > 30);

        if (month == 2 && leapYear(year))
            do {
                System.out.println("INVALID DAY INPUT");
            } while (day < 1 || day > 29);

        if (month == 2)
            do {
                System.out.println("INVALID DAY INPUT");
            } while (day < 1 || day > 28);
        else
            do {
                System.out.println("INVALID DAY INPUT");
            } while (day < 1 || day > 31);
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        do{
            if(month < 1 || month > 12)
                System.out.println("INVALID MONTH INPUT");
        }while(month < 1 || month > 12);
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public boolean leapYear(int year){
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
