import java.util.Scanner;
public class UpToCertainNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Up to what number? ");
        int number = 1;
        int read = Integer.parseInt(reader.nextLine());

        while (number <= read ) {
            System.out.println(number);
            number++;  // number++ means the same as number = number + 1
        }
    }
}