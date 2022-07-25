package _3Ciclos_Bucle;

import java.util.Scanner;

public class _17Datos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// dadas las edades y las alturas de 5
		// mostrar la edad y la estatura media
		// la cantidad de alumnos mayores de 18 años
		// y la cantidad de alumnos que miden 1.75 cm
		int mayores_A = 0, numero, edad_media, alumnos_mayores, alumnos_altos, resultado, mayores, edad_a = 0;
		float estatura_media, estatura_a = 0;
		int contador_edad = 0, resultado_edad = 0, promedio_pos = 0;
		float estatura_pro = 0, estatura_conta = 0, resulta_con = 0, prome_e;
		float altos_A = 0;
		int conta=0;
		// 2, 3, 3, 5, 7 ,10 = 30 --- 30 / 6 = 5
		System.out.println("*****Digita registro de los alumos*****");
		//System.out.println("Pulsa 1 para continuar... ");
		
		do {
			conta++;
			System.out.print("digita la edad del alumno: ");
			edad_a = entrada.nextInt();
			System.out.print("digita la estatura del alumno: ");
			estatura_a = entrada.nextFloat();
			
			contador_edad++;
			resultado_edad += edad_a;

			estatura_pro++;
			resulta_con += estatura_a;

			if (edad_a > 18) {
				mayores_A++;// va contando los mil cuantas vueltas da de a mil
			}
			if (estatura_a > 1.78) {
				altos_A++;// va contando los mil cuantas vueltas da de a mil
			}

		} while (conta < 5);
		
		promedio_pos = resultado_edad / contador_edad;
		System.out.println("Media de edad es: " + promedio_pos);
		
		prome_e = resulta_con / estatura_pro;
		System.out.println("Media de estaturas es: " + prome_e);
		
		System.out.println("Mayores de 18 años son: " + mayores_A);
		System.out.println("Mayores de 1.78 son: " + altos_A);

		System.out.println("*********FIN**********");
	}

}
