package cadenas;

public class SpecialCharacters {
    public static void main(String[] args) {
        /*Caracteres especiales
        * \n -> Imprime un salto de linea
        * \t -> Agrega una tabulacion
        * \' -> Agrega una comilla simple
        * \" -> Agrega una comilla doble
        * \\ -> Agrega una barra invertida
        * Ejemplos: * */

        var mensaje = "Hola \n mundo";
        var mensaje2 = "Hola \t mundo";
        var mensaje3 = "Hola \'mundo\'";
        var mensaje4 = "Hola \"mundo\"";
        var mensaje5 = "Hola \\mundo";
        System.out.println("mensaje = " + mensaje);
        System.out.println("mensaje2 = " + mensaje2);
        System.out.println("mensaje3 = " + mensaje3);
        System.out.println("mensaje4 = " + mensaje4);
        System.out.println("mensaje5 = " + mensaje5);
    }
}
