import javax.swing.*;

public class PassWord {

    public static void main(String[] args) {

        String pass = "0";
        /* String word = "ta"; */
        // String completed = "cripta";*/
        String maybe;

        maybe = JOptionPane.showInputDialog("type password");

       if (maybe == pass) {
      
        JOptionPane.showMessageDialog(null, "aproved");

        } else 

        JOptionPane.showMessageDialog(null, "Desaproved");
          
         

    }
}
