package programacion01;

import java.util.Scanner;

public class MayorEdad {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.println("Introducce tu edad");
			int edad=sc.nextInt();
			
		boolean mayorDeEdad= (edad>=18);
		
			System.out.println("Mayor de edad: " + mayorDeEdad);
			
			
			
			sc.close();
	}

}
