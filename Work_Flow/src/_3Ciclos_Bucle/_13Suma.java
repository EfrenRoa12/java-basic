package _3Ciclos_Bucle;

import java.util.Scanner;

public class _13Suma {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// diseñar un programa que muestre el producto de los 10 primeros numeros impares
		int numero;
		System.out.println("digite un numero: ");
		numero = entrada.nextInt();
		
		while (numero > 0) {
			if (numero %2 == 0) {
				System.out.println("numero par");
			}else {
				System.out.println("numero impar");
			}
			
			System.out.println("digite otro numero: ");
			numero = entrada.nextInt();
		}
		
		System.out.println("***************FIN****************");
	}

}
