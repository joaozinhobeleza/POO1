package exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Conta conta = new Conta("Porto", 1800.0);
        
        
        System.out.println("Saldo inicial de " + conta.titular + ": R$ " + conta.getSaldo());
                
        conta.depositar(500.0);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
               
        conta.sacar(300.0);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
              
        conta.sacar(1500.0);
              
        conta.sacar(110.0);
        
        
        
        
    }
    
}
