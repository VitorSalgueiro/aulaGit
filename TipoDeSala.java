package cinema;

public class TipoDeSala {
    
    int id;
    String desc;
    EnumStatus statusTipoSala;
    
    public static int contador = 1;
    
    public TipoDeSala(){
        this.id = TipoDeSala.contador;
        TipoDeSala.contador++;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getDesc(){
        return this.desc;
    }
}