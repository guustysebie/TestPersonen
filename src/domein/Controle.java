package domein;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Controle {

  
    
  
    private static final Pattern patroonGeenCijfers = Pattern.compile("[0-9]");
    private static final Pattern patroonGeenLetters = Pattern.compile("[a-zA-Z]");


     private static boolean bevatTekstLetters(String gsm) {
         //controleert of een gsm geen letters bevat
         return patroonGeenLetters.matcher(gsm).matches();
     }
    private static boolean bevatTekstCijfers(String tekst) {
        //controleert of de naam cijfers bevat en geeft true terug als dat zo is
        return patroonGeenCijfers.matcher(tekst).matches();
    }
    
    protected static void controleerNaam(String naam) {
       
        if (naam == null){
            throw  new IllegalArgumentException("naam mag niet null zijn ");
        }
        if (naam.length() == 0){
            throw  new IllegalArgumentException("naam mag niet leeg zijn");
        }
        if (naam.length() > 45){
            throw  new IllegalArgumentException("naam mag niet langer zijn dan 45");
        }
        if(bevatTekstCijfers(naam)){
       throw  new IllegalArgumentException("de naam mag geen cijfers bevatten");
        }
    }

    protected static void controleerGSM(String gsm){
        String hulpgsm = gsm;
        
         if(gsm == null)
       {
           throw new IllegalArgumentException("gsm mag niet null zijn");
       }
       if(gsm.length()==0)
       {
           throw new IllegalArgumentException("gsm mag niet leeg zijn");
       }
       if(gsm.length()>13)
       {
           throw new IllegalArgumentException
       }
      if(bevatTekstLetters(gsm))
      {
          throw new IllegalArgumentException("gsm mag geen letters bevatten");
      }
      
      String eersteVierCijfersGsm = gsm.substring(0, 3);
      
      if(!eersteVierCijfersGsm.equals("0032"))
      {
          throw new IllegalArgumentException("gsm nummer moet beginnen met 0032");
      }
      gsm=hulpgsm;
    }

    protected static  void controleerEmail(String email){

    }

    protected static void controleerStraatNaam(String straatNaam){

    }

    protected static  void controleerHuisnummer(String huisnummer){

    }

    protected static void controleerGemeente(String gemeente){

    }
    protected static  void controleerPostcode(String postcode){

    }

    protected static void controleerId(int id){

    }

    protected static void controleerBeginDatum(Date beginDatum){

    }

    protected static void controleerEinDatum(Date eindDatum){

    }

    protected static void controleerNaamKoelwagen(String naamKoelwagen){

    }


}
