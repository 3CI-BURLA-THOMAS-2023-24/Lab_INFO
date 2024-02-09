/**
 *     1. Programma che legge  un valore n >4, rileggerlo se non corretto, leggere n valori interi e visualizzare:                                  0,5 pt
        ◦ i valori maggiori di 100                         0,5 pt
        ◦ i valori minori o uguali a 10                     0,5 pt
        ◦ i valori divisibili per 8                    0,5 pt

 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es1{
    public static void main(String args[]){
        //dichiarazione variabili
        int n, v[];
        //inizializzazione variabili
        
        //leggo e controllo n
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Inserire un numero > 4"));
            if(n <= 4){
                JOptionPane.showMessageDialog(null, "ERRORE! Valore non accetttabile");
            }
        }while(n <= 4);
        //allocazione vettore
        v = new int[n];
        //scrivo nel vettore
        for(int i = 0; i < n; i++){
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire un valore nel vettore"));
        }
        //scrivo valori maggiori di 100
        System.out.println("I valori maggiori di 100 sono: ");
        for(int i = 0; i < n; i++){
            if(v[i] > 100){
                System.out.println(v[i]);
            }
        }
        //scrivo valori minori o uguali a 10
        System.out.println("I valori minori o uguali a 10 sono: ");
        for(int i = 0; i < n; i++){
            if(v[i] <= 10){
                System.out.println(v[i]);
            }
        }
        //scrivo i valori divisibili per 8
        System.out.println("I valori divisibli per 8 sono: ");
        for(int i = 0; i < n; i++){
            if((v[i] % 8) == 0){
                System.out.println(v[i]);
            }
        }
    }
}