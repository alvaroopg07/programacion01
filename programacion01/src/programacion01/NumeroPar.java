package programacion01;

import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Indicame un numero");
		int numero = sc.nextInt();
		
		Boolean numeroPar = (numero %2==0);
		System.out.println("el numero es par? " + numeroPar);
		
		
		
		
		sc.close();
	}

}
