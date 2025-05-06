public enum Gegenstand {
    D("Deutsch"),
    AM("Mathe"),
    E1("Englisch"),
    Syt("Systemtechnik"),
    INSY("Informationstechnische Systeme"),
    NWTK("Netzwerktechnik");

    private final String langbezeichnung;

    private Gegenstand(String langbezeichnung) {
        this.langbezeichnung = langbezeichnung;
    }

    public String getLangbezeichnung() {
        return langbezeichnung;
    }

    public String toString() {
        return name();
    }
}

