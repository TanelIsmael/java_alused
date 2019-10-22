import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("Type the password: ");
            String command = reader.nextLine();
            if (command.equals("carrot")) {
                break;
            }

            System.out.println("Wrong!");

        }
        System.out.println("Right!");
        System.out.println("\nThe secret is: hello hello fellow");
    }
}