package _4Arreglos;

import java.util.Scanner;

public class _8MezclaAlternativa {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Leer por teclado 2 tablas de 10 numeros enteros
		// y mezcalrlos en una tercera de la forma
		// 1 a 1 b 2 a 2 b

		int[] numeroA = new int[3];
		int[] numeroB = new int[3];
		int[] numeroC = new int[6];

		for (int a = 0; a < numeroA.length; a++) {
			System.out.println("Digita los elementos del arreglo A");
			numeroA[a] = entrada.nextInt();
		}

		for (int b = 0; b < numeroB.length; b++) {
			System.out.println("Digita los elementos del arreglo B");
			numeroB[b] = entrada.nextInt();
		}

		for (int c = 0; c < 6; c++) {
			System.out.println("Arreglo A: " + numeroA[c]++);
			System.out.println("Arreglo B: " + numeroB[c]++);
		}

		System.out.println("***********FIN*************");
	}
}
