package cadenas;

public class StringIndex {
    public static void main(String[] args) {
        var string1 = "Hola mundo";
        char firstChar = string1.charAt(0); // <- RETORNA EL PRIMER CARATCER DE LA CADENA CON INDICE 0
        System.out.println("firstChar = " + firstChar);
        char lastCaracter = string1.charAt(9);
        System.out.println("lastCaracter = " + lastCaracter); ;// <- RETORNA EL UTIMO CARASCTER DE LA CADENA
        var medium = string1.charAt(5);
        System.out.println("medium = " + medium);
    }
}
