package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {

	public static double readDouble(Scanner sc) {
		double numero = 0;

		try{
			numero=sc.nextDouble();
		}catch(InputMismatchException e) {
			System.out.println("Debe introducir un tipo double.");
		}finally {
			sc.nextLine();
		}
		
		
		
		return numero;
	}
	
	public static int readInt(Scanner sc) {
		int numero = 0;

		try{
			numero=sc.nextInt();
			
		}catch(InputMismatchException e) {
			System.out.println("Debe introducir un tipo int.");
		}finally {
			sc.nextLine();
		}
		
		return numero;
	}

}
