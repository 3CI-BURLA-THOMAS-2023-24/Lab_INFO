/**
 *  • Leggere un valore l compreso tra 3 e 10
    • leggere un vettore di l valori double corrispondenti ai voti di un alunno (voto compreso tra 3 e 10)
    • calcolare e visualizzare la media dei voti
    • dire se l'alunno è promosso o bocciato
    • visualizzare il voto più basso e il voto più alto
 * 
 * @author Thomas Burla
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es2{
    public static void main(String args[]){
        //dichiarazione variabili
        int l;
        double voto[], media, max, min, somma;
        //inizializzazione variabili
        media = somma = max = 0.0;
        min = 0.0;
        //leggo l e controllo l'input
        do{
            l = Integer.parseInt(JOptionPane.showInputDialog("Quanti voti desideri inserire? Minimo 3 e massimo 10"));
            if((l < 3) || (l > 10)){
                JOptionPane.showMessageDialog(null, "ERRORE! Inserire un valore rispettando le indicazioni");
            }
        }while((l < 3) || (l > 10));
        //allocazione array
        voto = new double[l];
        //leggo vettore con un ciclo
        for(int i = 0; i < l; i++){
            //controllo input
            do{
                voto[i] = Double.parseDouble(JOptionPane.showInputDialog("Inserire un voto compreso tra 3 e 10"));
                if((voto[i] < 3) || (voto[i] > 10)){
                    JOptionPane.showMessageDialog(null, "ERRORE! Inserire un valore rispettando i criteri.");
                }
                //calcolo la somma, usata poi per la me
            }while((voto[i] < 3) || (voto[i] > 10));
            //calcolo la somma, usata poi per la media
            somma = somma + voto[i];
            //il primo valore inserito viene di base considerato sia voto minimo che massimo
            if(i == 0){
                min = voto[0];
                max = voto[0];
            //confronto i valori successivi
            }else if((i != 0) && (i != (l))){
                if(voto[i] > max){
                    max = voto[i];
                }else if(voto[i] < min){
                    min = voto[i];
                }
            }
        }
        //calcolo media
        media = somma / l;
        //output
        if(media < 6){
            JOptionPane.showMessageDialog(null, "Bocciato");
        }else{
            JOptionPane.showMessageDialog(null, "Promosso");
        }
        JOptionPane.showMessageDialog(null, "Voto più basso-->"+min);
        JOptionPane.showMessageDialog(null, "Voto più alto-->"+max);
    }
}