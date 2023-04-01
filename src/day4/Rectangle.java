package day4;

import java.util.Scanner;

public class Rectangle implements Iislemler{
    Scanner scan= new Scanner(System.in);
    @Override
    public void alan() {
        System.out.println("kisa kenar giriniz");
        int kenar1=scan.nextInt();
        System.out.println("uzun kenar giriniz");
        int kenar2=scan.nextInt();
        System.out.println("Dikdörtgenin alani : " + kenar2*kenar1);
    }

    @Override
    public void cevre() {
        System.out.println("kisa kenar giriniz");
        int kenar1=scan.nextInt();
        System.out.println("uzun kenar giriniz");
        int kenar2=scan.nextInt();
        System.out.println("dikdörtgenin cevresi : " + (2*(kenar2+kenar1)));
    }
}
