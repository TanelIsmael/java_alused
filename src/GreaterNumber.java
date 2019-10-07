import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        int firstNumber = Integer.parseInt(reader.nextLine());
        int secondNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Type the first number: " + firstNumber);
        System.out.println("Type the second number: " + secondNumber);

        if ( firstNumber > secondNumber ) {
            System.out.println("\nGreater number: " + firstNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println("\nGreater number: " + secondNumber);
        } else if (firstNumber == secondNumber){
            System.out.println("\nThe numbers are equal!");
        }

    }
}