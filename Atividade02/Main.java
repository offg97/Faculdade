package Atividade02;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        // Livro livro1 = new Livro ("Os miseráveis","Victor Hugo",1862,"romance");

        // livro1.resumo();

        // JOptionPane.showMessageDialog(null, livro1, "Dados do livro", 3);
        
        // Retangulo retangulo01 = new Retangulo(10, 10);

        // System.out.println(retangulo01);

        // Animal animal01 = new Animal("Leão", "Mamífero", 25);

        // System.out.println(animal01);

        Calculadora calculo1 = new Calculadora(10, 5);
        calculo1.soma();
        calculo1.subtrair();
        calculo1.multiplicar();
        calculo1.dividir();
      


    }
    
}
