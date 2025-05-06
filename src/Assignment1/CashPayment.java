package Assignment1;

public class CashPayment implements Payable{
    @Override
    public void pay(double amount) {
        System.out.println("Receiving cash Payment of $" + amount);
        System.out.println("Cash payment successful");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Dispensing cash refund of $" + amount);
        System.out.println("Cash refund processed");

    }
}
