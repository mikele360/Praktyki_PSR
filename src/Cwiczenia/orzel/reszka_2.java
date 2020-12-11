package Cwiczenia.orzel;

public class reszka_2 {

   public static String rzut(){
        double r = Math.random();
        if(r > 0.5) return "Orzeł";
        else return "Reszka";
    }
    public static void main(String[] args){

        for(int i=0; i<100; i++){
            System.out.println(rzut());
        }
    }
}
