public void BMExercicio03() {
    System.out.println("Nome: " + this.nomeCliente);
    System.out.println("Número da conta: " + this.numeroConta);
    System.out.println("Tipo da conta: " + this.tipoConta);
    System.out.println("Saldo: " + this.saldo);
    if (this.tipoConta.equals("Especial") && this.saldo < 0) {
        System.out.println("ATENÇÃO: SALDO NEGATIVO!");
    }
}
