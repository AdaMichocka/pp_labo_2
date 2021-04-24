public enum Stanowisko {
    DYREKTOR("1 - Dyrektor"),
    KIEROWNIK("2 - Kierownik"),
    PRACOWNIK_SZEREGOWY("3 - Pracownik szeregowy");

    public final String nazwaStanowiska;

    private Stanowisko(String nazwaStanowiska) {
        this.nazwaStanowiska = nazwaStanowiska;
    }

}
