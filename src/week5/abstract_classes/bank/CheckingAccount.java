package week5.abstract_classes.bank;

public class CheckingAccount extends Account{
    @Override
    void withdraw(int amount) {
        if(this.amount >= amount){
            this.amount -= amount;
        }
    }

    @Override
    void deposit(int amount) {

    }
}
