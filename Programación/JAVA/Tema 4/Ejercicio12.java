public class Ejercicio12 {
    public static void main(String[] args) {
    
        int puntos = 0;
        String respuesta;
        
        System.out.println("CUESTIONARIO 1º DAW");
        
        System.out.println("1. ¿Cuál es la asignatura que tenemos los lunes a primera hora?");
        System.out.println("a) FOL\nb) Base de Datos\nc) Programacion"); 
        System.out.print("=> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("b")) {
          puntos++;
          System.out.println("Correcto");
        } else {
          System.out.println("Incorrecto");
        }
    
        System.out.println("2. ¿Cuál es el lenguaje que estamos practicando en Programacion");
        System.out.println("a) C\nb) Python\nc) Java"); 
        System.out.print("=> ");
        respuesta = System.console().readLine();  
        if (respuesta.equals("c")) {
          puntos++;
          System.out.println("Correcto");
        } else {
          System.out.println("Incorrecto");
        }
    
        System.out.println("3. ¿Cual es la asignatura con menos horas semanales?");
        System.out.println("a) Programacion\nb) Ingles\nc) Base de datos"); 
        System.out.print("=> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("b")) {
          puntos++;
          System.out.println("Correcto");
        } else {
          System.out.println("Incorrecto");
        }
        
        System.out.println("4. ¿Donde estamos subiendo los apuntes?");
        System.out.println("a) Github\nb) Moodle\nc) Drive"); 
        System.out.print("=> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("a")) {
          puntos++;
          System.out.println("Correcto");
        } else {
          System.out.println("Incorrecto");
        }
        
        System.out.println("5. ¿Que tipo de disco duro es mas rapido?");
        System.out.println("a) NVMe M.2\nb) SSD\nc) HDD"); 
        System.out.print("=> ");
        respuesta = System.console().readLine();
        if (respuesta.equals("a")) {
          puntos++;
          System.out.println("Correcto");
        } else {
          System.out.println("Incorrecto");
        }
    
        System.out.println("\nHa obtenido " + puntos + " puntos.");
      }
}
