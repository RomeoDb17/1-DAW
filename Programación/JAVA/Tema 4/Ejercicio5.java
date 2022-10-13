public class Ejercicio5 {
    public static void main(String[] args) {

        System.out.println("Ecuaciones de primer grado");
        System.out.print("Introduzca el valor de a: ");
        Double a = Double.parseDouble(System.console().readLine());
        System.out.print("Ahora introduzca el valor de b: ");
        Double b = Double.parseDouble(System.console().readLine());

        if (a == 0) {
          System.out.println("Esa ecuación no tiene solución");
        } else {
          System.out.println("x = " + (-b/a));
        }
      }
}
