public class Aluno{
    private int idade;
    private float pesoTotalKg;
    private double altura;
    private double percentualGordura;
    private double massaMagra;

    public Aluno(int idade, float pesoTotalKg, double altura, double percentualGordura, double massaMagra){
        this.idade = idade;
        this.pesoTotalKg = pesoTotalKg;
        this.altura = altura;
        this.percentualGordura = percentualGordura;
        this.massaMagra = massaMagra;
    }



    public void realizarBioimpedancia(Balanca balanca, Aluno aluno){
        balanca.ligarBalanca(balanca);
        balanca.medidasCorporais(aluno);
        balanca.desligarBalanca(balanca);
    }

    public float getPesoTotalKg(){
        return pesoTotalKg;
    }

    public void setPesoTotalKg(float pesoTotalKg) {
        this.pesoTotalKg = pesoTotalKg;
    }

    public double getMassaMagra() {
        return massaMagra;
    }

    public void setMassaMagra(float massaMagra) {
        this.massaMagra = massaMagra;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPercentualGordura() {
        return percentualGordura;
    }

    public void setPercentualGordura(float percentualGordura) {
        this.percentualGordura = percentualGordura;
    }
}