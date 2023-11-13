package com.yasemin;

public class Runner_Ornek_AtamaOperatorleri {
    public static void main(String[] args) {
        /**
         * Bir önceki yazım olan Java Değişken Tanımlaması ve Veri Tipleri içerisinde bolca kullandığımız operatör türüdür. Bir değişkeni başka bir değişkene atamak veya bir değişkene bir veri atamak için kullanılır. Atama operatörleri kullanılırken, aynı zamanda aritmetik operatörler de kullanılabilir. Karşımıza programlamaya başladığımız zaman çıkacak temel atama operatörlerine bir göz atalım.
         * = Operatörü: Herkesin muhakkak kullandığı temel bir atama operatörüdür. Atama işlemleri her zaman sağdan sola bir şekilde gerçekleştirilir.
         * += Operatörü: Solda bulunan değere, kendi değerini ekleyerek tekrar soldaki değere atamasını gerçekleştirir.
         * -= Operatörü: Solda atanan değerden, sağdaki değeri çıkararak tekrar solda yer alan değere atama gerçekleştirir.
         * *= Operatörü: Soldaki değeri, sağda yer alan değer ile çarparak tekrar soldaki değere atamasını gerçekleştirir.
         * /= Operatörü: Diğer operatörlerde olduğu gibi soldaki değeri, sağdaki değere bölerek sonucu tekrar soldaki değere atar.
         */
        int sayi1=54;
        System.out.println("sayi1 e atama yapıldı...:"+sayi1);
        sayi1+=11;
        System.out.println("sayi1 e 11 eklendi...:"+sayi1);
        sayi1-=23;
        System.out.println("sayi1 den 23 cıkarıldı...:"+sayi1);
        sayi1*=5;
        System.out.println("sayi1 i 5 ile carptık...:"+sayi1);
        sayi1/=6;
        System.out.println("sayi1 6 ya bölündü...:"+sayi1);


    }
}
