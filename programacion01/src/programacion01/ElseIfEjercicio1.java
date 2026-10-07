package programacion01;

import java.util.Scanner;

public class ElseIfEjercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero entero");
		int numero = sc.nextInt();

		if (numero >= 0 && numero < 10) {
			System.out.println("Su numero tiene 1 cifra");
		} else if (numero >= 10 && numero < 100) {
			System.out.println("Su numero tiene 2 cifras");

		} else if (numero >= 100 && numero < 1000) {
			System.out.println("Su numero tiene 3 cifras");

		} else if (numero >= 1000 && numero < 10000) {
			System.out.println("Su numero tiene 4 cifras");

		} else if (numero >= 10000 && numero < 100000) {
			System.out.println("Su numero tiene 5 cifras");

		} else {
			System.out.println("Numero introducido incorrecto");
		}

		sc.close();
	}

}
