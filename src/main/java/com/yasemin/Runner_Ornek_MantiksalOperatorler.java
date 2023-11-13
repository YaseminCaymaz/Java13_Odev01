package com.yasemin;

import java.util.Scanner;

public class Runner_Ornek_MantiksalOperatorler {
    public static void main(String[] args) {
        /**
         * && Mantıksal Operatörü koşullu 've' anlamina  gelir. Karşılaştırmalarda tabi tutulan değerlerin hepsinin true olduğu sürece, true değer döndürür.
         * || Mantıksal Operatörü koşullu 'veya' anlamina gelmektedir. Karşılaştırma yapılan değerlerden en az biri true olduğu sürece true değer döndürür.
         * ! Mantıksal Operatörü 'değil' anlamina gelir. Elde edilen boolean veri tipindeki verilerin tersini verir.
         */
        String userName="Yasemin";
        int password=20562056;
        System.out.println("Lütfen kullanıcı adınızı giriniz..:");
        String name=new Scanner(System.in).nextLine();
        System.out.println("Lütfen şifrenizi giriniz..:");
        int sifre=new Scanner(System.in).nextInt();
        if (userName.equals(name) && password==sifre)
            System.out.println("Giriş yapıldı");
        else
            System.out.println("Kullanıcı adı veya şifre hatalı");


    }
}
