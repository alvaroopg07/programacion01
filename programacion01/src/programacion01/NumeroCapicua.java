package programacion01;

import java.util.Scanner;

public class NumeroCapicua {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numero = sc.nextInt();

        if (numero >= 0 && numero <= 9999) {

            int cifra1 = numero / 1000;
            int cifra2 = (numero / 100) % 10;
            int cifra3 = (numero / 10) % 10;
            int cifra4 = numero % 10;

            if (cifra1 == cifra4 && cifra2 == cifra3) {
                System.out.println("El número es capicúa");
            } else {
                System.out.println("El número no es capicúa");
            }

        } else {
            System.out.println("El número no está entre 0 y 9999");
        }

        sc.close();
    }
}