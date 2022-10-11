import java.util.Scanner;

public class Ejercicio5 {
	public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
		
    System.out.print("Introduzca la medida de la base del rectangulo: ");
    double base = s.nextDouble();
    
    System.out.print("Introduzca la medidad del lado del rectangulo: ");
    double lado = s.nextDouble();
    
    double area;
    area = base * lado;
    
    System.out.println("El area del rectangulo es: " + " " + area);
	}
}

