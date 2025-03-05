package exercicio10;

public class Exercicio10 {

    public static void main(String[] args) {
        // TODO code application logic here
        Carro meuCarro = new Carro("BMW", "X1", 2016);

        
        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());

       
        meuCarro.setAno(2016);  
        System.out.println("Ano após tentativa de alteração inválida: " + meuCarro.getAno());
        
        
    }
    
}
