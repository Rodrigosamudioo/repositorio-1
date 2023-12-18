import java.util.Scanner;

public class practica3ejerciciow2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario;
        String usuarioCorrecto = "admin";
        int pin;
        int pinCorrecto = 1234567;
        int correcto = 0;
        System.out.println("Acceso al sistema");
        while (correcto <=0) {
             System.out.println("Ingrese usuario: ");
            usuario = scanner.nextLine();
             System.out.println("Ingrese pin: ");
             pin = scanner.nextInt();
            if ((usuario.equals(usuarioCorrecto))&& (pin == pinCorrecto)) {
                correcto = 1;
            }
             System.out.println("Usuario y/o pin incorrecto");
             scanner.nextLine();
        }
         System.out.println("Bienvenido al sistema!!");
         scanner.close();
    }
}
