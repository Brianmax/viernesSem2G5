package herencia;

public class Alumno extends Persona{
    private float promedio;

    public Alumno(String nombre, String apellido, float promedio)
    {
        super(nombre, apellido);
        this.promedio = promedio;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
}