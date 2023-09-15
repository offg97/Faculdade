public class Produto {

        private String nome;
        private double preco;
        private int quantidadeEmEstoque;
    
        // Construtor
        public Produto(String nome, double preco, int quantidadeEmEstoque) {
            this.nome = nome;
            this.preco = preco;
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }
    
        // Métodos get e set para os atributos
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public double getPreco() {
            return preco;
        }
    
        public void setPreco(double preco) {
            this.preco = preco;
        }
    
        public int getQuantidadeEmEstoque() {
            return quantidadeEmEstoque;
        }
    
        public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }
    
       
        public double vender(int quantidadeVendida) {
            if (quantidadeVendida <= quantidadeEmEstoque) {
                quantidadeEmEstoque -= quantidadeVendida;
                return quantidadeVendida * preco;
            } else {
                System.out.println("Quantidade insuficiente em estoque.");
                return 0.0;
            }
        }
    }
    
    
    