import javax.swing.JOptionPane;

public class TesteVetor {


    public static void main(String[] args) {
       //declarandovetores de 5 inteiros
        int v[] = new int[5];


        //inicialiuzar posiçoes
         v[0] = 1;
         v[1] = 6;
         v[2] = 8;
         v[3] = 10;
         v[4] = 9;
         
         
         //da para inicializar com valor informado

       v[4] = Integer.parseInt(JOptionPane.showInputDialog("Digite um ineteiro"));
      
       
       //Mostrando o conteudo

       JOptionPane.showMessageDialog(null, v[0]);
       JOptionPane.showMessageDialog(null, v[1]);
       JOptionPane.showMessageDialog(null, v[2]);
       JOptionPane.showMessageDialog(null, v[3]);
       JOptionPane.showMessageDialog(null, v[4]);
    }

   
    
}
