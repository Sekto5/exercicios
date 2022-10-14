import java.net.SocketOption;

public class BreakContinue {
    public static void main(String[] args) {
        for (int numero = 20; numero <= 50; ++numero) {
            if (numero == 30)
                break;
            if (numero == 30)
                continue;
            System.out.println(numero);

        }
    }

}

