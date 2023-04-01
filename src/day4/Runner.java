package day4;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hesap yapmak istediginiz geometrik sekli seciniz: \n" +
        "1.Kare \n" +
        "2.Dikdörtgen");

        Scanner scan= new Scanner(System.in);
        int secim= scan.nextInt();
        if (secim==1){
            Square kare=new Square();
            kare.alan();
            kare.cevre();
        } else if (secim==2) {
            Rectangle dikdörtgen= new Rectangle();
            dikdörtgen.alan();
            dikdörtgen.cevre();

        }

    }
}
