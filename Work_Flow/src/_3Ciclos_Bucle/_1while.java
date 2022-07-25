package _3Ciclos_Bucle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class _1while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		// orden
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		// desorden
		int j = 10;
		while (j >= 0) {
			System.out.println(j);
			j--;
		}

		// orden
		int l;
		System.out.println("digita un numero: ");
		l = entrada.nextInt();
		while (l >= 0) {
			System.out.println(l);
			l--;
		}
		// orden
		int a = 1, contador;
		System.out.println("digita un numero: ");
		contador = entrada.nextInt();
		while (a <= contador) {
			System.out.println(a);
			a++;
		}
		// orden 7 en 7
		int b = 1, contadr;
		System.out.println("digita un numero: ");
		contadr = entrada.nextInt();
		while (b <= contadr) {
			System.out.println(b);
			b += 7;
		}
	}

}
