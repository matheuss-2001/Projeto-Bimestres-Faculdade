import javax.swing.JOptionPane;

public class Ex9 {
    public static void main(String[] args) {
        int valor;

        valor=  Integer.parseInt(JOptionPane.showInputDialog("Iforme um valor"));
        while (valor != -999) {
            
            System.out.println(Math.sqrt(valor));
            valor=  Integer.parseInt(JOptionPane.showInputDialog("Iforme um valor"));
        }
    }

    
}
