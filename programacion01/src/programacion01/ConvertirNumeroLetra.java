package programacion01;

import java.util.Scanner;

public class ConvertirNumeroLetra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero de 1 a 99:");
        int numero = sc.nextInt();

        if (numero > 0 && numero < 100) {
            
            if (numero < 30) {
                switch (numero) {
                    case 1 -> System.out.println("uno");
                    case 2 -> System.out.println("dos");
                    case 3 -> System.out.println("tres");
                    case 4 -> System.out.println("cuatro");
                    case 5 -> System.out.println("cinco");
                    case 6 -> System.out.println("seis");
                    case 7 -> System.out.println("siete");
                    case 8 -> System.out.println("ocho");
                    case 9 -> System.out.println("nueve");
                    case 10 -> System.out.println("diez");
                    case 11 -> System.out.println("once");
                    case 12 -> System.out.println("doce");
                    case 13 -> System.out.println("trece");
                    case 14 -> System.out.println("catorce");
                    case 15 -> System.out.println("quince");
                    case 16 -> System.out.println("dieciséis");
                    case 17 -> System.out.println("diecisiete");
                    case 18 -> System.out.println("dieciocho");
                    case 19 -> System.out.println("diecinueve");
                    case 20 -> System.out.println("veinte");
                    case 21 -> System.out.println("veintiuno");
                    case 22 -> System.out.println("veintidós");
                    case 23 -> System.out.println("veintitrés");
                    case 24 -> System.out.println("veinticuatro");
                    case 25 -> System.out.println("veinticinco");
                    case 26 -> System.out.println("veintiséis");
                    case 27 -> System.out.println("veintisiete");
                    case 28 -> System.out.println("veintiocho");
                    case 29 -> System.out.println("veintinueve");
                }
            } 
            
            else {
                int decena = numero / 10;
                int unidad = numero % 10;
                
                String textoDecenas = "";
                String textoUnidades = "";
                
                switch (decena) {
                    case 3 -> textoDecenas = "treinta";
                    case 4 -> textoDecenas = "cuarenta";
                    case 5 -> textoDecenas = "cincuenta";
                    case 6 -> textoDecenas = "sesenta";
                    case 7 -> textoDecenas = "setenta";
                    case 8 -> textoDecenas = "ochenta";
                    case 9 -> textoDecenas = "noventa";
                }
                
                switch (unidad) {
                    case 1 -> textoUnidades = "uno";
                    case 2 -> textoUnidades = "dos";
                    case 3 -> textoUnidades = "tres";
                    case 4 -> textoUnidades = "cuatro";
                    case 5 -> textoUnidades = "cinco";
                    case 6 -> textoUnidades = "seis";
                    case 7 -> textoUnidades = "siete";
                    case 8 -> textoUnidades = "ocho";
                    case 9 -> textoUnidades = "nueve";
                }
                
                if (unidad == 0) {
                    System.out.println(textoDecenas);
                } else {
                    System.out.println(textoDecenas + " y " + textoUnidades);
                }
            }
        } else {
            System.out.println("Error: El número debe estar entre 1 y 99.");
        }

        sc.close();
    }
}