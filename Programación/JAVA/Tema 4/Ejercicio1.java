//Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.

public class Ejercicio1 {
    public static void main(String[] args) {
      String dia;

      System.out.println("Introduzca un día de la semana y le diré");
      System.out.print("qué asignatura toca a primera hora ese día: ");
      dia = System.console().readLine();
      dia = dia.toLowerCase();

      switch(dia) {
        case "lunes":
            System.out.println("Base de datos");
            break;
        case "martes":
            System.out.println("Programación");
            break;
        case "miercoles":
            System.out.println("Programación");
            break;
        case "jueves":
          System.out.println("Entornos");
          break;
        case "viernes":
          System.out.println("Bases de Datos");
          break;
        case "sabado":
          // continúa debajo
        case "sábado":
          // continúa debajo
        case "domingo":
          System.out.println("¡Ese día no hay clase!");
          break;
        default:
          System.out.println("El día introducido no es correcto.");
      }
    }
  }


  // Hola