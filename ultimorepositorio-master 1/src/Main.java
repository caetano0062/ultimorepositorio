public class Main {
    public static void main(String[] args) {
        int cont=0;

        Questao q1 = new Questao();
        q1.pergunta="1-quanto e 5 vezes 11 ?";
        q1.opcaoA="a - 17";
        q1.opcaoB="b - 99";
        q1.opcaoC="c - 19";
        q1.opcaoD="d - 55";
        q1.opcaoE="e- 55";
        q1.correta="d";

        q1.escrevaQuestao();
        String resposta = q1.leiaResposta();
        if (q1.isCorreta(resposta)){
            cont++;
        }





        Questao q2 = new Questao();
        q2.pergunta="1-quantos planetas existem no sistema solar?";
        q2.opcaoA="a - 11";
        q2.opcaoB="b - 12";
        q2.opcaoC="c - 5";
        q2.opcaoD="d - 7";
        q2.opcaoE="e - 8";
        q2.correta="e";

        q2.escrevaQuestao();
        resposta = q2.leiaResposta();
        if (q2.isCorreta(resposta)){
            cont++;
        }

        //proxima questao


        Questao q3 = new Questao();
        q3.pergunta="1-quem descobriu o brasil?";
        q3.opcaoA="a - pedro alvares cabral";
        q3.opcaoB="b - jair messias bolsonaro";
        q3.opcaoC="c - jucelino kubtchek";
        q3.opcaoD="d - donald trump";
        q3.opcaoE="e - bob chartlon";
        q3.correta="a";

        q3.escrevaQuestao();
        resposta = q3.leiaResposta();
        if (q3.isCorreta(resposta)){
            cont++;
        }

        //proxima questao


        Questao q4 = new Questao();
        q4.pergunta="1-quantas estrelas existem no universo observável?";
        q4.opcaoA="a - 1 bilhao 600 milhoes 934 mil";
        q4.opcaoB="b - 23 milhoes e 500 mil ";
        q4.opcaoC="c - 27 elevado a setima pontencia ";
        q4.opcaoD="d - 498 milhoes ";
        q4.opcaoE="e - 7 × 10 elevado a 22";
        q4.correta="e";

        q4.escrevaQuestao();
        resposta = q4.leiaResposta();
        if (q4.isCorreta(resposta)){
            cont++;
        }
        //proxima questao


        Questao q5 = new Questao();
        q5.pergunta="1-quando aconteceu o atentado de 11 de setembro  ?";
        q5.opcaoA="a - 14 de novembro";
        q5.opcaoB="b - 11 de janeiro ";
        q5.opcaoC="c - 32 de setembro  ";
        q5.opcaoD="d - 11 de setembro ";
        q5.opcaoE="e - ontem";
        q5.correta="d";

        q5.escrevaQuestao();
        resposta = q5.leiaResposta();
        if (q5.isCorreta(resposta)){
            cont++;
        }


        Questao q6 = new Questao();
        q6.pergunta="1-qual orgao responsavel por bombear sangue ao nosso corpo  ?";
        q6.opcaoA="a - rim";
        q6.opcaoB="b - olhos ";
        q6.opcaoC="c - estomago  ";
        q6.opcaoD="d - pulmões";
        q6.opcaoE="e - coração";
        q6.correta="e";

        q6.escrevaQuestao();
        resposta = q6.leiaResposta();
        if (q6.isCorreta(resposta)){
            cont++;
        }

        //proxima questao


        Questao q7 = new Questao();
        q7.pergunta="1- SUPONDO que há uma pena com a massa de 50 gramas caindo de uma altura de 10 metro a uma velocidade de 1 metro por e um papel com 25 gramas tambem caindo a mesma velocidade  e altura , qual deles cairia primeiro?";
        q7.opcaoA="a - ambos cairam no mesmo tempo";
        q7.opcaoB="b - a pena caiu primeiro ";
        q7.opcaoC="c - o martelo caiu primeiro";
        q7.opcaoD="d - é impossivel ambos nao cairem simultaneamente";
        q7.opcaoE="e - todas as opçao estao erradas ";
        q7.correta="a";

        q7.escrevaQuestao();
        resposta = q7.leiaResposta();
        if (q7.isCorreta(resposta)){
            cont++;
        }
        //proxima questao
        Questao q8 = new Questao();
        q8.pergunta="1- qual nome do atual presidente?";
        q8.opcaoA="a - cabo daciolo";
        q8.opcaoB="b -luiz inacio da silva";
        q8.opcaoC="c - tiririca";
        q8.opcaoD="d -marina";
        q8.opcaoE="e - dilma rousself  ";
        q8.correta="b";

        q8.escrevaQuestao();
        resposta = q8.leiaResposta();
        if (q8.isCorreta(resposta)){
            cont++;
        }
        //proxima questao
        Questao q9 = new Questao();
        q9.pergunta="1- em que regiao vivemos ?";
        q9.opcaoA="a -centro oeste ";
        q9.opcaoB="b -sul";
        q9.opcaoC="c - norte";
        q9.opcaoD="d -nordeste";
        q9.opcaoE="e - suldeste ";
        q9.correta="a";

        q9.escrevaQuestao();
        resposta = q9.leiaResposta();
        if (q9.isCorreta(resposta)){
            cont++;
        }
        //proxima questao
        Questao q10= new Questao();
        q10.pergunta="1- qual destes musicos é o criador da musica NOT LIKE US  ?";
        q10.opcaoA="a -kendrik lamar  ";
        q10.opcaoB="b -eminem";
        q10.opcaoC="c - kanie west";
        q10.opcaoD="d -asap rock ";
        q10.opcaoE="e - destroy lonel ";
        q10.correta="a";

        q10.escrevaQuestao();
        resposta = q10.leiaResposta();
        if (q10.isCorreta(resposta)){
            cont++;
        }
        //proxima questao
        Questao q11= new Questao();
        q11.pergunta="1- complete o ditado DEUS AJUDA QUEM   ?";
        q11.opcaoA="a -acorda tarde ";
        q11.opcaoB="b -cedo madruga";
        q11.opcaoC="c - quem vira a noite ";
        q11.opcaoD="d -quem muito trabalha";
        q11.opcaoE="e - quem pouco trabalha ";
        q11.correta="b";

        q11.escrevaQuestao();
        resposta = q11.leiaResposta();
        if (q11.isCorreta(resposta)){
            cont++;
        }
        //proxima questao
        Questao q12= new Questao();
        q12.pergunta="1- se uma moeda com apenas duas faces forem jogadas ao alto com o numero 2 de um lado 1 do outro , qual a probabilidade de um dos 2 numeros cair   ?";
        q12.opcaoA="a -56%";
        q12.opcaoB="b -77%";
        q12.opcaoC="c - 23 %";
        q12.opcaoD="d -50%";
        q12.opcaoE="e - 46% ";
        q12.correta="d";

        q12.escrevaQuestao();
        resposta = q12.leiaResposta();
        if (q12.isCorreta(resposta)){
            cont++;
        }
        //proxima questao
        Questao q13= new Questao();
        q13.pergunta="1- quanto e 25% de 100  ?";
        q13.opcaoA="a -56";
        q13.opcaoB="b -77";
        q13.opcaoC="c - 23 ";
        q13.opcaoD="d -50";
        q13.opcaoE="e - 25 ";
        q13.correta="e";

        q13.escrevaQuestao();
        resposta = q13.leiaResposta();
        if (q13.isCorreta(resposta)){
            cont++;
        }
        //proxima questao
        Questao q14= new Questao();
        q14.pergunta="1- qual nome do planeta nomeado como O PLANETA VERMELHO  ?";
        q14.opcaoA="a  plutao ";
        q14.opcaoB="b saturno";
        q14.opcaoC="c - sol";
        q14.opcaoD="d -terra";
        q14.opcaoE="e - marte ";
        q14.correta="e";

        q14.escrevaQuestao();
        resposta = q14.leiaResposta();
        if (q14.isCorreta(resposta)){
            cont++;
        }
        //proxima questao
        Questao q15= new Questao();
        q15.pergunta="1- h2o e a nomeclatura de qual elemento  ?";
        q15.opcaoA="a  agua ";
        q15.opcaoB="b gas carbonico";
        q15.opcaoC="c - titaniu";
        q15.opcaoD="d -ferro";
        q15.opcaoE="e - ouro ";
        q15.correta="e";

        q15.escrevaQuestao();
        resposta = q15.leiaResposta();
        if (q15.isCorreta(resposta)){
            cont++;
        }

        double porcetagem= ((double)cont / 15.0) * 100;
        System.out.println("voce acertou "+porcetagem+"%");
        System.out.println("voce acertou" +cont+ "de 15 questoes");
    }
}