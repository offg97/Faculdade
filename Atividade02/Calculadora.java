package Atividade02;

// Classe Calculadora
// Crie uma classe chamada Calculadora.
// Adicione os seguintes atributos privados:
// double numero1
// double numero2
// Crie um construtor para inicializar todos os atributos da classe.
// Crie métodos getters e setters para todos os atributos.
// Adicione métodos para somar(), subtrair(), multiplicar() e dividir() os números. ]
// Cada método deve retornar o resultado da operação correspondente.

public class Calculadora {

    private double num1;
    private double num2;

    public Calculadora(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2; 
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

public double soma(){
return num1 + num2;
}

public double subtrair(){
    return num1-num2;
}

public double multiplicar(){
    return num1*num2;
}

public double dividir(){
    return num1/num2;

}
    
}
