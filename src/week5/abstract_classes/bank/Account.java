package week5.abstract_classes.bank;

public abstract class Account {
    protected int amount;
    abstract void withdraw(int amount);
    abstract void deposit(int amount);

    int getCurrentAmount(){
        return amount;
    }

}
