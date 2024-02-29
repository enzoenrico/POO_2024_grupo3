import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Logica logica = new Logica();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.printf("Digite o primeiro número (ou 'x' para sair): ");
            String num1Str = scan.next();
            if (num1Str.equalsIgnoreCase("x")) {
                break;
            }

            double num1 = Double.parseDouble(num1Str);

            System.out.printf("Digite o segundo número: ");
            double num2 = scan.nextDouble();

            System.out.println("Escolha a operação:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            int operacao = scan.nextInt();

            double resultado;
            try {
                switch (operacao) {
                    case 1:
                        resultado = logica.soma(num1, num2);
                        System.out.println("Soma: " + resultado);
                        break;
                    case 2:
                        resultado = logica.subtracao(num1, num2);
                        System.out.println("Subtração: " + resultado);
                        break;
                    case 3:
                        resultado = logica.multiplicacao(num1, num2);
                        System.out.println("Multiplicação: " + resultado);
                        break;
                    case 4:
                        resultado = logica.divisao(num1, num2);
                        System.out.println("Divisão: " + resultado);
                        break;
                    default:
                        System.out.println("Operação inválida.");
                }
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada inválida.");
            }

            System.out.println("Digite 'x' para sair ou qualquer tecla para continuar: ");
            String sair = scan.next();
            if (sair.equalsIgnoreCase("x")) {
                break;
            }
        }

        scan.close();
    }
}
