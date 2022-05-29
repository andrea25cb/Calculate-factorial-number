package trabajos_programacion_def;

import java.util.Scanner;

public class Calcular_numero_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//Introducir cualquier numero y que me de el factorial
		
	Scanner teclado = new Scanner (System.in);	
	System.out.println("Introduce el número que quieres factorizar: ");
	
	int num = teclado.nextInt();
	
	int factorial = 1;
	while (num > 1) {
		factorial *=num;
		num--;
	}
	
			
	System.out.println("El  número en factorial sería: "+factorial);
		
		
	}

}
