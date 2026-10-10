package programacion01;

import java.util.Scanner;

public class DniEjercicio {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Introduce tu digitos del dni");
int dni=sc.nextInt();

int letra= (dni%23);

switch (letra) {
case 0 -> System.out.printf("Su DNI es: %d%c\n", dni, 'T');
case 1 -> System.out.printf("Su DNI es: %d%c\n", dni, 'R');
case 2 -> System.out.printf("Su DNI es: %d%c\n", dni, 'W');
case 3 -> System.out.printf("Su DNI es: %d%c\n", dni, 'A');
case 4 -> System.out.printf("Su DNI es: %d%c\n", dni, 'G');
case 5 -> System.out.printf("Su DNI es: %d%c\n", dni, 'M');
case 6 -> System.out.printf("Su DNI es: %d%c\n", dni, 'Y');
case 7 -> System.out.printf("Su DNI es: %d%c\n", dni, 'F');
case 8 -> System.out.printf("Su DNI es: %d%c\n", dni, 'P');
case 9 -> System.out.printf("Su DNI es: %d%c\n", dni, 'D');
case 10 -> System.out.printf("Su DNI es: %d%c\n", dni, 'X');
case 11 -> System.out.printf("Su DNI es: %d%c\n", dni, 'B');
case 12 -> System.out.printf("Su DNI es: %d%c\n", dni, 'N');
case 13 -> System.out.printf("Su DNI es: %d%c\n", dni, 'J');
case 14 -> System.out.printf("Su DNI es: %d%c\n", dni, 'Z');
case 15 -> System.out.printf("Su DNI es: %d%c\n", dni, 'S');
case 16 -> System.out.printf("Su DNI es: %d%c\n", dni, 'Q');
case 17 -> System.out.printf("Su DNI es: %d%c\n", dni, 'V');
case 18 -> System.out.printf("Su DNI es: %d%c\n", dni, 'H');
case 19 -> System.out.printf("Su DNI es: %d%c\n", dni, 'L');
case 20 -> System.out.printf("Su DNI es: %d%c\n", dni, 'C');
case 21 -> System.out.printf("Su DNI es: %d%c\n", dni, 'K');
case 22 -> System.out.printf("Su DNI es: %d%c\n", dni, 'E');




default ->System.out.println("Dni invalido");

}

sc.close();
	}

}
