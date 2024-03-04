public class Logica {
        public double soma(double num1, double num2) {
            return num1 + num2;
        }

        public double subtracao(double num1, double num2) {
            return num1 - num2;
        }

        public double multiplicacao(double num1, double num2) {
            return num1 * num2;
        }

        public double divisao(double num1, double num2) throws ArithmeticException {
            if (num2 == 0) {
                throw new ArithmeticException("Divisão por zero!");
            }
            return num1 / num2;
        }
}
