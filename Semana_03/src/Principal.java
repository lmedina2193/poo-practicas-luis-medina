public class Principal {
    public static void main(String[] args) {
        Curso curso = new Curso("Tecnicas de Programacion POO");
        Estudiante luis = new Estudiante("E001", "Luis Medina Quispe");
        Estudiante ana = new Estudiante("E002", "Ana Perez"); // Dato de prueba.
        System.out.println("Semana 3 - Luis Medina Quispe");
        try {
            curso.inscribir(luis);
            curso.inscribir(ana, "Matricula regular");
            curso.inscribir(luis); // Provoca un error controlado: codigo repetido.
        } catch (InscripcionException error) {
            System.out.println("Error controlado: " + error.getMessage());
        } finally {
            // Se ejecuta tanto si hubo error como si todo salio bien.
            System.out.println("Revision de inscripciones finalizada.");
        }
        curso.mostrar();
        if (curso.cantidad() != 2) { throw new AssertionError("Cantidad incorrecta"); }
        try {
            luis.agregarNota(25);
            throw new AssertionError("Se acepto nota 25");
        } catch (IllegalArgumentException error) {
            System.out.println("Error controlado: " + error.getMessage());
        }
        try {
            curso.inscribir(null);
            throw new AssertionError("Se acepto un estudiante nulo");
        } catch (InscripcionException error) {
            System.out.println("Error controlado: " + error.getMessage());
        }
        System.out.println("Pruebas completadas correctamente.");
    }
}
