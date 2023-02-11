public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double amountOfCredit = 1_000_000;
        int creditTerm = 12 ;
        double annualInterestRate = 9.99;
        int payment = service.calculate(amountOfCredit, creditTerm, annualInterestRate);
        System.out.println(payment);
    }
}
