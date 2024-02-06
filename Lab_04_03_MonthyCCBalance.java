public class Main {
    public static void main(String[] args) {
        double initialBalance = 5000.00;
        double annualInterestRate = 0.17;
        double monthlyInterestRate = annualInterestRate / 12.0;
        double interestAfterOneMonth = initialBalance * monthlyInterestRate;
        double newBalanceAfterOneMonth = initialBalance + interestAfterOneMonth;
        double interestAfterTwoMonths = newBalanceAfterOneMonth * monthlyInterestRate;

        System.out.println("Initial Balance: $" + initialBalance);
        System.out.println("Interest After One Month: $" + interestAfterOneMonth);
        System.out.println("\nBalance After One Month: $" + newBalanceAfterOneMonth);
        System.out.println("Interest After Two Months: $" + interestAfterTwoMonths);
    }
}
