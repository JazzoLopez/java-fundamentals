package consola;

import java.util.Scanner;

public class ConsoleManagement {
    public static void main(String[] args) {
        //Introducir datos por consola
        var scanner = new Scanner(System.in); //<- Entrada estandar de datos
        System.out.print("Escribe tu nombre: ");
        var name = scanner.nextLine();
        System.out.println("name = " + name);
    }
}
