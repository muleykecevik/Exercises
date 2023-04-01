package day5;

import java.util.Arrays;

public class ArrayElemanEkleme {
    /*
Verilen bir int array'in tum elemanlarini 2 artirip bize donduren bir method
olusturun. Eski array'i yeni haliyle kaydedin.
 */

    public static void main(String[] args) {
        int [] arr={2,3,4,5,6};
        System.out.println(Arrays.toString(arrayElemanEkle(arr)));
    }

    private static int[] arrayElemanEkle(int[] arr) {
        int[] yeniArr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i]+2;
        }
        arr=yeniArr;
        return arr;
    }
}
