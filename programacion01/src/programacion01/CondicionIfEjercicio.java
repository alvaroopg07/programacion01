package programacion01;

import java.util.Scanner;

public class CondicionIfEjercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero:");
		int numero = sc.nextInt();

		String resultado = "El número es impar";

		if (numero % 2 == 0) {
			resultado = "El número es par";
		}

		System.out.println(resultado);

		sc.close();
	}

}
