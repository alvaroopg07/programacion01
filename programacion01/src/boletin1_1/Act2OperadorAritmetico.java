package boletin1_1;

import java.util.Scanner;

public class Act2OperadorAritmetico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introducce la longitud del primer cateto");
		double cateto1 = sc.nextDouble();

		System.out.println("Introducce la longitud del segundo cateto");
		double cateto2 = sc.nextDouble();

		double cuadrado1 = cateto1 * cateto1;
		double cuadrado2 = cateto2 * cateto2;

		double hipotenusa = Math.sqrt(cuadrado1 + cuadrado2);
		System.out.println("La hipotenusa del rectangulo es de: " + hipotenusa);

		sc.close();
	}

}
