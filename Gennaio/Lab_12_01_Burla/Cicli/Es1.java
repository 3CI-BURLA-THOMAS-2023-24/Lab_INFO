/**
 * Leggere n voti (n >= 3) e mostrare la media dei voti
 * @author Burla Thomas
 * @version 1.0
 */
import java.util.Scanner;
public class Es1{
    public static void main(String args[]){
        //doichiaro le variabili
        int n;
        double media, somma, voto;
        //inizializzo somma
        somma = 0;
        //controllo dell'input
        Scanner inp = new Scanner(System.in);
        do{
            System.out.println("Inserire un numero di voti >= 3 per viualizzare la loro media");
            n = inp.nextInt();
            //messaggio di eventuale errore
            if(n < 3){
                System.out.println("Errore! Valore non valido!");
            }
        }while(n < 3);
        //ciclo per calcolare la somma dei voti
        for(int i = 0; i < n; i++){
            //controllo del voto inserito
            do{
                System.out.println("Inserire un voto comprso tra 3 e 10");
                voto = inp.nextDouble();
                //messaggio di eventuale input sbagliato
                if((voto < 3) || (voto > 10)){
                    System.out.println("Errore! Voto non valido");
                }
            }while((voto < 3) || (voto > 10));
            somma = somma + voto;
        }
        //calcolo media
        media = somma / n;
        //output
        System.out.println("La media dei voti è: "+media);
    }
}