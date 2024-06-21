import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco( ) {
        super();
        this.contas = new ArrayList<>();
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void exibirContas() {
        if (!contas.isEmpty()) {
            for (Conta conta : contas) {
                System.out.println(conta.toString());
            }
        } else {
            System.out.println("A lista está vazia!!");
        }
    }

    public void setContasCorrente(Cliente cliente) {
        ContaCorrente conta = new ContaCorrente(cliente);
        this.contas.add(conta);
    }

    public void setContasPoupanca(Cliente cliente) {
        ContaPoupanca conta = new ContaPoupanca(cliente);
        this.contas.add(conta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}