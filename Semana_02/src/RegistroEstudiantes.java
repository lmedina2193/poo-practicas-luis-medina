import java.util.HashMap;

public class RegistroEstudiantes {
    // El codigo es la clave: permite localizar un estudiante y evitar duplicados.
    private HashMap<String, Estudiante> estudiantes = new HashMap<>();

    public void registrar(String codigo, String nombre) {
        Estudiante estudiante = new Estudiante(codigo, nombre);
        if (estudiantes.containsKey(estudiante.getCodigo())) {
            throw new IllegalArgumentException("El codigo ya existe.");
        }
        estudiantes.put(estudiante.getCodigo(), estudiante);
    }

    public Estudiante buscar(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("Ingrese un codigo.");
        }
        Estudiante estudiante = estudiantes.get(codigo.trim().toUpperCase());
        if (estudiante == null) {
            throw new IllegalArgumentException("El estudiante no existe.");
        }
        return estudiante;
    }

    public int cantidad() { return estudiantes.size(); }

    public void listar() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        }
        for (Estudiante estudiante : estudiantes.values()) {
            System.out.println(estudiante.getCodigo() + " - " + estudiante.getNombre());
        }
    }
}
