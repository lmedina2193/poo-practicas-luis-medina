public class Principal {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("E001", "Luis Medina Quispe");
        Curso curso = new Curso("Tecnicas de Programacion POO");
        estudiante.saludar();
        curso.inscribir(estudiante);
        curso.mostrarEstudiantes();
    }
}
