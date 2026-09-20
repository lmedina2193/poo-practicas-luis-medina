import java.util.ArrayList;

public class Estudiante {
    private String codigo;
    private String nombre;
    private ArrayList<Double> notas = new ArrayList<>();

    public Estudiante(String codigo, String nombre) {
        if (codigo == null || codigo.trim().isEmpty() || nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El codigo y el nombre son obligatorios.");
        }
        this.codigo = codigo.trim().toUpperCase();
        this.nombre = nombre.trim();
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public boolean tieneNotas() { return !notas.isEmpty(); }

    public void agregarNota(double nota) {
        // Se rechazan numeros especiales y notas fuera de la escala elegida.
        if (!Double.isFinite(nota) || nota < 0 || nota > 20) {
            throw new IllegalArgumentException("La nota debe estar entre 0 y 20.");
        }
        notas.add(nota);
    }

    public double calcularPromedio() {
        if (notas.isEmpty()) {
            throw new IllegalStateException("El estudiante no tiene notas.");
        }
        double suma = 0;
        for (double nota : notas) {
            suma = suma + nota;
        }
        return suma / notas.size();
    }
}
