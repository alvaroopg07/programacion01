package programacion01;

import java.util.Scanner;

public class AngulosEjercicio {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Cuantos grados tiene un angulo?");
int angulo= sc.nextInt();

angulo=angulo%360;

double radianes = angulo*Math.PI /180;

System.out.printf("El angulo equivalente es de %d grados \n", angulo);
System.out.printf("Su equivalente en radianes es de : %f \n" , radianes);

sc.close();
	}

}
