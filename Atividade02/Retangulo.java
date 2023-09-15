package Atividade02;

public class Retangulo {

//     Crie uma classe chamada Retangulo.Adicione os seguintes atributos privados:
// double altura
// double largura
// Crie um construtor para inicializar todos os atributos da classe.
// Crie métodos getters e setters para todos os atributos.
// Adicione um método area() que retorna a área do retângulo.
    
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
 
@Override
    public String toString() {
        return "Área do retangulo = "  + area();
    }
    

    public double area(){
        return altura*largura;
    }

    

    }