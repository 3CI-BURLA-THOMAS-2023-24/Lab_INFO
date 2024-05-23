/**
 * Punto
    -attributi x, y
    -un costruttore
    -set/get
    -toString
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
public class Punto{
    // variabili d'istanza
    private double x;
    private double y;
    //costruttore senza parametri
    public Punto(){
        this.x = 0;
        this.y = 0;
    }
    //costruttore che imposta le coordinate del punto
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    //set ascissa
    public void setAscissa(double x){
        this.x = x;
    }
    //get ascissa
    public double getAscissa(){
        return this.x;
    }
    //set ordinata
    public void setOrdinata(double y){
        this.y = y;
    }
    //get ordinata
    public double getOrdinata(){
        return this.y;
    }
    //metodo per visualizzare tutte le variabili d'istanza
    public String toString(){
        String out = "";
        out+= "Il punto ha coordinate (" + this.x;
        out+= "; " + this.y + ")";
        return out;
    }
}