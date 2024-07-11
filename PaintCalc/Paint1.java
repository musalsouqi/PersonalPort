import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallon = 350.0;
        
        // Input validation for wall height
        do {
            System.out.println("Enter wall height (feet): ");
            while (!scnr.hasNextDouble()) {
                System.out.println("Invalid input");
                scnr.next();
            }
            wallHeight = scnr.nextDouble();
        } while (wallHeight <= 0);

        // Input validation for wall width
        do {
            System.out.println("Enter wall width (feet): ");
            while (!scnr.hasNextDouble()) {
                System.out.println("Invalid input");
                scnr.next(); 
            }
            wallWidth = scnr.nextDouble();
        } while (wallWidth <= 0);

        // Calculate wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate gallons of paint needed
        gallonsPaintNeeded = wallArea / squareFeetPerGallon;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

    }
}