package consola;

import java.util.Scanner;

public class CookingRecipe {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("--> Recetas de cocina <--\n");
        System.out.print("Ingresa el nombre: ");
        var recipeName = scanner.nextLine();
        System.out.print("Ingresa los ingredientes: ");
        var ingredients = scanner.nextLine();
        System.out.print("Ingresa el tiempo de preparación (min): ");
        var time = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingresa la dificultad: ");
        var difficult = scanner.nextLine();
        System.out.println("\n --- Receta de cocina ---");
        System.out.println("\tNombre de la receta: " + recipeName);
        System.out.println("\tIngredientes: " + ingredients);
        System.out.println("\tTiempo de preparación: " + time+" minutos");
        System.out.println("\tDificultad: " + difficult);
    }
}
