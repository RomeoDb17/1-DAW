// Escribe la función “numeroVocales” a la que le pasamos una cadena y nos devuelve el
// número de vocales que hay en la cadena.

public class E2 {
    public static int numeroVocales(String cad) {
        // Creamos un array que contiene las vocales
        char[] voc = {'a','e','i','o','u','A','E','I','O','U'};
        int numVoc = 0;

        // Iniciamos un bucle que recorre la frase introducida en busca de las vocales
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < cad.length(); j++) {
                if (cad.charAt(j) == voc[i])
                    numVoc++;
            }
        }
        // Muestra el numero de vocales
        return numVoc;
    }

    // Introducimos la frase que queremos pasar a la cadena
    public static void main(String[] args) {
        System.out.println(numeroVocales("Una casa verde"));
    }
}