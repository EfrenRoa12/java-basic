package _4Arreglos;

import java.util.Scanner;

public class _5Inverso {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//leer 5 numeros guardarlos en un arreglo y mostrar en orden inverso
		int numero=10;
		System.out.println("digita un numero: ");
		// 2 5 6 9 1 3 7 8 0 4
		// 2 4 5 0 6 8 9 7 1 3

		char[] letra = new char[numero];
		
		for (int i = 1; i < letra.length; i++) {
			System.out.print("digita numero: ");
			letra[i] = entrada.next().charAt(0);
			
		}
		for (int i = letra.length - 1; i > 0; i--) {
			System.out.println("orden inverso "+letra[i]);
		}
		
	}

}
