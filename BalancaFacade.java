public class BalancaFacade{
    public static void main(String[] args) {


        Balanca bio = new Balanca();

        Aluno carlos = new Aluno(22, 70.5f, 1.80, 10.4, 40.0);

        carlos.realizarBioimpedancia(bio, carlos);


    }
}