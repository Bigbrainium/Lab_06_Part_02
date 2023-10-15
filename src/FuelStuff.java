import java.util.Scanner;

public class FuelStuff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Variables
        double fuel = 0;
        double mileage = 0;
        double cost = 0;
        double remainingDistance;
        double costFor100Miles;

        // Checking for fuel in tank
        System.out.println("How much fuel is there?");
        do {
            if (scan.hasNextDouble()) {
                fuel = scan.nextDouble();
                if (fuel >= 0) {
                    break;
                }
            }
            scan.nextLine();
            System.out.println("Please enter a valid input");
        } while (true);

        // Checking mileage
        System.out.println("What is the mileage?");
        do {
            if (scan.hasNextDouble()) {
                mileage = scan.nextDouble();
                if (mileage >= 0) {
                    break;
                }
            }
            scan.nextLine();
            System.out.println("Please enter a valid input");
        } while (true);

        // Checking for fuel prices
        System.out.println("What is the cost per gallon of fuel?");
        do {
            if (scan.hasNextDouble()) {
                cost = scan.nextDouble();
                if (cost > 0) {
                    break;
                }
            }
            scan.nextLine();
            System.out.println("Please enter a valid input");
        } while (true);

        // math
        costFor100Miles = (100/mileage) * cost;
        remainingDistance = fuel * mileage;

        System.out.printf("%-24s %.2f", "Cost to drive 100 miles:" , costFor100Miles);
        System.out.printf("\n%-14s %.2f", "Distance left:" , remainingDistance);
    }
}