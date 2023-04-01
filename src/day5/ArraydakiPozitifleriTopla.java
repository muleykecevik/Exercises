package day5;

public class ArraydakiPozitifleriTopla {
    //Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
    //method yaziniz.
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, -4, -5, 5, -1, 0};
        System.out.println(pozitifleriYazdir(arr));

    }

    private static int pozitifleriYazdir(int[] arr) {
        int sonuc = 0;
        for (int each : arr) {
            if (each > 0) {
                sonuc += each;
            }
        }
        return sonuc;
    }
}
