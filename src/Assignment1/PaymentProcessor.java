package Assignment1;

import java.util.Random;

public class PaymentProcessor {
    public static void processPayments(Payable[] payables){
        Random random = new Random();
        for ( Payable payable : payables){
            double amount = random.nextDouble()*99 + 1;
            amount = Math.round( amount * 100.0) / 100.0;
            System.out.println("Processing Payment for: ");
            payable.pay(amount);
            System.out.println("------------");
        }
    }

    public static void main(String[] args){
        Payable[] payments = new Payable[2];
        payments[0] = new CreditCardPayment();
        payments[1] = new CashPayment();
        PaymentProcessor.processPayments(payments);
    }
}
