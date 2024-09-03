package LiskovRoberto.SinRefactor;

public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
    }

    public void realizarExamen(){
        System.out.println(nombre + " está realizando un examen.");
    }
}

class Alumno extends Persona{
    private int calificacion;

    public Alumno(String nombre, int calificacion) {
        super(nombre);
        this.calificacion = calificacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Calificacion: " + calificacion);
    }

    @Override
    public void realizarExamen() {
        System.out.println(getNombre() + " realizando un examen.");
    }
}

class Maestro extends Persona{
    private String materia;

    public Maestro(String nombre, String materia) {
        super(nombre);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Materia: " + materia);
    }

    @Override
    public void realizarExamen() {
        throw new UnsupportedOperationException("Los maestros no realizan exámenes");
    }
}

class Main{
    public static void realizarActividades(Persona persona) {
        persona.realizarExamen();
    }

    public static void main(String[] args) {
        Persona alumno = new Alumno("Juan", 9);
        Persona maestro = new Maestro("JVergara", "Introducción");

        realizarActividades(alumno);
        realizarActividades(maestro);

    }
}
