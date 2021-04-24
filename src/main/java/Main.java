import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
                    break;
                case 7:
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
}
