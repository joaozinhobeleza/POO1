/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio6;

/**
 *
 * @author aluno.saolucas
 */
public class Usuario {
    private String login;
    private String senha;

    
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    
    public boolean autenticar(String login, String senha) {
        
        return this.login.equals(login) && this.senha.equals(senha);
    }
    
    
    
    
}
