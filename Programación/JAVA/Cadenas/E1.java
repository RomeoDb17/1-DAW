//Escribe la función “numeroEspacios” a la que le pasamos una cadena y nos devuelve el
//número de espacios que contiene esa cadena

public class E1 {
    public static int numeroEspacios(String cad) {
        //Creamos "Espacios"
        int esp = 0;
        //Buecle para que recorra toda la frase en busca del caracter que pidamos, en este caso un espacio.
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) == ' ')
                esp++;
        }
        return esp;
    }

    // Introducimos la frase que queremos pasar a la cadenas
    public static void main(String[] args) {
        System.out.println(numeroEspacios("Numeros de espacios "));
    }
}