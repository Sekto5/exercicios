import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insira as temperaturas ");
        Scanner scnr = new Scanner(System.in);
        System.out.println("Segunda-Feira: ");
        double seg = scnr.nextDouble();
        System.out.println("Terça-Feira: ");
        double ter = scnr.nextDouble();
        System.out.println("Quarta-Feira: ");
        double qua = scnr.nextDouble();
        System.out.println("Quinta-Feira: ");
        double qui = scnr.nextDouble();
        System.out.println("Sexta-Feiraa: ");
        double sex = scnr.nextDouble();
        System.out.println("Sábado: ");
        double sab = scnr.nextDouble();
        System.out.println("Domingo: ");
        double dom = scnr.nextDouble();
        scnr.close();

        List<Double> temp = new ArrayList<Double>();
        temp.add(seg);
        temp.add(ter);
        temp.add(qua);
        temp.add(qui);
        temp.add(sex);
        temp.add(sab);
        temp.add(dom);
        Iterator<Double> iterator = temp.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A temperatura de Segunda foi " + seg + "° Graus.");
        System.out.println("A temperatura de Terça foi " + ter + "° Graus.");
        System.out.println("A temperatura de Quarta foi " + qua + "° Graus.");
        System.out.println("A temperatura de Quinta foi  " + qui + "° Graus.");
        System.out.println("A temperatura de Sexta foi " + sex + "° Graus.");
        System.out.println("A temperatura de Sábado foi " + sab + "° Graus.");
        System.out.println("A temperatura de Domingo foi " + dom + "° Graus.");

        System.out.println("A média de temperatura da semana foi de " + (soma / temp.size()) + "°Graus");
    }
}
