import java.util.ArrayList;



public class BlocoDeNotas {

    private ArrayList<String> notas;

    public BlocoDeNotas() {
        notas = new ArrayList<>();
    }

    // adicionar um elemento
    public void inserir(String nota) {
        notas.add(nota);
    }

    // remover um elemento
    public void remover(int posicao) {
        if (posicao >= 0 && posicao < notas.size()) {
            notas.remove(posicao);

        } else {
            System.out.println("Nota inexixtente");
        }

    }

    // retornar no exemplo a nota que esta na posicao 0 (Busca seuquencial , ter um
    // vetor ou arraylist e ver de posicao em posicao se encontar retornar a posicao
    // para).
    public int buscar(String chave) {
        int posicao = -1;

        /* busca sequencial */ for (int i = 0; i < notas.size(); i++) {

            String nota = notas.get(i);
            if (nota.equals(chave)) {
                posicao = i;

                break;
            }
        }

        return posicao;

    }

    public void listar() {
        for (String nota : notas) {
            System.out.println(nota);
        }

    }

}
