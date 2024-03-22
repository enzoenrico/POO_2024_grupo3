class Funcionario {
    private String name;
    private String jobTitle;
    private double pay;

    public Funcionario(String name, String jobTitle, double pay) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getPay() {
        return pay;
    }

    public void givePayRaise(double percentage) {
        double raiseAmount = pay * (percentage / 100);
        pay += raiseAmount;
    }
}