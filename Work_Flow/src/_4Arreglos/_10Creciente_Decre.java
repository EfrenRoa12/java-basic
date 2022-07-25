package _4Arreglos;

import java.util.Scanner;

public class _10Creciente_Decre {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		// Leer por teclado una serie de 10 numeros enteros la aplicacion debe
		// Findicarnos si los numeros estan ordenados de forma
		// creciente decreciente o desordenados

		int[] a = new int[6];
		boolean creciente = false, decreciente = false;
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("digita un numero: ");
			a[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < 5; i++) {
			if (a[i] < a[i + 1]) {
				creciente = true;
			}
			if (a[i] > a[i + 1]) {
				decreciente = true;
			}
		}

		if (creciente == true && decreciente == false) {
			System.out.println("creciente");
		} else if (creciente == false && decreciente == true) {
			System.out.println("decreciente");
		} else if (creciente == true && decreciente == true) {// desordenado
			System.out.println("desordenado");
		} else if (creciente == false && decreciente == false) {// iguales
			System.out.println("iguales");
		}

		System.out.println("*****FIN*****");
	}
}
