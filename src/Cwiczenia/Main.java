package Cwiczenia;

public class Main {
    public static void main(String[] args) {

        //Zadanie: Posortuj tablice liczb całkowitych rosnąco
        int[] tab = {4, 2, 5, 76, 8, 2, 14, 234, 346, 32, 1};
        int[] wynik = new int[tab.length];

        //Przechodzimy po każdym elemencie tabllicy wyników
        for (int j = 0; j < wynik.length; j++) {

            //pętla przechodząca po wszystkich elementach tablicy
            int temp = tab[0];
            int lokalizacja = 0;
            for (int i = 0; i < tab.length; i++) {
                //Porównaj przechowywaną zmienną z kolejnym miejscem w tablicy
                if (temp > tab[i]) {
                    temp = tab[i];
                    lokalizacja = i;
                }
//                System.out.println("Temp: "+ "Lokalizacja: "+lokalizacja);
            }
            //Wpisujemy do konkretnego miejsca w tablicy naszą wartość
            wynik[j] = temp;
            tab[lokalizacja] = Integer.MAX_VALUE;

            //Wpisujemy tablice wyników
            System.out.print(wynik[j] + ", " );
        }
    }
}