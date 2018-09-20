package domein;



public class Persoon {
    private String voorNaam;
    private String achterNaam;
    private String gsmNummer;
    private String email;
    private String straatNaam;
    private String huisNummer;
    private String gemeente;
    private String postCode;


    public Persoon() {
    }

    public Persoon(String voorNaam, String achterNaam, String gsmNummer, String email, String straatNaam, String huisNummer, String gemeente, String postCode) {
        setVoorNaam(voorNaam);
        this.achterNaam = achterNaam;
        this.gsmNummer = gsmNummer;
        this.email = email;
        this.straatNaam = straatNaam;
        this.huisNummer = huisNummer;
        this.gemeente = gemeente;
        this.postCode = postCode;
    }

    public String getVoorNaam() {
        return voorNaam;
    }

    public void setVoorNaam(String voorNaam) {

        Controle.controleerNaam(voorNaam);
        this.voorNaam = voorNaam;
    }

    public String getAchterNaam() {
        return achterNaam;
    }

    public void setAchterNaam(String achterNaam) {
        Controle.controleerNaam(achterNaam);
        this.achterNaam = achterNaam;
    }

    public String getGsmNummer() {

        return gsmNummer;
    }

    public void setGsmNummer(String gsmNummer) {
        Controle.controleerGSM(gsmNummer);
        this.gsmNummer = gsmNummer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Controle.controleerEmail(email);
        this.email = email;
    }

    public String getStraatNaam() {
        return straatNaam;
    }

    public void setStraatNaam(String straatNaam) {
        Controle.controleerStraatNaam(straatNaam);
        this.straatNaam = straatNaam;
    }

    public String getHuisNummer() {

        return huisNummer;
    }

    public void setHuisNummer(String huisNummer) {
        Controle.controleerHuisnummer(huisNummer);
        this.huisNummer = huisNummer;
    }


    public String getGemeente() {
        return gemeente;
    }

    public void setGemeente(String gemeente) {
        Controle.controleerGemeente(gemeente);
        this.gemeente = gemeente;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        Controle.controleerPostcode(postCode);
        this.postCode = postCode;
    }
}
