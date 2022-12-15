/**
 * Ejercicio 6: Programa que lea 15 numeros por teclado y que los desordene
 * añadiendole una posicion a cada uno.
 */

  public class E6T7 { // Clase principal
  public static void main(String[] args) {
    
    int numeroIntroducido;
    int[] n = new int[15];

    // Introducimos 15 numero por teclado

    for (int i = 0; i < 15; i++) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      n[i] = numeroIntroducido;
    }
  
    System.out.println();

    // Mostramos el primer array con la secuencia introducida

    System.out.print("Array Inicial: ");
  
    for (int i = 0; i < 15; i++) {
      System.out.print(n[i] + " ");
    }  
    
    // Aqui desplazamos la secuencia inicial para despues mostrarla
    int a = 0;
    int b = 1;
    int aux = 0;
  
    for (int i = 0; i < 14; i++) {
      aux = n[b];
      n[b] = n[a];
      b++;
      n[a] = aux;
    }
      n[0] = aux;
    
    System.out.println();
    
    // Mostramos el array desplazado 
    
    System.out.print("Array Desordenado: ");
    
    for (int i = 0; i < 15; i++) {
       System.out.print(n[i] + " ");
      }
    }
  }


    
