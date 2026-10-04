package boletin1_1;

import java.util.Scanner;

public class Act16_Modulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la hora de salida:");
        int HH = sc.nextInt();

        System.out.println("Introduce los minutos:");
        int MM = sc.nextInt();

        System.out.println("Introduce los segundos:");
        int SS = sc.nextInt();

        System.out.println("Introduce el tiempo de viaje en segundos:");
        int T = sc.nextInt();

        int segundosTotales = HH * 3600 + MM * 60 + SS;
        segundosTotales = segundosTotales + T;

        int horaLlegada = (segundosTotales / 3600) % 24;
        int minutosLlegada = (segundosTotales % 3600) / 60;
        int segundosLlegada = segundosTotales % 60;

        System.out.printf("La hora de llegada es %02d:%02d:%02d",
                horaLlegada, minutosLlegada, segundosLlegada);

        sc.close();
    }
}
