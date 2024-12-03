package variables;

public class TypeConst {
    public static void main(String[] args) {
        System.out.println("<-- CONSTANTES EN JAVA -->");
        final var DAYS_WEEK = 7;
        System.out.println("DAYS_WEEK = " + DAYS_WEEK);
        //DAYS_WEEK = 8; -> !cannot assign a value to final variable 'DAYS_WEEK'
        final var PI = 3.1416;
        System.out.println("PI = " + PI);

        System.out.println("Math.pi = " + Math.PI); // <- YA ESTA DEFINIDA DE LA CLASE MATH
        final var MESSAGE = "Bienvenido jeje";
        System.out.println("MESSAGE = " + MESSAGE);
        final var MINUTES_PER_SECCONDS = 60;
        System.out.println("MINUTES_PER_SECCONDS = " + MINUTES_PER_SECCONDS);
    }
}
