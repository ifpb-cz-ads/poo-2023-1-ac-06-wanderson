public void BMExercicio06(String nomeCliente, double valorInicial) {
    if (valorInicial < 100.0) {
        System.out.println("Valor mínimo para abertura de conta simples é de R$ 100,00");
    } else {
        this.nomeCliente = nomeCliente;
        this.saldo = valorInicial;
        this.tipoConta = "Simples";
        System.out.println("Conta aberta com sucesso!");
    }
}
