import java.util.ArrayList;
import java.util.List;

public class Questao5 {

    public List<String> descobrirInterruptor() {

        boolean[] lampadas = {false, false, false};
        boolean[] quentes = {false, false, false};

        lampadas[0] = true;


        lampadas[0] = false;
        quentes[0] = true;
        lampadas[1] = true;

        return verificarLampadas(lampadas, quentes);
    }

    public static List<String> verificarLampadas(boolean[] lampadas, boolean[] quentes) {
        List<String> resultados = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            if (lampadas[i]) {
                resultados.add("Lâmpada " + (i + 1) + " está acesa e é controlada pelo Interruptor B.");
            } else if (quentes[i]) {
                resultados.add("Lâmpada " + (i + 1) + " está apagada, mas quente, e é controlada pelo Interruptor A.");
            } else {
                resultados.add("Lâmpada " + (i + 1) + " está apagada e fria, e é controlada pelo Interruptor C.");
            }
        }
        return resultados;
    }
}