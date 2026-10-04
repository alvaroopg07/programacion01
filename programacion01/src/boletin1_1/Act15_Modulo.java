package boletin1_1;

import java.util.Scanner;

public class Act15_Modulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introducce los segundos totales");
		int segundosTotales = sc.nextInt();

		int horas = segundosTotales / 3600;
		int minutos = (segundosTotales % 3600) / 60;
		int segundos = segundosTotales % 60;

		System.out.printf("Te corresponde %d h  %d min y %d seg", horas, minutos, segundos);

		sc.close();
	}

}
