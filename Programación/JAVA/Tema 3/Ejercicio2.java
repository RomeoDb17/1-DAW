import java.util.Scanner;

public class Ejercicio2 {
	public static void main (String[] args) {
  
  Scanner s = new Scanner(System.in);
  
  System.out.print("Introduzca la cantidad en €: ");
  int euros = s.nextInt();
  
  double pesetas;
  pesetas = (euros * 166.386);
  
  System.out.print(euros + "€" + " " + "es igual a" + " " + pesetas); 
	}
}

  //  
  //  String linea;
  // System.out.print("Introduzca la cantidad en €: ");
   // linea = System.console().readLine();
   // int n1;
   // n1 = Integer.parseInt ( linea );
    
   // double pesetas;
   // pesetas = 166.386;
   // double conversor;
   // conversor = (n1 * pesetas);
   // System.out.println(n1 + "€" + " " + "son" + " " + conversor);
  
