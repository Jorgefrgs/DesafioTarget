import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao1 {
    Scanner scan = new Scanner(System.in);
    public String fibonnaci(){
        System.out.println("Indique o ponto de parada da sequência:");
        int tamanho = scan.nextInt();
        List<Integer> resultado = new ArrayList<>();
        resultado.add(1);
        resultado.add(1);
        for(int i =2; i < tamanho; i++) {
            int ponteiro = resultado.get(i-1) + resultado.get(i-2);
            resultado.add(ponteiro);

        }
        System.out.println("Indique o número a ser verificado:");
        int numero = scan.nextInt();
        if(!resultado.contains(numero)){
           return "O número informado não pertence a sequência";
        }
        return  "O número informado pertence a sequência";



    }

}

