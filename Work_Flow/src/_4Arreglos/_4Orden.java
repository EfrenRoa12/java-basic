package _4Arreglos;

import java.util.Scanner;

public class _4Orden {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		// leer 5 numeros guardarlos en un arreglo y mostrarlos
		// en elmismo orden introducido
		int numeros,contador=0;
		
		System.out.print(" digite un numero: ");
		numeros = entrada.nextInt();
		
		char[] letra = new char[numeros];
		
		for (int i = 0; i < letra.length; i++) {
			System.out.print((i + 1) + " digita un numero: ");
			letra[i] = entrada.next().charAt(0);
		}
		
		for (int i = 0; i < letra.length; i++) {
			System.out.println("numeros en orden que se introdujo: "+letra[i]++);
		}
		
		
		
	}

}
