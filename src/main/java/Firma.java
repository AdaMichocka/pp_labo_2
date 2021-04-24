import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Firma implements Iterable<Pracownik> {

    List<Pracownik> spisPracownikow = new ArrayList<>();

    public void dodajPracownika(String imie, String nazwisko, Stanowisko stanowisko, double pensja) {
        Pracownik pracownik = new Pracownik(imie, nazwisko, stanowisko, pensja);
        spisPracownikow.add(pracownik);
    }

    public int liczbaPracownikow() {
        return spisPracownikow.size();
    }

    public void wypiszSpisPracownikow() {
        spisPracownikow.forEach(System.out::println);
    }

    @Override
    public Iterator<Pracownik> iterator() {

        return new Iterator<>() {

            private final int curentIndex = 0;
            private final List<Pracownik> pracownicy = spisPracownikow;

            @Override
            public boolean hasNext() {
                return curentIndex < pracownicy.size() && pracownicy.get(curentIndex) != null;
            }

            @Override
            public Pracownik next() {
                return pracownicy.get(curentIndex);
            }
        };
    }

    public Iterator<Pracownik> iterator(Stanowisko s) {

        final List<Pracownik> pracownicy = spisPracownikow.stream()
                .filter(a -> a.getStanowisko().equals(s))
                .collect(Collectors.toList());

        return pracownicy.iterator();

    }

    public List<Pracownik> wezListeZIteratora(Iterator<Pracownik> iterator) {
        List<Pracownik> list = new ArrayList<>();
        iterator.forEachRemaining(list::add);
        return list;
    }

    public double sredniaPensjaWszystkichPracownikow() {
        double suma = 0;
        for (Pracownik p : spisPracownikow) {
            suma += p.getPensja();
        }
        return suma / spisPracownikow.size();
    }

    public double sredniaWybranychPracownikow(Stanowisko s) {
        double suma = 0;
        List<Pracownik> pracownicy = spisPracownikow.stream()
                .filter(a -> a.getStanowisko().equals(s))
                .collect(Collectors.toList());

        for (Pracownik p : pracownicy) {
            suma += p.getPensja();
        }
        return suma / pracownicy.size();
    }


}
