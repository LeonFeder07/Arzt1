package Praxis;

public class Patient {
    String vorname = "";
    String nachname = "";
    String krankenkasse = "";
    Patient nachfolger;

    Patient(String pvorname, String pnachname) {

        vorname = pvorname;
        nachname = pnachname;



    }

    public Patient getNachfolger() {
        return nachfolger;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getKrankenkasse() {
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
        if(nachfolger==null){
        nachfolger = pNachfolger;}
        else{


                nachfolger.setNachfolger(pNachfolger);
            }

    }

    }

