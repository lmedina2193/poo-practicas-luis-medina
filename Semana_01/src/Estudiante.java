public class Estudiante {
    // Cada estudiante guarda sus propios datos.
    private String codigo;
    private String nombre;

    public Estudiante(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }

    public void saludar() {
        System.out.println("Hola, soy " + nombre + ". Mi codigo es " + codigo);
    }
}
