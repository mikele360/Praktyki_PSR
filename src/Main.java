public class Main {
    public static void main(String[] args) {
        int zmienna1 = 30;
        long zmiennaa = 20;
        float zmiennab = 1.0f;
        double zmiennac = 30.1321;
        boolean zmiennad = true;

        char zmiennae = 'K';
        String zmiennaf = "Hello";
        String komunikat = new String("Hello World");

        char[] tablicaChar = new char[5];
        tablicaChar[0] = 'H';
        tablicaChar[1] = 'e';
        tablicaChar[2] = 'l';
        tablicaChar[3] = 'l';
        tablicaChar[4] = 'o';

        int[] tablicaInt = {6, 344, 123, 73, 234, 876};

        for (int i = 0; i < 30; i++) {
            if (0 < zmienna1) {
                zmienna1 = -1;

            } else {
                zmienna1 = 30;
            }
            System.out.println(zmienna1);
        }

        for (int i = 0; i < tablicaChar.length; i++) {
            System.out.print(tablicaChar[i]);
        }

        int iteration = 0;
        while (iteration < 15) {
            System.out.print(komunikat);
            iteration += +1;
        }

        boolean stopLoop = true;
       do{
           stopLoop = false;
           ;
       }while(true);

       //modulo - reszta z dzielenia



       //Tu wpisuje jaki jest znak ASCII dla litery f
       //System.out.println((int) 'f');

    }
}
