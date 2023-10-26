public class Patient {
    String vorname="";
    String nachname="";
    String krankenkasse="";
    Patient nachfolger;

    Patient(String pvorname, String pnachname, String pkrankenkasse,Patient pNachfolger){

        vorname=pvorname;
        nachname=pnachname;
        krankenkasse=pkrankenkasse;
        nachfolger=pNachfolger;



    }
    Patient getNachfolger(){
        return nachfolger ;
    }
    String getVorname(){
        return vorname;
    }
    String getNachname(){
        return nachname;
    }
    String getKrankenkasse(){
        return krankenkasse;
    }
}
