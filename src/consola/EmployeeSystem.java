package consola;

import java.util.Scanner;

public class EmployeeSystem {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("->> Sistema de empleados <<-");
        System.out.print("Ingresa el nombre del empleado: ");
        var employeeName = scanner.nextLine();
        System.out.print("Ingresa la edad del empleado: ");
        var age = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingresa el salario del empleado: ");
        var salary = Double.parseDouble(scanner.nextLine());
        System.out.print("¿Es el jefe del departamento (TrueFalse)?: ");
        var isBoss = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("****************************************");
        System.out.println("Datos del empleado:");
        System.out.println("\t Nombre: " + employeeName);
        System.out.println("\t Edad: " + age + "años");
        System.out.printf("\t Salario: $%.2f%n", salary); //Imprime en formato y la n de salto de linea
        System.out.println("\t Es jefe de departamento:" + isBoss);
        System.out.println("****************************************");
    }
}
