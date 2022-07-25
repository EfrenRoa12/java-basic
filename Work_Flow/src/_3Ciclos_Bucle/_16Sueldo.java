package _3Ciclos_Bucle;

import java.util.Scanner;

public class _16Sueldo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// pedir 10 sueldos mostrar su suma y cuantos hay mayores de 1000
		int pedir, suma_sueldo = 0, contador = 0, resultado, mayores = 0;

		System.out.println("digita 10 sueldos y 0 para salir");

		do {

			System.out.print("digita otro numero: ");
			pedir = entrada.nextInt();
			
			contador += pedir;//suma los sueldos
			
			if (pedir > 1000) {
				mayores++;//va contando los mil cuantas vueltas da de a mil
			}
			
		} while (pedir != 0);

		System.out.println("la suma de los sueldos es de: " + contador+" pesos");
		System.out.println("sueldos mayores a mil son: "+mayores+" sueldos");
		System.out.print("*********FIN***********");

	}
}
