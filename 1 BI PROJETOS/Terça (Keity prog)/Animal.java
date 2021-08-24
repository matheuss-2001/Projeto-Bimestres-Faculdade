public class Animal {
    private String nome;
    private int patas;


    public Animal( String nome , int patas){
        setNome(nome);
        setPatas(patas);

    }


    public String getNome(){
        return nome;

    }

    public void setNome(String nome){
        this.nome=nome;

    }
    

    public int getPatas(){
        return patas;
    }

    public void setPatas(int patas){
        this.patas=patas;
    }
}
