/* a) tem dois atributos, um inteiro chamado capacidade, que mostra a
capacidade do tanque de gasolina, e outro real chamado combustível, que
      mostra o quanto existe de gasolina disponível naquele momento.

b) O construtor da classe deve receber como parâmetro a capacidade do
tanque e verificar se o valor é maior ou igual a 40 antes de atribuí-lo ao
atributo combustível. Caso contrário, atribua arbitrariamente o valor de
40. A quantidade de combustível do tanque deve ser configurada em 2
litros a menos que sua capacidade no construtor.

c) Crie métodos de acesso aos atributos
d) e apenas um método modificador, que atribui um valor passado a ele
como parâmetro ao atributo combustível desde que este valor seja menor
ou igual à capacidade do tanque.
e) Crie um método tanqueCheio, que imprima uma mensagem avisando
que o tanque está cheio, isto é, que o atributo combustível é igual ao
capacidade.*/










public class Automovel {

    
//1 atributos
    private int capacidade;
    private double  combustivel;


    //2 construtor
       public Automovel( int c){
           if (c >= 40) {
               
               this.capacidade = c; 
           } 

           else {
            this.capacidade = 40;
           }

           this.combustivel = this.capacidade - 2;
           
       }

       // end contructor



       //

       public int getCapacidade (){
           return this.capacidade;
       }
       
    public double getCombustivel(){
          return this.combustivel;
    }


    public void setCombustivel( double combustivel){
        if (combustivel <= capacidade){
         this.combustivel = combustivel;
        }


    }


    public void tanqueCheio (){
        if (combustivel <= capacidade){
            System.out.println("O tanque ta cheio irmao");
        }
    }

    

}
