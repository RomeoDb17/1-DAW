/**
 * Ejercicio 9: Programa que pida 8 numeros enteros y que luego muestre los
 * numeros junto a par o impar.
 */

  public class E9T7 { // Clase principal
  public static void main(String[] args) {
    
    int[] n = new int[8];
    int num;

    // Pedimos los 8 numeros por teclado
    
    System.out.println("Introduce 8 números seguidos. A continuación se ");
    System.out.println("mostrarán tanto los pares como los impares.");
    System.out.println();
  
    // Recogemos los datos introducidos por teclado.

    for (int i = 0; i < 8; i++) {
      num = Integer.parseInt(System.console().readLine());
      n[i] = num;
    }
  
    System.out.println();
    System.out.println("El resultado es este: ");
    System.out.println();
  
    // Aqui hacemos un bucle para que compruebe si el numero es par/impar
    
    for (int i = 0; i < 8; i++) {
    
      if (n[i] % 2 == 0) {
        System.out.println(n[i] + ": par");
      } else {
        System.out.println(n[i] + ": impar");
      }
    }
  }
}


    
