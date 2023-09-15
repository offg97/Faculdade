package Atividade01;

public class Main {
    public static void main(String[] args) {
        
        Carro carro01 = new Carro("Ford", "KA", 2010, 101.001);
        carro01.exibirInfo();

       
        Produto produto1 = new Produto("Notebook", 21000, 10);
        double valorVenda = produto1.vender(7);
        System.out.println("Valor da venda: R$" + valorVenda);
        System.out.println("Quantidade em estoque: " + produto1.getQuantidadeEmEstoque());

        
        Funcionario funcionario1 = new Funcionario("Ferrari", 10000, "Gerente");
        funcionario1.aumentarSalario(10);
        System.out.println("Novo salário de " + funcionario1.getNome() + ": R$" + funcionario1.getSalario());
    }
}
