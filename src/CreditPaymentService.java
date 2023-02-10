public class CreditPaymentService {

    public int calculate(double s, int n, double ig) {
        double im = ig / 12 / 100;
        double result = s * ((im * Math.pow((1 + im), n)) / (Math.pow((1 + im), n) - 1));
        return (int)result;
    }
}
