package Ex03;

public class App {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João Silva", "12345-6");

        // Depósitos
        conta.depositar(500.0);
        conta.depositar(200.0);

        // Saques
        conta.sacar(100.0);
        conta.sacar(700.0); // Deve mostrar saldo insuficiente

        // Consulta de saldo
        conta.consultarSaldo();

        // Histórico de transações
        System.out.println("\nHistórico de transações:");
        for (Transacao t : conta.getHistorico()) {
            System.out.println(t);
        }
    }
}
