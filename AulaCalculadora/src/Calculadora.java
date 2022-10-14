public class Calculadora {
    public static void soma(int n1, int n2) {


        int resultado = (n1 + n2);

        System.out.println("A soma entre " + n1 + " e " + n2 + " será: " + resultado);
    }

    public static void mult(int n1, int n2) {

        int resultado = n1 * n2;

        System.out.println("A multiplicação de " + n1 + " por " + n2 + " será: " + resultado);
    }

    public static void div(int n1, int n2) {

        int resultado = n1 / n2;

        System.out.println("A divisão entre " + n1 + " e " + n2 + " vai ser: " + resultado);
    }

    public static void sub(int n1, int n2) {

        int resultado = n1 - n2;

        System.out.println("A subtração de " + n1 + " e " + n2 + " terá o valor de: " + resultado);
    }

}
