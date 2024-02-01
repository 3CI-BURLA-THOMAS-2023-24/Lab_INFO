/**
 * Si scriva un programma per convertire un numero binario in decimale e viceversa.
 * 
 * @author Burla Thomas
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Es10{
    public static void main(String args[]){
        //dichiarazione delle variabili
        short scelta;
        String num, ca2;
        boolean errore;
        int j, potenza, bit, output;
        //inizializzazione variabili
        ca2 = "";
        potenza = 1;
        output = 0;
        //controllo dell'input della scelta
        do{
            scelta = (short) Integer.parseInt(JOptionPane.showInputDialog("Inserire 0 per convertire un numero binario in complemento a 2 in decimale, 1 per il viceversa"));
            if((scelta != 0) && (scelta != 1)){
                JOptionPane.showMessageDialog(null, "ERRORE! Inserire solo 0 o 1");
            }
        }while((scelta != 0) && (scelta != 1));
        if(scelta == 0){
            //controllo che siano stati inseriti solo 0 e 1
            do{
                errore = false;
                num = JOptionPane.showInputDialog("Inserire un numero binario in complemento a due per visualizzare il suo decimale corrispondente");
                for(int i = 0; (i < num.length() && errore == false); i++){
                    if((num.charAt(i) != '0') && (num.charAt(i) != '1')){
                        errore = true;
                    }
                }
                if(errore == true){
                    JOptionPane.showMessageDialog(null, "ERRORE! Inserire solo bit");
                }
            }while(errore == true);
            //trascrivo i bit finche non incontro un bit pari a 1
            for(j = num.length() - 1; (num.charAt(j) != '1') && j >= 0; j--){
                ca2 = ca2 + num.charAt(j);
            }
            //trascrivo il primo bit pari a 1
            ca2 = ca2 + '1';
            //inverto i bit restanti della stringa
            for(int k = j + 1; k < num.length(); k++){
                if(num.charAt(k) == '0'){
                    ca2 = ca2 + '1';
                }else{
                    ca2 = ca2 + '0';
                }
            }
            //
            for(int b = ca2.length() - 1; b >=  0; b--){
                for(int t = b; t >= 0; t--){
                    if(ca2.charAt(t) == 0){
                        bit = 0;
                    }else{
                        bit = 1;
                    }
                    potenza = potenza * bit * 2;
                }
                output = output + potenza;
            }
            //output
            JOptionPane.showMessageDialog(null,output);
        }
    }
}