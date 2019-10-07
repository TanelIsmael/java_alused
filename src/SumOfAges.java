import java.util.Scanner;
public class SumOfAges {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String nameOne = reader.nextLine();
        int ageOne = Integer.parseInt(reader.nextLine());
        String nameTwo = reader.nextLine();
        int ageTwo = Integer.parseInt(reader.nextLine());
        int sum = ageOne + ageTwo;

        System.out.println("Type your name: " + nameOne);
        System.out.println("Type your age: " + ageOne);

        System.out.println("\nType your name: " + nameTwo);
        System.out.println("Type your age: " + ageTwo);

        System.out.println("\n" + nameOne + " and " + nameTwo + " are " + sum + " years old in total.");

    }
}