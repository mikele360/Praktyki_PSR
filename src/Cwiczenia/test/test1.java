package Cwiczenia.test;

public class test1 {
    public static void main(String[] args){

        int[] tab = {1, 732, 932, 431, 91, 21, 431};
        int n;
        n = tab[0];


        for(int i = 0; i < tab.length; i++){
            if(n < tab[i]){
                n=tab[i];
            }
        }
        System.out.println(n);
    }
}
