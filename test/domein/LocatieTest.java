package domein;

import org.junit.Test;

import static org.junit.Assert.*;

public class LocatieTest {


    /*------------------STRAATNAAM--------------*/

    @Test(expected = IllegalArgumentException.class)
    public void setStraatnaam_is_null_gooitException() {
        Locatie locatie = new Locatie();
        String straatnaam = null;
        locatie.setStraatnaam(straatnaam);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setStraatnaam_is_leeg_gooitException() {
        Locatie locatie = new Locatie();
        String straatnaam = "";
        locatie.setStraatnaam(straatnaam);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setStraatnaam_is_meer_dan45chars_gooitException() {
        Locatie locatie = new Locatie();
        String straatnaam = "qsdfqsfaeraegdfgdgerfsdgdgdfgergdsfgsdgrsdfgsdfgrzegf";
        locatie.setStraatnaam(straatnaam);
    }


    @Test(expected = IllegalArgumentException.class)
    public void setStraatnaam_is_bevat_cijfers_gooitException() {
        Locatie locatie = new Locatie();
        String straatnaam = "gijz3enzele";
        locatie.setStraatnaam(straatnaam);
    }


    @Test(expected = IllegalArgumentException.class)
    public void setStraatnaam_is_bevat_symbolen_gooitException() {
        Locatie locatie = new Locatie();
        String straatnaam = "|@&@|''('rzegf";
        locatie.setStraatnaam(straatnaam);
    }

    @Test
    public void setStraatnaam_is_bevat_koppelteken_assertequals_true() {
        Locatie locatie = new Locatie();
        String straatnaam = "gijzenzele-gent";
        locatie.setStraatnaam(straatnaam);
        assertEquals(locatie.getStraatnaam(), straatnaam);
    }


    @Test
    public void setStraatnaam_is_bevat_afkappingsteken_assertequals_true() {
        Locatie locatie = new Locatie();
        String straatnaam = "gijzenzele'gent";
        locatie.setStraatnaam(straatnaam);
        assertEquals(locatie.getStraatnaam(), straatnaam);
    }

    @Test
    public void setStraatnaam_is_bevat_uitspraaktekens_assertequals_true() {
        Locatie locatie = new Locatie();
        String straatnaam = "éèàï";
        locatie.setStraatnaam(straatnaam);
        assertEquals(locatie.getStraatnaam(), straatnaam);
    }

    @Test
    public void setStraatnaam_is_goed_assertequals_true() {
        Locatie locatie = new Locatie();
        String straatnaam = "Sint-livensPoorstraat";
        locatie.setStraatnaam(straatnaam);
        assertEquals(locatie.getStraatnaam(), straatnaam);
    }

//-------------------------HUISNUMMER--------------------------

    @Test(expected = IllegalArgumentException.class)
    public void setHuisnummer_is_null_gooitException() {
        Locatie locatie = new Locatie();
        String huisnummer = null;
        locatie.setHuisnummer(huisnummer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setHuisnummer_is_leeg_gooitException() {
        Locatie locatie = new Locatie();
        String huisnummer = "";
        locatie.setHuisnummer(huisnummer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setHuisnummer_bevat_rare_tekens_gooitException() {
        Locatie locatie = new Locatie();
        String huisnummer = "6@@#{";
        locatie.setHuisnummer(huisnummer);
    }


    @Test(expected = IllegalArgumentException.class)
    public void setHuisnummer_is_langer_dan10chars_gooitException() {
        Locatie locatie = new Locatie();
        String huisnummer = "552555353334";
        locatie.setHuisnummer(huisnummer);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setHuisnummer_start_met_een_letter_gooitException() {
        Locatie locatie = new Locatie();
        String huisnummer = "B10";
        locatie.setHuisnummer(huisnummer);
    }

    @Test
    public void setHuisnummer_isgoed_assertequeals_true() {
        Locatie locatie = new Locatie();
        String huisnummer = "55";
        locatie.setHuisnummer(huisnummer);
        assertEquals(locatie.getHuisnummer(), huisnummer);
    }

    //_____________GEMEENTE___________________

    @Test
    public void setGemeente_is_goed() {
        Locatie locatie = new Locatie();
        String gemeente = "gijzenzele";
        locatie.setGemeent(gemeente);
        assertEquals(locatie.getGemeent(), gemeente);
    }


    @Test(expected = IllegalArgumentException.class)
    public void setGemeente_is_null_gooitException() {
        Locatie locatie = new Locatie();
        String gemeente = null;
        locatie.setGemeent(gemeente);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setGemeente_is_leeg_gooitException() {
        Locatie locatie = new Locatie();
        String gemeente = "";
        locatie.setGemeent(gemeente);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setGemeente_is_langerDan45_gooitException() {
        Locatie locatie = new Locatie();
        String gemeente = "LLUwejNrazvVrbRPyupNbsgyfUPPCZVZPoYRKrGCaNasHf";
        locatie.setGemeent(gemeente);
    }


    @Test
    public void setGemeente_is_45_assertequelsistrue() {
        Locatie locatie = new Locatie();
        String gemeente = "LLUwejNrazvVrbRPyupNbsgyUPPCZVZPoYRKrGCaNasHf";
        locatie.setGemeent(gemeente);
        assertEquals(locatie.getGemeent(), gemeente);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setGemeente_is_korter_dan_2_gooit_exception() {
        Locatie locatie = new Locatie();
        String gemeente = "LLUwejNrazvVrbRPyupNbsgyUPPCZVZPoYRKrGCaNasHf";
        locatie.setGemeent(gemeente);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setGemeente_bevat_cijfers_gooitException() {
        Locatie locatie = new Locatie();
        String gemeente = "gijzenzel3";
        locatie.setGemeent(gemeente);
    }

    @Test
    public void setGemeente_bevat_koppelteken_assertEqueals() {
        Locatie locatie = new Locatie();
        String gemeente = "sint-lievens-houtem";
        locatie.setGemeent(gemeente);
        assertEquals(locatie.getGemeent(), gemeente);
    }

    @Test
    public void setGemeente_bevat_apostropf_assertEqueals() {
        Locatie locatie = new Locatie();
        String gemeente = "dalbajob's";
        locatie.setGemeent(gemeente);
        assertEquals(locatie.getGemeent(), gemeente);
    }

    @Test
    public void setGemeente_bevat_specialeLetters_assertEqueals() {
        Locatie locatie = new Locatie();
        String gemeente = "éàùïî";
        locatie.setGemeent(gemeente);
        assertEquals(locatie.getGemeent(), gemeente);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setGemeente_bevat_symbolen_gooitException() {
        Locatie locatie = new Locatie();
        String gemeente = "gijz||&";
        locatie.setGemeent(gemeente);
    }



    /*------------------POSTCODE---------------------*/

    @Test
    public void setPostCode_is_goed() {
        Locatie locatie = new Locatie();
        String postcode = "9860";
        locatie.setPostcode(postcode);
        assertEquals(locatie.getPostcode(), postcode);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setPostCode_is_null_gooit_exception() {
        Locatie locatie = new Locatie();
        String postcode = null;
        locatie.setPostcode(postcode);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setPostCode_is_leeg_gooit_exception() {
        Locatie locatie = new Locatie();
        String postcode = "";
        locatie.setPostcode(postcode);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setPostCode_bevat_letters_gooit_exception() {
        Locatie locatie = new Locatie();
        String postcode = "a321";
        locatie.setPostcode(postcode);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setPostCode_is_3chars_gooit_exception() {
        Locatie locatie = new Locatie();
        String postcode = "111";
        locatie.setPostcode(postcode);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setPostCode_is_5chars_gooit_exception() {
        Locatie locatie = new Locatie();
        String postcode = "111";
        locatie.setPostcode(postcode);
    }


    /*-------------------LOCATIE ID----------------------------*/
    @Test(expected = IllegalArgumentException.class)
    public void setid_locatie_is_negatief_gooit_exception() {
        Locatie locatie = new Locatie();
        int id =-1 ;
        locatie.setId_locatie(id);
    }





}