/**
 * Scrivere un programma che stampi a video tutti i numeri pari compresi tra due estremi a e b letti da tastiera. Il programma deve dire anche quanti sono.
 * 
 * @author Burla Thomas
 * @version 1.0
 */
import java.util.Scanner;
public class Es6 {
    public static void main(String args[]){
        //dichiarazione delle variabili
        int a, b, pari, counter;
        //inizializzazione delle variabili
        pari = 0;
        counter = 0;
        //prendo in ingresso a e b
        Scanner input = new Scanner(System.in);
        //controllo che b sia sempre il maggiore
        do{
        System.out.println("Inserire l'estremo inferiore dell'intervallo");
        a = input.nextInt();
        System.out.println("Inserire l'estremo superiore dell'intervallo");
        b = input.nextInt();
        if(b < a){
            System.out.println("Errore! Il primo valore deve essere minore del secondo");
        }
        }while(b < a);
        //controllo se a è dispari o meno
        if((a % 2) == 0){
            //aggiungo 2 per far raggiungere ad a il successivo valore pari
            pari = a + 2;
        }else{
            //aggiungo 1 per far raggiungere ad a il successivo valore pari
            pari = a + 1; 
        }
        //output
        System.out.println("I numeri pari compresi nell'intervallo sono: \n");
        //ciclo per stampare i valori pari
        while(pari < b){
            System.out.println(pari);
            pari = pari + 2;
            counter++;
        }
        //stampo quanti pari
        System.out.println("In tutto, i numeri pari sono: "+counter);
        input.close();
    }
    
}
