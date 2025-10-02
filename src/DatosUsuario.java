import java.util.Scanner;

public class DatosUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Introduce tu correo electrónico: ");
        String email = scanner.nextLine();

        // Validar el correo electrónico
        boolean emailValido = ProcesadorTexto.esEmailValido(email);

        // Estructura de control if-else
        if (emailValido) {
            Usuario usuario = new Usuario(nombre, edad, email);
            usuario.mostrarInformacion();

            if (edad > 18) {
                System.out.println("Tienes edad para conducir.");
            } else {
                System.out.println("No tienes edad para conducir.");
            }

        } else {
            System.out.println("El usuario no puede ser creado porque el email introducido no es válido.");
        }

        scanner.close();
    }
}