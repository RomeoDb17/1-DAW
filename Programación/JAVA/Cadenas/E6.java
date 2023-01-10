// Escribe las funciones “padLeft” y “padRight” a las que le pasaremos una cadena y una
// longitud final. Ambas funciones nos añadirán espacios delante (padLeft) o detrás
// (padRight) de nuestra cadena hasta que el tamaño de nuestra cadena llega a la longitud
// que le hemos pasado

public class E6 {
    // Funcion padLeft
    public static String padLeft(String cad, int longitud) {
        cad = String.format("%10s", cad);
        // Nos devuelve la primera cadena
        return cad;
    }
    // Funcion padRight
    public static String padRight(String cad, int longitud) {

        while (cad.length() < longitud) {
            cad = cad.concat(" ");
        }
        // Nos devuele la segunda cadena
        return cad;
    }

    // Muestra la palabra eleigida con la longitud seleccionada
    public static void main(String[] args) {
        System.out.println(padLeft("Romeo", 50));
        System.out.print(padRight("Dominguez", 50));
    }
}