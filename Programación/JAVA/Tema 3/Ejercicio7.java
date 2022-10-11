import java.util.Scanner;

public class Ejercicio7 {
	public static void main (String[] args) {
		
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la base imponible: ");
    double base = s.nextDouble();
    
    double iva;
    iva = base * 0.21;
    
    System.out.println("El total de su factura es" + " " + (base + iva));
	}
}

