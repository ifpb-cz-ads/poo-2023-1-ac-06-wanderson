public class BMExercicio05 {
    private String nome;
    private String paisOrigem;
    private List<Jogador> jogadores;
    private Tecnico tecnico;
    private int classificacaoAtual;
    private int pontuacaoAtual;
    private List<Jogo> historicoJogos;

}

public class Jogador {
    private String nome;
    private String posicao;
    private int idade;
}

public class Tecnico {
    private String nome;
    private String nacionalidade;
    private int anosExperiencia;
}

public class Jogo {
    private LocalDate data;
    private String adversario;
    private String resultado;
}
