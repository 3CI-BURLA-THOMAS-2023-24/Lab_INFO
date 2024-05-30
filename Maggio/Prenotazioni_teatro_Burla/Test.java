/**
 *  Fare in modo che il cliente possa acquistare uno o più biglietti
    Creare la classe Main che crea un teatro, tre spettacoli con gli attori e gestisce le prenotazioni 
    dei biglietti ad un determinato spettacolo, calcolando il costo tenendo conto delle riduzione per i bambini 
    fino a 12 anni e degli adulti con più di 65 anni
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import java.util.*;
import javax.swing.JOptionPane;
public class Test {
    public static void main(String args[]){
        //dichiarazione e inizializzazione variabili
        int ripeti = 0;
        String nome = "";
        String cognome = "";
        String email = "";
        int anni = 0;
        ArrayList <Prenotazione> prenotazioni = new ArrayList <Prenotazione> ();
        ArrayList <Cliente> clienti = new ArrayList <Cliente> ();
        //creo teatro
        Teatro marconiVR = new Teatro("Teatro Ristori", "Verona", 1800);
        //creo i tre spettacoli e li aggiungo al teatro
        Spettacolo jazz = new Spettacolo("Jazz", 90, "Musica");
        marconiVR.setSpettacolo(jazz);
        Spettacolo commedia = new Spettacolo("Divinaa Commedia", 60, "Letteratura");
        marconiVR.setSpettacolo(commedia);
        Spettacolo reggaeton = new Spettacolo("Reggaeton", 180, "Musica");
        marconiVR.setSpettacolo(reggaeton);
        //autori spettacolo jazz, aggiunti al rispettivo spettacolo
        Attore patitucci = new Attore("John", "Patitucci", 65, "Bassista");
        jazz.setAttore(patitucci);
        Attore calderazzo = new Attore("Joseph Dominik", "Calderazzo", 59, "Pianista");
        jazz.setAttore(calderazzo);
        Attore weckl = new Attore("Dave", "Weckl", 64, "Batterista");
        jazz.setAttore(weckl);
        //attori spettacolo commedia
        Attore dante = new Attore("Dante", "Alighieri", 35, "Protagonista");
        commedia.setAttore(dante);
        Attore virgilio = new Attore("Virgilio", "Marone", 60, "Guida");
        commedia.setAttore(virgilio);
        //attori spettacolo reggaeton
        Attore lamborghini = new Attore("Elettra", "Lamborghini", 30, "Cantante");
        reggaeton.setAttore(lamborghini);
        //ciclo per salvare le prenotazioni su una arraylist
        do{

            //ciclo per clienti e biglietti
            do{
                //controllo nome
                do{
                    nome = JOptionPane.showInputDialog("Inserire il nome del cliente");
                    if((nome.equals("")) || (nome.equals(" "))){
                        JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota", "Errore", JOptionPane.ERROR_MESSAGE);
                    }
                }while((nome.equals("")) || (nome.equals(" ")));
                //controllo cognome
                do{
                    cognome = JOptionPane.showInputDialog("Inserire il cognome del cliente");
                    if((cognome.equals("")) || (cognome.equals(" "))){
                        JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota", "Errore", JOptionPane.ERROR_MESSAGE);
                    }
                }while((cognome.equals("")) || (cognome.equals(" ")));
                //controllo email
                do{
                    email = JOptionPane.showInputDialog("Inserire l'email del cliente");
                    if((email.equals("")) || (email.equals(" "))){
                        JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota", "Errore", JOptionPane.ERROR_MESSAGE);
                    }
                }while((email.equals("")) || (email.equals(" ")));
                //controllo anni
                do{
                    anni = Integer.parseInt(JOptionPane.showInputDialog("Inserire l'eetà del cliente"));
                    if(anni <= 0){
                        JOptionPane.showMessageDialog(null, "ERRORE! Valore non valido", "Errore", JOptionPane.ERROR_MESSAGE);
                    }
                }while(anni <= 0);
                Cliente cliente = new Cliente(nome, cognome, email, anni);

            }while(ripeti == JOptionPane.YES_OPTION);
        }while(ripeti == JOptionPane.YES_OPTION);
    }
}
