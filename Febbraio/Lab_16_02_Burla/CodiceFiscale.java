/**
 * Implementare l'algoritmo per il calcolo del codice fiscale.
   https://it.wikipedia.org/wiki/Codice_fiscale
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class CodiceFiscale{
    public static void main(String args[]){
        //dichiarazione variabili
        String nome, cognome, luogo_n, provincia_n, sesso, nome_max, cognome_max, nome_fisc, cognome_fisc, anno_fisc, anno_str, mese, giorno_str, data_n;
        //variabili per il controllo della data
        int gg, mm, aaaa, counter_nome = 0, counter_cognome = 0;;
        boolean data = false;
        //inizializzazione variabili
        nome_fisc = "";
        cognome_fisc = "";
        mese = "";
        //leggo e controllo il nome
        do{
            nome = JOptionPane.showInputDialog("Inserire il nome");
            if((nome.equals("")) || ((nome.charAt(0)) == ' ')){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota!");
            }
        }while((nome.equals("")) || ((nome.charAt(0)) == ' '));
        //leggo e controllo il cognome
        do{
            cognome = JOptionPane.showInputDialog("Inserire il cognome");
            if((cognome.equals("")) || ((cognome.charAt(0)) == ' ')){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota!");
            }
        }while((cognome.equals("")) || ((cognome.charAt(0)) == ' '));
        //leggo e controllo il luogo di nascita
        do{
            luogo_n = JOptionPane.showInputDialog("Inserire il luogo di nascita");
            if((luogo_n.equals("")) || ((luogo_n.charAt(0)) == ' ')){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota!");
            }
        }while((luogo_n.equals("")) || ((luogo_n.charAt(0)) == ' '));
        //leggo e controllo la provincia di nascita
        do{
            provincia_n = JOptionPane.showInputDialog("Inserire la provincia di nascita");
            if((provincia_n.equals("")) || ((provincia_n.charAt(0)) == ' ')){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota!");
            }
        }while((provincia_n.equals("")) || ((provincia_n.charAt(0)) == ' '));
        //leggo e controllo il sesso
        do{
            sesso = JOptionPane.showInputDialog("Inserire il sesso. Scrivere maschio o femmina, senza spazi.");
            if((nome.equals("")) || ((nome.charAt(0)) == ' ')){
                JOptionPane.showMessageDialog(null, "ERRORE! Stringa vuota!");
            }else if((!(sesso.equals("maschio"))) && (!(sesso.equals("femmina")))){
                JOptionPane.showMessageDialog(null, "ERRORE di input!");
            }
        }while(((nome.equals("")) || ((nome.charAt(0)) == ' ')) || ((!(sesso.equals("maschio"))) && (!(sesso.equals("femmina")))));
        //leggo e controllo data + converto il mese in lettera secondo lo standard
        do{
            do{
              gg = Integer.parseInt(JOptionPane.showInputDialog("Inserire il giorno di nascita"));
              mm = Integer.parseInt(JOptionPane.showInputDialog("Inserire il mese di nascita"));
              aaaa = Integer.parseInt(JOptionPane.showInputDialog("Inserire l'anno di nascita"));
              if((gg <= 0) || (mm <= 0) || (mm > 12) || (aaaa <=0 )){
                JOptionPane.showMessageDialog(null, "Errore! Una data non può avere termini negativi o nulli");
              }
            }while((gg <= 0) || (mm <= 0) || (mm > 12) || (aaaa <=0 ));
            switch(mm){
                  case 1:
                    mese = "A";
                    if(gg <= 31){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 2:
                    mese = "B";
                    if((aaaa % 4) == 0){
                      if(gg <= 29){
                        JOptionPane.showMessageDialog(null, "Data valida");
                        data = true;
                      }
                    }else if(gg <= 28){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 3:
                    mese = "C";
                    if(gg <= 31){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 4:
                    mese = "D";
                    if(gg <= 30){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 5:
                    mese = "E";
                    if(gg <= 31){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 6:
                    mese = "H";
                    if(gg <= 30){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 7:
                    mese = "L";
                    if(gg <= 31){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 8:
                    mese = "M";
                    if(gg <= 31){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 9:
                    mese = "P";
                    if(gg <= 30){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 10:
                    mese = "R";
                    if(gg <= 31){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 11:
                    mese = "S";
                    if(gg <= 30){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
                    break;
                  case 12:
                    mese = "T";
                    if(gg <= 31){
                      JOptionPane.showMessageDialog(null, "Data valida");
                      data = true;
                    }else{
                      JOptionPane.showMessageDialog(null, "Data NON valida");
                    }
            }
        }while(data == false);
        //ricavo le prime 3 lettere del codice fiscale, che derivano solitamente dalle prime 3 consonanti del cognome e gestisco i casi particolari
        //converto il cognome in una stringa di sole maiuscole
        cognome_max = cognome.toUpperCase();
        //caso generale
        for(int i = 0; (i < cognome_max.length()) && (cognome_fisc.length() <= 3); i++){
            switch(cognome_max.charAt(i)){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': break;
                default : cognome_fisc = cognome_fisc.concat((cognome_max.charAt(i) + ""));
                counter_cognome++;
            }
        }
        //caso in cui il cognome abbia più di 3 caratteri ma meno di 3 consonanti
        if(cognome_max.length() >= 3){
          for(int i = counter_cognome; i < 3; i++){
            switch(cognome_max.charAt(i)){
              case 'A':
              case 'E':
              case 'I':
              case 'O':
              case 'U': cognome_fisc = cognome_fisc.concat((cognome_max.charAt(i) + ""));
                        break;
            }
          }
          //caso in cui il cognome ha meno di 3 caratteri
        }else{
          while(cognome_fisc.length() < 3){
            cognome_fisc.concat("X");
          }
        }
        //ricavo le successive 3 lettere del codice fiscale, che derivano solitamente dalle prime 4 consonanti del nome, 3 se sono insufficienti
        //converto il nome in una stringa di sole maiuscole
        nome_max = nome.toUpperCase();
        for(int i = 0; (i < nome_max.length()) && (nome_fisc.length() <= 3); i++){
            switch(nome_max.charAt(i)){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': break;
                default : if(counter_nome != 1){
                            nome_fisc = nome_fisc.concat((nome_max.charAt(i) + ""));
                          }
                          counter_nome++;
            }
        }
        //caso in cui il nome abbia più di 3 caratteri ma meno di 4 consonanti
        if(nome_max.length() >= 3){
          if(counter_nome == 3){
            nome_fisc = "";
            counter_nome = 0;
            for(int i = 0; (i < nome_max.length()) && (nome_fisc.length() <= 3); i++){
              switch(nome_max.charAt(i)){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': break;
                default : nome_fisc = nome_fisc.concat((nome_max.charAt(i) + ""));
                counter_nome++;
              }
            }
            //caso in cui il nome abbia più di 3 caratteri ma meno di 3 consonanti
          }else{
            for(int i = counter_nome - 1; i < 3; i++){
              switch(nome_max.charAt(i)){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': nome_fisc = nome_fisc.concat((nome_max.charAt(i) + ""));
                          break;
              }
            }
          }
          //caso in cui il nome ha meno di 3 caratteri
        }else{
          while(nome_fisc.length() < 3){
            nome_fisc.concat("X");
          }
        }
        //ricavo in una stringa le ultime 2 cifre dell'anno che compongono il codice fiscale
          //converto l'anno in stringa, aggiungendo uno 0 per i numeri compresi tra 0 e 9 che mi porterebbero ad avere solo una cifra
          anno_str = Integer.toString(aaaa);
        anno_fisc = ((anno_str.charAt(2)) + "").concat(anno_str.charAt(3) + "");
        //compongo giorno di nascita e lo trasformo in stringa
        if(sesso.equals("maschio")){
          if((gg >= 1) && (gg <= 9)){
            giorno_str = "0".concat(Integer.toString(gg));
          }else{
          giorno_str = Integer.toString(gg);
          }
        }else{
          giorno_str = Integer.toString(gg + 40);
        }
        
        //compongo data di nascita
        data_n = anno_fisc + mese + giorno_str;


        JOptionPane.showMessageDialog(null, cognome_fisc + nome_fisc + data_n);
    }
}