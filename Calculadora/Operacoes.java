public class Operacoes {
    public static double somar(double a , double b){
        return a + b;
    }

    public static double subtrair(double a , double b){
        return a - b;
    }

    public static double multiplicar(double a , double b){
        return a * b;
    }

    public static double divisao(double a , double b){
        if (b == 0){
            throw new ArithmeticException("Não é possivel dividir um número por 0");
        }else{
            return a / b;
        }
    }

    }

