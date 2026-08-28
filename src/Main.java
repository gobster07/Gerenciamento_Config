import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(1);
        l.add(2);
        l.add(1);
        System.out.println(nroRepeat(l));
        System.out.println(listRepeat(l));
        System.out.println(hasRepeat(l));

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);

        System.out.println(union(l, l2));
        System.out.println(intersect(l, l2));

    }

    public static boolean hasRepeat(ArrayList<Integer> l) {
        return nroRepeat(l) > 0;
    }



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

    public static ArrayList<Integer> union(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> uniao = new ArrayList<>();

        for (int i = 0; i < l1.size(); i++) {
            int valor = l1.get(i);
            if (!uniao.contains(valor)) {
                uniao.add(valor);
            }
        }

        for (int i = 0; i < l2.size(); i++) {
            int valor = l2.get(i);
            if (!uniao.contains(valor)) {
                uniao.add(valor);
            }
        }

        return uniao;
    }

    public static ArrayList<Integer> intersect(ArrayList<Integer> l1, ArrayList<Integer> l2) {
        ArrayList<Integer> intersecao = new ArrayList<>();

        for (int i = 0; i < l1.size(); i++) {
            int valor = l1.get(i);
            if (l2.contains(valor) && !intersecao.contains(valor)) {
                intersecao.add(valor);
            }
        }

        return intersecao;
    }
}