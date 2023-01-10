// Escribe la función “quitaEspacios” a la que le pasamos una cadena y nos devuelve la
// misma cadena, pero con todos los espacios quitados (tanto los del principio como los
// del final como los intermedios)

public class E7 {
    public static String quitaEspacios(String cad) {
        // Creamos la string sin espacios
        String sinEsp = "";
        // Iniciamos un bucle que recorra la frase y quitara los espacios que encuuentre
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) != ' ')
                sinEsp = sinEsp+cad.charAt(i); //.concat(String.valueOf(cad.charAt(i)));
        }
        // Nos devolvera la frase introducida pero sin espacios
        return sinEsp;
    }

    // Introducimos la frase que queramos quitar los espacios
    public static void main(String[] args) {
        System.out.println(quitaEspacios("Quita estos espacios"));
    }
}