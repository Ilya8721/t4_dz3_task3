public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double s = 1_000_000;
        int n = 12 ;
        double ig = 9.99;
        int payment = service.calculate(s, n, ig);
        System.out.println(payment);
    }
}
