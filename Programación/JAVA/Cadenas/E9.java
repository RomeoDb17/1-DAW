// Escribe la función “sustituyeCaracter” a la que le pasamos una cadena, un carácter y
// otro carácter y nos devuelve otra cadena igual que la primera en la que se ha sustituido
// el primer carácter por el segundo carácter. Ojo, en las cadenas, al contrario que en los
// arrays, no podemos modificar directamente un valor al estilo de cadena[2] = ‘A’ (los
// corchetes sólo sirven para leer el valor, no para modificarlo).

public class E9 {
    public static String sustituyeCaracter(String cad, char carInic, char carFin ){
        // Aqui reemplazaremos el primer caracter x el segundo caracter
        cad = cad.replace(carInic, carFin);
        // Nos mostrara la frase con los caracteres cambiados
        return cad;
    }

    // Introducimos la frase que queramos y los caracteres que quermos cambiar
    public static void main(String[] args) {
        System.out.println(sustituyeCaracter("Un lobo blanco", 'o', 'i'));
    }
}