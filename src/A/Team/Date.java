package A.Team;

import java.util.Scanner;
import java.util.Calendar;

public class Date {
    private int day;
    private int month;
    private int year;
    Scanner input = new Scanner(System.in);

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day < 1 || day > 30) {
                do {
                    System.out.println("INVALID DAY INPUT");
                    System.out.println("Enter player's day of birth: ");
                    day = input.nextInt();
                    this.day = day;
                } while (day < 1 || day > 30);
            }
        }

        if (month == 2 && leapYear(getYear())) {
            if (day < 1 || day > 29) {
                do {
                    System.out.println("INVALID DAY INPUT");
                    System.out.println("Enter player's day of birth: ");
                    day = input.nextInt();
                    this.day = day;
                } while (day < 1 || day > 29);
            }
        }else if (month == 2) {
            if (day < 1 || day > 28) {
                do {
                    System.out.println("INVALID DAY INPUT");
                    System.out.println("Enter player's day of birth: ");
                    day = input.nextInt();
                    this.day = day;
                } while (day < 1 || day > 28);
            }
        }
        if (day < 1 || day > 31){
            do {
                System.out.println("INVALID DAY INPUT");
                System.out.println("Enter player's day of birth: ");
                day = input.nextInt();
                this.day = day;
            } while (day < 1 || day > 31);
        }

        this.day = day;
    }

    public int getMonth() {
        return month;
    }
    
    public void setMonth(int month) {
        if(month < 1 || month > 12) {
            do{
                System.out.println("INVALID MONTH INPUT");
                System.out.println("Enter player's month of birth: ");
                month = input.nextInt();
                this.month = month;
            }while(month < 1 || month > 12);
        }

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

    public boolean leapYear(int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }
}