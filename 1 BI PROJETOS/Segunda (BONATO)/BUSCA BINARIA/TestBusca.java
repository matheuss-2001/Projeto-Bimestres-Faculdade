public class TestBusca {
    public static void main(String[] args) {
        char[] vetor = {'a' ,'c','e','z','f','b'};

        System.out.println('f' + " = " + Busca.BuscaSequencial(vetor , 'f'));
        System.out.println('f' + " = " + Busca.BuscaSequencial(vetor , 'a'));
        System.out.println('f' + " = " + Busca.BuscaSequencial(vetor , 'b'));
        System.out.println('f' + " = " + Busca.BuscaSequencial(vetor , 'x'));
       
    }

    
}
