/**
 * Segmento
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
public class Segmento{
    //variabili d'istanza
    private Punto p1;
    private Punto p2;
    //costruttore senza parametri
    public Segmento(){
        this.p1 = null;
        this.p2 = null;
    }
    //costruttore che crea due oggetti Punto dopo aver letto i parametri
    public Segmento(double x1, double y1, double x2, double y2){
        this.p1 = new Punto(x1, y1);
        this.p2 = new Punto(x2, y2);
    }
    //costruttore con due oggetti Punto come parametri
    public Segmento(Punto p1, Punto p2){
        this.p1 = p1;
        this.p2 = p2;
    }
    //set p1 dato un oggetto Punto come parametro
    public void setP1(Punto p1){
        if(p1 != null){
            this.p1 = p1;
        }
    }
    //get p1
    public String getP1(){
        return p1.toString();
    }
    //set p2 dato un oggetto punto come parametro
    public void setP2(Punto p2){
        if(p2 != null){
            this.p2 = p2;
        }
    }
    //get p2
    public String getP2(){
        return p2.toString();
    }
    //distanza tra due punti
    public double lunghezzaSegmento(){
        double lunghezza, diffX, diffY;
        if((p1 != null) && (p2 != null)){
            //differenza x dei punti
            diffX = p1.getAscissa() - p2.getAscissa();
            //quadrato differenza X
            diffX = Math.pow(diffX, 2);
            //differenza y dei punti
            diffY = p1.getOrdinata() - p2.getOrdinata();
            //quadrato differenza Y
            diffY = Math.pow(diffY, 2);
            //calcolo lunghezza mediante la radice quadrata
            lunghezza = Math.sqrt(diffX + diffY);
            return lunghezza;
        }
        return -1;
    }
}