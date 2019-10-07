import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number = Integer.parseInt(reader.nextLine());

        if (number >= 0) {
            System.out.println("Type a number: " + number);
            System.out.println("\nThe number is positive.");
        } else {
            System.out.println("Type a number: " + number);
            System.out.println("\nThe number is not positive.");
        }

    }
}