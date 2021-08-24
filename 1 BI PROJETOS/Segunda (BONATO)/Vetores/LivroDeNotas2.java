import java.util.*;
import javax.swing.*;

public class LivroDeNotas2 {
    private String nomeDisciplina;
    private double notas1[];
    private double notas2[];
    private double medias[];
    private int qtdeAlunos;

    public LivroDeNotas2(String nomeDisciplina, int qtdeAlunos) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas1 = new double[qtdeAlunos];
        this.notas2 = new double[qtdeAlunos];
        this.medias = new double[qtdeAlunos];
        this.qtdeAlunos = qtdeAlunos;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void gerarNotas() {

        Random gerador = new Random();
        for (int i = 0; i < this.qtdeAlunos; i++) {
            this.notas1[i] = gerador.nextDouble() * 10;
            this.notas2[i] = gerador.nextDouble() * 10;
        }
    }

    public void calcularMedias() {

        for (int i = 0; i < this.notas1.length; i++) {
            double media = (this.notas1[i] + this.notas2[i]) / 2;
            this.medias[i] = media;
        }

    }

    public void mostrarMedias() {
        String todasAsMedias = "";
        for (int i = 0; i < qtdeAlunos; i++) {
            todasAsMedias += String.format("Aluno %d: %.2f\n", i + 1, medias[i]);
        }
        
        JOptionPane.showMessageDialog(null, todasAsMedias);
    }
}
