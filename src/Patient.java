public class Patient {
    String vorname = "";
    String nachname = "";
    String krankenkasse = "";
    Patient nachfolger;

    Patient(String pvorname, String pnachname, String pkrankenkasse) {

        vorname = pvorname;
        nachname = pnachname;
        krankenkasse = pkrankenkasse;


    }

    Patient getNachfolger() {
        return nachfolger;
    }

    String getVorname() {
        return vorname;
    }

    String getNachname() {
        return nachname;
    }

    String getKrankenkasse() {
        return krankenkasse;
    }

    public void setKrankenkasse(String pKrankenkasse) {
        krankenkasse = pKrankenkasse;
    }

    public void setVorname(String pVorname) {
        vorname = pVorname;
    }

    public void setNachname(String pNachname) {
        nachname = pNachname;
    }

    public void setNachfolger(Patient pNachfolger) {
        nachfolger = pNachfolger;
    }
}
