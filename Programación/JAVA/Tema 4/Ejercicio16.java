public class Ejercicio16 {
    public static void main(String[] args) {

        String respuesta;
        int puntos = 0;

        System.out.println("TEST DE FIDELIDAD");

        System.out.print("1. Tu pareja mira mas el movil \n(v)erdadero o (f)also: ");
        respuesta = System.console().readLine();
        if ( respuesta.equals("v") ) {
          puntos += 2;
        }

        System.out.print("2. Actua de forma extraña \n(v)erdadero o (f)also: ");
        respuesta = System.console().readLine();
        if ( respuesta.equals("v") ) {
          puntos += 2;
        }

        System.out.print("3. Esta mas distante \n(v)erdadero o (f)also: ");
        respuesta = System.console().readLine();
        if ( respuesta.equals("v") ) {
          puntos += 2;
        }

        System.out.print("4. Pasa menos tiempo contigo.\n(v)erdadero o (f)also: ");
        respuesta = System.console().readLine();
        if ( respuesta.equals("v") ) {
          puntos += 2;
        }

        System.out.print("5. Es menos cariñosa contigo \n(v)erdadero o (f)also: ");
        respuesta = System.console().readLine();
        if ( respuesta.equals("v") ) {
          puntos += 2;
        }

        if ( puntos <= 5 ) {
          System.out.println("\n¡Enhorabuena! tu pareja parece ser totalmente fiel.");
        }

        if ( (puntos > 6 ) && (puntos <= 8) ) {
          System.out.println("\nQuizás exista el peligro de otra persona en su vida o en su mente.");    
        }

        if ( puntos >= 8 ) {
          System.out.println("\n¡Enhorabuena! tu pareja parece ser infiel.");
        }
      }
}
