/**
 * Cercare una parola all'interno di una stringa senza sapere a priori la lunghezza della parola.
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class CercoParola {
    public static void main(String args[]){
        //dichiarazione variabili ed eventuale inizialializzazione
        String stringa;
        String sCheck = "";
        String parola;
        int i = 0;
        int l;
        boolean trovata = false;
        boolean fine = false;
        char carattere;
        //leggo e controllo stringa
        do{
            stringa = JOptionPane.showInputDialog("Inserire la stringa nella quale si vuole cercare");
            if((stringa.equals("")) || stringa.equals(" ")){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota", "Errore di input", JOptionPane.ERROR_MESSAGE);
            }
        }while((stringa.equals("")) || stringa.equals(" "));
        //salvo in l la lunghezza della stringa
        l = stringa.length();
        //leggo e controllo parola
        do{
            parola = JOptionPane.showInputDialog("Inserire la parola che si desidera cercare");
            if((parola.equals("")) || parola.equals(" ")){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota", "Errore di input", JOptionPane.ERROR_MESSAGE);
            }
        }while((parola.equals("")) || parola.equals(" "));
        //cerco la parola
        do{
            //resetto la stringa di controllo
            sCheck = "";
            //assegno a carattere il primo carattere della stringa (oppure quello subito dopo lo spazio)
            carattere = stringa.charAt(i);
            //finchè non si trova uno spazio, si costruisce la parola
            while((carattere != ' ') && (fine == false)){
                //concateno il carattere alla stringa di confronto
                sCheck+= carattere;
                //aggiorno puntatore
                i++;
                //preparo carattere successivo nel caso in cui la stringa non sia finita
                if(i < l){
                    carattere = stringa.charAt(i);
                }else{
                    fine = true;
                }
            }
            //controllo se la parola estratta è uguale a quella desiderata
            if(sCheck.equals(parola)){
                //parola trovata
                trovata = true;
            }
            //aggiorno puntatore
            i++;
        }while((i < l) && (trovata == false));
        //output
        if(trovata == true){
            JOptionPane.showMessageDialog(null, "La parola è presente nella stringa", "Trovata!", JOptionPane.WARNING_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "La parola NON presente nella stringa", "NON trovata :(", JOptionPane.WARNING_MESSAGE);
        }
    }
}
