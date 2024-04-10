/**
 * Leggere un vettore di interi e dire quanti valori sono maggiori di 6.
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es3 {
    public static void main(String args[]){
        //dichiarazione variabili
        int vet[], c, l;
        //inizializzazione variabili
        c = 0;
        //chiedo dimensione array
        do{
            l = Integer.parseInt(JOptionPane.showInputDialog("Inserire la lunghezza del vettore, che deve essere minimo di 2"));
            if(l < 2){
                JOptionPane.showMessageDialog(null, "ERRORE di input, inserire una dimensione maggiore o uguale a 2", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }while(l < 2);
        //alloco array
        vet = new int[l];
        //leggo array e conto quanti valori sono > 6
        for(int i = 0; i < l; i++){
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Inserire un valore nell'array"));
            if(vet[i] > 6){
                c++;
            }
        }
        //output
        JOptionPane.showMessageDialog(null, "I valori maggiori di 6 sono " +c);
    }
}
