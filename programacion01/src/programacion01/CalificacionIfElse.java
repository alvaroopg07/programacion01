package programacion01;

import java.util.Scanner;

public class CalificacionIfElse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduce tu nota ");
		int nota= sc.nextInt();
		
		if (nota<5) {
			System.out.println("Insuficiente");
		} else if (nota==5) {
			System.out.println("Suficiente");
		}else if (nota==6) {
			System.out.println("Bien");
		}else if (nota<9) {
			System.out.println("Notable");
		}else if (nota<=10) {
			System.out.println("Sobresaliente");
		}else {
			System.out.println("Valor incorrecto. debe ser una nota de 0-10");
		}

		
		
		
		
		
		sc.close();

	}

}
