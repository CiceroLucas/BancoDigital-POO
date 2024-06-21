public class Main {
    public static void main(String[] args) {
        Cliente italo = new Cliente();
        italo.setNome("Italo");

        Cliente rebehk = new Cliente();
        rebehk.setNome("Rebehk");

        Cliente marcos = new Cliente();
        marcos.setNome("Marcos");

        Conta cc = new ContaCorrente(italo);
        Conta poupanca = new ContaPoupanca(italo);
        
        Conta ccEliane = new ContaCorrente(rebehk);
        Conta poupancaEliane = new ContaPoupanca(rebehk);

        Conta ccAndre = new ContaCorrente(marcos);
        Conta poupancaAndre = new ContaPoupanca(marcos);

        cc.depositar(80);
        poupanca.depositar(70);

        ccEliane.depositar(50);
        poupancaEliane.depositar(60);

        ccAndre.depositar(80);
        poupancaAndre.depositar(90);

        Banco banco = new Banco();
        banco.getContas().add(cc);
        banco.getContas().add(poupanca);
        banco.getContas().add(ccEliane);
        banco.getContas().add(poupancaEliane);
        banco.getContas().add(ccAndre);
        banco.getContas().add(poupancaAndre);

        banco.exibirContas();
    }
}