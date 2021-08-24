import javax.swing.*;

public class LivroDeNotas {

    private String nomeCurso;
    private double nota1Aluno1;
    private double nota2Aluno1;
    private double nota1Aluno2;
    private double nota2Aluno2;
    private double nota1Aluno3;
    private double nota2Aluno3;

    public LivroDeNotas(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void obterNotas() {
        nota1Aluno1 = Double.parseDouble(

                JOptionPane.showInputDialog("Nota 1 do aluno 1")

        );
        nota2Aluno1 = Double.parseDouble(

                JOptionPane.showInputDialog("Nota 2 do aluno 1")

        );
        nota1Aluno2 = Double.parseDouble(

                JOptionPane.showInputDialog("Nota 1 do aluno 2")

        );
        nota2Aluno2 = Double.parseDouble(

                JOptionPane.showInputDialog("Nota 2 do aluno 2")

        );
        nota1Aluno3 = Double.parseDouble(

                JOptionPane.showInputDialog("Nota 1 do aluno 3")

        );
        nota2Aluno3 = Double.parseDouble(

                JOptionPane.showInputDialog("Nota 2 do aluno 3")

        );
    }

    public void mostrarMedias() {
        String medias = "";
        medias += "Aluno 1: " + String.format("%.2f", (nota1Aluno1 + nota2Aluno1) / 2);
        medias += "Aluno 2: " + String.format("%.2f", (nota1Aluno2 + nota2Aluno2) / 2);
        medias += "Aluno 3: " + String.format("%.2f", (nota1Aluno3 + nota2Aluno3) / 2);
        JOptionPane.showMessageDialog(null, medias);
    }
}
