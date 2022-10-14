import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Meses {
    public static void main(String[] args) {
        System.out.println("Insira as temperaturas para os meses seguintes");
        Scanner scnr = new Scanner(System.in);
        System.out.println("Janeiro: ");
        double jan = scnr.nextDouble();
        System.out.println("Fevereiro: ");
        double fev = scnr.nextDouble();
        System.out.println("Março: ");
        double mar = scnr.nextDouble();
        System.out.println("Abril: ");
        double abr = scnr.nextDouble();
        System.out.println("Maio: ");
        double mai = scnr.nextDouble();
        System.out.println("Junho: ");
        double jun = scnr.nextDouble();
        scnr.close();

        List<Double> temp = new ArrayList<Double>();
        temp.add(jan);
        temp.add(fev);
        temp.add(mar);
        temp.add(abr);
        temp.add(mai);
        temp.add(jun);
        Iterator<Double> iterator = temp.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A temperatura de Janeiro foi " + jan + "° Graus.");
        System.out.println("A temperatura de Fevereiro foi " + fev + "° Graus.");
        System.out.println("A temperatura de Março foi " + mar + "° Graus.");
        System.out.println("A temperatura de Abril foi  " + abr + "° Graus.");
        System.out.println("A temperatura de Maio foi " + mai + "° Graus.");
        System.out.println("A temperatura de Junho foi " + jun + "° Graus.");

        System.out.println("A média de temperatura do semestre foi de " + (soma / temp.size()) + "°Graus");
    }
}
