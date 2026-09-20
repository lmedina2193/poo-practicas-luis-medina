import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        RegistroEstudiantes registro = new RegistroEstudiantes();
        int opcion = -1;
        System.out.println("Gestion de estudiantes - Luis Medina Quispe");
        while (opcion != 0) {
            System.out.println("1 Registrar | 2 Listar | 3 Buscar | 4 Nota | 5 Promedio | 0 Salir");
            try {
                if (!teclado.hasNextLine()) { break; }
                opcion = Integer.parseInt(teclado.nextLine().trim());
                switch (opcion) {
                    case 1:
                        System.out.print("Codigo: ");
                        String codigo = teclado.nextLine();
                        System.out.print("Nombre: ");
                        String nombre = teclado.nextLine();
                        registro.registrar(codigo, nombre);
                        System.out.println("Estudiante registrado.");
                        break;
                    case 2:
                        registro.listar();
                        break;
                    case 3:
                        System.out.print("Codigo: ");
                        System.out.println("Encontrado: " + registro.buscar(teclado.nextLine()).getNombre());
                        break;
                    case 4:
                        System.out.print("Codigo: ");
                        Estudiante estudiante = registro.buscar(teclado.nextLine());
                        System.out.print("Nota de 0 a 20: ");
                        double nota = Double.parseDouble(teclado.nextLine().trim());
                        estudiante.agregarNota(nota);
                        System.out.println("Nota registrada.");
                        break;
                    case 5:
                        System.out.print("Codigo: ");
                        double promedio = registro.buscar(teclado.nextLine()).calcularPromedio();
                        System.out.println("Promedio: " + promedio);
                        break;
                    case 0:
                        System.out.println("Programa terminado.");
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                }
            } catch (NumberFormatException error) {
                System.out.println("Ingrese un numero valido. Para decimales use punto.");
            } catch (IllegalArgumentException | IllegalStateException error) {
                System.out.println(error.getMessage());
            } catch (java.util.NoSuchElementException error) {
                System.out.println("Entrada finalizada.");
                break;
            }
        }
        teclado.close();
    }
}
