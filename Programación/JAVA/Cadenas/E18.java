// Escribe la función “sustituyePalabra” a la que le pasamos una cadena y dos palabras y
// nos devuelve otra cadena en la que haya que sustituir la primera por la segunda.

public class E18 {
    public static String sustituyePalabra(String cad, String palabraInic, String palabraFin) {
        cad = cad.replace(palabraInic, palabraFin);
        return cad;
    }

    public static void main(String[] args) {
        System.out.println(sustituyePalabra("Hoy es Lunes", "Lunes", "Martes"));
    }
}