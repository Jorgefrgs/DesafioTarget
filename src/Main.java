import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o número da questão:");
        int opcao = scan.nextInt();

        switch (opcao) {
            case(1):
                Questao1 questao1 = new Questao1();
                System.out.println(questao1.fibonnaci());
                break;
            case(2):
                Questao2 questao2 = new Questao2();
                questao2.verificaChar();
                break;
            case(3):
                Questao3 questao3 = new Questao3();
                System.out.println(questao3.soma());
                break;
            case(4):
                Questao4 questao4 = new Questao4();
                System.out.println(questao4.alternativaA());
                System.out.println(questao4.alternativaB());
                System.out.println(questao4.alternativaC());
                System.out.println(questao4.alternativaD());
                System.out.println(questao4.alternativaE());
                System.out.println(questao4.alternativaF());
                break;
            case(5):
                Questao5 questao5 = new Questao5();
                System.out.println(questao5.descobrirInterruptor());
                break;

        }

    }
}