package day4;

import java.util.Scanner;

public class Square implements Iislemler{
    Scanner scan=new Scanner(System.in);
    @Override
    public void alan() {
        System.out.println("karenin kenar uzunlugunu giriniz");
        int kenar=scan.nextInt();
        System.out.println("Karenin alani : " + kenar*kenar);
    }

    @Override
    public void cevre() {
        System.out.println("karenin kenar uzunlugunu giriniz");
        int kenar=scan.nextInt();
        System.out.println("Karenin cevresi : " + kenar*4);

    }
}
