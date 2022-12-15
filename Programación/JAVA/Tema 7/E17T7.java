/**
 * Ejercicio 17: Programa que genera un array de 10 numeros entre 0 y 100, el
 * usuario debera introducir uno de esos numeros y posteriormente se debera
 * girar el array hacia la derecha cuantas veces haga falta hasta que el
 * numero elegido por el usuario se encuentre en la posicion 0.
 */

  public class E17T7 { // Clase principal
  public static void main(String[] args) {
    
    int[] n = new int[10];
    int numero;
    
    // Array original, aqui se genera el primer array con los numero aleatorios

    System.out.println("\nArray original:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
      for (int i = 0; i < 10; i++) {
        System.out.printf("│%4d ", i);
      }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
      for (int i = 0; i < 10; i++) {
        numero = (int)(Math.random() * 101);
        n[i] = numero;
        System.out.printf("│%4d ", n[i]);
      }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
    // Aqui introducimos el numero de la secuancia original que queramos

    System.out.println();
    System.out.println("Escribe un número de la secuencia y pulsa intro: ");
    System.out.println();
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    // Aqui miraremos que el numero introducido se encuentra en la secuencia, si no esta introduciremos otro.

    boolean correcto = false;
    
    do {
      
      for (int i = 0; i < 10; i++) {
        if (n[i] == numeroIntroducido) {
          correcto = true;
        }
      }
    
      if (correcto == false) {
        System.out.println("Ese número no está en la secuencia. Míralos bien e introduce otro:");
        numeroIntroducido = Integer.parseInt(System.console().readLine());
      }
    } while (correcto == false);
    
    int[] rotado = new int[10];
    int celdasRotado = 0;
    int i;
    int posicionInicio = 0;
    boolean encontrado = false;
    
    // Aqui rotamos toda la secuencia a partir del numero que hemos introducido.

    for (i = 0; encontrado == false; i++) {
      
      if (n[i] == numeroIntroducido) {
        posicionInicio = i;
        encontrado = true;
      }
    }
    
    int limite = posicionInicio;
    
    for (int d = posicionInicio; d < 10; d++) {
      rotado[celdasRotado] = n[d];
      celdasRotado++;
    }
    
    for (int r = 0; r < limite; r++) {
      rotado[celdasRotado] = n[r];
      celdasRotado++;
    }

    // Aqui mostramos la secuencia final con el nuevo orden. 

    System.out.println("\nArray final:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
      for (int r = 0; r < 10; r++) {
        System.out.printf("│%4d ", r);
      }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
      for (int r = 0; r < 10; r++) {
        System.out.printf("│%4d ", rotado[r]);
      }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
  }
}
