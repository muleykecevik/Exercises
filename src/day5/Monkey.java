package day5;

public class Monkey {
    /*
		There is a lonely monkey in the island
		He needs to eat 4 bananas every day
		there are just 165 bananas in that island
		Create following variables and find how many days
		monkey can survive.
		Use do while loop, increment and decrement and if statements
		int numberOfBananas =165, survivalDays = 1;
		boolean monkeyAlive = true;


		Adada yalnız bir maymun var Her gün 4 muz yemesi gerekiyor
        o adada sadece 165 muz var
Aşağıdaki değişkenleri oluşturun ve kaç gün olduğunu bulun maymun hayatta kalabilir.
Do while döngüsü, artırma ve eksiltme ve if deyimlerini kullanın
int Muz Sayısı =165, hayatta kalmaDays = 1;
boolean maymunAlive = true;
		*/


    public static void main(String[] args) {
         int muzSayisi=200;
         int hayattaKalmaSayisi=1;
         boolean maymunAlive = true;
        do {
            if (muzSayisi>4){
                hayattaKalmaSayisi++;
                muzSayisi-=4;
            } else if (muzSayisi<4){
                maymunAlive=false;
            }
        }while (maymunAlive);
        System.out.println("maymunun hayatta kaldigi gun sayisi : " + hayattaKalmaSayisi);
    }


}
