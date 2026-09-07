import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuarNumeros;
        char continuarOperacao;

        do {
            System.out.println("Digite o primeiro número: ");
            double a = scanner.nextDouble();
            System.out.println("Digite o segundo número: ");
            double b = scanner.nextDouble();

            do {
                System.out.println("Agora digite a operação que deseja fazer: ");
                System.out.println(" 1 - SOMA ");
                System.out.println(" 2 - SUBTRAÇÃO ");
                System.out.println(" 3 - MULTIPLICAÇÃO ");
                System.out.println(" 4 - DIVISÃO ");
                int opcao = scanner.nextInt();
                double resultado;

                switch (opcao) {
                    case 1:
                        resultado = Operacoes.somar(a, b);
                        System.out.printf("O resultado da soma é %.2f%n", resultado);
                        break;

                    case 2:
                        resultado = Operacoes.subtrair(a, b);
                        System.out.printf("O resultado da subtração é %.2f%n", resultado);
                        break;

                    case 3:
                        resultado = Operacoes.multiplicar(a, b);
                        System.out.printf("O resultado da multiplicação é %.2f%n", resultado);
                        break;

                    case 4:
                        try {
                            resultado = Operacoes.divisao(a, b);
                            System.out.printf("O resultado da divisão é %.2f%n", resultado);
                        } catch (ArithmeticException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;

                    default:
                        System.out.println("Opção inválida");
                }

                System.out.println("Deseja fazer outra operação com esses mesmos números (S/N): ");
                continuarOperacao = scanner.next().charAt(0);

            } while (continuarOperacao == 'S' || continuarOperacao == 's');

            System.out.println("Deseja continuar com novos números (S/N): ");
            continuarNumeros = scanner.next().charAt(0);

        } while (continuarNumeros == 'S' || continuarNumeros == 's');

        System.out.println("Calculadora encerrada com sucesso. Até logo!");
        scanner.close();
    }
}