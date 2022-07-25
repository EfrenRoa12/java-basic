package _3Ciclos_Bucle;

import java.util.Scanner;

public class _11mostrarNumeros {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// pedir un numero N y mostrar todos los numeros de 1 al N
		int numero; 
		System.out.println("digite un numero: ");
		numero = entrada.nextInt();
		
		char[] letra = new char[numero];
		
		for (int i = 0; i < letra[i]; i++) {
			System.out.println((i+1)+"digite un numero: ");
			letra[i] = entrada.next().charAt(0);
			
		}
		for (int i = 0; i < letra.length; i++) {
			System.out.println(i);
			
		}
		
		
	}

}
