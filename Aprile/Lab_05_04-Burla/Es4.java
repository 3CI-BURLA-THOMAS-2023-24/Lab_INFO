/**
 * Leggere un vettore di voti (da 3 a 10) e calcolare la media
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es4 {
    public static void main(String args[]){
        //dichiarazione variabili
        double vet[], mediaVoti, sommaVoti;
        int l;
        //inizializzazione variabili
        sommaVoti = 0.0;
        //chiedo dimensione array
        do{
            l = Integer.parseInt(JOptionPane.showInputDialog("Inserire la lunghezza del vettore, che deve essere minimo di 2"));
            if(l < 2){
                JOptionPane.showMessageDialog(null, "ERRORE di input, inserire una dimensione maggiore o uguale a 2", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }while(l < 2);
        //alloco array
        vet = new double[l];
        //leggo array controllando i voti in ingresso e calcolandone la somma
        for(int i = 0; i < l; i++){
            do{
                vet[i] = Double.parseDouble(JOptionPane.showInputDialog("Inserire un voto, da 3 a 10"));
                if((vet[i] < 3)  || (vet[i] > 10)){
                    JOptionPane.showMessageDialog(null, "ERRORE! Il voto NON è compreso nel range. Reinserirlo", "Errore", JOptionPane.ERROR_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Voto registrato!", "Ok", JOptionPane.WARNING_MESSAGE); 
                }
            }while((vet[i] < 3)  || (vet[i] > 10));
            sommaVoti+= vet[i];
        }
        //calcolo media
        mediaVoti = sommaVoti / l;
        //output
        JOptionPane.showMessageDialog(null, "La media dei voti inseriti è: "+mediaVoti);
    }
}
