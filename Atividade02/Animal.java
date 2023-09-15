package Atividade02;

package Atv02;

public class Animal {

// Crie uma classe chamada Animal.Adicione os seguintes atributos privados:
// String nome
// String especie
// int idade
// Crie um construtor para inicializar todos os atributos da classe.
// Crie métodos getters e setters para todos os atributos.
// Adicione um método emitirSom() que imprime "Este animal faz um som".

private String nome;
private String especie;
private int idade;

public Animal (String nome, String especie, int idade){
    this.nome = nome;
    this.especie = especie;
    this.idade = idade;

}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getEspecie() {
    return especie;
}

public void setEspecie(String especie) {
    this.especie = especie;
}

public int getIdade() {
    return idade;
}

public void setIdade(int idade) {
    this.idade = idade;
}

public String emitirSom(){
    return"Emitir som!";
}


public String toString() {
    return "Animal" + " \n Nome do animal = " + nome + " \n Qual é a especie =" + especie + " \n Qual sua idade = " + idade + "\n" + emitirSom() + "\n";
}



}