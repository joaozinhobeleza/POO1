package exercicio6;

public class Exercicio6 {

    public static void main(String[] args) {
        // TODO code application logic here
          Usuario usuario = new Usuario("adm", "4321");
        
        
        boolean autenticado = usuario.autenticar("adm", "4321");
        System.out.println("Autenticação bem-sucedida: " + autenticado); 
        
        
        autenticado = usuario.autenticar("adm", "aabb");
        System.out.println("Autenticação bem-sucedida: " + autenticado); 
    
    

    }
    
      
}
