// Escribe la función “cuentaPalabras” a la que le pasamos una cadena que contiene una
// frase y nos devuelve el número de palabras que hay en la misma.

public class E10 {
    public static int cuentaPalabras(String cad) {
        int palabras = 1;
        // Quitamos los espacios del principio y fin
        cad = cad.trim();
        // Si la cadena no continene nada nos devuelve 0
        if (cad.isBlank())
            return 0;
        
        // Iniciamos un bucle que recorre la cadena contando solo el numero de palabras, los espacio no los cuenta
        for (int i = 0; i < cad.length() - 1; i++) {
            if (cad.charAt(i) == ' ' && cad.charAt(i+1) != ' ')
                palabras++;
        }
        // Nos devuelve el numero de palabras que tenemos
        return palabras;
    }

    // Introducimos la frase que queramos contar las palabras
    public static void main(String[] args) {
        System.out.println(cuentaPalabras("Hoy esta lloviendo mucho"));
    }
}