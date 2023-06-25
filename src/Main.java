//Liczby parzyste: Napisz program, który znajdzie i wyświetli wszystkie liczby parzyste w przedziale od 1 do 100.
// Wykorzystaj pętlę do iteracji przez liczby i sprawdź, czy są one parzyste.
public class Main {
    public static void main(String[] args) {


        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {

                System.out.println(i);
            }
        }
    }
}