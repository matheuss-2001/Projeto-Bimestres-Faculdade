import javax.swing.*;

public class TesteIniWhile {
    public static void main(String[] args) {
        int v [] = new int [10];
int i = 0;
while (i < 10) {
    v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite " + (i + 1) + " valor"));
i++;
}
i = 0;
while(i < 10) {
JOptionPane.showMessageDialog(null, (i + 1) + " valor: " + v[i]);
i++;
    }
  }
}


