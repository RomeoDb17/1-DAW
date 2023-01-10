// Escribe la función “contiene” a la que le pasamos una cadena y un carácter por
// parámetro y nos dice si el carácter aparece en la cadena o no. Es igual que la función
// contains. Evidentemente, no podéis usar esta función para hacer la vuestra.

public class E4 {
    public static boolean contiene(String cad, char car) {
        // Inciamos un bucle que recorra "contiene" para ver si contiene el caracter que le hemos introducido
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) == car)
                // Si tiene el caracter nos devuelve "True"
                return true;
        }
        // Si no tiene el caracter nos devuelve "False"
        return false;
    }

    // Escribrimos la frase que queremos comprarbar y el caracter.
    public static void main(String[] args) {
        System.out.println(contiene("Casa", 'o'));
    }
}