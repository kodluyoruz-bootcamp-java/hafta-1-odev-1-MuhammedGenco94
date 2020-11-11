package org.kodluyoruz.homework1.question1;
/*
    1- 	0 ile 2000 arasında
	    3,5,7 ve 53’e bölünebilen
	    sayıların ağırlıklı ortalamasını (Aritmetik ortalaması)
	    bulan bir uygulama yazınız.
*/
public class Main {
    public static void main(String[] args) {
        int sayiAdedi = 0;
        long toplami = 0;
        float ortalamasi = 0;

        for (int i = 0; i <= 2000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0) && (i % 7 == 0) && (i % 53 == 0)) {
                sayiAdedi++;
                toplami += i;
            }
        }

        if (sayiAdedi != 0) ortalamasi = (float) toplami / sayiAdedi;

        System.out.println("Aritmetik Ortalama : " + ortalamasi);
        System.out.println("Eşleşen Sayıların Adedi : " + sayiAdedi);
        System.out.println("Sayıları Toplami : " + toplami);
    }
}
