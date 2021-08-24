public class Frentista {
    private  Automovel  automovel;
    private Bomba bomba;


    public Frentista () {
        automovel = new Automovel(80);
        bomba = new Bomba(automovel);
    }


    public void abastecer(){
        while (automovel.getCombustivel() < automovel.getCapacidade()){
            bomba.abastecer();
        }

        if(automovel.getCombustivel() == automovel.getCapacidade()){
            automovel.tanqueCheio();

        }
    }
    
}
