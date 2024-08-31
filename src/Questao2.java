import java.util.Scanner;

public class Questao2 {
    Scanner scan = new Scanner(System.in);

    public void verificaChar(){
        System.out.println("Insira a palavra:");
        String palavra = scan.nextLine();

        if(!palavra.toLowerCase().contains("a")){
            System.out.println("A palavra não contém o caracter 'a'");

        }else {
            System.out.println("A palavra contém o caracter 'a' ");
        }

        int contador = 0;

        for(int i =0; i < palavra.length(); i++){
            char a = 'a';
            char caracter = palavra.charAt(i);
            if(caracter == a){
                contador++;
            }

        }
        System.out.println("O caracter aparece " + contador + " vezes");

    }



}
