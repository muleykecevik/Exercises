package day5;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Lutfen yapmak istedginiz islemi giriniz : 1-toplama, 2- cıkarma, 3-carpma, 4-bolme");
        Scanner scan=new Scanner(System.in);
        int islem=scan.nextInt();
        double sayi1,sayi2,sonuc;
        System.out.println("lutfen ilk sayi giriniz");
        sayi1=scan.nextDouble();
        System.out.println("lutfen 2. sayi giriniz");
        sayi2=scan.nextDouble();

        switch (islem){
            case 1 :
                sonuc=sayi1+sayi2;
                System.out.println("sonuc : " + sonuc);
                break;
            case 2:
                sonuc=sayi1-sayi2;
                System.out.println("sonuc : " + sonuc);
                break;
            case 3 :
                sonuc=sayi1*sayi2;
                System.out.println("sonuc : " + sonuc);
                break;
            case 4 :
                sonuc=sayi1/sayi2;
                System.out.println("Sonuc : " + sonuc);
            default:
                System.out.println("lutfen gecerli bir deger girin");
        }
    }
}
