public class Busca {
    public static int BuscaSequencial(char[] vetor, char procurado) {
        int i = 0;
         while(i<vetor.length && vetor [i] != procurado){
             i++;

         }

         if( i == vetor.length){
             return -1;

         } else{
             return i;
         }

      
    }

    public static int buscaBinaria(char[]vetor , char procurando){
        int inicio = 0;
        int fim = vetor.length -1;

        while (inicio <=fim){

            int meio (inicio +fim)/2;

        }
    }
}
