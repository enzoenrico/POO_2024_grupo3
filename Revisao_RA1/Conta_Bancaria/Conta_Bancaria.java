class Conta_Bancaria {
    private String ownerName;
    private int accountNumber;
    private double money;

    public Conta_Bancaria(String ownerName, int accountNumber) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.money = 0.0;
    }

    public void deposit(double amount) {
        money += amount;
    }

    public void withdraw(double amount) {
        if (amount <= money) {
            money -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}