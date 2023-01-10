// Escribe la función “quitaAcentos” a la que le pasas una cadena con caracteres
// acentuados y te devuelve la cadena con los acentos quitados (esto se hace para algunos
// programas que no se enteran de los acentos).

public class E13 {
    public static String quitaAcentos(String cad) {
        // Creamos el replace de todas la letras con hacento
        cad = cad.replace('á', 'a');
        cad = cad.replace('é', 'e');
        cad = cad.replace('í', 'i');
        cad = cad.replace('ó', 'o');
        cad = cad.replace('ú', 'u');
        cad = cad.replace('Á', 'A');
        cad = cad.replace('É', 'E');
        cad = cad.replace('Í', 'I');
        cad = cad.replace('Ó', 'O');
        cad = cad.replace('Ú', 'U');
        return cad;
    }

    public static void main(String[] args) {
        System.out.println(quitaAcentos("áéíóúÁÉÍÓÚ"));
    }
}