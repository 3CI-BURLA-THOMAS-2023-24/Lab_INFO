/**
 * Scrivi un programma Java che trova e visualizza la stringa più corta in un array di stringhe precedentemente letto (provare con 5 stringhe), se due stringhe hanno la stessa lunghezza, stampare la prima.
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es2{
    public static void main(String args[]){
        //dichiarazione variabili e inizializzazione
        String array[];
        int n;
        int i;
        String piuCorta = "";
        //leggo e controllo n
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Inserire la dimensione dell'array che deve essere maggiore di 2"));
            if(n < 2){
                JOptionPane.showMessageDialog(null, "ERRORE di input!", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }while(n < 2);
        //alloco e leggo array
        array = new String[n];
        for(i = 0; i < n; i++){
            //controllo stringa
            do{
                array[i] = JOptionPane.showInputDialog("Inserire stringa nell'array");
                if(array[i].equals(" ") || array[i].equals("")){
                    JOptionPane.showMessageDialog(null, "ERRORE stringa vuota", "Errore", JOptionPane.ERROR_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Stringa registrata", "Ok", JOptionPane.WARNING_MESSAGE);
                }
            }while(array[i].equals(" ") || array[i].equals(""));
            //controllo lunghezza con la più corta
            if(i == 0){
                piuCorta = array[i];
            }
            else if(array[i].length() < piuCorta.length()){
                piuCorta = array[i];
            }
        }
        //output
        JOptionPane.showMessageDialog(null, "La stringa più corta è: " + piuCorta + "; in posizione: " + i);
    }
}