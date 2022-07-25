package _3Ciclos_Bucle;

import java.util.Scanner;

public class _14factorial {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// pedir un numero y calcular su factorial
		int numero, suma = 0, resultado, factorial;
		System.out.println("digite un numero: ");
		numero = entrada.nextInt();

		while (numero > 0) {
			
			if (numero == numero) {
				
				suma = numero * numero;
				System.out.println(suma);
				
			}
			
			System.out.println("digite otro numero: ");
			numero = entrada.nextInt();

		}
		System.out.println("**********FIN************");

	}

}
