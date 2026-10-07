package programacion01;

import java.util.Scanner;

public class CondicionIfElseEjercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introducce el primer numero");
		int num1 = sc.nextInt();

		System.out.println("Introducce el segundo numero");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("El primer numero es el mayor");
		} else {
			System.out.println("El segundo numero es el mayor");
		}

		sc.close();

	}

}
