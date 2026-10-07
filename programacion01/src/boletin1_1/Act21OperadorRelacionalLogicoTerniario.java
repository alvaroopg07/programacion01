package boletin1_1;

import java.util.Scanner;

public class Act21OperadorRelacionalLogicoTerniario {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);

System.out.println("Introducce tu primera nota");
double nota1 = sc.nextDouble();

System.out.println("Introducce tu segunda nota");
double nota2 = sc.nextDouble();

System.out.println("Introducce tu tercera nota");
double nota3 = sc.nextDouble();


double media= (nota1+nota2+nota3) /3;

String resultado = (media >=5 && (nota1>3 && nota2>3 && nota3>3)) ? "Aprobado" : "Suspenso";

System.out.println(resultado);

sc.close();
	}

}
