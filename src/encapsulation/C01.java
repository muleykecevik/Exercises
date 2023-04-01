package encapsulation;

public class C01 {

    private static String isim;
    public static String getIsim() {
        isimYazdir();return isim;
    }

    public static void setIsim(String isim) {
        isimKontrolEt();
        C01.isim = isim;
    }

    public static void isimYazdir(){}
    private static void isimKontrolEt(){}









}