public class Teste {

    public static void main(String[] args) {
        Cachorro dog = new Cachorro("scooby ", 4);
        Gato cat = new Gato("billy",  4 );

        System.out.println( dog.getNome() +  dog.getPatas());
        
        System.out.println( cat.getNome() +  cat.getPatas());

    }

}
