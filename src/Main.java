import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the price of the purchase
        System.out.print("Enter the price of the purchase: $");
        double price = scanner.nextDouble();

        // Compute the sales tax (5%)
        double salesTaxRate = 0.05; // 5%
        double salesTax = price * salesTaxRate;

        // Output the price and the computed sales tax
        System.out.println ("Price of the purchase: " +  price);
        System.out.println ("Computed sales tax: " + salesTax);

        // Close the scanner
        scanner.close();
    }
}