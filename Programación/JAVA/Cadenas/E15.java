// Escribe la función “vecesCaracter” a la que le pasamos una cadena y un carácter y nos
// dice cuántas veces se repite ese carácter.

public class E15 {
    public static int vecesCaracter(String cad, char car) {
        // Creamos la variable
        int contCar = 0;
        // Inciamos un bucle que recorra la cadena y mira que las letras de la cadena sean igual a caracter
        for (int i = 0; i < cad.length() ; i++) {
            if (cad.charAt(i) == car)
                contCar++;
        }
        // Nos devuelve el numero de caracteres
        return contCar;
    }

    public static void main(String[] args) {
        System.out.println(vecesCaracter("Aqui aparece muchas letras", 'a'));
    }
}