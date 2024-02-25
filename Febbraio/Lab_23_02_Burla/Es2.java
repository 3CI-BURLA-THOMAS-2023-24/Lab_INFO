/**
 * contare quante volte k è presente nell'array
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es2{
    public static void main(String args[]){
        //dichiarazione variabili
        double k, v[];
        int l, conto_k = 0;
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
        for(int i = 0; i < l; i++){
            if(v[i] == k){
                conto_k++;
            }
        }
        //output
        JOptionPane.showMessageDialog(null, "Il valore compare " +conto_k+" volte");
    }
}