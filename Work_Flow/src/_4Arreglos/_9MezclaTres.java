package _4Arreglos;

import java.util.Scanner;

public class _9MezclaTres {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		// Leer los datos correspondientes a 2 tablas de 12 elementos numericos
		// y mezclarlos en una tercera de la forma 3 de la tabla A, 3 de la tabla B
		// otros 3 de la tabla Ay otros 3 de la tabla B
		// 3 en 3
		// digita 12 elementos cada uno
		int[] numeroA = new int[12];
		int[] numeroB = new int[12];
		// digita 12 elementos cada uno
		int[] numeroC = new int[24];

		int i=0, j=0;
		for (i = 0; i < 12; i++) {
			System.out.print("Digita el arreglo A: ");
			numeroA[i] = entrada.nextInt();
		}
		for (i = 0; i < 12; i++) {
			System.out.print("Digita  el arreglo B: ");
			numeroB[i] = entrada.nextInt();
		}

		// vamos a mezclar los dos arreglos a y b
		//i = 0;
		//j = 0;

		while (i < 12) {
			// copiamos los 3 elementos de a
			for (int k = 0; k < 3; k++) {
				numeroC[j] = numeroA[i + k];
				j++;
			}
			for (int k = 0; k < 3; k++) {
				numeroC[j] = numeroB[i + k];
				j++;
			}
			i += 3;
		}
		for (int l = 0; l < 24; l++) {
			System.out.println(numeroC[l]);
		}

		System.out.println("***********FIN*************");

	}
}
