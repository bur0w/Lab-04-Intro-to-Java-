public class Main {
    public static void main(String[] args) {
        double purchasePrice = 95.00;
        double salesTaxRate = 0.05;
        double salesTax = purchasePrice * salesTaxRate;

        System.out.println("Purchase Price: $" + purchasePrice);
        System.out.println("Sales Tax (5%): $" + salesTax);
    }
}
