import java.util.Scanner;

public class Ejercicio3 {
	public static void main (String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("Introduzca la cantidad en pesetas: ");
  double pesetas = s.nextDouble();
  
  double euros;
  euros = (pesetas * 0.006);
  
  System.out.println(pesetas + " " + "pesetas" + " " + "es igual a" + " " + euros + "€"); 
	}
}
