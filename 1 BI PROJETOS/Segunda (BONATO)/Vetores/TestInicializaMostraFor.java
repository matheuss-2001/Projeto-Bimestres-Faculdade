
import javax.swing.*;

public class TestInicializaMostraFor {

    public static void main(String[] args) {
        int v[] = new int[10];
        for (int i = 0; i < 10; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite " + (i + 1) + " valor"));
        }
        for (int i = 0; i < 10; i++) {
            JOptionPane.showMessageDialog(null, (i + 1) + " valor: " + v[i]);

        }
    }

}
