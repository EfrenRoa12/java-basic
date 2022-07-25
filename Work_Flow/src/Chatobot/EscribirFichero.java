package Chatobot;

import java.io.FileWriter;

public class EscribirFichero {

	public static void main(String[] args) {

		String[] lineas = { "Si puedes imaginarlo, puedes programarlo" };

		/** FORMA 1 DE ESCRITURA **/
		FileWriter fichero = null;
		try {

			fichero = new FileWriter("C:\\\\Users\\\\Efren\\\\Documents\\\\javaIOE\\\\archivo.txt");

			// Escribimos linea a linea en el fichero
			for (String linea : lineas) {
				fichero.write(linea + "\n");
			}

			fichero.close();

		} catch (Exception ex) {
			System.out.println("Mensaje de la excepción: " + ex.getMessage());
		}
	}
}
