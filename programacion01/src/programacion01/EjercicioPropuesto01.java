package programacion01;

import java.util.Scanner;

public class EjercicioPropuesto01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el primer numero");
		int num1=sc.nextInt();
		
		System.out.println("Escribe el segundo numero");
		int num2= sc.nextInt();
		
		boolean resultado= (num1 != num2) || (num1 == 0 || num2 == 0);
		System.out.println(resultado);
		
		
		sc.close();
	}

}
