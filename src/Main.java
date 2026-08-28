package PACKAGE_NAME;
import java.util.ArrayList;

public class Main {
ArrayList<Integer> l = new ArrayList<>();
}
public class Repetidos {
    public static int nroRepeat(ArrayList<Integer> l) {
        int contador = 0;
        ArrayList<Integer> jaContados = new ArrayList<>();

        for (int i = 0; i < l.size(); i++) {
            int valor = l.get(i);

            if (jaContados.contains(valor)) {
                continue;
            }

            int ocorrencias = 0;
            for (int j = 0; j < l.size(); j++) {
                if (l.get(j) == valor) {
                    ocorrencias++;
                }
            }

            if (ocorrencias > 1) {
                contador++;
                jaContados.add(valor);
            }
        }

        return contador;
    }
   public static ArrayList<Integer> listRepeat(ArrayList<Integer> l) {
        ArrayList<Integer> repetidos = new ArrayList<>();

        for (int i = 0; i < l.size(); i++) {
            int valor = l.get(i);

            if (repetidos.contains(valor)) {
                continue;
            }

            int ocorrencias = 0;
            for (int j = 0; j < l.size(); j++) {
                if (l.get(j) == valor) {
                    ocorrencias++;
                }
            }

            if (ocorrencias > 1) {
                repetidos.add(valor);
            }
        }

        return repetidos;
    }
