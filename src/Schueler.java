import java.util.*;

/**
 * eine Klasse Schueler mit der man noten und einen Schüler bestimmen kann, optimiert für collections
 * @author Julia Stuppnig
 * @version 06.05.2025
 */
public class Schueler implements Comparable<Schueler> {
    private int katalognummer;
    private String vorname;
    private String nachname;
    private char gruppe;
    private Map<Gegenstand, Integer> notenliste;

    public Schueler() {
        notenliste = new HashMap<Gegenstand, Integer>();
        this.katalognummer = 0;
        this.vorname = "falsch";
        this.nachname = "falsch";
        this.gruppe = 'z';
    }

    public Schueler(int katalognummer, String vorname, String nachname, char gruppe) {
        notenliste = new HashMap<Gegenstand, Integer>();
        this.katalognummer = katalognummer;
        this.vorname = vorname;
        this.nachname = nachname;
        this.gruppe = gruppe;
    }

    public int getKatalognummer() {
        return katalognummer;
    }

    public void setKatalognummer(int katalognummer) {
        this.katalognummer = katalognummer;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public char getGruppe() {
        return gruppe;
    }

    public void setGruppe(char gruppe) {
        this.gruppe = gruppe;
    }

    @Override
    public boolean equals(Object o) {
        Schueler s = (Schueler) o;
        if (this == o) {
            return true;
        } else if (this.katalognummer == s.getKatalognummer()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(katalognummer);
    }

    @Override
    public int compareTo(Schueler s) {
        return Integer.compare(this.katalognummer, s.getKatalognummer());
    }

    /**
     * gibt alle noten mit Gegenstand und lanbzeichnung als String zurück
     *
     * @return den String mit Noten
     */
    public String notenListe() {
        String liste = "";
        for (Map.Entry<Gegenstand, Integer> eintrag : notenliste.entrySet()) {
            liste = liste + eintrag.getKey().toString() + " (";
            liste = liste + eintrag.getKey().getLangbezeichnung() + "): ";
            liste = liste + eintrag.getValue() + ", ";
        }
        return liste;
    }

    /**
     * gibt die Note von dem gegebenen Gegenstand zurück
     *
     * @param g der Gegenstand
     * @return die Note
     */
    public int note(Gegenstand g) {
        return notenliste.get(g);
    }

    /**
     * fügt eine Note zu einem Gegenstand hinzu
     *
     * @param g    der Gegenstand
     * @param note die Note
     */
    public void noteHinzu(Gegenstand g, int note) {
        if (notenliste.containsKey(g)) {
            notenliste.remove(g);
            notenliste.put(g, note);
        } else {
            notenliste.put(g, note);
        }
    }
}
