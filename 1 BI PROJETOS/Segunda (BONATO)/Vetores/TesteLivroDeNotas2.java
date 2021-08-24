import javax.swing.*;

public class TesteLivroDeNotas2 {

    public static void main(String[] args) {
        // instancia um livro de notas para a disciplina Programação com 10 alunos
        LivroDeNotas2 livro = new LivroDeNotas2("Programação", 10);
        // gera notas aleatórias
        livro.gerarNotas();
        // calcula as médias
        livro.calcularMedias();
        // exibe as médias
        livro.mostrarMedias();
    }

    public void exibeMaior () {
        //suponha que o primeiro seja o maior
        double maior = this.medias [0];
        //olhe para os demais, um a um
        for (int i = 1; i < this.qtdeAlunos; i++) {
        //se encontrar um maior, atualize a variável
        if (this.medias[i] > maior)
        maior = this.medias[i];
        
        }
        //exibe o maior, que está na variável maior
        JOptionPane.showMessageDialog(null, "Maior média:"  + maior);
        }
}
