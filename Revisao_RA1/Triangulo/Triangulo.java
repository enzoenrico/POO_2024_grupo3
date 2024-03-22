class Triangulo {
    private double a;
    private double b;
    private double c;

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isValid() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public double calculateArea() {
        double s = (a + b + c) / 2; 
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
    }
}