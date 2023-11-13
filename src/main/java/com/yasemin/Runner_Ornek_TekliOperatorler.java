package com.yasemin;

public class Runner_Ornek_TekliOperatorler {
    public static void main(String[] args) {
        /**
         * Operatörler işlemleri gerçekleştirebilmek için ihtiyaç duyduğu değişkenlere operand denilmektedir. Tek operandı bulunan operatörlere ise tekli (unary) operatör denir.
         * Tekli - veya + konulması, ilgili operandın değerini negatif veya pozitif yapmak için kullanılır.
         * Arttırma Operatörü ve Azaltma Operatörü (++ / --) operandın değerini bir arttırır veya azaltır.
         * Sonrasında Artış veya Azaltma (a++ / a--) operand önce hesaplanır sonra arttırılır.
         * Ön Arttırma veya Azaltma(++a / --a) operand önce arttırılır veya azaltılır sonra hesaplaması gerçekleştirilir.
         */
         //'=' operatorü ile bir degişkene deger atarız
        int sayi1=68, sayi2=13;
        System.out.println("1. sayı..:"+sayi1+"  2.sayı..:"+sayi2);
        //'++'  operatori yanına geldikleri degişkeni bir arttırır.'--' ise bir azaltır.
        sayi1++;
        sayi2--;
        System.out.println("1. sayı..:"+sayi1+"  2.sayı..:"+sayi2);
        //'++' ile '--' operatorleri degişkenin önüne geldiginde önce arttırma ya da azaltma işlemini yapar sonra kod satırına devam eder.
        //arkasına geldiğinde ise önce kod satırını bitirir sonta arttırma ya da azaltma işlemini yapar.
        System.out.println("1.sayı..:"+(++sayi1)+" 1.sayı..:"+(sayi1++));
        System.out.println("2.sayı..:"+(--sayi2)+" 2.sayı..:"+(sayi2--));
        System.out.println("1. sayı..:"+sayi1+"  2.sayı..:"+sayi2);

    }
}
