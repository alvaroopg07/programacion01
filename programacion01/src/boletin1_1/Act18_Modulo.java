package boletin1_1;

import java.util.Scanner;

public class Act18_Modulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantas monedas de 2€ tienes?");
		int moneda2e = sc.nextInt();

		System.out.println("Cuantas monedas de 1€ tienes?");
		int moneda1e = sc.nextInt();

		System.out.println("Cuantas monedas de 50 cent tienes?");
		int moneda50cent = sc.nextInt();

		System.out.println("Cuantas monedas de 20 cent tienes?");
		int moneda20cent = sc.nextInt();

		System.out.println("Cuantas monedas de 10 cent tienes?");
		int moneda10cent = sc.nextInt();

		int centimosTotales = (moneda2e * 200) + (moneda1e * 100) + (moneda50cent * 50) + (moneda20cent * 20)
				+ (moneda10cent * 10);

		int eurosTotales = centimosTotales / 100;

		int centimosSueltos = centimosTotales % 100;

		System.out.printf("TIenes %d € y %d cent", eurosTotales, centimosSueltos);

		sc.close();
	}

}
