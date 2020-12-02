package Cwiczenia;

public class Zadanie_2_Suma {
    public static void main(String[] args){

        int liczby[] = {5,7,2,45,112};
        int suma = 0;

        for(int i = 0; i<liczby.length; i++) {
            suma+=liczby[i];
        }
        System.out.println("Suma tych liczb wynosi: " + suma);
    }
}
