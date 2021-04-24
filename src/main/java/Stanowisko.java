import java.util.stream.Stream;

public enum Stanowisko {
    DYREKTOR("1 - Dyrektor"),
    KIEROWNIK("2 - Kierownik"),
    PRACOWNIK_SZEREGOWY("3 - Pracownik szeregowy");

    public final String nazwaStanowiska;

    Stanowisko(String nazwaStanowiska) {

        this.nazwaStanowiska = nazwaStanowiska;
    }

    public static Stream<Stanowisko> stream() {
        return Stream.of(Stanowisko.values());
    }
}
