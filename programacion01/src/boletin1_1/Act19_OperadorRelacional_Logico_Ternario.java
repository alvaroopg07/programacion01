package boletin1_1;

import java.util.Scanner;

public class Act19_OperadorRelacional_Logico_Ternario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introducce tu edad");
		int edad = sc.nextInt();

		System.out.println("Eres VIP?");
		boolean paseVip = sc.nextBoolean();

		String resultado = (edad >= 18 || paseVip) ? "Acceso Permitido" : "Acceso Denegado";
		System.out.println(resultado);
		sc.close();
	}

}
