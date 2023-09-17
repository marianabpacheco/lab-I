// Crie uma classe Livro, que possui título, autor, ano de publicação, preço e quantidade de páginas. Crie um construtor para esta classe e os métodos de acesso de todos os atributos.
//        Na classe Livro, crie um método chamado calcularPrecoPorPagina, que retorna o valor de cada página do livro, levando em conta seu preço.
//        Crie nesta classe, também, um método que imprime as informações de forma clara e organizada.

public class Livro {

    private String nome;
    private String autor;
    private int anoPublicacao;
    private double preco;
    private int qtdPaginas;

    public Livro(String nome, String autor, int anoPublicacao, double preco, int qtdPaginas) {
        this.nome = nome;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
        this.qtdPaginas = qtdPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public double calcularPrecoPorPagina(){
        return preco/qtdPaginas;
    }

    @Override
    public String toString() {
        return "Nome do livro: " + nome + "\n" +
                "Autor: " + autor + "\n" +
                "Ano de publicação: " + anoPublicacao + "\n" +
                "Preço: R$ " + preco + "\n" +
                "Quantidade de páginas: " + qtdPaginas + "\n" +
                "Preço por página: R$ " + calcularPrecoPorPagina();
    }
}
