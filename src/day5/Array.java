package day5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Array {
    // kullanıcıdan alınan bir String'deki herbir karakterin adedini bir array
		// içinde
		// yazdıran bir java programı yazın.
		// String "Javacilar cook afilli" ise cevap şöyle olmalıdır:
		// { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
    public static void main(String[] args) {
        int sayac=0;
        List<String> list= new ArrayList<>();
        String str="Javacilar cook afilli";
        String [] strArr=str.split("");
        for (String each: strArr) {
            if (!list.contains(each)){
                list.add(each);
            }
        }
        String [] yeniArr= new String[list.size()];
       for (int i = 0; i < list.size(); i++) {
           sayac=0;
           for (int j = 0; j < strArr.length ; j++) {
               if (list.get(i).contains(strArr[j])){
                   sayac++;
                   yeniArr[i]=list.get(i)+ " = " + sayac;
                      }
                    }
                   }
        System.out.println("");
        System.out.println("Arr : " +Arrays.toString(yeniArr));
               }
}

