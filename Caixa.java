package cinema;

public class Caixa {
    
    int id;
    Status status;
    OperadorCaixa operador;
    
    enum Status{
        ativo, inativo;
    }
    
    public static int contador = 1;
    
    public Caixa(){
            this.id = Caixa.contador;
            Caixa.contador++;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }
    
    public void setOperador(OperadorCaixa operador) {
        this.operador = operador;
    }
    
    public int getId(){
        return this.id;
    }
    
    /*public enum getEnum() {
        return this.status;
    }*/
    
}
