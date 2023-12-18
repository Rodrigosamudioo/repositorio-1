public class Banco {
    private Cliente cliente1, cliente2, cliente3;
    public Banco() {
        cliente1 = new Cliente("pablo");
        cliente2 = new Cliente("paola");
        cliente3 = new Cliente("Rodrigo");

    }

    public void operar() {
        cliente1.depositar(50000);
        cliente2.depositar(150000);
        cliente3.depositar(250000);
        cliente3.extraer(100000);
    }
    public void mostrartotal() {
        System.out.println("Total del cliente, =" + cliente1+ " = " + cliente1.retornarMonto());
        System.out.println("Total del cliente, =" + cliente2+ " = " + cliente2.retornarMonto());
        System.out.println("Total del cliente, =" + cliente3+ " = " + cliente3.retornarMonto());

    }
    public void mostrartotalbanco() {
        int total = cliente1.retornarMonto() + cliente2.retornarMonto() +cliente3.retornarMonto();
        System.out.println("Total del banco: " + total);

    }
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.operar();
        banco.mostrartotal();
    }
}
