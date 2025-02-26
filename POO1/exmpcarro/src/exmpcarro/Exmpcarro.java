package exmpcarro;

public class Exmpcarro {

    public static void main(String[] args) {
        // TODO code application logic here
        carro carro1 = new carro ();
        carro1.marca = "BMW";
        carro1.modelo = "SUV Coupe";
        carro1.cor = "azul";
        carro1.ligar = false;
        carro1.acelerar = false;
        carro1.status();
        
        System.out.println("======================================");
        
        carro carro2 = new carro();
        carro2.marca = "Bugatti";
        carro2.modelo = "Super Esportivo";
        carro2.cor = "vermelho";
        carro2.ligar = true;
        carro2.acelerar = true;
        carro2.status();
        
        
        
    }
    
}
