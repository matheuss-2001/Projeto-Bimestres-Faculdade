public class Professor extends Pessoa{
    private int matricula;

    public int getMatricula(){
        return this.matricula;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void lecionar(){
        System.out.println(getNome() + " lecionando...");
    }
}