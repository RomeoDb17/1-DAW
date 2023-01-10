// Escribe la función “invierteCadena” a la que le pasamos una cadena y nos la devuelve
// invertida (de detrás para delante, vamos).


public class E14 {
    public static String invierteCadena(String cad) {
        // Creamos la variable
        String cadReves = "";
        // Creamos un bucle que recorre la cadena al reves
        for (int i = cad.length() - 1; i >= 0 ; i--) {
            cadReves = cadReves.concat(String.valueOf(cad.charAt(i)));
        }
        // Nos devuelve la cadena
        return cadReves;
    }

    public static void main(String[] args) {
        System.out.println(invierteCadena("Esta palabra"));
    }
}