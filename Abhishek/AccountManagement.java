package Abhishek;
class LessBalanceException extends Exception {
    LessBalanceException(String s) {
    super(s);
    }
    }
    class Account {
    double minbalance;
    Account() {
    minbalance = 1000;
    }
    void deposit(double amt) {
    minbalance = minbalance + amt;
    }
    void withdraw(double amt) {
    double t;
    t = minbalance;
    t = t - amt;
    try {
    if (t < 1000) throw new LessBalanceException(
    "Withdraw amount Rs:" +
    amt +
    " is not valid because actual balance is getting lesser than 1000"
    ); else {
    minbalance = minbalance - amt;
    System.out.println("remaining Balance after withdrawal:");
    System.out.println(minbalance);
    }
    } catch (LessBalanceException e) {
    System.out.println(e.getMessage());
    }
    }
    double balance() {
    return minbalance;
    }
    }
public class AccountManagement {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();
        double dep, wit;
        System.out.println("Min balance of account 1");
        System.out.println(a1.balance());
        dep = 2000;
        a1.deposit(dep);
        System.out.println("Balance after deposit:");
        System.out.println(a1.balance());
        wit = 2100;
        System.out.println("amount to withdraw:" + wit);
        a1.withdraw(wit);
        System.out.println("------------------------------------------------------------- -");
        System.out.println("Min balance of account 2:");
        System.out.println(a2.balance());
        dep = 1500;
        a2.deposit(dep);
        System.out.println("Balance after deposit:");
        System.out.println(a2.balance());
        wit = 1000;
        System.out.println("amount to withdraw:" + wit);
        a2.withdraw(wit);
        }
}
