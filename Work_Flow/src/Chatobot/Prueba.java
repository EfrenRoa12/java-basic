package Chatobot;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// TODO Auto-generated method stub
		int[] a = new int[6];
		boolean creciente = false, decreciente = false;
		for (int i = 0; i < 6; i++) {
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
		
	}

}
