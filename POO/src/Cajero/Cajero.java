package Cajero;

import java.util.Scanner;

public class Cajero {

	public static void main(String[] args) {
		Scanner entrada = null;
		// Crear el flujo de un cajero automático
		int ingreso;// entrada
		int cinco;
		int diez;
		int moneda_veinte;
		int billete_veinte;
		int billete_cincuenta;
		int billete_cien;
		int billete_doscientos;
		int saldo_actual = 0;
		int saldo_inicial = 100;
		int res = 0;
		int retiro;

		int menu = 0;
		int men = 0;

		try {
			do {
				System.out.println("Bienvenido al menu principal");
				System.out.println("Seleccione la operacion deseada");
				System.out.println("1) Ingresar dinero ");
				System.out.println("2) Consulta");
				System.out.println("3) Retiro ");
				System.out.println("4) Recomendacion ");
				System.out.println("5) Salir ");
				// INICIALIZAMOS EL VALOR
				entrada = new Scanner(System.in);
				// INICIALIZAMOS EL MENU
				menu = entrada.nextInt();

				switch (menu) {
				case 1:
					System.out.println("cuanto deseas ingresar dinero: ");
					ingreso = entrada.nextInt();
					saldo_actual = saldo_inicial + ingreso;
					System.out.println("usted ingreso " + saldo_actual + " pesos mx");

					break;
				case 2:

					System.out.println("su saldo actual es de " + saldo_actual);

					break;
				case 3:
					System.out.println("cuanto deseas ingresar dinero: ");
					retiro = entrada.nextInt();

					if (retiro > saldo_inicial) {
						System.out.println("no cuenta con el saldo suficiente: ");
					} else {
						saldo_actual = saldo_inicial = retiro;
						System.out.println("dinero en cuenta " + saldo_actual);
					}
					break;

				case 4:
					System.out.println("salir");
				}
			} while (menu < 5);

		} catch (Exception e) {
			System.out.println("*****Error*****");
		}

	}

}
