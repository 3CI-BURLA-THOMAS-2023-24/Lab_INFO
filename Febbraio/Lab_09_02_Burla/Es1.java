/**
 * Programma per leggere un valore n > 3, rileggerlo se non corretto, leggere n valori interi e visualizzare: 							     0,5 pt
        ? i valori maggiori di 10		     			                                                                                             0,5 pt
        ? i valori minori o uguali a 0		     			                                                                                             0,5 pt
        ? i valori divisibili per 7					                                                                                             0,5 pt
 *
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es1{
    public static void main(String args[]){
        //dichiarazione variabili
        int n, v[];
        //leggo n e lo controllo
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un valore maggiore di 3"));
            if(n <= 3){
                JOptionPane.showMessageDialog(null, "ERRORE! Valore non valido");
            }
        }while(n <= 3);
        //allocazione vettore
        v = new int[n];
        //riempio vettore
        for(int i = 0; i < n; i++){
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire un valore nel vettore"));
        }
        //visualizzo valori maggiori di 10
        System.out.println("I valori maggiori di 10 sono: ");
        for(int i = 0; i < n; i++){
            if(v[i] > 10){
                System.out.println(v[i]);
            }
        }
        //visualizzo i valori minori o uguali a 0
        System.out.println("I valori minori o uguali a 0 sono: ");
        for(int i = 0; i < n; i++){
            if(v[i] <= 0){
                System.out.println(v[i]);
            }
        }
        //visualizzo i valori divisibili per 7
        System.out.println("I valori divisibili per 7 sono: ");
        for(int i = 0; i < n; i++){
            if((v[i] % 7) == 0){
                System.out.println(v[i]);
            }
        }
    }
}