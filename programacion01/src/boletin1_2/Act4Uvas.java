package boletin1_2;

import java.util.Scanner;

public class Act4Uvas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los kilos de uva entregados:");
        double kilos = sc.nextDouble();

        System.out.println("Introduce el precio inicial por kilo (en euros):");
        double precioInicial = sc.nextDouble();

        System.out.println("Introduce el tipo de uva (A o B):");
        String tipo = sc.next();

        System.out.println("Introduce el tamaño de la uva (1 o 2):");
        int tamano = sc.nextInt();

        double precioFinalKilo = precioInicial;
        boolean datosValidos = true;

        if (tipo.equalsIgnoreCase("A")) {
            if (tamano == 1) {
                precioFinalKilo = precioInicial + 0.20; 
            } else if (tamano == 2) {
                precioFinalKilo = precioInicial + 0.30; 
            } else {
                datosValidos = false;
            }
        } else if (tipo.equalsIgnoreCase("B")) {
            if (tamano == 1) {
                precioFinalKilo = precioInicial - 0.30;
            } else if (tamano == 2) {
                precioFinalKilo = precioInicial - 0.50; 
            } else {
                datosValidos = false;
            }
        } else {
            datosValidos = false;
        }

        if (datosValidos && kilos > 0 && precioInicial > 0) {
            double gananciaTotal = precioFinalKilo * kilos;
            System.out.printf("El precio final por kilo es: %f €\n",precioFinalKilo);
            System.out.printf("El productor recibirá en total: %f € \n",gananciaTotal);
        } else {
            System.out.println("Error: alguno de los datos introducidos no es válido.");
        }

        sc.close();
    }
}