/**
 * Quadrato
 * 
 * @author Thomas Burla
 * @version 1.0
 */
public class Quadrato {
    //variabili d'istanza
    private double lato;
    private double diagonale;
    private double area;
    private double perimetro;
    //costruttore senza parametri
    public Quadrato(){
        this.lato = 0.0;
        this.diagonale = 0.0;
        this.area = 0.0;
        this.perimetro = 0.0;
    }
    //costruttore con perimetro e area controllati
    public Quadrato(double area, double perimetro){
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
        //lato
        this.lato = 0.0;
        //diagonale
        this.diagonale = 0.0;
    }
    //costruttore con lato controllato
    public Quadrato(double lato){
        //lato
        if(lato > 0.0){
            this.lato = lato;
        }else{
            this.lato = 0.0;
        }
        //area
        this.area = 0.0;
        //perimetro
        this.perimetro = 0.0;
        //diagonale
        this.diagonale = 0.0;
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
    //set lato
    public void setLato(double lato){
        if(lato > 0.0){
            this.lato = lato;
        }
    }
    //get lato
    public double getLato(){
        return this.lato;
    }
    //set diagonale
    public void setDiagonale(double diagonale){
        if(diagonale > 0.0){
            this.diagonale = diagonale;
        }
    }
    //get diagonale
    public double getDiagonale(){
        return this.diagonale;
    }
    //calcolo il perimetro
    public double perimetro(){
        if(this.lato > 0.0){
            this.perimetro = this.lato * 4;
            return this.perimetro;
        }
        return -1;
    }
    //calcolo area 
    public double calcolaArea(){
        if(this.lato > 0.0){
            this.area = this.lato * this.lato;
            return this.area;
        }
        return -1;
    }
}
