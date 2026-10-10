package programacion01;

import java.util.Scanner;

public class granjaEjercicio {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);

System.out.println("Cuanta cantidad de comida se compra diariamente?");
int comidaDiaria=sc.nextInt();

System.out.println("Cuantos animales hay?");
int numAnimales=sc.nextInt();

System.out.println("Cual es la media que come cada animal?");
int kilosPorAnimal=sc.nextInt();

if (numAnimales== 0) {
	System.out.println("No hay animales para alimentar");
} else {
	int comidaNecesaria= numAnimales*kilosPorAnimal;
 
	if (comidaDiaria>=comidaNecesaria) {
		System.out.println("Disponemos de comida para el animal");
	}else {
		double racionCorrespondiente = comidaDiaria / numAnimales;
		System.out.println("No hay alimento suficiente.");
		System.out.printf("La ración que corresponde a cada animal es de %.2f kilos.\n", racionCorrespondiente);
		}
	





sc.close();
	}

}
}