package programacion01;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la primera nota");
		int nota1=sc.nextInt();
		System.out.println("Introduce la segunda nota");
		int nota2=sc.nextInt();

		double media= (nota1+nota2*1.00) /2;
		
		System.out.printf("La media tus notas es: %.3f \n",media);
		
		sc.close();
	}

}
