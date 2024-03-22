class Banco { 
    private int accountNumber;
    private double money;

    public Banco(int accountNumber, double initialMoney) {
        this.accountNumber = accountNumber;
        this.money = initialMoney;
    }

    public void deposit(double amount) {
        money += amount;
    }

    public void withdraw(double amount) {
        if (amount <= money) {
            money -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getMoney() {
        return money;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}