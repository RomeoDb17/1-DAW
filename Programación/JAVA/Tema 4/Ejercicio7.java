public class Ejercicio7 {
    public static void main(String[] args) {

        System.out.println("Calcular la nota media de 3 notas");

        System.out.print("Introduzca la primera nota: ");
        double nota1 = Double.parseDouble(System.console().readLine());

        System.out.print("Introduzca la segunda nota: ");
        double nota2 = Double.parseDouble(System.console().readLine());

        System.out.print("Introduzca la tercera nota: ");
        double nota3 = Double.parseDouble(System.console().readLine());

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("La media es %.2f\n", media);
      }
}
