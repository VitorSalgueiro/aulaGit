package cinema;

public class OperadorCaixa {
    
    int id;
    String nome;
    String cpf;
    String fone;
    
    public static int contador = 1;
    
    public OperadorCaixa(){
        this.id = OperadorCaixa.contador;
        OperadorCaixa.contador++;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    
    public void setFone(String fone) {
        this.fone = fone;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public String getCpf() {
        return this.cpf;
    }
    
    public String getFone() {
        return this.fone;
    }
    
}
