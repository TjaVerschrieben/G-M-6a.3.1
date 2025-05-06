import java.util.SortedSet;
import java.util.*;
public class main {
    public static void main(String[] args){
        SortedSet<Schueler> set = new TreeSet<>();
        Schueler s1 = new Schueler(25, "Julia", "Stuppnig", 'a');
        Schueler s2 = new Schueler(20, "Angelina", "Omesu", 'b');
        Schueler s3 = new Schueler(25, "Julia", "Stuppnig", 'a');
        s1.noteHinzu(Gegenstand.INSY, 3);
        s1.noteHinzu(Gegenstand.AM, 2);
        s1.noteHinzu(Gegenstand.D, 1);

        s2.noteHinzu(Gegenstand.INSY, 4);
        s2.noteHinzu(Gegenstand.NWTK, 3);
        s2.noteHinzu(Gegenstand.E1, 1);

        s3.noteHinzu(Gegenstand.Syt, 2);

        set.add(s1);
        set.add(s2);
        set.add(s3);


        for(Schueler k : set){
            System.out.println(k.getVorname() + k.notenListe());
        }



    }



}
