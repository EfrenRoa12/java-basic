package _3Ciclos_Bucle;

import java.util.Scanner;

public class _4Cuadrado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// leer un numero y mostrar su cuadrado 
		//repetir el proceso hasta que se introduzca un numero negativo
		int numero,contador=0,resultado;
		System.out.println("digite un numero: ");
		numero = entrada.nextInt();
		
		while (numero >=0) {
			resultado = numero * numero;
			System.out.println("el resultado es: "+resultado);
			System.out.println("digite otro numero: ");
			numero = entrada.nextInt();
		}
		System.out.println("*********fin**********");
		
	}

}
