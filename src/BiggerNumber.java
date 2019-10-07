import java.util.Scanner;
public class BiggerNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int firstNumber = Integer.parseInt(reader.nextLine());
        int secondNumber = Integer.parseInt(reader.nextLine());
        int sum = Math.max(firstNumber, secondNumber);

        System.out.println("Type a number: " + firstNumber);
        System.out.println("Type another number: " + secondNumber);
        System.out.println("\nThe bigger number of the two numbers given was: " + sum);

    }
}