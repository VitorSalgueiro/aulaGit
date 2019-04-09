package cinema;

public class Ator {
    
    public static int contador = 1;
    
    int id;
    String nome;
    Status status;
    
    enum Status{
        vivo, morto, ativo, inativo;
    };
    
    public Ator(){
            this.id = Ator.contador;
            Ator.contador++;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Status getStatus() {
        return this.status;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public int getId(){
        return this.id;
    }
    
    /*public Status getStatus() {
        return this.status;
    }*/
    
}