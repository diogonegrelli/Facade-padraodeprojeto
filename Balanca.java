public class Balanca{
    boolean ligado = false;

    public void medidasCorporais(Aluno aluno){
        pesar(aluno);
        System.out.println("Seu IMC É " + calcularImc(aluno));
        System.out.println("Sua massa magra é " + calcularmassaMagra(aluno));
    }

    public float pesar(Aluno aluno){
        return aluno.getPesoTotalKg();
    }

    public double calcularPercentGordura(Aluno aluno){
        return aluno.getPercentualGordura();
    }


    public double calcularImc(Aluno aluno){
        double alt = aluno.getAltura();
        float peso = aluno.getPesoTotalKg();
        double altImc = Math.pow(alt, 2.0);
        double imc = peso / altImc;

        return imc;
    }

    public double calcularmassaMagra(Aluno aluno){
        return aluno.getMassaMagra();
    }


    public void ligarBalanca(Balanca balanca){
        balanca.ligado = true;
    }

    public void desligarBalanca(Balanca balanca){
        balanca.ligado = false;
    }

}
