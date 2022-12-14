/**
 * Ejercicio 12: Programa que a partir de 2 numeros introducidos por el ususario
 * (inicial y final) te los desordena todos menos los numeros que se encuentran
 * entre ellos y cambia la posicion de ambos
 */

  public class E12T7 { // Clase principal
  public static void main(String[] args) {
    
    int[] n = new int[10];
    int numero;
    int origen;
    int destino;
    int auxOrigen;
    int auxDestino;
    int limite;
    
    // Introducimos 10 numeros por teclado

    System.out.println("Este programa cambia la posición en la tabla.");
    System.out.println("Introduce 10 números seguidos: ");
    System.out.println();
    
    // Recogemos los datos y los almacenamos

    for (int i = 0; i < 10; i++) {
      numero = Integer.parseInt(System.console().readLine());
      n[i] = numero;
    }

    // Imprimera la "tabla"

    System.out.println("Array original:");
    System.out.println(" Índice :");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%4d ", i);
    }
    System.out.println();
    System.out.println(" Valor :");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%4d ", n[i]);
    }
    System.out.println();
    
    // Pedimos que numero queremos cambiar

    System.out.println();
    System.out.println("Introduce la posición del número que quieras cambiar: ");
    origen = Integer.parseInt(System.console().readLine());
    System.out.println();

    // Introducimos la nueva posicion del numero anterior

    System.out.println("Introduce la posición en la que lo quieres colocar: ");
    destino = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    auxOrigen = n[origen];
    auxDestino = n[destino];
    limite = destino;
    
    // Aqui creamos un bucle para que cambie de posicion, al cambiar el numero mueve una casilla a la derecha a todos los que le afecte

    if ((origen < destino) && (origen >= 0) && (origen <= 9) && (destino >= 0) && (destino <= 9)) {
      
      do {
        n[origen] = n[origen + 1];
        origen++;
      } while (origen < destino);
      
      do {
        if (destino == 9) {
        n[destino] = auxOrigen;
        auxOrigen = auxDestino;
        auxDestino = n[0];
        destino++;
      } else { 
        n[destino] = auxOrigen;
        auxOrigen = auxDestino;
        auxDestino = n[destino + 1];
        destino++;
        }
      } while (destino <= 9);
      
      destino = 0;
      
      do {
        n[destino] = auxOrigen;
        auxOrigen = auxDestino;
        auxDestino = n[destino + 1];
        destino++;
        
      } while (destino < limite);
      
      // Muestra el array final, con las nuevas posiciones

      System.out.println("\nArray final:");
      System.out.print(" Índice :");
      for (int i = 0; i < 10; i++) {
        System.out.printf("%4d ", i);
      }
      System.out.println();
      
      System.out.print(" Valor  :");
      for (int i = 0; i < 10; i++) {
        System.out.printf("%4d ", n[i]);
      }
      System.out.println();
      
    } else {
      System.out.println("Asegurate de introducir los datos correctamente.");
    }
  }
}


    
