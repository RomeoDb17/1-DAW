// Escribe la función “repiteCaracter” a la que le pasamos dos parámetros: un carácter y
// un entero. La función nos devolverá una cadena que contendrá el carácter repetido
// tantas veces como indique el entero. Ej.: repiteCaracter(‘A’, 5) = “AAAAA”


public class E5 {
    public static String repiteCaracter(char car, int rep) {
        // Creamos la string "Cadena Final"
        String cadFinal = "";
        // Iniciamos un bucle que recorrar el caracter y parara cuando llegue al numero de repeticiones que le hayamos introducido
        for (int i = 0; i < rep; i++) {
            cadFinal = cadFinal.concat(String.valueOf(car));
        }
        // Nos devolvera la cadena final
        return cadFinal;
    }

    // Le pasamos el caracter que quermos que repita y el numero de veces que queremos repetirlo
    public static void main(String[] args) {
        System.out.println(repiteCaracter('r',10));
    }
}