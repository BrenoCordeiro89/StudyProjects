import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Jogo da Advinhação! ");
        System.out.println("#-------------------#");
        int computer = new Random().nextInt(20) + 1;
        System.out.println(computer);  //usar para debugar!
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Computador já escolheu o número dele. Agora é sua vez: ");
        int userNumber = scanner.nextInt();
        tentativas++;
        while (!acertou) {
            if (userNumber > computer) {
                System.out.println("Número alto. Tente um menor: ");
                userNumber = scanner.nextInt();
                tentativas++;

            } else if (userNumber < computer) {
                System.out.println("Numero baixo. Tente um maior: ");
                userNumber = scanner.nextInt();
                tentativas++;
            } else {
                if (userNumber == computer && tentativas == 1) {
                    System.out.printf("Parabéns, você acertou de primeira. O número era %d!", userNumber);
                    acertou = true;

                } else {
                    acertou = true;
                    System.out.printf("Agora sim você acertou. O numero era %d e você precisou de %d tentativas! ", userNumber, tentativas);
                    break;
                }

            }


        }
    }
}


