public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    //double pegaMedia;
    int totalDeAvaliacao;
    int duracaoEmMinutos;
    String sinopse;

    int getTotalDeAvaliacao (){
        return  totalDeAvaliacao;
    }

    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duração do Filme: " + duracaoEmMinutos);
        //System.out.println("Avaliação: " + somaDasAvaliacoes);
        System.out.println("Sinopse do Filme: " + sinopse);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao ++;
    }
    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacao;

    }


}

