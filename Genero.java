package cinema;

public class Genero {
    
    public static int contador = 1;
    
    int id;
    String desc;
    
    public Genero(){
        this.id = Genero.contador;
        Genero.contador++;
    }
    
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getDesc() {
        return this.desc;
    }
    
}