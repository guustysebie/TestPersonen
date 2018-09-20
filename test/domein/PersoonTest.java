package domein;


import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class PersoonTest {

    /*---------------VOORNAAM-------*/
    @Test(expected = IllegalArgumentException.class)
    public void setVoorNaamMetLengteNaam_0_gooitException() {
        Persoon persoon = new Persoon();
        String naam = "";
        
        persoon.setVoorNaam(naam);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setVoorNaamMetLengteNaam_null_gooitException() {
        Persoon persoon = new Persoon();
        String naam = null;
        persoon.setVoorNaam(naam);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setVoorNaamMetLengteNaam_46_gooitException() {
        Persoon persoon = new Persoon();
        String naam = "LLUwejNrazvVrbRPyupNbsgyfUPPCZVZPoYRKrGCaNasHf";
        persoon.setVoorNaam(naam);
    }

    @Test
    public void setVoorNaamMetLengteNaam_45_naamIsOke() {
        Persoon persoon = new Persoon();
        String naam = "LLUwejNrazvVrbRPyupNbsgyfUPPCZVZPoYRKrGCaNasH";
        persoon.setVoorNaam(naam);
        assertEquals(persoon.getVoorNaam(), naam);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setVoorNaamMet_RareTekens_gooitException() {
        Persoon persoon = new Persoon();
        String naam = "nAvosHhvEHU##|2UC7JW";
        persoon.setVoorNaam(naam);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setVoorNaamMet_Cijfers_gooitException() {
        Persoon persoon = new Persoon();
        String naam = "guust38";
        persoon.setVoorNaam(naam);
    }


    @Test
    public void setVoorNaam_Normaal_AllesGoed() {
        Persoon persoon = new Persoon();
        String naam = "guust";
        persoon.setVoorNaam(naam);
        assertEquals(persoon.getVoorNaam(), naam);
    }

    @Test
    public void setVoorNaam_met_aphostroff_Normaal_AllesGoed() {
        Persoon persoon = new Persoon();
        String naam = "guust's";
        persoon.setVoorNaam(naam);
        assertEquals(persoon.getVoorNaam(), naam);
    }

    @Test
    public void setVoorNaam_met_koppel_teken_Normaal_AllesGoed() {
        Persoon persoon = new Persoon();
        String naam = "lous-phillipe";
        persoon.setVoorNaam(naam);
        assertEquals(persoon.getVoorNaam(), naam);
    }

    @Test
    public void setVoorNaam_met_dingetjes_Op_letter_Normaal_AllesGoed() {

        Persoon persoon = new Persoon();
        String naam = "laïséèàùü";
        persoon.setVoorNaam(naam);
        assertEquals(persoon.getVoorNaam(), naam);
    }






    /*-----------------ACHTERNAAM-----------------*/

    /*---------------AchterNaam-------*/
    @Test(expected = IllegalArgumentException.class)
    public void setAchterNaamMetLengteNaam_0_gooitException() {
        Persoon persoon = new Persoon();
        String naam = "";
        persoon.setAchterNaam(naam);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setAchterNaamMetLengteNaam_null_gooitException() {
        Persoon persoon = new Persoon();
        String naam = null;
        persoon.setAchterNaam(naam);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setAchterNaamMetLengteNaam_46_gooitException() {
        Persoon persoon = new Persoon();
        String naam = "LLUwejNrazvVrbRPyupNbsgyfUPPCZVZPoYRKrGCaNasHf";
        persoon.setAchterNaam(naam);
    }

    @Test
    public void setAchterNaamMetLengteNaam_45_naamIsOke() {
        Persoon persoon = new Persoon();
        String naam = "LLUwejNrazvVrbRPyupNbsgyfUPPCZVZPoYRKrGCaNasH";
        persoon.setAchterNaam(naam);
        assertEquals(persoon.getAchterNaam(), naam);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setAchterNaamMet_RareTekens_gooitException() {
        Persoon persoon = new Persoon();
        String naam = "nAvosHhvEHU##|2UC7JW";
        persoon.setAchterNaam(naam);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setAchterNaamMet_Cijfers_gooitException() {
        Persoon persoon = new Persoon();
        String naam = "guust38";
        persoon.setAchterNaam(naam);
    }


    @Test
    public void setAchterNaam_Normaal_AllesGoed() {
        Persoon persoon = new Persoon();
        String naam = "guust";
        persoon.setAchterNaam(naam);
        assertEquals(persoon.getAchterNaam(), naam);
    }

    @Test
    public void setAchterNaam_met_aphostroff_Normaal_AllesGoed() {
        Persoon persoon = new Persoon();
        String naam = "guust's";
        persoon.setAchterNaam(naam);
        assertEquals(persoon.getAchterNaam(), naam);
    }

    @Test
    public void setAchterNaam_met_koppel_teken_Normaal_AllesGoed() {
        Persoon persoon = new Persoon();
        String naam = "lous-phillipe";
        persoon.setAchterNaam(naam);
        assertEquals(persoon.getAchterNaam(), naam);
    }

    @Test
    public void setAchterNaam_met_dingetjes_Op_letter_Normaal_AllesGoed() {

        Persoon persoon = new Persoon();
        String naam = "laïséèàùü";
        persoon.setAchterNaam(naam);
        assertEquals(persoon.getAchterNaam(), naam);
    }


    //_____________GSM NUMMER___________________
    @Test(expected = IllegalArgumentException.class)
    public void setGsmNummer_nummer_is_null_gooitException() {
        Persoon persoon = new Persoon();
        String gsm = null;
        persoon.setGsmNummer(gsm);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setGsmNummer_nummer_is_leeg_gooitException() {
        Persoon persoon = new Persoon();
        String gsm = "";
        persoon.setGsmNummer(gsm);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setGsmNummer_bevat_letters_gooitException() {
        Persoon persoon = new Persoon();
        String gsm = "0986548B";
        persoon.setGsmNummer(gsm);
        // 0492 9834 21
        // 0936 2434 9
    }

    @Test(expected = IllegalArgumentException.class)
    public void setGsmNummer_bevat_rare_tekens_gooitException() {
        Persoon persoon = new Persoon();
        String gsm = "0986|@|";
        persoon.setGsmNummer(gsm);
    }


    @Test(expected = IllegalArgumentException.class)
    public void setGsmNummer_is_langer_dan_13_gooitException() {
        Persoon persoon = new Persoon();
        String gsm = "0032 4929 8342 12";
        persoon.setGsmNummer(gsm);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setGsmNummer_is_korter_dan_9_gooitException() {
        Persoon persoon = new Persoon();
        String gsm = "00000000";
        persoon.setGsmNummer(gsm);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setGsmNummer_start_niet_met0032_gooitException() {
        Persoon persoon = new Persoon();
        String gsm = "0492983421";
        persoon.setGsmNummer(gsm);
    }

    @Test
    public void setGsmNummer_is_goed() {
        Persoon persoon = new Persoon();
        String gsm = "0032492983421";
        persoon.setGsmNummer(gsm);
        assertEquals(persoon.getGsmNummer(), gsm);
    }

    //_____________EMAIL___________________

    @Test(expected = IllegalArgumentException.class)
    public void setEmail_is_null_gooitException() {
        Persoon persoon = new Persoon();
        String email = null;
        persoon.setEmail(email);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setEmail_is_leeg_gooitException() {
        Persoon persoon = new Persoon();
        String email = "";
        persoon.setEmail(email);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setEmail_is_langer_dan4chars_gooitException() {
        Persoon persoon = new Persoon();
        String email = "qsdsdfaijerfmkjaemlfkjazemlkfjazmlefkjqlskfjlmakzejffaze";
        persoon.setEmail(email);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setEmail_is_nietgoed1_gooitException() {
        Persoon persoon = new Persoon();
        String email = "foo";
        persoon.setEmail(email);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setEmail_is_nietgoed2_gooitException() {
        Persoon persoon = new Persoon();
        String email = "@baz.com";
        persoon.setEmail(email);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setEmail_is_nietgoed3_gooitException() {
        Persoon persoon = new Persoon();
        String email = "@baz";
        persoon.setEmail(email);
    }
    @Test(expected = IllegalArgumentException.class)
    public void setEmail_is_nietgoed4_gooitException() {
        Persoon persoon = new Persoon();
        String email = "@";
        persoon.setEmail(email);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setEmail_is_nietgoed5_gooitException() {
        Persoon persoon = new Persoon();
        String email = "@@";
        persoon.setEmail(email);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setEmail_is_nietgoed6_gooitException() {
        Persoon persoon = new Persoon();
        String email = ".@@";
        persoon.setEmail(email);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setEmail_is_nietgoed7_gooitException() {
        Persoon persoon = new Persoon();
        String email = "foo bar@baz.com";
        persoon.setEmail(email);
    }
    @Test
    public void setEmail_is_goed_assertequals_istrue() {
        Persoon persoon = new Persoon();
        List<String> lijstGoedEmailAdressen = LijstEmails.lijstGoedeEmails();

        for (String k : lijstGoedEmailAdressen) {
            persoon.setEmail(k);
            assertEquals(persoon.getEmail(), k);
        }
    }
    //_____________STRAATNAAM___________________

    @Test(expected = IllegalArgumentException.class)
    public void setStraatnaam_is_null_gooitException() {
        Persoon persoon = new Persoon();
        String straatnaam = null;
        persoon.setStraatNaam(straatnaam);
    }
    @Test(expected = IllegalArgumentException.class)
    public void setStraatnaam_is_leeg_gooitException() {
        Persoon persoon = new Persoon();
        String straatnaam = "";
        persoon.setStraatNaam(straatnaam);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setStraatnaam_is_meer_dan45chars_gooitException() {
        Persoon persoon = new Persoon();
        String straatnaam = "qsdfqsfaeraegdfgdgerfsdgdgdfgergdsfgsdgrsdfgsdfgrzegf";
        persoon.setStraatNaam(straatnaam);
    }


    @Test(expected = IllegalArgumentException.class)
    public void setStraatnaam_is_bevat_cijfers_gooitException() {
        Persoon persoon = new Persoon();
        String straatnaam = "gijz3enzele";
        persoon.setStraatNaam(straatnaam);
    }



    @Test(expected = IllegalArgumentException.class)
    public void setStraatnaam_is_bevat_symbolen_gooitException() {
        Persoon persoon = new Persoon();
        String straatnaam = "|@&@|''('rzegf";
        persoon.setStraatNaam(straatnaam);
    }

    @Test
    public void setStraatnaam_is_bevat_koppelteken_assertequals_true() {
        Persoon persoon = new Persoon();
        String straatnaam = "gijzenzele-gent";
        persoon.setStraatNaam(straatnaam);
        assertEquals(persoon.getStraatNaam(),straatnaam);
    }


    @Test
    public void setStraatnaam_is_bevat_afkappingsteken_assertequals_true() {
        Persoon persoon = new Persoon();
        String straatnaam = "gijzenzele'gent";
        persoon.setStraatNaam(straatnaam);
        assertEquals(persoon.getStraatNaam(),straatnaam);
    }

    @Test
    public void setStraatnaam_is_bevat_uitspraaktekens_assertequals_true() {
        Persoon persoon = new Persoon();
        String straatnaam = "éèàï";
        persoon.setStraatNaam(straatnaam);
        assertEquals(persoon.getStraatNaam(),straatnaam);
    }
    @Test
    public void setStraatnaam_is_goed_assertequals_true() {
        Persoon persoon = new Persoon();
        String straatnaam = "Sint-livensPoorstraat";
        persoon.setStraatNaam(straatnaam);
        assertEquals(persoon.getStraatNaam(),straatnaam);
    }


    //_____________Huisnummer___________________

    @Test(expected = IllegalArgumentException.class)
    public void setHuisnummer_is_null_gooitException() {
        Persoon persoon = new Persoon();
        String huisnummer = null;
        persoon.setHuisNummer(huisnummer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setHuisnummer_is_leeg_gooitException() {
        Persoon persoon = new Persoon();
        String huisnummer = "";
        persoon.setHuisNummer(huisnummer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setHuisnummer_bevat_rare_tekens_gooitException() {
        Persoon persoon = new Persoon();
        String huisnummer = "6@@#{";
        persoon.setHuisNummer(huisnummer);
    }



    @Test(expected = IllegalArgumentException.class)
    public void setHuisnummer_is_langer_dan10chars_gooitException() {
        Persoon persoon = new Persoon();
        String huisnummer = "552555353334";
        persoon.setHuisNummer(huisnummer);
    }
    @Test
    public void setHuisnummer_isgoed_assertequeals_true() {
        Persoon persoon = new Persoon();
        String huisnummer = "55";
        persoon.setHuisNummer(huisnummer);
        assertEquals(persoon.getHuisNummer(),huisnummer);
    }


    //_____________GEMEENTE___________________

    @Test
    public void setGemeente_is_goed() {
        Persoon persoon = new Persoon();
        String gemeente = "gijzenzele";
        persoon.setGemeente(gemeente);
        assertEquals(persoon.getGemeente(), gemeente);
    }


    @Test(expected = IllegalArgumentException.class)
    public void setGemeente_is_null_gooitException() {
        Persoon persoon = new Persoon();
        String gemeente = null;
        persoon.setGemeente(gemeente);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setGemeente_is_leeg_gooitException() {
        Persoon persoon = new Persoon();
        String gemeente = "";
        persoon.setGemeente(gemeente);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setGemeente_is_langerDan45_gooitException() {
        Persoon persoon = new Persoon();
        String gemeente = "LLUwejNrazvVrbRPyupNbsgyfUPPCZVZPoYRKrGCaNasHf";
        persoon.setGemeente(gemeente);
    }


    @Test
    public void setGemeente_is_45_assertequelsistrue() {
        Persoon persoon = new Persoon();
        String gemeente = "LLUwejNrazvVrbRPyupNbsgyUPPCZVZPoYRKrGCaNasHf";
        persoon.setGemeente(gemeente);
        assertEquals(persoon.getGemeente(), gemeente);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setGemeente_is_korter_dan_2_gooit_exception() {
        Persoon persoon = new Persoon();
        String gemeente = "LLUwejNrazvVrbRPyupNbsgyUPPCZVZPoYRKrGCaNasHf";
        persoon.setGemeente(gemeente);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setGemeente_bevat_cijfers_gooitException() {
        Persoon persoon = new Persoon();
        String gemeente = "gijzenzel3";
        persoon.setGemeente(gemeente);
    }

    @Test
    public void setGemeente_bevat_koppelteken_assertEqueals() {
        Persoon persoon = new Persoon();
        String gemeente = "sint-lievens-houtem";
        persoon.setGemeente(gemeente);
        assertEquals(persoon.getGemeente(), gemeente);
    }

    @Test
    public void setGemeente_bevat_apostropf_assertEqueals() {
        Persoon persoon = new Persoon();
        String gemeente = "dalbajob's";
        persoon.setGemeente(gemeente);
        assertEquals(persoon.getGemeente(), gemeente);
    }

    @Test
    public void setGemeente_bevat_specialeLetters_assertEqueals() {
        Persoon persoon = new Persoon();
        String gemeente = "éàùïî";
        persoon.setGemeente(gemeente);
        assertEquals(persoon.getGemeente(), gemeente);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setGemeente_bevat_symbolen_gooitException() {
        Persoon persoon = new Persoon();
        String gemeente = "gijz||&";
        persoon.setGemeente(gemeente);
    }

    /*------------------POSTCODE---------------------*/

    @Test
    public void setPostCode_is_goed() {
        Persoon persoon = new Persoon();
        String postcode = "9860";
        persoon.setPostCode(postcode);
        assertEquals(persoon.getPostCode(), postcode);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setPostCode_is_null_gooit_exception() {
        Persoon persoon = new Persoon();
        String postcode = null;
        persoon.setPostCode(postcode);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setPostCode_is_leeg_gooit_exception() {
        Persoon persoon = new Persoon();
        String postcode = "";
        persoon.setPostCode(postcode);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setPostCode_bevat_letters_gooit_exception() {
        Persoon persoon = new Persoon();
        String postcode = "a321";
        persoon.setPostCode(postcode);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setPostCode_is_3chars_gooit_exception() {
        Persoon persoon = new Persoon();
        String postcode = "111";
        persoon.setPostCode(postcode);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setPostCode_is_5chars_gooit_exception() {
        Persoon persoon = new Persoon();
        String postcode = "111";
        persoon.setPostCode(postcode);
    }


}