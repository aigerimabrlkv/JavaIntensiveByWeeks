package Assignment1;

public class CreditCardPayment implements Payable{
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        System.out.println("Credit Card payment successful");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Initiating credit card refund of $" + amount);
        System.out.println("Credit card refund processed");
    }
}
