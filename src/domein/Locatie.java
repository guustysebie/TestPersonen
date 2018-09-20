package domein;




public class Locatie {

    private String straatnaam;
    private String huisnummer;
    private String gemeente;
    private String postcode;
    private int id_locatie;

    public Locatie() {

    }

    public String getStraatnaam() {
        return straatnaam;
    }

    public void setStraatnaam(String straatnaam) {
        Controle.controleerStraatNaam(straatnaam);
        this.straatnaam = straatnaam;
    }

    public String getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(String huisnummer) {
        Controle.controleerHuisnummer(huisnummer);
        this.huisnummer = huisnummer;
    }

    public String getGemeent() {
        return gemeente;
    }

    public void setGemeent(String gemeente) {
        Controle.controleerGemeente(gemeente);
        this.gemeente = gemeente;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        Controle.controleerPostcode(postcode);
        this.postcode = postcode;
    }

    public int getId_locatie() {
        return id_locatie;
    }

    public void setId_locatie(int id_locatie) {
        Controle.controleerId(id_locatie);
        this.id_locatie = id_locatie;
    }
}
