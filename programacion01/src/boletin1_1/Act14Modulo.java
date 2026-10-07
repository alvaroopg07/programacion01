package boletin1_1;

import java.util.Scanner;

public class Act14Modulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introducce los minutos");
		int minutos = sc.nextInt();

		int horas = minutos / 60;
		int minutos2 = minutos % 60;

		System.out.printf("Te corresponde %d h y %d min ", horas, minutos2);

		sc.close();
	}

}
