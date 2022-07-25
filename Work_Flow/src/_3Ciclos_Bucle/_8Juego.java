package _3Ciclos_Bucle;

import java.util.Scanner;

public class _8Juego {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// realizar un juego para adivinar un numero aleatorio
		// para ello generar un numero aleatorio pedir entre 0 y 100
		// y luego ir pidiendo numeros e indicar es mayor o es menor segun sea mayor o
		// menor sea a con respecto a N
		// el proceso termina cuando el usuario acierta y mostrar el numero de intentos
		int numero, aleatorio, contador = 0;

		aleatorio = (int) (Math.random() * 100);

		do {
			System.out.println("digita un numero: ");
			numero = entrada.nextInt();

			if (aleatorio > numero) {
				System.out.println("digita un numero mayer: ");
			} else {
				System.out.println("digite un numero menor: ");
			}
			contador++;
		} while (numero != aleatorio);

		System.out.println("felicidades adivinaste el numero: ");

	}

}
