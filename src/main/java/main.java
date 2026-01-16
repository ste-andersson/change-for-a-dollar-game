import java.util.Scanner;

public class main {

    public static void main(String args[]) {
        //State things we know
        //Starting with coin types
        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.1;
        double quarter = 0.25;

        //Setting the target as a double, so it can be changed easily later
        double target = 1;

        //Ask user for amounts of each type
        System.out.println("How many pennies?");
        Scanner scanner = new Scanner(System.in);
        int pennyNumber = scanner.nextInt();

        System.out.println("How many nickles?");
        int nickelNumber = scanner.nextInt();

        System.out.println("How many dimes?");
        int dimeNumber = scanner.nextInt();

        System.out.println("How many quarters?");
        int quarterNumber = scanner.nextInt();

        //Close scanner
        scanner.close();

        //Calculate total value of all coins
        double coinValueSum = pennyNumber * penny + nickelNumber * nickel + dimeNumber * dime + quarterNumber * quarter;
        double valueDifference = coinValueSum - target;

        //Respond to user
        if(coinValueSum == target) {
            System.out.println("You win!");
        } else if (coinValueSum > target) {
            System.out.println("You were " + valueDifference + " too high!");
        } else {
            System.out.println("You were " + valueDifference * -1 + " too low!");
        }
    }

}
