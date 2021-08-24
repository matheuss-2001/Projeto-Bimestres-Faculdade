public class Empregado {
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;
    private double horasTrabalhadas;
    private double valorHora;

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;

    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;

    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

private double numeroDeTarefas;
private double valorTarefa;
public double getNumeroDeTarefas() {
return numeroDeTarefas;
}
public void setNumeroDeTarefas(double numeroDeTarefas) {
this.numeroDeTarefas = numeroDeTarefas;
}
public double getValorTarefa() {
return valorTarefa;
}
public void setValorTarefa(double valorTarefa) {
this.valorTarefa = valorTarefa;
}
//uma nova possibilidade
int tipo = gerador.nextInt(5) + 1;
//gerando dados de tarefeiro
 else if (tipo == 5) {
 empregados[i].setNumeroDeTarefas(500 + gerador.nextInt(501));
empregados[i].setValorHora(gerador.nextDouble() * 70 + 30);
}
//fazendo cálculos para tarefeiro
else if (empregados[i].getTipo() == 5) {
salario = empregados[i].getValorTarefa() * empregados[i].getNumeroDeTarefas();
}



 }
