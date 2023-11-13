package com.yasemin;

public class Runner_Ornek_AritmetikOperatorler {
    public static void main(String[] args) {

        /**
         * Aritmetik operatörler isminden de anlaşılacağı üzere, matematiksel işlemleri gerçekleştirmek için kullanılan operatör türüdür. Bu operatörleri şu şekilde sıralayabilirim:
         * Ekleme (+) yani toplama işlemleri için kullanılır.
         * Çıkarma (-) işlemleri için kullanılır.
         * Çarpma (*) işlemleri için kullanılır.
         * Bölme (/) işlemleri için kullanılır.
         * Mod Alma (%) işlem sonucunda ortaya çıkan kalan değerini verir.
         */
        int sayi1=58, sayi2=5;
        int toplam=sayi1+sayi2;
        System.out.println(sayi1+" ve "+sayi2+" nın toplamı..:"+toplam);
        int fark=sayi1-sayi2;
        System.out.println(sayi1+" ve "+sayi2+" nın farkı..:"+fark);
        int carpim=sayi1*sayi2;
        System.out.println(sayi1+" ve "+sayi2+" nın carpımı..:"+carpim);
        float bolum=(float) sayi1/sayi2;
        System.out.println(sayi1+" ve "+sayi2+" nın bolümü..:"+bolum);
        int kalan=sayi1%sayi2;
        System.out.println(sayi1+" in "+sayi2+" ye bolumunden kalan..:"+kalan);




    }
}
