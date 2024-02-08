/**
 * Ricercare in un vettore di dimensione DIM la presenza di un valore e restituire il numero di occorrenze nel vettore.
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es3 {
    public static void main(String args[]){
        //dichiarazione variabili
        int dim, counter = 0;
        double v[], cerca;
        //leggo la dimensione del vettore e la controllo
        do{
            dim = Integer.parseInt(JOptionPane.showInputDialog("Quanto deve essere grande il vettore?"));
            if(dim <= 0){
                JOptionPane.showInputDialog("ERRORE! Valore non valido");
            }
        }while(dim <= 0);
        //allocazione vettore
        v = new double[dim];
        //riempio vettore
        for(int i = 0; i < dim; i++){
            v[i] = Double.parseDouble(JOptionPane.showInputDialog("Immettere un valore per inserirlo nel vettore"));
        }
        //chiedo il valore da cercare nel vettore
        cerca = Double.parseDouble(JOptionPane.showInputDialog("Inserire il numero da cercare nel vettore compilato precedentemente"));
        //cerco il valore e conto
        for(int i = 0; i < dim; i++){
            if(v[i] == cerca){
                counter++;
            }
        }
        //output
        JOptionPane.showMessageDialog(null, "Il valore compare "+counter+" volte");
    }
}
