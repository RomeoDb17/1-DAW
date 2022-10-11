import java.util.Scanner;

public class Ejercicio10 {
	public static void main (String[] args) {
		
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca el numero de MB que quieras convertir: ");
    double mb = s.nextDouble();
    
    double kb;
    kb = mb * 1024;
    
    System.out.println(mb + "MB" + " " + "son" + " " + kb + "KB"); 
	}
}

