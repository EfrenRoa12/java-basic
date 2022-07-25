package _3Ciclos_Bucle;

import java.util.Scanner;

public class _6par_impar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// leer numeros hasta que se introduzca un 0
		// para cada uno indicar si es par o impar
		int numero, par, impar;
		System.out.println("digita un numero: ");
		numero = entrada.nextInt();

		while (numero != 0) {
			
			if (numero %2 ==0) {
				System.out.println("numero es par");
			}
			else {
				System.out.println("numero es impar");
			}
			System.out.println("digita otro numero: ");
			numero = entrada.nextInt();
		}
		System.out.println("**********FIN*************");
	}

}
