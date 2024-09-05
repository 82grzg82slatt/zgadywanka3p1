import java.util.Scanner;

public class Main {
    //nazwa pliku i nazwa klasy muszą być takie same
    //nazwy klas powinny być z dużej litery bo tak karze obyczaj
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Witamy na lekcjach programowania"); //wypisanie frazy
        //typ prosty = tylko wartość, z malej litery
        //typ złożony to obiekt ktory ma wlasnosci i metody, z duzej litery
        int wylosowanaLiczba = (int)(Math.random()*100+1);//rzutowanie
        System.out.println(wylosowanaLiczba);

        System.out.println("Zgadnij liczbę");
        Scanner Klawiatura = new Scanner(System.in);
        int wpisanaLiczba  = Klawiatura.nextInt();

        if (wpisanaLiczba == wylosowanaLiczba){
            System.out.println("Gratulacje, wygrana");
        }
        else {
            System.out.println("Pudło");
        }
        int roznica = wylosowanaLiczba>wpisanaLiczba? wylosowanaLiczba-wpisanaLiczba : wpisanaLiczba-wylosowanaLiczba;
        roznica = roznica/10;//dzielenie calkowite

        switch (roznica) {
            case 0 -> System.out.println("Dobra robota");
            case 1 -> System.out.println("Bardzo blisko");
            case 2 -> System.out.println("Blisko");
            default -> System.out.println("Słabo");
        }
        System.out.println(switch (roznica){
         case 0 -> "Bardzo dobrze";
         case 1 -> "Blisko";
         case 2 -> "dość blisko";
            default -> "Słabo";
        });
//zgadujemy 10 razy
        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj liczbę");
            wpisanaLiczba = Klawiatura.nextInt();
            if (wpisanaLiczba == wylosowanaLiczba){
                System.out.println("Gratulacje wygrana");
                break;
            }
        }
        //zgadujemy do skutku
        do {
            System.out.println("Podaj liczbe");
            wpisanaLiczba = Klawiatura.nextInt();
                if (wylosowanaLiczba > wpisanaLiczba) {
                    System.out.println("Wpisano za mało");
                } else if (wylosowanaLiczba<wpisanaLiczba){
                    System.out.println("Wpisano za dużo");
                }

            }
        while (wylosowanaLiczba != wpisanaLiczba);
            System.out.println("Gratulacje wygrana");
        }
    }



// pushowanie na githuba
// boolean int long short byte float double char -- typy zlozone
