package _3Ciclos_Bucle;

import java.util.Scanner;

public class _18Multiplicard {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Pide un numero (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho numero
		// 7 * 1 = 7
		
		int numero,resultado,multiplicacion;
		
		System.out.print("Digita un numero a multiplicar ");
		numero = entrada.nextInt();
		
		System.out.println("El resultado es: ");
		
		for (int i = 1; i < 11; i++) {
			
			resultado = i * numero;
			
			System.out.println(numero+" * "+i+" = "+resultado);
			
		}

	}

}
