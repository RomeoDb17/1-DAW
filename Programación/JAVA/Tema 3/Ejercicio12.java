public class Ejercicio12 {
	public static void main (String[] args) {
    
    System.out.print("Introduzca la base imponible: ");
    double base = Double.parseDouble(System.console().readLine());
		
    System.out.print("Introduzca el tipo de IVA: ");
    String tipoiva = System.console().readLine();
    
    System.out.print("Introduzca el codigo promocional: ");
    String promocion = System.console().readLine();
    
    int tipoivanu = 0;
    
    switch (tipoiva) {
      case "general":
        tipoivanu = 21;
        break;
      case "reducido":
        tipoivanu = 10;
        break;
      case "superreducido":
      tipoivanu = 4;
        break;
        default:
      System.out.println("El tipo de IVA introducido no es aplicable");
    }
    double iva = base * tipoivanu / 100;
    double preciosin = base + iva;
    
    double descuento = 0;
    
    switch (promocion) {
      case "nopro":
        break;
      case "mitad":  
        descuento = preciosin / 2;
        break;
      case "meno5":
        descuento = 5;
        break;
      case "porc5":
        descuento = preciosin * 0.05;
        break;
      default:
      System.out.println("El tipo de promocion incluido no es aplicable");
    }
        double total = preciosin - descuento;
    
    System.out.printf("Base imponible       %6.2f\n", base);
    System.out.printf("IVA (%2d%%)            %6.2f\n", tipoivanu, iva);
    System.out.printf("Precio con IVA       %6.2f\n", preciosin);
    System.out.printf("Cód. promo. (%5s) -%6.2f\n", promocion, descuento);
    System.out.printf("TOTAL                %6.2f", total);
  }
}
