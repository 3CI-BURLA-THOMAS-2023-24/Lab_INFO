/*
 * Calcolare il prodotto tra due valori interi letti in input val1, val2 per somme successive
    Es 4 * 3 = 4+4+4
 *
 * @author Burla Thomas
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es4{
    public static void main(String args[]){
        //dichirazione variabili
        int val1, val2, prodotto;
        //inizializzazione variabili
        prodotto = 0;
        //controllo dell'input
        do{
            val1 = Integer.parseInt(JOptionPane.showInputDialog("Inserire il primo fattore della moltiplicazione. Accettati solo numeri interi e positivi o nulli.."));
            val2 = Integer.parseInt(JOptionPane.showInputDialog("Inserire il secondo fattore della moltiplicazione. Accettati solo numeri interi e positivi o nulli"));
            if((val1 < 0) || (val2 < 0)){
                JOptionPane.showMessageDialog(null, "Errore! Il valore inserito non rispetta i parametri");
            }
        }while((val1 < 0) || (val2 < 0));
        //caso di un fattore uguale a 0
        if(!((val1 == 0) || (val2 == 0))){
            //caso generale
            for(int i = 0; i < val2; i++){
                prodotto = prodotto + val1;
            }
        }
        //se un fattore vale 0, il prodotto rimane con il valore di inizializzazione, ovvero 0
        JOptionPane.showMessageDialog(null, "Il prodotto è: "+prodotto);
    }
}
