package programacion01;

import java.util.Scanner;

public class OperadorAritmeticos {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Dime el primer número: ");
		int numero1 = sc.nextInt();	
		
		System.out.println("Dime el segundo número: ");
		int numero2 = sc.nextInt();
		
		int suma = numero1 + numero2;
		int resta = numero1 - numero2;
		int multiplicacion = numero1 * numero2;
		double division = (numero1 * 1.0) / numero2;

		System.out.printf("Suma = %d \n", suma);
		System.out.printf("Resta = %d \n", resta);
		System.out.printf("Multiplicación = %d \n", multiplicacion);
		System.out.printf("División = %.3f \n", division);
		
		
		sc.close();
	}

}
