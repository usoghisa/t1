/**
 * Created by upisa01 on 13/01/2017.
 */
class BankAccount {
    private float balance;
    public void deposit(float amount) {
        this.balance += amount;
    }
    public float showBalance() {
        return this.balance;
    }
    BankAccount() {
        balance = 100;
    }
}
