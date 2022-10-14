import java.util.Random;

public class doWhile {
    public static void main(String[] args) {
        do {
            System.out.println("Tocando o telefone");
        }while(tocando());

        System.out.println("Alô!");

    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;
    }
}
