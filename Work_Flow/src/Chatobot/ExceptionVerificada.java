package Chatobot;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionVerificada {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		Scanner entrada = new Scanner(System.in);
		//Exception verificada (IOException)
		//lectura de un archivo de texto.txt
		BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Efren\\Documents\\javaIOE\\archivo.txt")); // direccion donde se encuentra mi archivo
		String linea;
		//mostramos todo lo que hay en el archivo
		while ((linea=bf.readLine()) != null) {
			System.out.println(linea);
		}
		
	}

}
