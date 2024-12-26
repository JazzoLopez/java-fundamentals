package cadenas;

public class strings {
    public static void main(String[] args) {
        System.out.println("<- MANEJO DE CADENAS ->");
        var cadena1 = "Hola mundo";
        System.out.println("cadena1 = " + cadena1);
        int lng = cadena1.length();
        for(int i = 0; i < lng;i++){
            System.out.println(cadena1.charAt(i));
        }
    }
}
