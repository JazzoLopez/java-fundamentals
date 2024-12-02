public class TypeVar {
    public static void main(String[] args) {
        System.out.println("<-- USO DE VAR EN JAVA -->");
        //VARIABLE LOCAL AL METODO
        var name = "Jazzo"; //EL TIPO DE DATO INFIERE EN BASE A LO QUE ALMACENAMOS, SOLO ALMACENA VALORES CADENA
        var age = 20; //SE INFIERE EL TIPO INT
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        var salary = 50000.5; //SE INFIERE EL TIPO FLOAT
        System.out.println("salary = " + salary);
        var isMarried = false;//INFIERE LOS DATOS DE TIPO BOOLEAN
        System.out.println("isMarried = " + isMarried);
        isMarried = true; // CORRECTO
        System.out.println("isMarried = " + isMarried);
        //var data; //NO SE PUEDE PRIMERO DEFINIR Y LUEGO ASIGNAR
    }
}
