import java.util.Scanner;
public class Adder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int firstNumber = Integer.parseInt(reader.nextLine());
        int secondNumber = Integer.parseInt(reader.nextLine());
        int sum = firstNumber + secondNumber;

        System.out.println("Type a number: " + firstNumber);
        System.out.println("Type another number: " + secondNumber);
        System.out.println("\nSum of the numbers: " + sum);
    }
}
