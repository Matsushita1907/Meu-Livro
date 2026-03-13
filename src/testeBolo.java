import java.sql.SQLOutput;

public class testeBolo {
    public static void main(String[] args) {
        Bolo meuBolo = new Bolo();
        meuBolo.autor = "Vanessa Souza";
        meuBolo.nome = "Bolo de Milho";
        meuBolo.dificuldade = "Muito Facil";
        meuBolo.avaliacao = 4.8;
        meuBolo.tempoPreparo = 50;
        meuBolo.porcoes = 10;
        meuBolo.descricao  = "O bolo de milho....";
        System.out.println(meuBolo.nome);
        System.out.println(meuBolo.autor);
        System.out.println(meuBolo.tempoPreparo + "min" + "\t\t" +
                meuBolo.dificuldade + "\t\t +" +
                meuBolo.avaliacao + "\t\t" +
                meuBolo.porcoes + "porções");
    }
}
