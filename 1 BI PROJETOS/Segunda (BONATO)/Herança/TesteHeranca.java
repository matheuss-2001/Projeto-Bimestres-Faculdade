
public class TesteHeranca {
    public static void main(String[] args){
        AlunoDeGraduacao alunos = new AlunoDeGraduacao();
       alunos.nome = "José";
        alunos.idade = 19;
        //funcionamento do printf
        //os % são tokens que devem ser substituídos pelos valores dos parâmetros passados;
        //os parâmetros devem aparecer na mesma ordem dos tokens
        //%s é string, %d é inteiro, %f é double
        //tem que colocar o \n no final se quiser que pule linha
        System.out.printf("nome: %s, idade: %d\n", aluno.nome, aluno.idade);
    }
}