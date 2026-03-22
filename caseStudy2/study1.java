abstract class Payment {
    private String txnId;
    private double amt;

    public Payment(String txnId, double amt) {
        this.txnId = txnId;
        this.amt = amt;
    }

    public String getTxnId() {
        return txnId;
    }

    public double getAmt() {
        return amt;
    }

    public abstract double processPayment();
}

class CreditCardPayment extends Payment {
    public CreditCardPayment(String id, double a) {
        super(id, a);
    }

    public double processPayment() {
        return getAmt() * 1.02;
    }
}

class UPIPayment extends Payment {
    public UPIPayment(String id, double a) {
        super(id, a);
    }

    public double processPayment() {
        return getAmt();
    }
}

public class study1 {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment("TXN1", 1000);
        Payment p2 = new UPIPayment("TXN2", 1000);

        Payment arr[] = {p1, p2};

        double tot = 0;

        for (Payment p : arr) {
            double res = p.processPayment();
            System.out.println(res);
            tot += res;
        }

        System.out.println("Total: " + tot);
    }
}