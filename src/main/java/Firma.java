import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Firma implements Iterable {

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
        Iterator<Pracownik> it = new Iterator<Pracownik>() {

            private int curentIndex = 0;
            private Pracownik[] arrayList;

            @Override
            public boolean hasNext() {
                return curentIndex < spisPracownikow.size() && arrayList[curentIndex] != null;
            }

            @Override
            public Pracownik next() {
                return arrayList[curentIndex];
            }
        };

        return it;
    }


}
