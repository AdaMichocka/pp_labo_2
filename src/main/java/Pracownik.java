public class Pracownik extends Osoba {

    private final Stanowisko stanowisko;
    private final double pensja;


    public Pracownik(String imie, String nazwisko, Stanowisko stanowisko, double pensja) {
        super(imie, nazwisko);
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    public double getPensja() {
        return pensja;
    }

    public Stanowisko getStanowisko() {
        return stanowisko;
    }

    @Override
    public String toString() {
        return "\n" +
                "imie = '" + getImie() + "'\n" +
                "nazwisko = '" + getNazwisko() + "'\n" +
                "stanowisko = '" + stanowisko.nazwaStanowiska + "'\n" +
                "pensja = '" + pensja + '\'';
    }
}

