package cadenas;

public class ReplaceSubstrings {
    public static void main(String[] args) {
        var cadena = "Hola mundo";
        System.out.println("cadena = " + cadena);
        //REMPLAZAR "mundo" POR "A todos"
        var nuevaCadena = cadena.replace("mundo", "A todos");
        System.out.println("nuevaCadena = " + nuevaCadena);
        nuevaCadena = cadena.replace("Hola", "Saludos");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
