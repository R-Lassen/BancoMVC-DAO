
package model;

/**
 *
 * @author 44966
 */
public class Cliente {
    private int codigo;
    private String nome;
    private String telefone;
    private String endereco;
    private String email;
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome) {
        this.telefone = nome;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
 
}
