 // Crie uma classe chamada Principal. Nela, coloque o método main.
 //       No main, crie 3 instâncias de Livro e 3 instâncias de Cliente. Todas as informações necessárias para a criação dos objetos devem ser solicitadas pelo Teclado.
 //      Imprima o preço por página de cada um dos livros criados.
 //       Imprima as informações de todos os objetos criados.

 import java.util.Scanner;

 public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o nome do livro: ");
            String nome = sc.nextLine();
            System.out.print("Digite o autor do livro: ");
            String autor = sc.nextLine();
            System.out.print("Digite o ano de publicação do livro: ");
            int anoPublicacao = sc.nextInt();
            System.out.print("Digite o preço do livro: ");
            double preco = sc.nextDouble();
            System.out.print("Digite a quantidade de páginas do livro: ");
            int qtdPaginas = sc.nextInt();
            Livro livro = new Livro(nome, autor, anoPublicacao, preco, qtdPaginas);
            System.out.println(livro);
        }


        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o seu nome: ");
            String nome = sc.nextLine();
            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();
            System.out.print("Digite seu sexo: ");
            char sexo = sc.next().charAt(0);
            System.out.print("Digite o seu email: ");
            sc.nextLine();
            String email = sc.nextLine();
            System.out.print("Digite sua senha: ");
            String senha = sc.nextLine();
            Cliente cliente = new Cliente(nome, idade, sexo,email,senha);
            System.out.println(cliente);

        }
    }
}