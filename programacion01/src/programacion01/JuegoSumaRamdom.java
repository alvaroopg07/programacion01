package programacion01;

import java.util.Random;
import java.util.Scanner;

public class JuegoSumaRamdom {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Random rm = new Random();

int numero1=rm.nextInt(99)+1;
int numero2 = rm.nextInt(99)+1;

System.out.printf("¿Cuánto es la suma de %d + %d?\n", numero1, numero2);
System.out.print("Tu respuesta: ");

int respuestaUsuario = sc.nextInt();
int resultadoReal = numero1 + numero2;

if (respuestaUsuario == resultadoReal) {
	System.out.println("¡Correcto!");
} else {
	System.out.printf("Incorrecto. El resultado correcto era: %d\n", resultadoReal);
}

sc.close();
	}

}
