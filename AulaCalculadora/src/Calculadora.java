public class Calculadora {
    public static void soma(double n1, double n2) {

        double resultado = (n1 + n2);

        System.out.println("A soma entre " + n1 + " e " + n2 + " será: " + resultado);
    }

    public static void mult(double n1, double n2) {

        double resultado = n1 * n2;

        System.out.println("A multiplicação de " + n1 + " por " + n2 + " será: " + resultado);
    }

    public static void div(double n1, double n2) {

        double resultado = n1 / n2;

        System.out.println("A divisão entre " + n1 + " e " + n2 + " vai ser: " + resultado);
    }

    public static void sub(double n1, double n2) {

        double resultado = n1 - n2;

        System.out.println("A subtração de " + n1 + " e " + n2 + " terá o valor de: " + resultado);
    }

}
