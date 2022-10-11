public class Ejercicio6 {
	
	public static void main (String[] args) {
		
    int base = 50;
    double iva = 0.21;
    
    double resultado;
    resultado = (double)base * (double)iva;
    
    System.out.println(base + "€" + " " + "es el precio base." + " " + "Con IVA son" + " " + (base + resultado) + "€");
	}
}

