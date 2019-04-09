package cinema;

public class Ingresso {
    
    int id;
    Sessao sessao;
    TabelaPreco preco;
    
    public static int contador = 1;
    
    public Ingresso(){
        this.id = Ingresso.contador;
        Ingresso.contador++;
    }
    
    public void setSessao(Sessao sessao){
        this.sessao = sessao;
    }
    
    public void setTabelaPreco(TabelaPreco preco){
        this.preco = preco;
    }
    
    public int getId(){
        return this.id;
    }
    
    public Sessao getSessao(){
        return this.sessao;
    }
    
    public TabelaPreco getPreco(){
        return this.preco;
    }
    
}
