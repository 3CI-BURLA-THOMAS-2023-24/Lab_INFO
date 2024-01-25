/**
 * Estrarre da una stringa la sottostringa che va dalla posizione a alla posizione b comprese.
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es1{
    public static void main(String args[]){
        //dichiarazione delle variabili
        int pos1, pos2;
        String stringa, sottostringa;
        sottostringa = "";
        //inizilizzazione variabili
        do{
            pos1 = Integer.parseInt(JOptionPane.showInputDialog("Da qual posizione deve partire la sottostringa? DISCLAIMER: la posizione più a sinistra viene contata come posizione 0"));
            pos2 = Integer.parseInt(JOptionPane.showInputDialog("In quale posizione deve finire la sottostringa? DISCLAIMER: la posizione più a sinistra viene contata come posizione 0"));
            if((pos1 < 0) || (pos2 < pos1)){
                JOptionPane.showMessageDialog(null, "ERRORE! Controlla di vaer inserito i numeri di posizione secondo le indicazioni");
            }
        }while((pos1 < 0) || (pos2 < pos1));
        stringa = JOptionPane.showInputDialog("Inserire la stringa da cui si vuole estrarre la sottostringa");
        sottostringa = stringa.substring(pos1, pos2 + 1);
        JOptionPane.showMessageDialog(null, "La sottostringa è: "+sottostringa);
    }
}