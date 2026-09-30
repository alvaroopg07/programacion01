package programacion01;

import java.util.Scanner;

public class SalirCalle {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("esta lloviendo?");
boolean lluvia=sc.nextBoolean();

System.out.println("has terminado las tareas?");
boolean tareas=sc.nextBoolean();

System.out.println("Necesitas ir a la biblioteca?");
boolean biblioteca= sc.nextBoolean();
//System.out.println("salir a la calle: " + biblioteca);

boolean salirCalle= (lluvia== false && tareas==true || biblioteca==true );
System.out.println("salir a la calle " + salirCalle);



sc.close();
	}

}
