/**
 * La classe Test (main)
    -Creare 3 oggetti Punto
    -visualizzare le coordinate del punto1
    -dire se ci sono due punti coincidenti
    -...
 * 
 * @author Thomas Burla 
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Test{
    public static void main(String args[]){
        //coefficienti per calcolare l'equazione della circonferenza
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        double coefficienti[][] = new double[3][3];
        double risultati[][] = new double[3][1];
        double terminiNoti[][] = new double[3][1];
        double detA = 0.0;
        double detB = 0.0;
        double detC = 0.0;
        double determinante = 0.0;
        String circonferenza = "";
        //creo oggetti di classe Punto
        //Punto p = new Punto(Double.parseDouble(JOptionPane.showInputDialog("Inserire ascissa del punto P")), Double.parseDouble(JOptionPane.showInputDialog("Inserire ordinata del punto P")));
        //Punto s = new Punto();
        //Punto t = new Punto(Double.parseDouble(JOptionPane.showInputDialog("Inserire ascissa del punto T")), Double.parseDouble(JOptionPane.showInputDialog("Inserire ordinata del punto T")));
        Punto p = new Punto(-1.0, 0.0);
        Punto s = new Punto(2.0 , 0.0);
        Punto t = new Punto(1.0, 1.0);
        //imposto coordinate s
        //s.setAscissa(Double.parseDouble(JOptionPane.showInputDialog("Inserire ascissa del punto S")));
        //s.setOrdinata(Double.parseDouble(JOptionPane.showInputDialog("Inserire ordinata del punto S")));
        //visualizzo coordinate p
        //JOptionPane.showMessageDialog(null, p);
        System.out.println(p);
        System.out.println(s);
        System.out.println(t);
        //controllo se vi sono due punti coincidenti
        if((p.getAscissa() == s.getAscissa()) && (p.getOrdinata() == s.getOrdinata())){
            JOptionPane.showMessageDialog(null, "Il punto P e il punto S sono coincidenti");
        }else if((p.getAscissa() == t.getAscissa()) && (p.getOrdinata() == t.getOrdinata())){
            JOptionPane.showMessageDialog(null, "Il punto T e il punto S sono coincidenti");
        }else if((s.getAscissa() == t.getAscissa()) && (s.getOrdinata() == t.getOrdinata())){
            JOptionPane.showMessageDialog(null, "Il punto T e il punto S sono coincidenti");
        }
        //definisco matrice dei coefficienti (risolvo sistema con metodo della matrice inversa)
        coefficienti[0][0] = p.getAscissa();
        coefficienti[0][1] = p.getOrdinata();
        coefficienti[1][0] = s.getAscissa();
        coefficienti[1][1] = s.getOrdinata();
        coefficienti[2][0] = t.getAscissa();
        coefficienti[2][1] = t.getOrdinata();
        for(int r = 0; r < 3; r++){
            coefficienti[r][2] = 1.0;
        }
        //definisco matrice dei termini noti
        terminiNoti[0][0] = -((p.getAscissa() * p.getAscissa()) + (p.getOrdinata() * p.getOrdinata()));
        terminiNoti[1][0] = -((s.getAscissa() * s.getAscissa()) + (s.getOrdinata() * s.getOrdinata()));
        terminiNoti[2][0] = -((t.getAscissa() * t.getAscissa()) + (t.getOrdinata() * t.getOrdinata()));
        //calcolo determinante
        determinante = (coefficienti[0][0] * ((coefficienti[1][1] * coefficienti[2][2]) - (coefficienti[2][1] * coefficienti[1][2]))) - (coefficienti[0][1] * ((coefficienti[1][0] * coefficienti[2][2]) - (coefficienti[2][0] * coefficienti[1][2]))) + (coefficienti[0][2] * ((coefficienti[1][0] * coefficienti[2][1]) - (coefficienti[2][0] * coefficienti[1][1])));
        System.out.println(determinante);
        //calcolo detA
        detA = (terminiNoti[0][0] * ((coefficienti[1][1] * coefficienti[2][2]) - (coefficienti[2][1] * coefficienti[1][2]))) - (coefficienti[0][1] * ((terminiNoti[1][0] * coefficienti[2][2]) - (terminiNoti[2][0] * coefficienti[1][2]))) + (coefficienti[0][2] * ((terminiNoti[1][0] * coefficienti[2][1]) - (terminiNoti[2][0] * coefficienti[1][1])));
        a = detA / determinante;
        System.out.println(a);
        //scrivo equazione della circonferenza
        circonferenza = "x^2 + y^2 + " + a + "x + " + b + "y + " + c + " = 0";
        JOptionPane.showMessageDialog(null, "I tre punti appartengono alla circonferenza di equazione: " + circonferenza);
    }
}