package boletin1_1;

import java.util.Scanner;

public class Act20_OperadorRelacional_Logico_Ternario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		int edad= sc.nextInt();
		
		String resultado = (edad < 18 || edad >=65) ? "Descuento aplicable" : "Tarifa normal";

		System.out.println(resultado);
		
		sc.close();
	}

}
