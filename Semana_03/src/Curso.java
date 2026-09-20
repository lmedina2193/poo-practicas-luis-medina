// Practica de sobrecarga realizada por Luis Medina Quispe
import java.util.HashMap;

public class Curso {
    private String nombre;
    private HashMap<String, Estudiante> estudiantes = new HashMap<>();
    private HashMap<String, String> observaciones = new HashMap<>();

    public Curso(String nombre) { this.nombre = nombre; }

    // Version corta: se usa cuando no hay observacion.
    public void inscribir(Estudiante estudiante) throws InscripcionException {
        inscribir(estudiante, "Sin observacion");
    }

    // Mismo nombre y otro parametro: esto es sobrecarga de metodos.
    public void inscribir(Estudiante estudiante, String observacion) throws InscripcionException {
        if (estudiante == null) { throw new InscripcionException("Falta el estudiante."); }
        if (estudiantes.containsKey(estudiante.getCodigo())) {
            throw new InscripcionException("El estudiante ya esta inscrito.");
        }
        if (observacion == null || observacion.trim().isEmpty()) {
            throw new InscripcionException("La observacion no puede estar vacia.");
        }
        estudiantes.put(estudiante.getCodigo(), estudiante);
        observaciones.put(estudiante.getCodigo(), observacion);
        System.out.println("Inscrito: " + estudiante.getNombre() + " - " + observacion);
    }

    public int cantidad() { return estudiantes.size(); }

    public void mostrar() {
        System.out.println("Curso: " + nombre + " | Total inscritos: " + estudiantes.size());
    }
}
