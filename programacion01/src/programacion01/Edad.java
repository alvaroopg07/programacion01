package programacion01;

import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Introducce tu edad");
int edad=sc.nextInt();

System.out.printf("Este año tienes %d , y el año que viene tendras %d \n",edad, ++edad);



sc.close();
	}

}
