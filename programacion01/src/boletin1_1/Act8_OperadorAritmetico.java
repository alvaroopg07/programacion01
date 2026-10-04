package boletin1_1;

import java.util.Scanner;

public class Act8_OperadorAritmetico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el primer numero");
		int num1 = sc.nextInt();

		System.out.println("Introduce el segundo numero");
		int num2 = sc.nextInt();

		int distancia = Math.abs(num1 - num2);
		System.out.println("La distancia seria: " + distancia);

		sc.close();
	}

}
