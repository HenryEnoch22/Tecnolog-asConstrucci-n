package LiskovRoberto.Refactor;

public class Main {
    public static void main(String[] args) {
        Persona alumno = new Alumno("Alexis", 10);
        Persona  maestro = new Maestro("Irwing",  "Redes");
        maestro.mostrarInfo();
        alumno.mostrarInfo();

        Alumno alumno1 = (Alumno) alumno;
        alumno1.realizarExamen();
    }
}
