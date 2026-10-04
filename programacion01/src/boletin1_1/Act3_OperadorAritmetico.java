package boletin1_1;

import java.util.Scanner;

public class Act3_OperadorAritmetico {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Cuantos grados F hacen?");
int gradosF= sc.nextInt();

int gradosC = (gradosF - 32) * 5 / 9;

System.out.printf("Hacen %d grados", gradosC);





sc.close();
	}

}
