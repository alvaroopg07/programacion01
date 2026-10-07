package programacion01;

import java.util.Scanner;

public class ElseIfEjercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introducce el primer numero");
		int num1 = sc.nextInt();

		System.out.println("Introducce el segundo numero");
		int num2 = sc.nextInt();

		System.out.println("Introducce el tercer numero");
		int num3 = sc.nextInt();

		if (num1 == num2 || num2 == num3 || num3 == num1) {
			System.out.println("Hay valores que se repiten");

		} else if (num1 > num2 && num2 > num3) {
			System.out.printf("El mayor es %d, luego %d y por ultimo %d\n", num1, num2, num3);

		} else if (num1 > num3 && num3 > num2) {
			System.out.printf("El mayor es %d, luego %d y por ultimo %d\n", num1, num3, num2);

		} else if (num2 > num1 && num1 > num3) {
			System.out.printf("El mayor es %d, luego %d y por ultimo %d\n", num2, num1, num3);

		} else if (num2 > num3 && num3 > num1) {
			System.out.printf("El mayor es %d, luego %d y por ultimo %d\n", num2, num3, num1);

		} else if (num3 > num1 && num1 > num2) {
			System.out.printf("El mayor es %d, luego %d y por ultimo %d\n", num3, num1, num2);

		} else if (num3 > num2 && num2 > num1) {
			System.out.printf("El mayor es %d, luego %d y por ultimo %d\n", num3, num2, num1);

		} else {
			System.out.println("Valor incorrecto");
		}

		sc.close();
	}

}
