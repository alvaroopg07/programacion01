package programacion01;

import java.util.Scanner;

public class Fruteria {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

final double PRECIO_KG_MANZANA= 2.35;
final double PRECIO_KG_PERA= 1.95;

System.out.println("Introducce ventas en kg de manzanas en el primer semestre");
double manzanaPrimerSemestre= sc.nextDouble();

System.out.println("introducce ventas en kg de manzanas en el segundo semestre");
double manzanaSegundoSemestre= sc.nextDouble();

double totalManzana= (manzanaPrimerSemestre + manzanaSegundoSemestre)*PRECIO_KG_MANZANA;
System.out.println("El beneficio de manzanas al año es de : " + totalManzana );

System.out.println("introducce ventas en kg de peras en el primer semestre");
double peraPrimerSemestre= sc.nextDouble();

System.out.println("introducce ventas en kg de peras en el segundo semestre");
double peraSegundoSemestre= sc.nextDouble();

double totalPera= (peraPrimerSemestre + peraSegundoSemestre)*PRECIO_KG_PERA;
System.out.println("El beneficio de peras al año es de : " + totalPera );

sc.close();
	}

}
