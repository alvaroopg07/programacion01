package boletin1_2;

import java.util.Scanner;

public class Act3Condicionales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el día:");
        int dia = sc.nextInt();

        System.out.println("Introduce el mes:");
        int mes = sc.nextInt();

        System.out.println("Introduce el año:");
        int anio = sc.nextInt();

        int diasDelMes = 0;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            diasDelMes = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diasDelMes = 30;
        } else if (mes == 2) {
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                diasDelMes = 29;
            } else {
                diasDelMes = 28;
            }
        }

        if (anio != 0 && diasDelMes > 0 && dia >= 1 && dia <= diasDelMes) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("La fecha es incorrecta");
        }

        sc.close();
    }
}