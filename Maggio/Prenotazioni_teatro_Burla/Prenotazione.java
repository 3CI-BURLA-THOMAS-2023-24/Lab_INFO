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
    //costruttore con parametri
    public Prenotazione(Biglietto biglietto, Cliente cliente){
        this.biglietti = new ArrayList <Biglietto> ();
        this.clienti = new ArrayList <Cliente> ();
        if(biglietto != null){
            (this.biglietti).add(biglietto);
        }
        if(cliente != null){
            (this.clienti).add(cliente);
        }
    }
    //set biglietto
    public void setBiglietto(Biglietto biglietto){
        if(biglietto != null){
            (this.biglietti).add(biglietto);
        }
    }
    //get biglietto(come stringa), dato il titolare
    public String getBiglietto(String titolare){
        Biglietto biglietto = null;
        boolean trovato = false;
        int i = 0;
        while((trovato == false) && (i < (this.biglietti).size())){
            biglietto = (this.biglietti).get(i);
            if((biglietto.getTitolare()).equalsIgnoreCase(titolare)){
                trovato = true;
            }
            i++;
        }
        if(trovato == true){
            return biglietto.toString();
        }
        return "Nessun biglietto corrispondente al nominativo";
    }
    //get biglietto, dato l'indice nella lista
    public Biglietto getBiglietto(int index){
        if(index < this.biglietti.size()){
            return this.biglietti.get(index);
        }
        return null;
    }
    //set clienti
    public void setCliente(Cliente cliente){
        if(cliente != null){
            (this.clienti).add(cliente);
        }
    }
    //get clienti, dati nome e cognome
    public String getClienti(String nome, String cognome){
        Cliente cliente = null;
        boolean trovato = false;
        int i = 0;
        while((trovato == false) &&  (i < (this.clienti).size())){
            cliente = (this.clienti).get(i);
            if(((cliente.getNome()).equalsIgnoreCase(nome)) && ((cliente.getCognome()).equalsIgnoreCase(cognome))){
                trovato = true;
            }
            i++;
        }
        if(trovato == true){
            return cliente.toString();
        }
        return "Nessun cliente trovato dati tali informazioni";
    }
    //metodo che restituisce il numero di biglietti della prenotazione
    public int numeroBiglietti(){
        return this.biglietti.size();
    }
    //toString
    public String toString(){
        String out = "Elenco dei biglietti e dei relativi clienti della seguente prenotazione: ";
        Cliente cliente = null;
        Biglietto biglietto =  null;
        boolean errore = false;
        int b;
        boolean trovato;
        for(int i = 0; (i < (this.clienti).size()) && (errore == false); i++){
            //leggo cliente
            cliente = this.clienti.get(i);
            //ricerca del biglietto, dato il numero di posto del cliente
            b = 0;
            trovato = false;
            while((trovato == false) && (b < biglietti.size())){
                biglietto = this.biglietti.get(b);
                if((biglietto).getNumero_posto() == cliente.getPosto()){
                    trovato = true;
                }
            }
            if(trovato == true){
                //output cliente
                out += "\n" + i + ". " + cliente.toString();
                //output prezzo biglietto
                out += ".\n Il prezzo del biglietto è: " + biglietto.getPrezzo() + "€ \n";
                
            }else{
                errore = true;
            }
        }
        if(errore == true){
            return "OPS! QUalcosa è andato storto :(...verificare che ogni cliente abbia il biglietto corrispondente!";
        }
        return out + ".\n Nella prenotazione vi sono " + this.biglietti.size() + "biglietti.";
    }
}