import java.util.*;
/**
 *
 * @author Julia Stuppnig
 * @version 06.05.2025
 */
public class EmailListe {
    private SortedMap<Schueler, Set<String>> map;

    public EmailListe(){
        map = new TreeMap<>();
    }

    /**
     * fügt eine Email zu einem Schüler hinzu, falls der Schüler nicht existiert, oder die email im Schüler nicht existiert, wird neues Set geamcht.
     * @param email die hinzuzufügene Email
     * @param s der Schüler
     */
    public void addEmail(String email, Schueler s){
        if(!map.containsKey(s) || map.get(s).isEmpty()){
            Set<String> emails = new TreeSet<>();
            emails.add(email);
            map.put(s, emails);
        } else {
            map.get(s).add(email);
        }
    }

    /**
     * gibt alle Email adressen zu einem Schüler zurück
     * @param s der Schüler
     * @return die Email Adressen
     */
    public String[] searchEmail(Schueler s){
        String[] emails = new String[map.get(s).size()];
        int i = 0;
        for(String email : map.get(s)){
            emails[i] = email;
            i++;
        }
        return emails;
    }

    /**
     * löscht einen Schüler aus der map
     * @param s der Schüler
     */
    public void deleteS(Schueler s){
        if(!map.containsKey(s)){
            System.out.println("Den Schüler gibts nicht");
        }else{
            map.remove(s);
        }
    }

    /**
     * löscht eine Email zu einem Schüler
     * @param s der Schüler
     * @param email die Email zum Schüler
     */
    public void deleteE(Schueler s, String email) {
        if (!map.containsKey(s) || !map.get(s).contains(email)) {
            System.out.println("Den Schüler oder die Email bei dem Schüler gibts nicht");
        }else{
            map.get(s).remove(email);
        }
    }

    /**
     * fasst alle Schüler mit Emails in einen String zusammen
     * @return der String
     */
    @Override
    public String toString(){
        String auflistung = "";

        for(Map.Entry<Schueler, Set<String>> eintrag : map.entrySet()){
            auflistung += eintrag.getKey();
            int index = 1;
            for(String s : eintrag.getValue()){
                auflistung += "E" + index + ": " + s;
            }
        }
        return auflistung;
    }
}
