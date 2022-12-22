import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c,u, cevre, alan;


        Scanner kenar = new Scanner(System.in);

        System.out.println("1. kenarı giriniz");
        a = kenar.nextInt();

        System.out.println("2. kenarı giriniz");
        b = kenar.nextInt();

        System.out.println("3. kenarı giriniz");
        c = kenar.nextInt();

        u = (a+b+c)/2;
        cevre= 2*u;

        alan = u* ((u-a)*(u-b)*(u-c));

        System.out.println("alan" + alan);




    }

}