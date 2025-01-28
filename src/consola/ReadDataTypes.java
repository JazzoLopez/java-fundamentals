package consola;

import java.util.Scanner;

public class ReadDataTypes {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad = scanner.nextLine();
        System.out.println("edad = " + edad);
        System.out.print("Ingresa tu altura:");
        var altura = scanner.nextDouble();
        System.out.println("altura = " + altura);
        scanner.nextLine(); //<- Consumimos el caracter de salto de linea faltante
        System.out.println("Ingresa tu nombre");
        var nombre = scanner.nextLine();
        System.out.println("nombre = " + nombre);

        //Conversion de datos
        System.out.print("Ingresa el numero");
        var numero = Integer.parseInt(scanner.nextLine());
    }
}
