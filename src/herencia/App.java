package herencia;

public class App {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Jose", "Lopez", 1299.9f);
        Alumno alumno1 = new Alumno("Pedro", "Ramirez", 18.4f);

        Persona persona1 = new Alumno("Renzo", "Mejia", 19.4f);
        Persona persona2 = new Profesor("Alex", "Cuadros", 2000f);


    }
}