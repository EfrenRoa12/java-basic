package _3Ciclos_Bucle;

import java.util.Scanner;

public class _5Pos_Neg {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		// Leer un numero e indicar si es positivo o negativo
		//el proceso se terminara hasta que se introduzca un 0
		int numero;
		System.out.println("digite un numero: ");
		numero = entrada.nextInt();
		
		while (numero != 0) {
			if (numero >0) {
				System.out.println("positivo");
			}else {
				System.out.println("negativo");
			}
			System.out.println("digite otro numero: ");
			numero = entrada.nextInt();
		}
		System.out.println("*********fin**********");
	}

}
