package _3Ciclos_Bucle;

import java.util.Scanner;

public class _9iterativa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// pedir numeros hasta que se teclee un 0
		// mostrar la suma de todos los numeros introducidos
		int numero, contador = 0, res = 0;
		System.out.println("digite un numero: ");
		numero = entrada.nextInt();

		while (numero > 0){
			
			contador += numero;
			
			System.out.println("digite un numero: ");
			numero = entrada.nextInt();
			
		}

		System.out.println("numero total es: " + contador);
	}

}
