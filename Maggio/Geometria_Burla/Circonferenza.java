/**
 * Circonferenza
 *
 * @author Thomas Burla
 * @version 1.0
 */
public class Circonferenza {
    //variabili d'istanza
    private double raggio;
    private double area;
    private double perimetro;
    private final double PI_GRECO = 3.141592653;
    //costruttore senza parametri
    public Circonferenza(){
        this.raggio = 0.0;
        this.area = 0.0;
        this.perimetro = 0.0;
    }
    //costruttore con raggio controllato
    public Circonferenza(double raggio){
        //raggio
        if(raggio > 0.0){
            this.raggio = raggio;
        }else{
            this.raggio = 0.0;
        }
        //area
        this.area = 0.0;
        //perimetro
        this.perimetro = 0.0;
    }
//costruttore con perimetro e area controllati
public Circonferenza(double area, double perimetro){
    //area
    if(area > 0.0){
        this.area = area;
    }else{
        this.area = 0.0;
    }
    //perimetro
    if(perimetro > 0.0){
        this.perimetro = perimetro;
    }else{
        this.perimetro = 0.0;
    }
    //raggio
    this.raggio = 0.0;
}
    //set raggio
    public void setRaggio(double raggio){
        if(raggio > 0.0){
            this.raggio = raggio;
        }
    }
    //get raggio
    public double getRaggio(){
        return this.raggio;
    }
    //set area
    public void setArea(double area){
        if(area > 0.0){
            this.area = area;
        }
    }
    //get area
    public double getArea(){
        return this.area;
    }
    //set perimetro
    public void setPerimetro(double perimetro){
        if(perimetro > 0.0){
            this.perimetro = perimetro;
        }
    }
    //get perimetro
    public double getPerimetro(){
        return this.perimetro;
    }
    //calcolo perimetro nel caso in cui il raggio sia positivo 
    public double perimetro(){
        if(this.raggio > 0.0){
            this.perimetro = 2 * PI_GRECO * this.raggio;
            return this.perimetro;
        }
        return -1;
    }
    //calcolo area nel caso in cui il raggio sia positivo
    public double area(){
        if(this.raggio > 0.0){
            this.area = PI_GRECO * this.raggio * this.raggio;
            return this.area;
        }
        return -1;
    }
}
