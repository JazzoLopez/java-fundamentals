package cadenas;

public class EmailGenerator {
    public static void main(String[] args) {
        String name = "Jazziel Rodriguez Lopez";
        String school = "Universidad Tecnologica";
        String domain = ".edu.mx";

        String normalizedName = name.replace(" ", ".").toLowerCase();
        String normalizedSchool = school.replace(" ", "").toLowerCase();

        String email = normalizedName +
                "@" +
                normalizedSchool +
                domain;

        System.out.println("->> Generador de emails <<-");
        System.out.println("Nombre del usuario = " + name);
        System.out.println("Nombre del usuario normalizado = " + normalizedName + "\n");
        System.out.println("Nombre de la escuela = " + school);
        System.out.println("Dominio del email normalizado = @" + normalizedSchool + domain + "\n");
        System.out.println("Email final generado = " + email);
    }
}
