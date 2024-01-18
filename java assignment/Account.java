
public class Account {
    private String name;
    private double balance;

    // constructor
    public Account(String n, double b) {
        this.name = n;
        this.balance = b;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double b) {
        if (b >= 0)
            this.balance = b;
        else
            System.out.println("The amount cannot be negative");
    }
}

class saving_account extends Account {
    private int saving;

    saving_account(String name, double balance, int s) {
        super(name, balance);
        this.saving = s;
    }

    public int getSavings() {
        return this.saving;
    }

    public void setSavings(int s) {
        this.saving = s;
    }
}

class fixed_account extends Account {
    private int term;
    private int rate = 7;

    // constructor
    fixed_account(String name, double balance, int t) {
        super(name, balance);
        this.term = t;
    }

    double afterfixed() {
        return getBalance() + term * rate * getBalance();
    }
}