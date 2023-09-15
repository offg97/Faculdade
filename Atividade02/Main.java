package Atividade02;
import java.util.ArrayList;
import java.util.List;

// import javax.print.attribute.standard.JobHoldUntil;
// import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        // Livro livro1 = new Livro ("Os miseráveis","Victor Hugo",1862,"romance");

        // livro1.resumo();

        // JOptionPane.showMessageDialog(null, livro1, "Dados do livro", 3);
        
        // Retangulo retangulo01 = new Retangulo(10, 10);

        // System.out.println(retangulo01);

        // Animal animal01 = new Animal("Leão", "Mamífero", 25);

        // System.out.println(animal01);

    //     Calculadora calculo1 = new Calculadora(10, 5);
    //     calculo1.soma();
    //     calculo1.subtrair();
    //     calculo1.multiplicar();
    //     calculo1.dividir();

    //   System.out.println("O resultado da soma é: " + calculo1.soma());
    //   System.out.println("O resultado da subtração é: " + calculo1.subtrair());
    //   System.out.println("O resultado da multiplicação é: " + calculo1.multiplicar());
    //   System.out.println("O resultado da divisão é : " + calculo1.dividir());

    //Instancia da Biblioteca
    Biblioteca minhaBiblioteca = new Biblioteca();
    
        //Dados da biblioteca
        minhaBiblioteca.setEndereco("Praça Cívica");
        minhaBiblioteca.setNome("LivrosLivraria");

    //Livro
    Livro meuLivro = new Livro("Principe","Nicolau Maquiavel",1943,"Ação");
    Livro meuLivro1 = new Livro("Principe2","Nicolau Maquiavel",1943,"Jornalistico");
    Livro meuLivro2= new Livro("Principe3","Nicolau Maquiavel",1943,"Romance");
    Livro meuLivro3 = new Livro("Principe4","Nicolau Maquiavel",1943,"Comedia");
    
    //Lista de Livros
    List<Livro> estanteDeLivros = new ArrayList<>();

    //Adicionando os livros a lista
    
    estanteDeLivros.add(meuLivro);
    estanteDeLivros.add(meuLivro1);
    estanteDeLivros.add(meuLivro2);
    estanteDeLivros.add(meuLivro3);
    estanteDeLivros.add(new Livro("QualquerLivro","Ferrari",2023,"Horror"));

    //Levando a estante para a biblioteca
    minhaBiblioteca.setLivros(estanteDeLivros);

    //Mostrar os livroos na biblioteca

    minhaBiblioteca.listarLivros();
    
    




    }
    
}
