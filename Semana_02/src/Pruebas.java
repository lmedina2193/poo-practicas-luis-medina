public class Pruebas {
    public static void main(String[] args) {
        RegistroEstudiantes registro = new RegistroEstudiantes();
        registro.listar();
        registro.registrar("E001", "Luis Medina Quispe");
        if (registro.cantidad() != 1) { throw new AssertionError("Registro incorrecto"); }
        Estudiante estudiante = registro.buscar(" e001 ");
        if (!estudiante.getNombre().equals("Luis Medina Quispe")) { throw new AssertionError("Busqueda incorrecta"); }
        System.out.println("OK: registrar y buscar por codigo");
        try {
            estudiante.calcularPromedio();
            throw new AssertionError("Se acepto un promedio sin notas");
        } catch (IllegalStateException error) { System.out.println("OK: " + error.getMessage()); }
        estudiante.agregarNota(14);
        estudiante.agregarNota(18);
        if (estudiante.calcularPromedio() != 16) { throw new AssertionError("Promedio incorrecto"); }
        System.out.println("OK: promedio de 14 y 18 = " + estudiante.calcularPromedio());
        try {
            registro.registrar("e001", "Otro nombre");
            throw new AssertionError("Se acepto un duplicado");
        } catch (IllegalArgumentException error) { System.out.println("OK: " + error.getMessage()); }
        try {
            registro.buscar("E999");
            throw new AssertionError("Se encontro un codigo inexistente");
        } catch (IllegalArgumentException error) { System.out.println("OK: " + error.getMessage()); }
        double[] invalidas = {-1, 21, Double.NaN, Double.POSITIVE_INFINITY};
        for (double nota : invalidas) {
            try {
                estudiante.agregarNota(nota);
                throw new AssertionError("Se acepto una nota invalida");
            } catch (IllegalArgumentException error) { System.out.println("OK: rechaza nota " + nota); }
        }
        try {
            registro.registrar("", "Luis");
            throw new AssertionError("Se acepto codigo vacio");
        } catch (IllegalArgumentException error) { System.out.println("OK: rechaza codigo vacio"); }
        if (registro.cantidad() != 1 || estudiante.calcularPromedio() != 16) {
            throw new AssertionError("Los errores modificaron los datos");
        }
        registro.listar();
        System.out.println("TODAS LAS PRUEBAS CORRECTAS");
    }
}
