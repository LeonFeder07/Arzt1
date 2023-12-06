package Praxis;

public class Patient {
    String vorname = "";
    String nachname = "";
    String termin= "";
    Patient nachfolger;

    Patient(String pvorname, String pnachname,String pTermin) {

        vorname = pvorname;
        nachname = pnachname;
        termin = pTermin;



    }

   // public Patient getNachfolger() {
     //   return nachfolger;
   // }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getTermin() {
        return termin;
    }

    public void setTermin(String pTermin) {
        termin = pTermin;
    }

    public void setVorname(String pVorname) {
        vorname = pVorname;
    }

    public void setNachname(String pNachname) {
        nachname = pNachname;
    }

   // public void setNachfolger(Patient pNachfolger) {
     //   if(nachfolger==null){
       // nachfolger = pNachfolger;}
        //else{


          //      nachfolger.setNachfolger(pNachfolger);
           // }

    //}

    }

