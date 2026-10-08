package programacion01;

import java.util.Scanner;

public class ActividadOperacionElegida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero");
		int num1 = sc.nextInt();

		System.out.println("Introduce el segundo numero");
		int num2 = sc.nextInt();

		System.out.print("Ingresar operador (-, +, *, /): ");
		String operador = sc.next();

		switch (operador) {
		case "+":
			System.out.println("Resultado: " + (num1 + num2));
			break;

		case "-":
			System.out.println("Resultado: " + (num1 - num2));
			break;

		case "*":
			System.out.println("Resultado: " + (num1 * num2));
			break;

		case "/":
			if (num2 != 0) {
				System.out.println("Resultado: " + (num1 / num2));
			} else {
				System.out.println("No se puede dividir entre cero.");
			}
			break;

		default:
			System.out.println("Operador no válido.");
		}

		sc.close();
	}
}
