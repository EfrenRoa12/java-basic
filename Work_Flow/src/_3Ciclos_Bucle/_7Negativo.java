package _3Ciclos_Bucle;

import java.util.Scanner;

public class _7Negativo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//pedir numeros hasta que se teclee uno negativo
		//y mostrar cuantos numeros se han introducidp
		
		int numero,contador=0;
		System.out.println("digita un numero: ");
		numero = entrada.nextInt();
		
		while (numero >=0) {
			contador++;//cuantas vueltas dio
			
			System.out.println("digita otro numero: ");
			numero = entrada.nextInt();
		}
		System.out.println("se han introducido "+contador+" numeros");
	}

}
