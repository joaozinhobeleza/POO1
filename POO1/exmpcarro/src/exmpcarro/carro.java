package exmpcarro;

public class carro {
    
    String marca, cor, modelo;
    boolean ligar;
    boolean acelerar;
    
    void desligar(){
        this.ligar = false;
        
    }
    
    void ligar(){
        this.ligar = true;
        
    }
    
    void acelerar(){
        this.acelerar = true;
        
}
    
    void freiar(){
        this.acelerar = false;
        
    }
    
    void status(){
        
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("cor: " + cor);
        System.out.println("o carro esta ligado? " + ligar);
        System.out.println("o carro esta acelerando? " + acelerar);
        
        
        
    }
    
}
