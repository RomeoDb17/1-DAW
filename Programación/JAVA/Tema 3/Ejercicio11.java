import java.util.Scanner;

public class Ejercicio11 {
	public static void main (String[] args) {
		
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca el numero de KB que quieras convertir: ");
    double kb = s.nextDouble();
    
    double mb;
    mb = kb / 1024;
    
    System.out.println(kb + "KB" + " " + "son" + " " + mb + "MB"); 
	}
}
