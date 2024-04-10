public class Conditional {
    public static void main(String[] args) {
        int releaseYear = 2022;
        boolean includedInPlan = false;
        double filmNote = 8.1;
        String planType = "plus";

        if (releaseYear >= 2022){
            System.out.println("Most Viewed Releases");
        } else {
            System.out.println("Retros Worth Watching");
        }

        if (includedInPlan == true || planType.equals("plus")) {
            System.out.println("Watch Movie");
        } else {
            System.out.println("Rent Movie");
        }
    }
}
