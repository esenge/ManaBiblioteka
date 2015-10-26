
import java.math.BigInteger;

//Agnese Skujiņa, as11204

// ================ Klasi Skaitlis modificet aizliegts!
public class Skaitlis {

    public static void main(String[] args)
    {
       LIELS_SKAITLIS lielsSkaitlis1 = new LIELS_SKAITLIS(args[0]);
       LIELS_SKAITLIS lielsSkaitlis2 = new LIELS_SKAITLIS(args[1]);

       lielsSkaitlis1.add(lielsSkaitlis2);
       lielsSkaitlis1.display();
       lielsSkaitlis1.reverse();
       lielsSkaitlis1.display();

//       lielsSkaitlis2.sub(lielsSkaitlis1);
//       lielsSkaitlis2.display();
//       lielsSkaitlis2.reverse();
//       lielsSkaitlis2.display();
    }
}
// ================ Klasi Skaitlis modificet aizliegts!


//Japapildina klase LIELS_SKAITLIS ar nepieciesamo funcionalitati
class LIELS_SKAITLIS {
    private String skaitlis;
    //Varat pievienot savus laukus, ja tas ir nepieciesams
   
	
    LIELS_SKAITLIS(String str) { skaitlis = str; }

    public void add(LIELS_SKAITLIS sk) {
        System.out.print("Skaitļu saskaitīšana: ");
        BigInteger pirmais = new BigInteger(skaitlis);
        BigInteger otrais = new BigInteger(sk.getSkaitlis());
        BigInteger summa = pirmais.add(otrais);
        String original = summa.toString();
        if(String.valueOf(summa).length() >= 21) {
            if(original.charAt(0) == ('-')) {
                System.out.println("SKAITLIS PAR MAZU");
            } else {
                System.out.println("SKAITLIS PAR LIELU");
            }
            
        } else {
            this.skaitlis = String.valueOf(summa);
        }
        
    }
    public void sub(LIELS_SKAITLIS sk) {
        System.out.print("Skaitļu atņemšana: ");
        BigInteger pirmais = new BigInteger(skaitlis);
        BigInteger otrais = new BigInteger(sk.getSkaitlis());
        BigInteger starpiba = pirmais.subtract(otrais);
        if(String.valueOf(starpiba).length() < 21){
            this.skaitlis = String.valueOf(starpiba);
        } else {
            System.out.println("SKAITLIS PAR MAZU");
        }
    }
    public void reverse() {    
      String original, reverse = "";
      original = skaitlis.toString();
      int length = original.length();
      
      if(length >= 21) {
            if(original.charAt(0) == ('-')) {
                System.out.println("SKAITLIS PAR MAZU");
            } else {
                System.out.println("SKAITLIS PAR LIELU");
            }
            
        } else {
            boolean isZero = true;
      for ( int i = length - 1 ; i >= 0 ; i-- ) {
          if(original.charAt(i) != ('0')) {
              isZero = false;
          }       
          if(isZero == false) {
              reverse = reverse + original.charAt(i);
          }
      }
      System.out.print("Apgriezts skaitlis: ");
      this.skaitlis = reverse;
        }
      
      
      
      
    }

    public String getSkaitlis() {
        return skaitlis;
    }

    //Varat pievienot savas metodes, ja tas ir nepieciesams


    // ================= Metodi display() modificet aizliegts!
    public void display() {System.out.println(skaitlis);}
}

