import java.sql.SQLOutput;
import java.util.Scanner;

public class Readout {

    public static void main(String[] args) {
        
        Scanner reading = new Scanner(System.in);

        System.out.println("Enter your favorite movie:");
        String filme = reading.nextLine();
        System.out.println("What is the year of release?");
        int releaseYear = reading.nextInt();
        System.out.println("Tell us your rating for the Film:");
        double assessment = reading.nextDouble();

        System.out.println(filme);
        System.out.println(releaseYear);
        System.out.println(assessment);
    }
}

