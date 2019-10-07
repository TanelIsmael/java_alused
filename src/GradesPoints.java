import java.util.Scanner;

public class GradesPoints {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        int points = Integer.parseInt(reader.nextLine());

        System.out.println("Type the points [0-60]: " + points);

        if (points <= 29 && points >= 0) {
            System.out.println("\nGrade: failed");
        } else if (points >= 30 && points <= 34) {
            System.out.println("\nGrade: 1");
        } else if (points >= 35 && points <= 39) {
            System.out.println("\nGrade: 2");
        } else if (points >= 40 && points <= 44) {
            System.out.println("\nGrade: 3");
        } else if (points >= 45 && points <= 49) {
            System.out.println("\nGrade: 4");
        } else if (points >= 50 && points <= 60) {
            System.out.println("\nGrade: 5");
        } else {
            System.out.println("\nNot a valid grade point!");
        }

    }
}