import java.util.Scanner;

public class LoopTwo {

    public static void main(String[] args) {

        Scanner reading = new Scanner(System.in);

        double averageRating = 0;
        double grade = 0;
        int totalGrades = 0;

        while (grade != -1) {

            System.out.println("Enter your grade for the movie or -1 to close:");
            grade = reading.nextDouble();

            if (grade != -1) {
                averageRating += grade;
                totalGrades++;
            }
        }
        System.out.println("Average ratings: " + averageRating / totalGrades);
    }
}
