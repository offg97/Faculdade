package Atividade01;

class Funcionario {
    
    private String nome;
    private double salario;
    private String cargo;

    // Construtor
    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    // Métodos get e set para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public void aumentarSalario(double percentualAumento) {
        salario += (salario * percentualAumento / 100);
    }
}

