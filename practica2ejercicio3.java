import java.util.Scanner;

public class practica2ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String caracter;
        System.out.println("Programa Java Condicional String");
        System.out.println("Tipee un caracter");
        caracter = scanner.nextLine();
        if ((caracter.compareTo("A")>= 0)&& (caracter.compareTo("Z")<= 0)) {
            System.out.println("El caracter no existe");

        } else{
            System.out.println("El caracter no es una mayuscula");
        }
        scanner.close();
    }
}
