package Atividade02;

// Classe Livro
// 1. Crie uma classe chamada `Livro`.
// 2. Adicione os seguintes atributos privados:
//     - `String titulo`
//     - `String autor`
//     - `int anoPublicacao`
//     - `String genero`
// 3. Crie um construtor para inicializar todos os atributos da classe.
// 4. Crie métodos `getters` e `setters` para todos os atributos.
// 5. Adicione um método `resumo()` que retorna uma string contendo um resumo das informações do livro.

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String genero;

    public Livro(String titulo, String autor, int anoPublicacao, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
    
}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
   
    @Override
    public String toString() {
        return "Livro" + " \n Titulo da capa: " + titulo + " \n Autor do livro: " + autor + " \n Ano de Publicacao : " + anoPublicacao + " \n Gênero do livro: "
                + genero +"";
    }

    public void resumo() {
        System.out.println(toString());
        

    }

}