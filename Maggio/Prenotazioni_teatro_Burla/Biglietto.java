/**
 * Biglietto:
    -prezzo
    -numero_posto
    -metodi opportuni
 * 
 * @author Thomas Burla
 * @version 1.0
 */
public class Biglietto{
    private double prezzo;
    private int numero_posto;
    private String titolare;
    private String tipoSpettacolo;
    //costruttore senza parametri
    public Biglietto(){
        this.prezzo = 0.0;
        this.numero_posto = 0;
        this.titolare = "Sconosciuto";
        this.tipoSpettacolo = "-";
    }
    //costruttore con parametri controllati
    public Biglietto(double prezzo, int numero_posto, Cliente titolare, String tipoSpettacolo){
        //prezzo
        if(prezzo > 0.0){
            this.prezzo = prezzo;
        }else{
            this.prezzo = 0.0;
        }
        //numero_posto
        if(numero_posto > 0){
            this.numero_posto = numero_posto;
        }else{
            this.numero_posto = 0;
        }
        //titolare
        if(titolare != null){
            this.titolare = titolare.getNome() + " " + titolare.getCognome();
        }else{
            this.titolare = "-";
        }
        //tipoSpettacolo
        if(tipoSpettacolo != null){
            this.tipoSpettacolo = tipoSpettacolo;
        }else{
            this.tipoSpettacolo = "-";
        }
    }
    //set prezzo
    public void setPrezzo(double prezzo){
        if(prezzo > 0.0){
            this.prezzo = 0.0;
        }
    }
    //get prezzo
    public double getPrezzo(){
        return this.prezzo;
    }
    //set numero_posto
    public void setNumero_posto(int numero_posto){
        if(numero_posto > 0){
            this.numero_posto = numero_posto;
        }
    }
    //get numero_posto
    public int getNumero_posto(){
        return this.numero_posto;
    }
    //set titolare
    public void setTitolare(String titolare){
        if(titolare != null){
            this.titolare = titolare;
        }
    }
    //get titolare
    public String getTitolare(){
        return this.titolare;
    }
    //set tipoSpettacolo
    public void setTipoSpettacolo(String tipoSpettacolo){
        if(tipoSpettacolo != null){
            this.tipoSpettacolo = tipoSpettacolo;
        }
    }
    //get tipoSpettacolo
    public String getTipoSpettacolo(){
        return this.tipoSpettacolo;
    }
    //toString
    public String toString(){
        String out = "";
        out += "Il prezzo del biglietto è: " + this.prezzo + " euro.";
        out += "\n Il numero del posto è: " + this.numero_posto;
        out += ".\n Il nome del titolare è: " + this.titolare;
        out += ".\n Il tipo di spettacolo è: " + this.tipoSpettacolo + ".";
        return out;
    }
}