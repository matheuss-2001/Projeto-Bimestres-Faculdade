public class Bomba {
    private Automovel automovel;    



public Bomba (Automovel car){
    this.automovel = car;

}


public void abastecer (){
    automovel.setCombustivel(automovel.getCombustivel() +1);
}


}