import java.util.Arrays;

public class Main {
    private static void precedencia(String[] args) {
    }

    public static void main(String[] args) {

        int a = 50;
        int b = 40;
        int c = 30;
        int d = 20;
        int e = 10;

        int r1 = a + b;
        int r2 = b - c;
        int r3 = c * d;
        int r4 = d / e;
        int r5 = e % a;

        System.out.println("a+b: " + r1);
        System.out.println("b-c: " + r2);
        System.out.println("c*d: " + r3);
        System.out.println("d/e: " + r4);
        System.out.println("e%a: " + r5);

        //

        int k = 20;

        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("x = " + x);


        int o = 1500;
        short p = 15;
        long q = 500l;
        int r = 35;
        float s = 3.5f;
        double t = s;

        System.out.println("d:  " + t);

        int v = 10;
        int w = 20;
        int y = 30;

        int u = v++ + --w * p;
        System.out.println("v++ + --w * p: " + a);
        System.out.println("v: " + v);

        int uu = 
    }
}