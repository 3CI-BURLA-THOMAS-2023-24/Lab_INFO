/**
 * Scrivi un programma Java che legge una matrice quadrata n x n (n>3), la visualizza e calcola e visualizza la somma dei valori sulle due diagonali.
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es3{
    public static void main(String args[]){
        //dichiarazione variabili e inizializzazione
        int n;
        double matrice[][];
        double sommaPrinc = 0.0;
        double sommaSecond = 0.0;
        //leggo e controllo n
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Inserire l'ordine della matrice quadrata"));
            if(n <=3 ){
                JOptionPane.showMessageDialog(null, "ERRORE di input!", "Errore", JOptionPane.ERROR_MESSAGE);
            }
        }while(n <= 3);
        //alloco matrice
        matrice = new double[n][n];
        //leggo matrice e calcolo somme
        for(int r = 0; r < n; r++){
            for(int c = 0; c < n; c++){
                matrice[r][c] = Double.parseDouble(JOptionPane.showInputDialog("Inserire valore reale, che andra in posizione" + r + "," + c));
                if(r == c){
                    sommaPrinc += matrice [r][c];
                }else if((r + c) == (n - 1)){
                    sommaSecond += matrice[r][c];
                }
            }           
        }
        //visualizzo matrice
        System.out.println("La matrice contiene i seguenti valori: ");
        for(int r = 0; r < n; r++){
            for(int c = 0; c < n; c++){
                System.out.print("|" + matrice[r][c] + "|");
            }
            System.out.println(" ");
        }
        //visualizzo somme
        System.out.println("Somma valori nella diagonale principale: "+sommaPrinc);
        System.out.println("Somma valori nella diagonale secondaria: "+sommaSecond);
    }
}