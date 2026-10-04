package programacion01;

import java.util.Scanner;

public class VidaLaboral {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introducce tu edad");
		int edad=sc.nextInt();
		
	boolean edadLaboral= (edad>=16 && edad <67);
	
		System.out.println("estas en edad laboral? " + edadLaboral);
		
		
		
		sc.close();
	}

}
