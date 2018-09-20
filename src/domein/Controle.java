package domein;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controle {

    private static final Pattern patroonGeenCijfers = Pattern.compile("[0-9]");
    private static final Pattern patroonGeenLetters = Pattern.compile("[a-zA-Z]");
    private static final Pattern patroonEmail = Pattern.compile("\\\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,4}\\\\b");
    //private static final Pattern patroonEmail = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\\\.[A-Z]{2,6}$");

    protected static void controleerCombinatieBeginEnEindatum(Date beginDatum, Date eindDatum) {
        //Moet kijken of begindatum niet groter is dan eindDatum -> gooit exception dan 

    }
    //returnt true als alleen letters of cijfers zijn
    private static final Pattern patroonMetSpecialeChars = Pattern.compile("[a-zA-Z0-9]");

    private static boolean bevatTekstLetters(String tekst) {
        //controleert of een gsm geen letters bevat
        return patroonGeenLetters.matcher(tekst).matches();
    }

    private static boolean bevatTekstCijfers(String tekst) {
        //controleert of de naam cijfers bevat en geeft true terug als dat zo is
        return patroonGeenCijfers.matcher(tekst).matches();
    }

    private static boolean controleertJuisteEmailRegex(String email) {
        //controleert of de email correct is
        return patroonEmail.matcher(email).matches();
    }

    private static boolean controleerPatroonMetSpecialeTekens(String tekst) {
        //controleer of gsm speciale tekens bevat
        return patroonMetSpecialeChars.matcher(tekst).matches();
    }

    protected static void controleerNaam(String naam) {

        if (naam == null) {
            throw new IllegalArgumentException("naam mag niet null zijn ");
        }
        if (naam.length() == 0) {
            throw new IllegalArgumentException("naam mag niet leeg zijn");
        }
        if (naam.length() > 45) {
            throw new IllegalArgumentException("naam mag niet langer zijn dan 45");
        }
        if (bevatTekstCijfers(naam)) {
            throw new IllegalArgumentException("naam mag geen cijfers bevatten");
        }
    }

    protected static void controleerGSM(String gsm) {
        String hulpgsm = gsm;

        if (gsm == null) {
            throw new IllegalArgumentException("gsm mag niet null zijn");
        }
        if (gsm.length() == 0) {
            throw new IllegalArgumentException("gsm mag niet leeg zijn");
        }
        if (gsm.length() > 13) {
            throw new IllegalArgumentException("de gsm mag niet langer zijn dan 13 cijfers");
        }
        if (gsm.length() < 9) {
            throw new IllegalArgumentException("de gsm mag niet korter zijn dan 9 cijfers");
        }
        if (bevatTekstLetters(gsm)) {
            throw new IllegalArgumentException("gsm mag geen letters bevatten");
        }

        if (bevatTekstLetters(gsm)) {
            throw new IllegalArgumentException("gsm mag geen speciale tekens bevatten");
        }
        String eersteVierCijfersGsm = gsm.substring(0, 4);
        System.out.println(eersteVierCijfersGsm);

        if (!eersteVierCijfersGsm.equals("0032")) {
            throw new IllegalArgumentException("gsm nummer moet beginnen met 0032");
        }
    }

    protected static void controleerEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("email mag niet null zijn");
        }

        if (email.contains(" ")) {
            throw new IllegalArgumentException("email mag geen spaties bevatten");
        }

        if (email.length() == 0) {
            throw new IllegalArgumentException("email mag niet leeg zijn");
        }
        if (email.length() > 45) {
            throw new IllegalArgumentException("email mag niet langer zijn dan 45 characters");
        }
        if (controleertJuisteEmailRegex(email)) {
            throw new IllegalArgumentException("email moet aan de juiste vormgeving voldoen");
        }
    }

    protected static void controleerStraatNaam(String straatNaam) {
        if (straatNaam == null) {
            throw new IllegalArgumentException("straatnaam mag niet null zijn");
        }
        if (straatNaam.length() == 0) {
            throw new IllegalArgumentException("straatnaam mag niet leeg zijn");
        }
        if (straatNaam.length() > 45) {
            throw new IllegalArgumentException("straatnaam mag niet langer zijn dan 45 characters");
        }
        if (bevatTekstCijfers(straatNaam)) {
            throw new IllegalArgumentException("straatnaam mag geen cijfers bevatten");
        }
        if (controleerPatroonMetSpecialeTekens(straatNaam)) {
            throw new IllegalArgumentException("straatnaam mag geen speciale tekens bevatten");
        }
    }

    protected static void controleerHuisnummer(String huisnummer) {
        if (huisnummer == null) {
            throw new IllegalArgumentException("huisnummer mag niet null zijn");
        }
        if (huisnummer.length() == 0) {
            throw new IllegalArgumentException("huisnummer mag niet leeg zijn");
        }
        if (huisnummer.length() > 10) {
            throw new IllegalArgumentException("huisnummer mag niet langer zijn dan 10 cijfers   ");
        }
        if (controleerPatroonMetSpecialeTekens(huisnummer) || huisnummer.matches("[^a-z A-Z0-9]")) {
            throw new IllegalArgumentException("huisnummer mag geen speciale tekens bevatten");
        }
    }

    protected static void controleerGemeente(String gemeente) {
        if (gemeente == null) {
            throw new IllegalArgumentException("gemeente mag niet null zijn");
        }
        if (gemeente.length() == 0) {
            throw new IllegalArgumentException("gemeente mag niet leeg zijn");
        }
        if (gemeente.length() > 45) {
            throw new IllegalArgumentException("gemeente mag niet langer zijn dan 45 karakters");
        }
        if (gemeente.length() < 2) {
            throw new IllegalArgumentException("gemeente mag niet minder dan 2 karakters zijn");
        }
        if (bevatTekstCijfers(gemeente)) {
            throw new IllegalArgumentException("gemeente mag geen cijfers bevatten");
        }
        if (controleerPatroonMetSpecialeTekens(gemeente)) {
            throw new IllegalArgumentException("gemeente mag geen speciale tekens bevatten");
        }
    }

    protected static void controleerPostcode(String postcode) {
        if (postcode == null) {
            throw new IllegalArgumentException("postcode mag niet null zijn");
        }
        if (postcode.length() == 0) {
            throw new IllegalArgumentException("postcode mag niet leeg zijn");
        }
        if (bevatTekstLetters(postcode)) {
            throw new IllegalArgumentException("postcode mag geen letters bevatten");
        }
        if (postcode.length() != 4) {
            throw new IllegalArgumentException("postcode moet 4 cijfers bevatten");
        }
    }

    protected static void controleerId(int id) {

    }

    protected static void controleerBeginDatum(Date beginDatum) {

    }

    protected static void controleerEinDatum(Date eindDatum) {

    }

    protected static void controleerNaamKoelwagen(String naamKoelwagen) {

    }

}
