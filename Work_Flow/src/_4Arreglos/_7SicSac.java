package _4Arreglos;

import java.util.Scanner;

public class _7SicSac {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// leer 10 numeros enteros gurdarlos en un arreglo
		// debemos mostraros en el siguiente orden
		// el primero el ultimo el segundo el penultimo el tercero etc..
		// 2 5 6 9 1 3 7 8 0 4
		// 2 4 5 0 6 8 9 7 1 3
		int elementos = 10, dividir = 0, inverso = 0, a = 0;
		
		System.out.println("Digita el numero de elementos: ");
		
		// elementos = entrada.nextInt();
		int[] numeros = new int[elementos];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digita un numero: ");
			numeros[i] = entrada.nextInt();
		}
		
		for (int l = 5; l < numeros.length; l++) {
			a=l-5;// restamos 5 numeros para que solo se muestren 5 primeros nummeros del orde
			System.out.println("orden: " + numeros[a]--);
			elementos--;
			System.out.println("inver: " + numeros[elementos]);
		}
		
		System.out.println("*********FIN**********");
	}
}
