import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());

        boolean year4 = (year%4==0);
        boolean year400 = (year%400==0);
        boolean year100 = (year%100==0);

        if ((year400==true)&&(year100==true) && (year4==true)) {
            System.out.print("The year is a leap year.");
        } else if ((year400==false) && (year100==true)) {
            System.out.print("This year is not a leap year.");
        } else if (year4==true) {
            System.out.print("This year is a leap year.");
        } else {
            System.out.print("This year is not a leap year.");
        }
    }
}