public class Ejercicio5 {
	public static void main (String[] args) {
    
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    String hola = "\033[36m";
    String hola2 = "\033[30m";
    
		System.out.println("Hora/Dia" + "             " + "Lunes" + "       " + "Martes" + "                " + "Miercoles" + "       " + "Jueves" + "             " + "Viernes");
    System.out.println(blanco + "08:00 a 09:00" + " " + rojo + "Base de Datos" + "   " + naranja +"Programacion" + "          " + naranja + "Programacion" + "    " + hola+ "Entonos" + "            " + rojo + "Base de Datos");
    System.out.println(blanco +"09:00 a 10:00" + " " + rojo + "Base de Datos" + "   " + naranja + "Programacion" + "          " + naranja + "Programacion" + "    " + naranja + "Programacion" + "       " + rojo +"Base de Datos");
    System.out.println(blanco +"10:00 a 11:00" + " " + verde +"Ingles" + "          " + hola +"Entornos" + "              " + naranja + "Programacion" + "    " + naranja + "Programacion" + "       " + hola2+ "Sistemas");
    System.out.println(blanco +"11:00 a 11:30" + " " + blanco +"RECREO" + "          " + "RECREO" + "                " + "RECREO" + "          " + "RECREO" + "             " + "RECREO");
    System.out.println(blanco +"11:30 a 12:30" + " " + azul + "FOL" + "             " + hola + "Entornos" + "              " + verde + "Ingles" + "          " + naranja + "Programacion" + "       " + hola2 + "Sistemas");
    System.out.println(blanco +"12:30 a 13:30" + " " + azul +"FOL" + "             " + morado + "Lenguaje de Marcas" + "    " + hola2 +"Sistemas" + "        " + hola2 +"Sistemas" + "           " + morado + "Lenguaje de Marcas");
    System.out.println(blanco +"13:30 a 14:30" + " " + azul +"FOL" + "             " + morado +  "Lenguaje de Marcas" + "    " + hola2 +"Sistemas" + "        " + hola2 +"Sistemas" + "           " + morado +  "Lenguaje de Marcas");
	}
}
