import java.util.Scanner;

public class Ejercicio9 {
	public static void main (String[] args) {
		
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce el radio: ");
    double radio = s.nextDouble();
    
    System.out.print("Introduce la altura: ");
    double altura = s.nextDouble();
    
    double pi = 3.1415;
    
    
    double formula;
    formula = (pi * radio * radio * altura) / 3;
    
    System.out.println("El volumen del cono es: " + formula);
	}
}

