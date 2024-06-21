
public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("---Extrato Conta Corrente---");
        super.imprimirInfosComuns();
    }

    @Override
    public String toString() {
        return "ContaPoupanca => agencia: " + agencia + ", numero: " + numero + ", saldo: " + super.saldo + ", cliente: " + cliente;
    }
}