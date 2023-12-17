import java.util.Scanner;

/**
 * practica1ejercicio1
 */
public class practica2ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float ingreso;
        float irp = 80000000;
        System.out.print("Digite el ingreso anual: ");
        ingreso = scanner.nextFloat();
        if (ingreso > irp) {
            System.out.print("Debe abonar IRP el siguiente año");

            
        } else {
            System.out.print("No abona IRP!");

        }

        scanner.close();
        
    }
}