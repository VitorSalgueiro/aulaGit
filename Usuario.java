package cinema;

public class Usuario {
    
    int id;
    String nome;
    String cpf;
    String login;
    String senha;
    
    enum status{
    	ativo, inativo;
    }
    
    enum perfil{
    	adm, usuario;
    }
    
    public static int contador = 1;
    
    public Usuario(){
        this.id = Usuario.contador;
        Usuario.contador++;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    
    public void setLogin(String login) {
    	this.login = login;
    }
    
    public void setSenha(String senha) {
    	this.senha = senha;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getCPF() {
        return this.cpf;
    }
    
    public String getLogin() {
    	return this.login;
    }
    
    public String getSenha() {
    	return this.senha;
    }
}
