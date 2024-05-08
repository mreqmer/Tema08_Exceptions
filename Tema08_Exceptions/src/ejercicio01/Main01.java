package ejercicio01;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroInt;
		
		double numeroDouble;
		
		System.out.println("Introduce un int: ");
		
		numeroInt = Utils.readInt(sc);
		
		System.out.println(numeroInt);
		
		System.out.println();
		
		System.out.println("Introduce un double:");
		
		numeroDouble = Utils.readDouble(sc);
		
		System.out.println(numeroDouble);

	}

}
