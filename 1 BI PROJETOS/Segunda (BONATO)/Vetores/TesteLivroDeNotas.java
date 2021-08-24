 import javax.swing.*;
 
 public class TesteLivroDeNotas {

    public static void main(String[] args) {
        LivroDeNotas book = new LivroDeNotas("Progamação");
       book.obterNotas();
       JOptionPane.showMessageDialog(null,"Médias da disciplina: " + book.getNomeCurso());
        book.mostrarMedias();

        
    }
    
}
