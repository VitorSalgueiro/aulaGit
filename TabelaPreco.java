package cinema;

public class TabelaPreco {
    
    int id;
    float preco;
    String desc;
    
    public static int contador = 1;
    
    public TabelaPreco(){
        this.id = TabelaPreco.contador;
        TabelaPreco.contador++;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public int getId(){
        return this.id;
    }
    
    public float getPreco(){
        return this.preco;
    }
    
    public String getDesc(){
        return this.desc;
    }
    
}
