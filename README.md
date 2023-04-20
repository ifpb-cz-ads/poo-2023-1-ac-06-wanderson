1. Modelo da lâmpada:
Nome da lâmpada
Marca da lâmpada
Tipo de lâmpada (LED, incandescente, fluorescente, etc.)
Potência (em watts)
Tensão (em volts)
Preço (em reais)
Disponibilidade em estoque (quantidade)


2. Modelo do time em um campeonato:
Nome do time
País de origem do time
Lista de jogadores (nome, posição, idade, etc.)
Técnico do time (nome, nacionalidade, anos de experiência, etc.)
Classificação atual no campeonato
Pontuação atual no campeonato
Histórico de jogos (data, adversário, resultado, etc.)

7.
Há um erro de sintaxe na linha 1, onde há um espaço entre "Registro" e "De", que deveria ser removido. Além disso, a classe não possui um construtor, o que pode dificultar a criação de instâncias dessa classe em outras partes do programa. Outro possível problema é que a visibilidade dos atributos não foi definida, o que significa que eles são "default", ou seja, visíveis apenas dentro do mesmo pacote. Isso pode ser intencional ou não, dependendo da intenção do programador. Por fim, não há métodos ou operações definidos na classe, o que pode limitar sua utilidade em um programa mais complexo.

8.
Na linha 7, há um caractere "*" extra que deve ser removido.
O método maior() retorna um int, mas a implementação está retornando um boolean. A implementação deveria ser corrigida para retornar um int.
O método menor() está com problemas de sintaxe. A linha 16 deveria ser substituída por int menor() {, e a linha 17 deveria ser excluída. Além disso, o retorno deveria ser feito fora do bloco de if/else, e não dentro, como está atualmente. Assim, as linhas 18 e 20 deveriam ser removidas e a linha 19 deveria ser alterada para return num1;.

9.
Na linha 1, o nome da classe está escrito como "Testelmpressao", com a letra "i" faltando na palavra "Impressão".
O método main não tem a palavra-chave public na sua definição, o que é necessário para que ele possa ser executado como um ponto de entrada do programa.
O método main está sem o tipo de retorno, que deve ser void.
O método main precisa ter a assinatura correta, com a palavra-chave static antes do void.
Na linha 5, a função de impressão está escrita como printIn, mas deveria ser println.
Na linha 6, a função de impressão está escrita como printin, mas deveria ser println.
Na linha 7, a função de impressão está escrita como printin, mas deveria ser println.
Na linha 8, a função de impressão está escrita como printIn, mas deveria ser println.
A linha 11 não deveria estar ali, pois já foi utilizado o comando de fechamento da classe na linha 10.

10.
Na classe TesteDatas- Na linha 3, a palavra-chave static deveria vir antes da palavra-chave void no método main.
Na linha 5, a declaração do objeto hoje está incompleta. É necessário utilizar parênteses para chamar o construtor da classe Data2: Data2 hoje = new Data2();.
Na linha 7, o objeto amanha não foi instanciado, o que causa um erro de compilação. É necessário utilizar o operador new para criar uma nova instância da classe Data2: Data2 amanha = new Data2();.
Na linha 9, a função de impressão está escrita como printin, mas deveria ser println.
Na linha 11, há um número "solto" que não tem utilidade na classe.

Na classe TesteObjetos - Na linha 5, há uma declaração incompleta do objeto a. É necessário instanciar a classe Data utilizando o operador new: Data a = new Data();.
Na linha 6, a declaração do objeto b já cria uma instância da classe Data, então a próxima linha que atribui null a b é desnecessária.
Na linha 8, a variável a precisa ser inicializada com algum valor antes de ser atribuída a b, caso contrário, haverá um erro de compilação.


Atividade Pratica 1 - Classe TesteIgualdade: A classe cria duas strings com o mesmo conteúdo, mas em posições de memória diferentes. A comparação usando == retorna false, pois compara as posições de memória. Para comparar o conteúdo de strings, deve-se usar o método equals(). Ao testar a classe, é necessário usar frase1.equals(frase2) para comparar as strings corretamente.

Atividade Pratica 2 - Classe TesteIgualdade2: A classe cria duas strings com o mesmo conteúdo. A variável frase4 é inicializada como uma referência para a variável frase3, em vez de criar uma nova instância da string. A comparação usando == retorna true porque as duas variáveis apontam para a mesma instância de string na memória. Isso ilustra que duas variáveis podem apontar para o mesmo objeto, e a comparação usando == retorna true quando elas se referem ao mesmo objeto.

Atividade Pratica 3 - Classe TesteIgualdade3: A classe cria duas strings com o mesmo conteúdo e usa o método equals() para comparar o conteúdo das strings. O método equals() compara o conteúdo das strings e retorna true se as duas strings tiverem o mesmo conteúdo e false caso contrário. Ao executar a classe TesteIgualdade3, a saída deve ser true, porque as duas strings possuem o mesmo conteúdo. Isso ilustra que para comparar o conteúdo de strings em Java, deve-se usar o método equals() em vez de ==, que compara as posições de memória.

Atividade Pratica 4 - A classe RegistraAluno define um objeto que possui as informações de um aluno, incluindo nome, endereço, idade e notas em três disciplinas. Além disso, a classe possui um atributo estático contadorEstudante que mantém a quantidade total de instâncias criadas da classe. A classe AppRegistraAluno cria três objetos RegistraAluno e define seus nomes. O método getQuantidadeAlunos é chamado para retornar o número total de instâncias criadas da classe.