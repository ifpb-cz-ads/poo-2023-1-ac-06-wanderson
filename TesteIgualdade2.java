class TesteIgualdade2 {
    public static void main(String[] args) {
        String frase3;
        String frase4;
        frase3 = new String("Testando igualdade!");
        frase4 = frase3;
        System.out.println("Frase 1:"+frase3);
        System.out.println("Frase 2:"+frase4);
        System.out.println("Frase 3 e frase 4 são iguais? R:"+(frase3==frase4));
    }
}