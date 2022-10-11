import java.util.Scanner;

public class Ejercicio1 {
	public static void main (String[] args) {
		
    String linea;
    System.out.print("Introduzca el primero numero: ");
    linea = System.console().readLine();
    int n1;
    n1 = Integer.parseInt( linea );
    
    System.out.print("Introduzca el segundo numero: ");
    linea = System.console().readLine();
    int n2;
    n2 = Integer.parseInt( linea );
    
    int total;
    total = (n1 * n2);
    
    System.out.println("El resultado es: " + total);
 	}
}

