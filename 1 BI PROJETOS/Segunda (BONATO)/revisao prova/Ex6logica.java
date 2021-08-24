import javax.swing.JOptionPane;

public class Ex6logica {
    public static void main(String[] args) {
        double numero;
        double soma = 0;
        int contador = 0;
        double media;

        do{

            numero = Double.parseDouble(JOptionPane.showInputDialog("digite um numero positivo ou/num nao positivo para parar"));

                    if (numero>0){
                soma = soma + numero;
                contador++;
                  }

          } 
        
        while (numero>0);

        if (contador >0){
            media = soma / contador ;
            JOptionPane.showMessageDialog(null , " A media e  " + media);
        }
         
         else{
             JOptionPane.showMessageDialog(null , "nenhum valor positivo foi digitado");
         }



        
    }
}