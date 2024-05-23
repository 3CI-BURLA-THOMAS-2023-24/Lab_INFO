/**
 * Triangolo
 * 
 * @author Thomas Burla
 * @version 1.0
 */
public class Triangolo {
    //variabili d'istanza
    private String tipo;
    private double altezza;
    private double area;
    private double perimetro;
    private double lato1;
    private double lato2;
    private double lato3;
    //costruttore senza parametri
    public Triangolo(){
        this.tipo = "-";
        this.altezza = 0.0;
        this.area = 0.0;
        this.perimetro = 0.0;
        this.lato1 = 0.0;
        this.lato2 = 0.0;
        this.lato3 = 0.0;
    }
    //costruttore con lati e altezza controllati, che assegna il tipo
    public Triangolo(double lato1, double lato2, double lato3, double altezza){
        //altezza
        if(altezza > 0.0){
            this.altezza = altezza;
        }else{
            this.altezza = 0.0;
        }
        //lato1
        if(lato1 > 0.0){
            this.lato1 = lato1;
        }else{
            this.lato1 = 0.0;
        }
        //lato2
        if(lato2 > 0.0){
            this.lato2 = lato2;
        }else{
            this.lato2 = 0.0;
        }
        //lato3
        if(lato1 > 0.0){
            this.lato3 = lato3;
        }else{
            this.lato3 = 0.0;
        }
        //perimetro
        this.perimetro = 0.0;
        //area
        this.area = 0.0;
        //calcolo tipo
        if((lato1 > 0.0) && (lato2 > 0.0) && (lato3 > 0.0)){
            if((lato1 == lato2) || (lato1 == lato3) || (lato2 == lato3)){
                if((lato1 == lato2) && (lato1 == lato3)){
                    this.tipo = "equilatero";
                }else{
                    this.tipo = "isoscele";
                }
            }else{
                this.tipo = "scaleno";
            }
        }else{
            this.tipo = "-";
        }
    }
    //costruttore con perimetro, area e tipo controllati
    public Triangolo(String tipo, double area, double perimetro){
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
        //tipo
        if(tipo != null){
            if(tipo.equalsIgnoreCase("scaleno")){
                this.tipo = "scaleno";
            }else if(tipo.equalsIgnoreCase("isoscele")){
                this.tipo = "isoscele";
            }else if(tipo.equalsIgnoreCase("equilatero")){
                this.tipo = "equilatero";
            }else{
                this.tipo = "-";
            }
        }else{
            this.tipo = "-";
        }
    }
    //set tipo
    public void setTipo(String tipo){
        if(tipo != null){
            if(tipo.equalsIgnoreCase("scaleno")){
                this.tipo = "scaleno";
            }else if(tipo.equalsIgnoreCase("isoscele")){
                this.tipo = "isoscele";
            }else if(tipo.equalsIgnoreCase("equilatero")){
                this.tipo = "equilatero";
            }
        }
    }
    //get tipo
    public String getTipo(){
        return this.tipo;
    }
    //set lato1
    public void setLato1(double lato1){
        if(lato1 > 0.0){
            this.lato1 = lato1;
        }
    }
    //get lato1
    public double getLato1(){
        return this.lato1;
    }
    //set lato1
    public void setLato2(double lato2){
        if(lato2 > 0.0){
            this.lato2 = lato2;
        }
    }
    //get lato1
    public double getLato2(){
        return this.lato2;
    }
    //set lato1
    public void setLato3(double lato3){
        if(lato3 > 0.0){
            this.lato3 = lato3;
        }
    }
    //get lato1
    public double getLato3(){
        return this.lato3;
    }
    //set altezza
    public void setAltezza(double altezza){
        if(altezza > 0.0){
            this.altezza = altezza;
        }
    }
    //get altezza
    public double getAltezza(){
        return this.altezza;
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
    //calcolo perimetro, controllando i lati e calcolando il tipo
    public double calcolaPerimetro(){
        if((this.lato1 > 0.0) && (this.lato2 > 0.0) && (this.lato3 > 0.0)){
            if((this.lato1 == this.lato2) || (this.lato1 == this.lato3) || (this.lato2 == this.lato3)){
                if((this.lato1 == this.lato2) && (this.lato1 == this.lato3)){
                    this.tipo = "equilatero";
                    this.perimetro = lato1 * 3;
                }else{
                    this.tipo = "isoscele";
                    if(this.lato1 == this.lato2){
                        this.perimetro = this.lato1 * 2 + this.lato3;
                    }else if(this.lato1 == this.lato3){
                        this.perimetro = this.lato1 * 2 + this.lato2;
                    }else if(this.lato2 == this.lato3){
                        this.perimetro = this.lato2 * 2 + this.lato1;
                    }
                }
            }else{
                this.tipo = "scaleno";
                this.perimetro = this.lato1 + this.lato2 + this.lato3;
            }
            return this.perimetro;
        }
        return -1;
    }
}