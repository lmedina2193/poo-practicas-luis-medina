import java.util.ArrayList;

public class Curso {
    private String nombre;
    // La lista permite guardar varios objetos Estudiante.
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public Curso(String nombre) { this.nombre = nombre; }

    public void inscribir(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarEstudiantes() {
        System.out.println("Curso: " + nombre);
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getCodigo() + " - " + estudiante.getNombre());
        }
    }
}
