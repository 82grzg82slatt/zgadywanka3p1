import java.util.Scanner;

public class Main {
    //nazwa pliku i nazwa klasy muszą być takie same
    //nazwy klas powinny być z dużej litery bo tak karze obyczaj
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Witamy na lekcjach programowania"); //wypisanie frazy
        //typ prosty = tylko wartość, z malej litery
        //typ złożony to obiekt ktory ma wlasnosci i metody, z duzej litery
        int wylosowanaLiczba = (int)(Math.random()*10+1);//rzutowanie
        System.out.println(wylosowanaLiczba);

        System.out.println("Zgadnij liczbę");
        Scanner klawiatura = new Scanner(System.in);
        int wpisanaLiczba  = klawiatura.nextInt();


    }
}
//pushowanie na githuba
// boolean int long short byte float double char -- typy zlozone
