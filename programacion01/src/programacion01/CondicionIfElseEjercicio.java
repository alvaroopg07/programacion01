package programacion01;

import java.util.Scanner;

public class CondicionIfElseEjercicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introducce el primer numero");
		int num1 = sc.nextInt();

		System.out.println("Introducce el segundo numero");
		int num2 = sc.nextInt();

		if (num1 == num2) {
			System.out.println("Los numeros son iguales");
		} else {
			System.out.println("Los numeros no son iguales");
		}

		sc.close();
	}

}
