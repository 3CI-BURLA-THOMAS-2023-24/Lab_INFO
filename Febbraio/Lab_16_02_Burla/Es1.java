/**
 * Leggere un valore n >3
    Leggere un vettore di n valori interi
    visualizzare i valori pari
    sommare i valori in posizione dispari
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es1{
    public static void main(String args[]){
        //dichiarazione variabili
        int n, v[], somma;
        //inizializzazione variabili
        somma = 0;
        //leggo e controllo n
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Quanto deve sssere grande il vettore? Almeno 4 valori"));
            if(n <= 3){
                JOptionPane.showMessageDialog(null, "ERRORE! Il vettore deve contenere almeno 4 valori");
            }
        }while(n <= 3);
        //alloco vettore
        v = new int[n];
        //riempio vettore e sommo i valori in posizione dispari
        for(int  i = 0; i < n; i++){
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire un valore intero nel vettore"));
            if((i % 2) != 0){
                somma+= v[i];
            }
        }
        //output valori pari
        System.out.println("I valori pari sono: ");
        for(int i = 0; i < n; i++){
            if((v[i] % 2) == 0){
                System.out.println(v[i]);
            }
        }
        System.out.println("La somma dei valori in posizione dispari è: "+somma);
    }
}