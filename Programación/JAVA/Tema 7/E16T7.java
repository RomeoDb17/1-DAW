/**
 * Ejercicio 16: Programa que genera 20 numeros entre 0 y 400 y despues el 
 * programa pregunta si queremos resaltar los numeros multiplos de 5 o multiplos
 * de 7, y estos se resaltaran entre corchetes.
 */

  public class E16T7 { // Clase principal
  public static void main(String[] args) {
    
    int[] n = new int[20];
    int numero;
    
    // Aqui generamos 20 numero aleatorios

    for (int i = 0; i < 20; i++) {
      numero = (int)(Math.random() * 401);
      n[i] = numero;
      System.out.print(numero + " ");
    }
    
    // Aqui el programa nos pregunta si queremos los multiplos de 5 o de 7

    System.out.println();
    System.out.println("¿Qué números quieres resaltar? (1 - Múltiplos de 5, 2 - Múltiplos de 7): ");
    int respuesta = Integer.parseInt(System.console().readLine());
    
    // Abrimos un switch con las dos respuestas, si elegimos 5 se ejecuta el primer caso y si elegimos 7 se ejecuta el segundo caso.

    switch (respuesta) {
    
      //Aqui se resaltan los multiplos de 5

      case 1:
      
        for (int i = 0; i < 20; i++) {
          
          if (n[i] % 5 == 0) {
             System.out.print("[" + n[i] + "] ");
           } else {
             System.out.print(n[i] + " ");
           }
         }
         break;
         
      // Aqui se resaltan los multiplos de 7
      
      case 2:
        
         for (int i = 0; i < 20; i++) {
          
          if (n[i] % 7 == 0) {
             System.out.print("[" + n[i] + "] ");
           } else {
             System.out.print(n[i] + " ");
           }
         }
         break;
       }
     }
}
