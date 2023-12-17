import java.util.Scanner;

public class sumaproducto {
    

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2, suma, producto;
        System.out.println("ingrese el primer numero");
        num1= leer.nextInt();
        System.out.println("ingrese el segundo numero");
        num2= leer.nextInt();
        suma= num1+num2;
        producto= num1*num2;
        System.out.println("Resultadp de la suma:" +suma);
        System.out.println("Resultadp de la multiplicacion:" +producto);
        leer.close();
    } 
}
