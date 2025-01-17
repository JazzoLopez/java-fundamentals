package cadenas;

public class MoreConcats {
    public static void main(String[] args) {
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena = cadena1 + " " + cadena2;
        System.out.println("cadena = " + cadena);
        //Metodo concat
        cadena = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena = " + cadena);
        //Uso de stringbuilder, mas eficiente no crea mas objetos en memoria
        var constructorDeCadenas = new StringBuilder();
        constructorDeCadenas.append(cadena1);
        constructorDeCadenas.append(" ");
        constructorDeCadenas.append(cadena2);
        var result = constructorDeCadenas.toString(); //<- Generando la cadena final
        System.out.println("result = " + result);

        //Uso de StringBuffer, cuanod hay varios procesos ejecutandose es mejor usar este, (Threads)
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        var resultado2 = stringBuffer.toString();
        System.out.println("resultado2 = " + resultado2);

        //Uso de join
        result = String.join(" ",cadena1,cadena2);
        System.out.println("result with join = " + result);

    }
}
