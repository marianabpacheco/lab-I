import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));
        Aluno aluno1 = new Aluno("Brandamente Brasil","1585258",5,9);
        Aluno aluno2 = new Aluno("Radigunda Cercená","2254879",8,2);
        Aluno aluno3 = new Aluno("Vitimado José Araújo","0085994",7,1);

        aluno1.imprimeInformacoes();
        aluno2.imprimeInformacoes();
        aluno3.imprimeInformacoes();

        aluno2.setGrauA(9);
        System.out.println(aluno2.calcularMediaFinal());
        System.out.println(aluno3.calcularMediaFinal());
        aluno1.setMatricula("1585228");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nova nota: ");
        double grauB = sc.nextDouble();
    }
}