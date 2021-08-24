


import javax.swing.JOptionPane;

public class AppBlocoum {

    


    public static void main(String[] args){
        int menu;
        BlocoDeNotas bloco = new BlocoDeNotas();
        do{
            menu = Integer.parseInt(JOptionPane.showInputDialog("1) Insira uma nota\n"+
                                                                "2) Remova uma nota\n"+
                                                                "3) Altere uma nota\n"+
                                                                "4) Listar todas as notas\n"+
                                                                "5) Saia do sistema"));
            String nota = "";
            int numero = -1;
           
            switch(menu){
                case 1: 
                    nota = JOptionPane.showInputDialog("Digite o texto da nota");
                    bloco.inserir(nota);
                    break;
                case 2: 
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Qual o número da nota que deseja remover?"));
                    //subtrair um por causa do índice
                    bloco.remover(numero - 1);
                    break;
                case 3: 
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Qual o número da nota que deseja alterar?"));
                    nota = JOptionPane.showInputDialog("Qual o novo texto?");
                    bloco.remover(numero - 1);
                    bloco.inserir(nota);
                    break;
                case 4: 
                    bloco.listar();
                    break;
                case 5: break;
                default: break;
            }

        } while(menu != 5);
    
}
    
}
