/**
 * Circonferenza
 *
 * @author Thomas Burla
 * @version 1.0
 */
public class Cerchio {
    //variabili d'istanza
    private double raggio;
    private double area;
    private double perimetro;
    private String equazione;
    private final double PI_GRECO = 3.141592653;
    //costruttore senza parametri
    public Cerchio(){
        this.raggio = 0.0;
        this.area = 0.0;
        this.perimetro = 0.0;
        this.equazione = "non definita";
    }
    //costruttore con raggio controllato
    public Cerchio(double raggio){
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
        //equazione
        this.equazione = "non definita";
    }
    //costruttore con perimetro e area controllati
    public Cerchio(double area, double perimetro){
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
        //equazione
        this.equazione = "non definita";
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
    public double calcolaPerimetro(){
        if(this.raggio > 0.0){
            this.perimetro = 2 * PI_GRECO * this.raggio;
            return this.perimetro;
        }
        return -1;
    }
    //calcolo area nel caso in cui il raggio sia positivo
    public double calcolaArea(){
        if(this.raggio > 0.0){
            this.area = PI_GRECO * this.raggio * this.raggio;
            return this.area;
        }
        return -1;
    }
    //calcolo equazione della circonferenza dati 3 suoi punti
    public String calcolaEquazione(Punto p, Punto s, Punto t){
        //coefficienti per calcolare l'equazione della circonferenza
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        //matrici 
        double coefficientiCirconferenza[][] = new double[3][3];
        double terminiNoti[][] = new double[3][1];
        //determinanti
        double detA = 0.0;
        double detB = 0.0;
        double detC = 0.0;
        double determinante = 0.0;
        if((p != null) && (s != null) && (t != null)){
            //definisco matrice dei coefficienti per ricercare l'equazione della circonferenza (risolvo sistema con metodo di Cramer)
            coefficientiCirconferenza[0][0] = p.getAscissa();
            coefficientiCirconferenza[0][1] = p.getOrdinata();
            coefficientiCirconferenza[1][0] = s.getAscissa();
            coefficientiCirconferenza[1][1] = s.getOrdinata();
            coefficientiCirconferenza[2][0] = t.getAscissa();
            coefficientiCirconferenza[2][1] = t.getOrdinata();
            for(int r = 0; r < 3; r++){
                coefficientiCirconferenza[r][2] = 1.0;
            }
            //definisco matrice dei termini noti per ricercare l'equazione della circonferenza
            terminiNoti[0][0] = -((p.getAscissa() * p.getAscissa()) + (p.getOrdinata() * p.getOrdinata()));
            terminiNoti[1][0] = -((s.getAscissa() * s.getAscissa()) + (s.getOrdinata() * s.getOrdinata()));
            terminiNoti[2][0] = -((t.getAscissa() * t.getAscissa()) + (t.getOrdinata() * t.getOrdinata()));
            //calcolo determinante
            determinante = (coefficientiCirconferenza[0][0] * ((coefficientiCirconferenza[1][1] * coefficientiCirconferenza[2][2]) - (coefficientiCirconferenza[2][1] * coefficientiCirconferenza[1][2]))) - (coefficientiCirconferenza[0][1] * ((coefficientiCirconferenza[1][0] * coefficientiCirconferenza[2][2]) - (coefficientiCirconferenza[2][0] * coefficientiCirconferenza[1][2]))) + (coefficientiCirconferenza[0][2] * ((coefficientiCirconferenza[1][0] * coefficientiCirconferenza[2][1]) - (coefficientiCirconferenza[2][0] * coefficientiCirconferenza[1][1])));
            //calcolo coefficiente a della circonferenza
            detA = (terminiNoti[0][0] * ((coefficientiCirconferenza[1][1] * coefficientiCirconferenza[2][2]) - (coefficientiCirconferenza[2][1] * coefficientiCirconferenza[1][2]))) - (coefficientiCirconferenza[0][1] * ((terminiNoti[1][0] * coefficientiCirconferenza[2][2]) - (terminiNoti[2][0] * coefficientiCirconferenza[1][2]))) + (coefficientiCirconferenza[0][2] * ((terminiNoti[1][0] * coefficientiCirconferenza[2][1]) - (terminiNoti[2][0] * coefficientiCirconferenza[1][1])));
            a = detA / determinante;
            //calcolo coefficiente b della circonferenza
            detB = (coefficientiCirconferenza[0][0] * ((terminiNoti[1][0] * coefficientiCirconferenza[2][2]) - (terminiNoti[2][0] * coefficientiCirconferenza[1][2]))) - (terminiNoti[0][0] * ((coefficientiCirconferenza[1][0] * coefficientiCirconferenza[2][2]) - (coefficientiCirconferenza[2][0] * coefficientiCirconferenza[1][2]))) + (coefficientiCirconferenza[0][2] * ((coefficientiCirconferenza[1][0] * terminiNoti[2][0]) - (coefficientiCirconferenza[2][0] * terminiNoti[1][0])));
            b = detB / determinante;
            //calcolo coefficiente c della circonferenza
            detC = (coefficientiCirconferenza[0][0] * ((coefficientiCirconferenza[1][1] * terminiNoti[2][0]) - (coefficientiCirconferenza[2][1] * terminiNoti[1][0]))) - (coefficientiCirconferenza[0][1] * ((coefficientiCirconferenza[1][0] * terminiNoti[2][0]) - (coefficientiCirconferenza[2][0] * terminiNoti[1][0]))) + (terminiNoti[0][0] * ((coefficientiCirconferenza[1][0] * coefficientiCirconferenza[2][1]) - (coefficientiCirconferenza[2][0] * coefficientiCirconferenza[1][1])));
            c = detC / determinante;
            //scrivo equazione della circonferenza
            this.equazione = "x^2 + y^2 + " + a + "x + " + b + "y + " + c + " = 0";
        }
        return this.equazione;
    }
    //toString
    public String toString(){
        String out = "";
        out+= "Il raggio della circonferenza è: " + this.raggio;
        out+= "cm.\nIl perimetro della circonferenza è: " + this.perimetro;
        out+= "cm.\nL'area del cerchio è: " + this.area;
        out+= "cm^2.\nLa circonferenza, di cui sono stati forniti i punti, ha equazione: " + this.equazione;
        return out;
    }
}
