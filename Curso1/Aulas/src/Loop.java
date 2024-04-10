import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        double averageRating = 0;
        double grade = 0;

        for (int i = 0; i < 3; i++) {

            System.out.println("Tell us your rating for the Film:");
            grade = reading.nextDouble();
            averageRating += grade;
        }

        System.out.println("Average ratings: " + averageRating/3);
    }
}
