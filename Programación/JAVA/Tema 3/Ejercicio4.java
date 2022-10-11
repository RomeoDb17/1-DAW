import java.util.Scanner;

public class Ejercicio4 {
	public static void main (String[] args) {
		
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca el primer numero que quiere calcular: ");
    double n1 = s.nextDouble();
    
    System.out.print("Introduzca el segundo numero que quiere calcular: ");
    double n2 = s.nextDouble();
    
    System.out.println("Suma: " + "           " + (n1 + n2));
    System.out.println("Resta: " + "          " + (n1 - n2));
    System.out.println("Multiplicacion: " + " " + (n1 * n2));
    System.out.println("Division: " + "       " + (n1 / n2));
    
	}
}

