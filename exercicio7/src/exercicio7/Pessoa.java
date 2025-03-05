package exercicio7;

public class Pessoa {
    protected int idade;

   
    public Pessoa(int idade) {
        this.idade = idade;
    }
}


class Aluno extends Pessoa {

    
    public Aluno(int idade) {
        super(idade);  
    }

    
    public void definirIdade(int idade) {
        this.idade = idade;
    }

   
    public void exibirIdade() {
        System.out.println("A idade do aluno é: " + idade + " anos.");
    }
    
}
