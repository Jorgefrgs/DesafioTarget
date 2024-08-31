import java.util.ArrayList;
import java.util.List;

public class Questao4 {

    public List<Integer> alternativaA() {
        List<Integer> resultado = new ArrayList<>();
        resultado.add(1);
        for (int i = 0; i < 4; i++) {
            int ponteiro = resultado.get(i);
            resultado.add(ponteiro + 2);


        }
        return resultado;
    }

    public List<Integer> alternativaB() {
        List<Integer> resultado = new ArrayList<>();
        resultado.add(2);
        for (int i = 0; i < 6; i++) {
            int ponteiro = resultado.get(i);
            resultado.add(ponteiro * 2);
        }
        return resultado;
    }

    public List<Integer> alternativaC() {
        List<Integer> resultado = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            int ponteiroSqr = (int) Math.pow(i, 2);
            resultado.add(ponteiroSqr);

        }
        return resultado;
    }

    public List<Integer> alternativaD() {
        List<Integer> resultado = new ArrayList<>();
        for (int i = 2; i < 12; i++) {
            if (i % 2 == 0) {
                int ponteiroSqr = (int) Math.pow(i, 2);
                resultado.add(ponteiroSqr);
            }
        }
        return resultado;
    }

    public List<Integer> alternativaE() {
        List<Integer> resultado = new ArrayList<>();
        resultado.add(1);
        resultado.add(1);
        for (int i = 2; i < 7; i++) {
            int ponteiro = resultado.get(i - 1) + resultado.get(i - 2);
            resultado.add(ponteiro);

        }
        return resultado;


    }

    public List<Integer> alternativaF(){
        List<Integer> resultado = new ArrayList<>();
        resultado.add(2);
        resultado.add(10);
        resultado.add(12);
        for (int i = 4; i < 9; i++) {
            resultado.add(resultado.get(2) + i);


        }
        return resultado;


}
}
