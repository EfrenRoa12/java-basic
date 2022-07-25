package _3Ciclos_Bucle;

import java.util.Scanner;

public class _10Media {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// pedir numeros hasta que se introduzca uno negativo y calcular la media
		// 2, 3, 3, 5, 7 ,10 = 30 --- 30 / 6 = 5
		int numero, contador = 0, resultado = 0, promedio = 0;
		
		System.out.println("digita un numero: ");
		numero = entrada.nextInt();

		while (numero > 0) {
			
			contador++;
			resultado += numero;
			
			System.out.println("digita otro numero: ");
			numero = entrada.nextInt();
		}
		
		promedio = resultado / contador;
		System.out.println("el promedio es: " + promedio);

	}

}
