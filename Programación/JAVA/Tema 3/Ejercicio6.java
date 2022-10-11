import java.util.Scanner;

public class Ejercicio6 {
	public static void main (String[] args) {
		
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la medida de la base del triangulo: ");
    double base = s.nextDouble();
    
    System.out.print("Introduzca la medida del lado del triangulo: ");
    double lado = s.nextDouble();
    
    double area;
    area = base * lado;
    
    System.out.println("El area de su trinagulo es: " + " " + (area / 2));

	}
}

