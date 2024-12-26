package cadenas;

public class InmutabilityStrings {
    public static void main(String[] args) {
        var string1 = "Hola";
        System.out.println("string1 = " + string1);
        var string2 = string1;
        System.out.println("string2 = " + string2);
        string1 = "cadena modificada?";
        System.out.println("string2 = " + string2);
        //  EL ESPACIO EN  MEMORIA SE MANTUVO MEDIANTE EL GUARDADO DEL VALOR EN LA CADENA 2, ASI AL MODIFICAR LA CADENA 1 SE CREO UN NUEVO PUNTERO QUE MARCABA A OTRO ESPACIO PERO ESE ESPACIO SE GUARDO EN CADENA 1
    }
}
