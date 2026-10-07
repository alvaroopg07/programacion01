package boletin1_1;

import java.util.Scanner;

public class Act1OperadorAritmeticos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introducce la base del rectangulo");
		double base = sc.nextDouble();

		System.out.println("Introducce la altura del rectangulo");
		double altura = sc.nextDouble();

		double area = base * altura;
		System.out.println("EL area del rectangulo es de: " + area);

		double perimetro = base + altura * 2;
		System.out.println("El perimetro del rectangulo es: " + perimetro);

		sc.close();
	}

}
