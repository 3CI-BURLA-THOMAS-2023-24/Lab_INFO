/**
 *  • Leggere un valore l compreso tra 3 e 10
    • Leggere un vettore di l elementi interi 
    • fare la somma di tutti i valori del vettore e visualizzare la somma
    • fare la somma di tutti i valori dispari (sommad) e visualizzare il risultato 
    • fare la somma di tutti i valori in posizione pari (sommapp) e visualizzare il risultato
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es1{
    public static void main(String args[]){
        //dichirazione variabili
        int v[], l, somma, sommapp, sommad;
        //inizializzazione variabili
        somma = sommad = sommapp = 0;
            //leggo l e controllo l'input
            do{
                l = Integer.parseInt(JOptionPane.showInputDialog("Quanti valori desideri utilizzare nel programma? Minimo 3 e massimo 10"));
                if((l < 3) || (l > 10)){
                    JOptionPane.showMessageDialog(null, "ERRORE! Inserire un valore rispettando le indicazioni");
                }
            }while((l < 3) || (l > 10));
        //allocazione array
        v = new int[l];
        //leggo vettore con un cilo
        for(int i = 0; i < l; i++){
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire un valore intero"));
            //sommo il vettore letto
            somma = somma + v[i];
            //se il vettore letto è diapsri, sommo
            if((v[i] % 2) != 0){
                sommad = sommad + v[i];
            }
            //se il vettore letto è in posizione pari, sommo
            if((i % 2) == 0){
                sommapp = sommapp + v[i];
            }
        }
        JOptionPane.showMessageDialog(null,"Somma-->"+somma);
        JOptionPane.showMessageDialog(null,"Somma dei valori dispari-->"+sommad);
        JOptionPane.showMessageDialog(null,"Somma dei valori in posizione pari-->"+sommapp);
    }
}