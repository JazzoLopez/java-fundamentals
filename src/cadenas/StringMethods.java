package cadenas;

public class StringMethods {
    public static void main(String[] args) {
        // ->METODOS DE CADENA
        var cadena1 = "Hola Mundo";

        // * OBTENER LA LONGITUD DE CADENA *
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud); //<- n -1
        var nuevaCadena = cadena1.replace('o','u');
        System.out.println("nuevaCadena = " + nuevaCadena);

        //CONVERTIR A MAYUSCULAS
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        //CONVERTIR A MINUSCULAS
        System.out.println("minusculas = " + cadena1.toLowerCase());

        var cadena2 = "                Frase con muchos espacios   ";
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena2 sin espacios = " + cadena2.trim()); //<- ELIMINA LOS ESPACIOS QUE ESTEN AL INICIO Y AL FINAL DE LA CADENA
    }
}
