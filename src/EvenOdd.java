import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        int number = Integer.parseInt(reader.nextLine());
        int evenOdd = number % 2;


        if ( evenOdd == 0) {
            System.out.println("Type a number: " + number);
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Type a number: " + number);
            System.out.println("Number " + number + " is odd.");
        }

    }
}