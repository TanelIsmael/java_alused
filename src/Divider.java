import java.util.Scanner;
public class Divider {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int firstNumber = Integer.parseInt(reader.nextLine());
        int secondNumber = Integer.parseInt(reader.nextLine());
        double sum = (double)firstNumber / secondNumber;

        System.out.println("Type a number: " + firstNumber);
        System.out.println("Type another number: " + secondNumber);
        System.out.println("\nDivision: " + firstNumber + " / " + secondNumber + " = " + sum);
    }
}