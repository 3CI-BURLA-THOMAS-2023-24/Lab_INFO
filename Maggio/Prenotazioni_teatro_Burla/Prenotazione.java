/**
 *  classe Prenotazione:
    ArrayList di Biglietti
    ArrayList di Clienti
 * 
 */
import java.util.*;
public class Prenotazione {
    //variabili d'istanza
    private ArrayList <Biglietto> biglietti;
    private ArrayList <Cliente> clienti;
    //costruttore senza parametri
    public Prenotazione(){
        this.biglietti = new ArrayList <Biglietto> ();
        this.clienti = new ArrayList <Cliente> ();
    }
}