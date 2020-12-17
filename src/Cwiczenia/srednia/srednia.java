package Cwiczenia.srednia;

import java.util.Scanner;


public class srednia {

    public static void main(String[] args){

        ArrayList<Integer> tab;

        int[]tablica = {1,2,3,4,5,6,7};
        double suma=0;
        for(int i=0; i < tablica.length; i++){
            suma=suma+ tablica[i];
        }
        suma=suma/tablica.length;
        system.out.println("Srednia wynosi" + suma);


    }
}
