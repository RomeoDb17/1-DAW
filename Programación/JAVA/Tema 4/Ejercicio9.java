public class Ejercicio9 {
    public static void main(String[] args) {


        System.out.println("Ecuaciones de segundo grado.");

        System.out.println("Introduzca los valores.");

        System.out.print("a = ");
        double a = Double.parseDouble(System.console().readLine());

        System.out.print("b = ");
        double b = Double.parseDouble(System.console().readLine());

        System.out.print("c = ");
        double c = Double.parseDouble(System.console().readLine());

        if ((a == 0) && (b == 0) && (c == 0)) {
          System.out.println("La ecuación tiene infinitas soluciones.");
        }

        if ((a == 0) && (b == 0) && (c != 0)) {
          System.out.println("La ecuación no tiene solución.");
        }

        if ((a != 0) && (b != 0) && (c == 0)) {
          System.out.println("x1 = 0");
          System.out.println("x2 = " + (-b / a));
        }

        if ((a == 0) && (b != 0) && (c != 0)) {
          System.out.println("x1 = x2 = " + (-c / b));
        }

        if ((a != 0) && (b != 0) && (c != 0)) {

          double discriminante = b*b - (4 * a * c);

          if (discriminante < 0) {
              System.out.println("La ecuación no tiene soluciones reales");
          }  else {
            System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(2 * a));
            System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(2 * a));
          }
        }
      }
}
