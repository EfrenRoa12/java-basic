package _4Arreglos;

import java.util.Scanner;

public class _11Dezplazar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Diseñar una aplicacion que declare una tabla de 10 elementos enteros
		//leer mediante el teclado 8 numeros 
		//despues se debe pedir un numro y una posicion, insertarlo en la posicion indicada 
		//dezplazando los que esten detras
		
		//en un bucle for pediremos 8 numeros
		//nos debe dar un numero 7 
		//y luego una posicion 5 
		int[] numero = new int[10];
		
		for (int i = 0; i < 8; i++) {
			System.out.print("digite un caracter ");// SEUTILIZA I + 1 PARA NO EMPEZAR DE 0 SI NO APARTIR DE	// 1
			numero[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println(" numeros son: "+numero[i]);
		}

	}

}
