/**
 * Implementare e consegnare gli algoritmi svolti a lezione:
   - ricerca di un valore k in un array (presente/non presente)
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es1{
    public static void main(String args[]){
        //dichiarazione variabili
        double k, v[];
        int l, b = 0;
        boolean trovato = false;
        //leggo e controllo l
        do{
            l =  Integer.parseInt(JOptionPane.showInputDialog("Quanti valori deve contenere l'array?"));
            if(l <= 1){
                JOptionPane.showMessageDialog(null, "ERRORE! Un vettore deve contenere almeno due valori");
            }
        }while(l <= 1);
        //alloco vettore
        v = new double[l];
        //riempio vettore
        for(int i = 0; i < l; i++){
            v[i] = Double.parseDouble(JOptionPane.showInputDialog("Inserire un valore double"));
        }
        //chiedo valore da cercare
        k = Double.parseDouble(JOptionPane.showInputDialog("Quale valore vuoi cercare nel vettore?"));
        //ricerca valore
        do{
            if(v[b] == k){
                trovato = true;
            }
            b++;
        }while((b < l) && (trovato == false));
        //output
        if(trovato == true){
            JOptionPane.showMessageDialog(null, "Il valore è presente");
        }else{
            JOptionPane.showMessageDialog(null, "Il valore NON è presente");
        }
    }
}