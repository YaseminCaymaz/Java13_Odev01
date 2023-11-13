package com.yasemin;

public class Runner_Ornek_IliskiselOperatorler {
    public static void main(String[] args) {
        /**
         * İlişkisel operatörler, değişkenler içerisindeki verilerin arasında karşılaştırma yapmaya yarar. Bunları şu şekilde sıralayabiliriz:
         * Küçüktür (<)
         * Büyüktür (>)
         * Küçük Eşittir (<=)
         * Büyük Eşittir (>=)
         * Eşittir (==)
         * Eşit Değildir (!=)
         */
        int sayi1=25, sayi2=15, sayi3=9, sayi4=15;
        boolean kontrol=sayi1<sayi3;
        System.out.println(sayi1+" küçüktür "+sayi3+" ->  "+kontrol);
        kontrol=sayi4>sayi3;
        System.out.println(sayi4+" büyüktür "+sayi3+" ->  "+kontrol);
        kontrol=sayi1<=sayi4;
        System.out.println(sayi1+" küçük eşittir "+sayi4+" ->  "+kontrol);
        kontrol=sayi4>=sayi2;
        System.out.println(sayi4+" büyük eşittir "+sayi2+" ->  "+kontrol);
        kontrol=sayi2==sayi4;
        System.out.println(sayi2+" eşittir "+sayi4+" ->  "+kontrol);
        kontrol=sayi2!=sayi1;
        System.out.println(sayi2+" eşit degildir "+sayi1+" -> "+kontrol);



    }
}
