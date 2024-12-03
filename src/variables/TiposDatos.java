package variables;

public class TiposDatos {
    public static void main(String[] args) {
//        TIPOS DE DATOS
//        ENTEROS
        System.out.println("TIPOS DE DATOS");
        byte type = 127; //VALOR MAXIMO
        System.out.println("type = " + type); //sout -> CONCATENA EL NOMBRE Y VALOR
        short typeShort = 32000; //VALOR MAXIMO
        System.out.println("typeShort = " + typeShort);
        int typeInt = 2147483647; //VALOR MAXIMO
        System.out.println("typeInt = " + typeInt);
        long typeLong = 987654321433333344L; //LONGITUD Extendida CON "L" Y MAXIMA
        System.out.println("typeLong = " + typeLong);
        float typeFloat = 3.14F; //CON "F" PARA IDENTIFICAR TIPO DE DATO FLOAT, SI NO POR DEFECTO SERA DOUBLE , SI NO TIENE DECIMAL SE TOMA COMO ENTERO
        System.out.println("typeFloat = " + typeFloat);
        double typeDouble = 3.1315D; //OPCIONAL LA "D"
        String end = "mensaje de final";
        char typeChar = 'A'; //CARACTERES DEL JUEGO UNICODE
        System.out.println("end = " + end);
        typeChar = 65;
        System.out.println("typeChar = " + typeChar);
        boolean bool = true;
        System.out.println("bool = " + bool);
        String name = null; //AUSENCIA DE REFERENCIA DE UN OBJETO
        System.out.println("name = " + name);
        name = "Jazzo";
        System.out.println("name = " + name);
    }
}
