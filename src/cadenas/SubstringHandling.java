package cadenas;

public class SubstringHandling {
    public static void main(String[] args) {
        //CADENA ORIGINAL
        var cadena1 = "Hola mundo que mundo debes tener para un mundo";
        System.out.println("cadena1 = " + cadena1);

        //SUBCADENA
        var subCadena1 = cadena1.substring(0,4); //<- Desde o hasta 3
        var subCadena2 = cadena1.substring((5));
        System.out.println("subCadena1 = " + subCadena1.toUpperCase());
        System.out.println("subCadena2 = " + subCadena2.toUpperCase());

        //BUSQUEDA DE SUBCADENAS
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);
        var indice2 = cadena1.indexOf("mundo");
        System.out.println("indice2 = " + indice2);
        System.out.println("cadena1 = " + cadena1.indexOf("hola")); //<- SI NO HACE MATCH DEVUELVE -1 QUE SERIA FALSE, CON UN CARACTER QUE NO SEA IGUAL
        var indice3 = cadena1.lastIndexOf("mundo");
        System.out.println("indice3 = " + indice3);//<- DEVUELVE EL ULTIMO  

    }
}
