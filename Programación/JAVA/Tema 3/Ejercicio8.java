import java.util.Scanner;

public class Ejercicio8 {
	public static void main (String[] args) {
		
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca cuantas horas has trabajado esta semana: ");
    double horas = s.nextDouble();
    
    double salario;
    salario = horas * 12;
    
    System.out.println("Tu salaria semanal es de" + " " + salario + "€");
	}
}

