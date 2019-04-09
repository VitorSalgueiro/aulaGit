package cinema;

public class Sala {
    
    int id;
    int numero;
    Sessao sessao;
    Fila fila;
    
    public static int contador = 1;
    
    public Sala(){
        this.id = Sala.contador;
        Sala.contador++;
    }
    
    public void setSessao(Sessao sessao){
        this.sessao = sessao;
    }
    
    public void setFila(Fila fila){
        this.fila = fila;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getId(){
        return this.id;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public Sessao getSessao(){
        return this.sessao;
    }
    
    public Fila getFila(){
        return this.fila;
    }
    
}
