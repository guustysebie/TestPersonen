package domein;

import java.util.Date;


public class Controle {


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

        if (naam.contains("1")){
            // moet alle cijfers zijn
            if (naam.length() == 0){
                throw  new IllegalArgumentException("naam mag geen cijfers bevatten");
            }
        }



    }

    protected static void controleerGSM(String gsm){

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
