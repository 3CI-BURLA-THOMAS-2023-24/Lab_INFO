/**
 *     4. Leggere un valore n compreso tra 1 e 5						     0,5 pt
        ◦ leggere un vettore di n valori double 			      			0,5 pt
        ◦ visualizzare il vettore					      			0,5 pt
        ◦ sommare i valori pari e calcolare e visualizzare la media 			1    pt
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es4{
    public static void main(String args[]){
        //dichiarazione variabili
        int n, counterpari;
        double v[], somma, media;
        //inizializzazione variabili
        somma = 0.0;
        counterpari = 0;
        //leggo n e lo controllo
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Inserire la lunghezza del vettore, compresa tra 1 e 5 (esclusi gli estremi)"));
            if((n <= 1) || (n >= 5)){
                JOptionPane.showMessageDialog(null, "ERRORE! Valore non valido");
            }
        }while((n <= 1) || (n >= 5));
        //allocazione vettore
        v = new double[n];
        //riempio vettore
        for(int i = 0; i < n; i++){
            v[i] = Double.parseDouble(JOptionPane.showInputDialog("Inserire un valore nel vettore"));
            //somam  tra pari
            if((v[i] % 2) ==0){
                somma = somma + v[i];
                counterpari++;
            }
        }
        //calcolo media tra pari
        media = somma / counterpari;
        //output vettore
        System.out.println("Il vettore contiene i seguenti valori: ");
        for(int i = 0; i < n; i++){
            System.out.println(v[i]);
        }
        //output media tra pari
        System.out.println("La media tra i pari è: "+media);
    }
}