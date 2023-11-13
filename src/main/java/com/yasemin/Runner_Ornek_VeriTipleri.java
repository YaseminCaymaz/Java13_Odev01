package com.yasemin;

public class Runner_Ornek_VeriTipleri {
    public static void main(String[] args) {
        /**
         * Primitive veri türleri;
         * Byte: Bellek üzerinde 1 byte yer kaplar. Tamsayı türünde -128 ile 127 arasında değerler alır.
         * Short: 16 bittir. Byte tipinde tanımlanan sayılardan daha büyük sayılar tanımlanabilir. -32768 ile 32767 arasında değerler tanımlanabilir.
         * Integer (int): En fazla kullanılan veri tipidir. Bellekte 4 Byte yer kaplar ve 32 bittir. -2³¹ ile 2³¹-1 arasında değerler tanımlanabilir.
         * Long: Uzunluğu 64 bittir. Tamsayı türünde  değerler tanımlanabilir.
         * Float: Uzunluğu 32 bittir. Ondalık sayı türünde  değerler alır.
         * Double: Uzunluğu 64 bittir. Ondalık sayı türünde  değerler alır.
         * Char: Veri tipinin uzunluğu 16 bittir. Karakter türünde değerler alır. Tanımlama yapılırken yalnız bir rakam, işaret veya harf kullanılabilir. Yapılan tanımlama işlemleri tek tırnak arasında yapılmalıdır.
         * Boolean: Diğer değişkenlerden daha farklı olarak sadece 2 değer alır. Bu değerler true veya false’dir. Bellekte bir bit yer kaplar. Mantıksal tipler olarak da bilinir.
         */
        System.out.println("****** VERİ TÜRLERİ ******");
        byte myByte=25;
        System.out.println("Byte veri tipli değişken....:"+myByte);
        short myShort=25_144;
        System.out.println("Short veri tipli değişken....:"+myShort);
        int myInt=25_468575;
        System.out.println("Integer veri tipli değişken....:"+myInt);
        long myLong=-2_548_966_546l;
        System.out.println("Long veri tipli değişken....:"+myLong);
        float myfloat=35.54878f;
        System.out.println("Float veri tipli değişken....:"+myfloat);
        double myDouble=35984.544444444d;
        System.out.println("Double veri tipli değişken....:"+myDouble);
        //char veri tipine sayı atandıgında o sayının ASCII tablodaki karakter karşılıgı ne ise ekrana o yazdırılır.
        char myChar=65;
        System.out.println("Char veri tipli değişkene sayı atandı....:"+myChar);
        char myChar2='A';
        System.out.println("Char veri tipli değişken....:"+myChar2);
        boolean myBoolean=true;
        System.out.println("Boolean veri tipli değişken....:"+myBoolean);
    }
}
