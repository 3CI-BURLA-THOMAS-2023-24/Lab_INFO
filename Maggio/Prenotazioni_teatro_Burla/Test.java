/**
 *  Fare in modo che il cliente possa acquistare uno o più biglietti
    Creare la classe Main che crea un teatro, tre spettacoli con gli attori e gestisce le prenotazioni 
    dei biglietti ad un determinato spettacolo, calcolando il costo tenendo conto delle riduzione per i bambini 
    fino a 12 anni e degli adulti con più di 65 anni
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Test {
    public static void main(String args[]){
        //clienti
        Cliente cliente1 = new Cliente(JOptionPane.showInputDialog("Inserire il nome del primo cliente"), JOptionPane.showInputDialog("Inserire il cognome del primo cliente"), JOptionPane.showInputDialog("Inserire l'email del primo cliente"));
        Cliente cliente2 = new Cliente(JOptionPane.showInputDialog("Inserire il nome del secondo cliente"), JOptionPane.showInputDialog("Inserire il cognome del secondo cliente"), JOptionPane.showInputDialog("Inserire l'email del secondo cliente"));
        Cliente cliente3 = new Cliente(JOptionPane.showInputDialog("Inserire il nome del terzo cliente"), JOptionPane.showInputDialog("Inserire il cognome del terzo cliente"), JOptionPane.showInputDialog("Inserire l'email del terzo cliente"));
        //creo biglietti
        Biglietto biglietto1 = new Biglietto(Double.parseDouble(JOptionPane.showInputDialog("Quanto vuole spendere il primo cliente?")), 785, cliente1);
        Biglietto biglietto2 = new Biglietto(Double.parseDouble(JOptionPane.showInputDialog("Quanto vuole spendere il secondo cliente?")), 23, cliente2);
        Biglietto biglietto3 = new Biglietto(Double.parseDouble(JOptionPane.showInputDialog("Quanto vuole spendere il terzo cliente?")), 1, cliente3);
        //assegno biglietti e posti
        cliente1.setPosto(biglietto1);
        cliente2.setPosto(biglietto2);
        cliente3.setPosto(biglietto3);
        //leggo risultati
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(biglietto1);
        System.out.println(biglietto2);
        System.out.println(biglietto3);
    }
}
