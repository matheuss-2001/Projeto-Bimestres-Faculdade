/*Matheus Loureiro de Albuquerque
RA 82116773 */

public class Elevador {
    // Atributos

    int pessoas;
    boolean subindo;

// construtor
    public Elevador () {
        
        subindo = false;
        pessoas = 0;
                      }


//metodos de acesso 
    public int getPessoas(){
        return this.pessoas;
                           }


    public boolean getSubindo(){
        return this.subindo;
                               }
                              

    // metodos modificadores 

    public void setPessoas( int pessoas ){
        if (pessoas >=0 && pessoas <=10);
        this.pessoas=pessoas;

                                          }

    public void setSubindo( boolean subindo)  {
        this.subindo=subindo;


                                              }
//questao G
        public void sobe(){
            if (!subindo){
                subindo=true;

                         }
                        }

//questao H
        public void desce(){
            if (subindo == true){
                subindo=false;
            }
        }
 //questao I
 

       public void entrarGente( int quantidade)   {
           if (getPessoas() + quantidade <=10){
               pessoas = getPessoas() + quantidade;
                                              }

                                                  }
    
// questao j
/*Crie um método subirPessoa, que aumenta o número de pessoas em 1
toda vez que é acionado. Não se esqueça de validar o limite superior da
faixa.*/

  public void subirPessoa(){
      if (getPessoas() <= 10){
          pessoas = getPessoas() + 1 ;
                           }
                            }
    
                           

  // questao k 
  /*Crie um método descerPessoa, que reduz o número de pessoas em 1 toda
vez que é acionado. Não se esqueça de validar o valor inferior da faixa.*/

   public void descerPessoa(){
       int novaQuantidade = getPessoas() + 1;
       setPessoas(novaQuantidade);
       
   }


            
    


    


    
}
