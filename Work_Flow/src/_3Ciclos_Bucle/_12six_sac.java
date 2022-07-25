package _3Ciclos_Bucle;

import java.util.Scanner;

public class _12six_sac {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// escribir nueros de 100 en 7 en 7
		int numero;
		System.out.println("digita un numero: ");
		numero = entrada.nextInt();

		char[] letra = new char[numero];
		
		for (int i = 0; i < letra[i]; i++) {
			System.out.println((i + 1) + " digita un numero: ");
			letra[i] = entrada.next().charAt(0);
		}
		
		for (int i = 0; i < letra.length; i += 7) {
			System.out.println(i);
		}
	}
}
