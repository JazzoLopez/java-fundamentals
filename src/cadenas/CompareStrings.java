package cadenas;

public class CompareStrings {
    public static void main(String[] args) {
        var string1 = "java";
        var string2 = "java";
        var string3 = new String("java");
        //APUNTAN EXACTAMENTE AL MISMO OBJETO

        //COMPARAMOS LAS CADENAS PARA VERIFICAR ESE PUNTO (==) comparamos las referencias
        System.out.println("Evaluando las 2 cadenas");
        System.out.println(string1 == string2);//<- true
        System.out.println(string1 == string3); //<-- false, porque la cadena3 apunta a otro objeto en memoria
        //COMPARANDO EL CONTENIDO
        System.out.println(string1.equals(string3));//<-- true, se evalua el contenido y no la referencia

    }
}
