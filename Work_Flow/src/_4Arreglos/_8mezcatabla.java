package _4Arreglos;

import java.util.Scanner;

public class _8mezcatabla {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Leer por teclado 2 tablas de 10 numeros enteros
		// y mezcalrlos en una tercera de la forma
		// 1 a 1 b 2 a 2 b

		int[] numeroA = new int[3];
		int[] numeroB = new int[3];
		int[] numeroC = new int[6];

		for (int i= 0; i < 3; i++) {
			System.out.println("Digita los elementos del arreglo A");
			numeroA[i] = entrada.nextInt();
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("Digita los elementos del arreglo B");
			numeroB[i] = entrada.nextInt();
		}
		int j=0;
		for (int i = 0; i < 3; i++) {
			numeroC[j] = numeroA[i];
			j++;
			numeroC[j] = numeroB[i];
			j++;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Arreglo C: " + numeroC[i]);
		}
		
		System.out.println("***********FIN*************");
	}

}
