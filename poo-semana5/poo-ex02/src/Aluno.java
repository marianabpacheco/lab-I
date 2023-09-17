public class Aluno {
    private String nome;
    private String matricula;
    private double grauA;
    private double grauB;

    public Aluno(String nome, String matricula, double grauA, double grauB) {
        this.nome = nome;
        this.matricula = matricula;
        this.grauA = grauA;
        this.grauB = grauB;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getGrauA() {
        return grauA;
    }

    public void setGrauA(double grauA) {
        this.grauA = grauA;
    }

    public double getGrauB() {
        return grauB;
    }

    public void setGrauB(double grauB) {
        this.grauB = grauB;
    }

    public double calcularMediaFinal(){
        return (this.grauA * 0.33) + (this.grauB * 0.67);
    }


    public void imprimeInformacoes(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Matrícula do aluno: " + matricula);
        System.out.println("Nota do Grau A: " + grauA);
        System.out.println("Nota do Grau B: " + grauB);
        System.out.println("Média final: " + calcularMediaFinal());
    }
}
