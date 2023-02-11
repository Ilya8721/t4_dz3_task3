public class CreditPaymentService {

    public int calculate(double amountOfCredit, int creditTerm, double annualInterestRate) {
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        double result = amountOfCredit * ((monthlyInterestRate * Math.pow((1 + monthlyInterestRate), creditTerm)) / (Math.pow((1 + monthlyInterestRate), creditTerm) - 1));
        return (int)result;
    }
}
