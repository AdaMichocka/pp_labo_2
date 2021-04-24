public class Pracownik extends Osoba {

    private Stanowisko stanowisko;
    private double pensja;


    public Pracownik(String imie, String nazwisko, Stanowisko stanowisko, double pensja) {
        super(imie, nazwisko);
        this.stanowisko = stanowisko;
        this.pensja = pensja;
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

