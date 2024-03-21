/**
 * Implementare l'algoritmo per il calcolo del codice fiscale.
   https://it.wikipedia.org/wiki/Codice_fiscale
* 
* @author Thomas Burla 
* @version 2.0
*/
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class CodiceFiscaleScan{
    public static void main(String args[]){
        //dichiarazione variabili
        String nome, cognome, luogo_n, provincia_n, sesso, nome_max, cognome_max, nome_fisc, cognome_fisc, anno_fisc, anno_str, mese, giorno_str, data_n, comune_n, controllo_pari[], controllo_dispari[], controllo_str, codice_fisc, verificacomune[], lunghezzaComune[], comuneCompleto;
        int counter_nome = 0, counter_cognome = 0, p, d, controllo[], resto_div, somma;
        boolean esisteComune = false;
        //variabili per il controllo della data
        int gg, mm, aaaa;
        boolean data = false;
        //inizializzazione variabili
        nome_fisc = "";
        cognome_fisc = "";
        mese = "";
        p = 0;
        d = 0;
        somma = 0;
        resto_div = 0;
        controllo_str = "";
        comuneCompleto = "";
        try{
          File f = new File("D:/scuola/INI/Laboratorio/Lab_INFO/Marzo/Lab_08_03_Burla/codice_catastale.txt");
          FileReader fr = new FileReader(f);
          Scanner leggoFile = new Scanner(fr);
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
          //trasformo il contenuto della stringa dedicata al luogo di nascita in un'altra equivalente di sole minuscole
          comune_n = luogo_n.toLowerCase();
          //determino, dividendo i token in un array di stringhe, quante parole ha il comune
          lunghezzaComune = comune_n.split(" ");
          //leggo il file dei codici catastali finchè non finiscono le righe o finchè non trovo un comune corrispondente
          while((leggoFile.hasNextLine()) && (esisteComune == false)){
            //divido in un array di stringhe le informazioni della prossima riga
            verificacomune = (leggoFile.nextLine()).split(" ");
            //uso la variabile comuneCompleto per gestire anche i comuni che hanno più di una parola nel nome
            comuneCompleto = "";
            for(int i = 0; i < lunghezzaComune.length; i++){
              if(lunghezzaComune.length == (verificacomune.length - 3)){
                if(i == 0){
                  comuneCompleto = comuneCompleto + verificacomune[i + 1];
                }else{
                  comuneCompleto = comuneCompleto + " " + verificacomune[i + 1];
                }
              }
            }
            //verifico se esiste un comune con il nome indicato dall'utente: in caso affermativo, assegno il corrispondente codice catastale
            if(comuneCompleto.equals(comune_n)){
              comune_n = verificacomune[0].toUpperCase();
              esisteComune = true;
            }
          }
          //calcolo il codice fiscale parziale, che servirà per determinare l'ultima lettera del codice fiscale definitivo
          codice_fisc = cognome_fisc + nome_fisc + data_n + comune_n;
          //calcolo la lettera che costituisce il carattere di controllo
          controllo = new int[codice_fisc.length()];
          controllo_pari = new String[7];
          controllo_dispari = new String[8];
          //assegno ad ogni carattere un "numero di posizione"
          for(int i = 1; i <= codice_fisc.length(); i++){
            //divido i caratteri in due vettori in base al valore del numero di posizione
            if((i % 2) == 0){
              controllo_pari[p] = codice_fisc.charAt(i - 1) + ""; 
              //in base al carattere in posizione pari, assegno un numero
              switch(controllo_pari[p]){
                case "0": 
                case "A": controllo[i - 1] = 0;
                          break;
                case "1": 
                case "B": controllo[i - 1] = 1;
                          break;
                case "2": 
                case "C": controllo[i - 1] = 2;
                          break;
                case "3":
                case "D": controllo[i - 1] = 3;
                          break;
                case "4": 
                case "E": controllo[i - 1] = 4;
                          break;
                case "5":
                case "F": controllo[i - 1] = 5;
                          break;
                case "6":
                case "G": controllo[i - 1] = 6;
                          break;
                case "7":
                case "H": controllo[i - 1] = 7;
                          break;
                case "8":
                case "I": controllo[i - 1] = 8; 
                          break;
                case "9":
                case "J": controllo[i - 1] = 9;
                          break;
                case "K": controllo[i - 1] = 10;
                          break;
                case "L": controllo[i - 1] = 11;
                          break;
                case "M": controllo[i - 1] = 12;
                          break;
                case "N": controllo[i - 1] = 13;
                          break;
                case "O": controllo[i - 1] = 14;
                          break;
                case "P": controllo[i - 1] = 15;
                          break;
                case "Q": controllo[i - 1] = 16;
                          break;
                case "R": controllo[i - 1] = 17;
                        break;
                case "S": controllo[i - 1] = 18;
                          break;
                case "T": controllo[i - 1] = 19;
                          break;
                case "U": controllo[i - 1] = 20;
                          break;
                case "V": controllo[i - 1] = 21;
                        break;
                case "W": controllo[i - 1] = 22;
                          break;
                case "X": controllo[i - 1] = 23;
                          break;
                case "Y": controllo[i - 1] = 24;
                          break;
                case "Z": controllo[i - 1] = 25;
              }
              p++;
            }else{
              controllo_dispari[d] = codice_fisc.charAt(i - 1) + ""; //controllo[i];
              //in base al carattere in posizione dispari, assegno un numero
              switch(controllo_dispari[d]){
                case "0": 
                case "A": controllo[i - 1] = 1;
                          break;
                case "1": 
                case "B": controllo[i - 1] = 0;
                          break;
                case "2": 
                case "C": controllo[i - 1] = 5;
                          break;
                case "3":
                case "D": controllo[i - 1] = 7;
                          break;
                case "4": 
                case "E": controllo[i - 1] = 9;
                          break;
                case "5":
                case "F": controllo[i - 1] = 13;
                          break;
                case "6":
                case "G": controllo[i - 1] = 15;
                          break;
                case "7":
                case "H": controllo[i - 1] = 17;
                          break;
                case "8":
                case "I": controllo[i - 1] = 19; 
                          break;
                case "9":
                case "J": controllo[i - 1] = 21;
                          break;
                case "K": controllo[i - 1] = 2;
                          break;
                case "L": controllo[i - 1] = 4;
                          break;
                case "M": controllo[i - 1] = 18;
                          break;
                case "N": controllo[i - 1] = 20;
                          break;
                case "O": controllo[i - 1] = 11;
                          break;
                case "P": controllo[i - 1] = 3;
                          break;
                case "Q": controllo[i - 1] = 6;
                          break;
                case "R": controllo[i - 1] = 8;
                        break;
                case "S": controllo[i - 1] = 12;
                          break;
                case "T": controllo[i - 1] = 14;
                          break;
                case "U": controllo[i - 1] = 16;
                          break;
                case "V": controllo[i - 1] = 10;
                        break;
                case "W": controllo[i - 1] = 22;
                          break;
                case "X": controllo[i - 1] = 25;
                          break;
                case "Y": controllo[i - 1] = 24;
                          break;
                case "Z": controllo[i - 1] = 23;
              }
              d++;
            }
            somma+= controllo[i - 1];
          }
          //calcolo resto della divisione
          resto_div = somma % 26;
          //associo carattere al resto della divisione
          switch(resto_div){
            case 0: controllo_str = "A";
                    break;
            case 1: controllo_str = "B";
                    break;
            case 2: controllo_str = "C";
                    break;
            case 3: controllo_str = "D";
                    break;
            case 4: controllo_str = "E";
                    break;
            case 5: controllo_str = "F";
                    break;
            case 6: controllo_str = "G";
                    break;
            case 7: controllo_str = "H";
                    break;
            case 8: controllo_str = "I";
                    break;
            case 9: controllo_str = "J";
                    break;
            case 10: controllo_str = "K";
                    break;
            case 11: controllo_str = "L";
                    break;
            case 12: controllo_str = "M";
                    break;
            case 13: controllo_str = "N";
                    break;
            case 14: controllo_str = "O";
                    break;
            case 15: controllo_str = "P";
                    break;
            case 16: controllo_str = "Q";
                    break;
            case 17: controllo_str = "R";
                    break;
            case 18: controllo_str = "S";
                    break;
            case 19: controllo_str = "T";
                    break;
            case 20: controllo_str = "U";
                    break;
            case 21: controllo_str = "V";
                    break;
            case 22: controllo_str = "W";
                    break;
            case 23: controllo_str = "X";
                    break;
            case 24: controllo_str = "Y";
                    break;
            case 25: controllo_str = "Z";
            //chiudo flusso di lettura da file
            leggoFile.close();
          }
          //output
          JOptionPane.showMessageDialog(null, cognome_fisc + nome_fisc + data_n + comune_n + controllo_str);
      }catch(FileNotFoundException e){
        JOptionPane.showMessageDialog(null, "ERRORE FATALE! File dei codici catastali non trovato" , "Errore fatale", JOptionPane.ERROR_MESSAGE);
      }
  }
}