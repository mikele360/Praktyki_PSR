package Cwiczenia.SzyftCezara;

public class main {



        //Funkcja kodująca text do szyfru cezara
        public static String code(String text){

            //text zamieniamy na tablice char za pomocą text.toCharArray()
            //oraz przypisujemy do zmiennej typu char[]

            //pętla przechodząca po wszystkich miejscach w tablicy char (uzupełnija warunek)
            //pętla ma się wykonywać dopuki wasze i (zmienna iterująca) jest mniejsza nić .lenght waszej tablicy char
            for (int i =0; /* Tu wstaw odpowiedni warunek */; i++){

                //sprawdzamy czy i-ty element w tablicy jest literą
                //czyli jeżeli wartość w tablicy char nazwatablicy[i] jest w zakresie 65-90 (duże liczby), w zakresie 97-122 (małe liczby) - patrz tablica ASCII wartości decymalne
                //zostawiam wam argument bo to jest chyba najtrudniejszy fragment kodu (tylko uzupełnijcie go o nazwe waszej tablicy, moja nazywała się textchar)
                if((textchar[i] >= 65 && textchar[i] <= 90) || (textchar[i] >= 97 && textchar[i] <= 122)){

                    //seria ifów które sprawdzą nam końcówki (jak natrafimy na 88,89,90 lub 120,121,122 to dodanie trójki wyjdzie nam poza zakres liter, więc można na sztywno ustalić jakie litery mają się tam znaleźć)

                    //jeżeli trafiliśmy na X(88) to zamieniamy na A(65)
                    if(){

                    }
                    //inaczej jeżeli trafiliśmy na Y(89) to zamieniamy na B(66)
                    else if(){

                    }
                    //inaczej jeżeli trafiliśmy na Z(90) to zamieniamy na C(67)
                    else if(){

                    }
                    //inaczej jeżeli trafiliśmy na x(120) to zamieniamy na a(97)
                    else if(){

                    }
                    //inaczej jeżeli trafiliśmy na y(121) to zamieniamy na b(98)
                    else if(){

                    }
                    //inaczej jeżeli trafiliśmy na x(122) to zamieniamy na a(99)
                    else if(){

                    }
                    //inaczej dodaj do liczby wartość 3
                    else {

                    }
                }
            }

            //Stworzenie zmiennej do zwrócenia przez funkcję
            //Conversja tablicy char spowrotem na string (za pomocą metody z klasy string - String.valueOf(nazwatablicy))
            String result = String.valueOf();
            return result;
        }

        public static void main(String[] args) {

            //Tej części nie musicie nic robić (przygowtowałem wam jużwszystko pod testowanie)
            //ten text powinno wam zamienić na "DdEeFfGg, AaBbCc, !.?<>" - jeżeli tak się dzieje to znaczy że jest oki
            String text = "AaBbCcDd, XxYyZz, !.?<>";
            System.out.println(text);

        }
    }

}
