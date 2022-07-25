package _3Ciclos_Bucle;

import java.util.Scanner;

public class _15promedios {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// pedir 10 numeros mostrar la media de los numeros positivos, la media de los
		// numeros negativos y la cantidad de ceros

		// pedir numeros hasta que se introduzca uno negativo y calcular la media
		// 2, 3, 3, 5, 7 ,10 = 30 --- 30 / 6 = 5
		float numero_pos, contador_pos = 0, resultado_pos = 0, promedio_pos = 0, contador_cero = 0;
		float numero_neg, contador_neg = 0, resultado_neg = 0, promedio = 0, suma_neg = 0;
		float numero, suma_pos = 0, media_pos = 0, media_neg = 0;

		System.out.println("digita un numero: ");
		numero_pos = entrada.nextFloat();

		for (float i = 1; i <=10; i++) {
			
			System.out.println("digita un numero: ");
			numero = entrada.nextFloat();
			
			if (numero == 0) {
				contador_cero++;
			} else if (numero > 0) {
				suma_pos += numero;
				contador_pos++;
			} else {
				suma_neg += numero;
				contador_neg++;
			}
			// positivos
			if (contador_pos == 0) {
				System.out.println("no");
			} else {
				media_pos = suma_pos / contador_pos;
				System.out.println("la media de los numeros positivos es: " + media_pos);
			}
			// negativos
			if (contador_neg == 0) {
				System.out.println("no");
			} else {
				media_neg = suma_neg / contador_neg;
				System.out.println("la media de los numeros positivos es: " + media_neg);
			}
		}
		System.out.println("ceros es: " + contador_cero);
	}
}
