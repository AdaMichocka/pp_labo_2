import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Firma firma = new Firma();
        firma.dodajPracownika("Jan", "Kowalski", Stanowisko.DYREKTOR, 20000.00);
        firma.dodajPracownika("Anna", "Nowak", Stanowisko.KIEROWNIK, 10000.00);
        firma.dodajPracownika("Adam", "Drozd", Stanowisko.PRACOWNIK_SZEREGOWY, 5000.00);
        firma.dodajPracownika("Piotr", "Nowicki", Stanowisko.PRACOWNIK_SZEREGOWY, 5000.00);
        firma.dodajPracownika("Monika", "Szpak", Stanowisko.PRACOWNIK_SZEREGOWY, 5000.00);

        boolean war = false;
        while (!war) {
            System.out.println("------------------------------------------");
            System.out.println("Wpisz numer zadania 1-7");
            System.out.println("(Żeby zakończyć program wpisz 0)");
            System.out.println("------------------------------------------");
            System.out.println();

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Zadanie 1, utworzenie klasy Osoba");
                    Osoba osoba = new Osoba("Jan", "Kowalski");
                    System.out.println(osoba);
                    break;
                case 2:
                    System.out.println("Zadanie 2, utworzenie klasy Pracownik");
                    Pracownik pracownik = new Pracownik("Jan", "Kowalski", Stanowisko.DYREKTOR, 20000.00);
                    System.out.println(pracownik);
                    break;
                case 3:
                    System.out.println("Zadanie 3, utworzenie enuma Stanowisko:");
                    System.out.println(Stanowisko.DYREKTOR.nazwaStanowiska);
                    System.out.println(Stanowisko.KIEROWNIK.nazwaStanowiska);
                    System.out.println(Stanowisko.PRACOWNIK_SZEREGOWY.nazwaStanowiska);
                    break;
                case 4:
                    System.out.println("Zadanie 4, utworzenie klasy Firma i implementacja metod:");
                    System.out.println("metoda dodajPracownika(), dodajemy 5 pracowników");

                    System.out.println();
                    System.out.println("metoda liczbaPracownikow()");
                    System.out.println(firma.liczbaPracownikow());
                    System.out.println();
                    System.out.println("metoda wypiszSpisPracownikow()");
                    firma.wypiszSpisPracownikow();
                    System.out.println();

                    break;
                case 5:
                    System.out.println("Zadanie 5, uimplementacja metody Iterator():");
                    List<Pracownik> listaPracownikow = new ArrayList<>(firma.spisPracownikow);
                    for (Pracownik p : listaPracownikow) {
                        System.out.println(p);
                    }
                    break;
                case 6:
                    System.out.println("Zadanie 6, uimplementacja metody Iterator() dla pracowników o stanowisku s:");
                    System.out.println("Wpisz numer: 1 - DYREKTOR, 2 - KIEROWNIK, 3 - PRACOWNIK_SZEREGOWY");
                    int i = scanner.nextInt();

                    List<Pracownik> pracownicy = firma.wezListeZIteratora(firma.iterator(wezStanowiskoZInta(i)));

                    for (Pracownik pp : pracownicy) {
                        System.out.println(pp);
                    }
                    break;
                case 7:
                    System.out.println("Zadanie 7, uimplementacja metod:");
                    System.out.println("a) metoda obliczająca średnią pensję wszystkich pracowników:");
                    System.out.println(firma.sredniaPensjaWszystkichPracownikow());
                    System.out.println();
                    System.out.println("b) metoda obliczjąca średnią pensję pracowników ze wskazanym stanowiskiem:");
                    System.out.println("Wpisz numer: 1 - DYREKTOR, 2 - KIEROWNIK, 3 - PRACOWNIK_SZEREGOWY");
                    int x = scanner.nextInt();
                    System.out.println(firma.sredniaWybranychPracownikow(wezStanowiskoZInta(x)));
                    break;
                case 0:
                    war = true;
                    break;
                default:
                    break;
            }
        }
        scanner.close();

    }


    public static Stanowisko wezStanowiskoZInta(int i) {
        Stanowisko s = null;
        switch (i) {
            case 1:
                s = Stanowisko.DYREKTOR;
                break;
            case 2:
                s = Stanowisko.KIEROWNIK;
                break;
            case 3:
                s = Stanowisko.PRACOWNIK_SZEREGOWY;
                break;
            default:
                break;
        }
        return s;
    }

}
