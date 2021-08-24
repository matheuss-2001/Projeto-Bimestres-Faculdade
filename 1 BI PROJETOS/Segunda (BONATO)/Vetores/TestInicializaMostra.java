
import javax.swing.*;


public class TestInicializaMostra {
    public static void main(String[] args) {
        int v [] = new int [10];
v[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 valor"));
v[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite 2 valor"));
v[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite 3 valor"));
v[3] = Integer.parseInt(JOptionPane.showInputDialog("Digite 4 valor"));
v[4] = Integer.parseInt(JOptionPane.showInputDialog("Digite 5 valor"));
v[5] = Integer.parseInt(JOptionPane.showInputDialog("Digite 6 valor"));
v[6] = Integer.parseInt(JOptionPane.showInputDialog("Digite 7 valor"));
v[7] = Integer.parseInt(JOptionPane.showInputDialog("Digite 8 valor"));
v[8] = Integer.parseInt(JOptionPane.showInputDialog("Digite 9 valor"));
v[9] = Integer.parseInt(JOptionPane.showInputDialog("Digite 10 valor"));




JOptionPane.showMessageDialog(null, "1 valor: " + v[0]);
JOptionPane.showMessageDialog(null, "2 valor: " + v[1]);
JOptionPane.showMessageDialog(null, "3 valor: " + v[2]);
JOptionPane.showMessageDialog(null, "4 valor: " + v[3]);
JOptionPane.showMessageDialog(null, "5 valor: " + v[4]);
JOptionPane.showMessageDialog(null, "6 valor: " + v[5]);
JOptionPane.showMessageDialog(null, "7 valor: " + v[6]);
JOptionPane.showMessageDialog(null, "8 valor: " + v[7]);
JOptionPane.showMessageDialog(null, "9 valor: " + v[8]);
JOptionPane.showMessageDialog(null, "10 valor: " + v[9]);
    }
    
}
