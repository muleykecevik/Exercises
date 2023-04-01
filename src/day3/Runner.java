package day3;
/*
    ÖĞRENCİ YÖNETİM PLATFORMU KODLAYINIZ.
1. BU PROGRAMDA ÖĞRENCİ KAYITLARI İLE İLGİLİ İŞLEMLER YAPILABİLMEKTEDİR.
KAYITLARDA ŞU BİLGİLER OLMALIDIR:
    -AD SOYAD
    -KİMLİK NO
    -YAŞ
    -NUMARA
    -SINIF  BİLGİLERİNİ İÇERMELİDİR.
2. ============= İŞLEMLER =============
         1-EKLEME
         2-ARAMA
         3-LİSTELEME
         4-SİLME
         Q-ÇIKIŞ
    SEÇİMİNİZ:
  ŞEKLİNDE BİR MENÜ OLUŞTURULMALI.
3. ARAMA VE SİLME İŞLEMLERİ KİMLİK NO YA GÖRE YAPILMALIDIR.
NOT: PROJEYİ YAPARKEN NESNE YÖNELİMLİ PROGRAMLAMANIN BİZE SAĞLADIĞI İMKANLARI KULLANMAYA DİKKAT EDİNİZ.
     */
import java.util.ArrayList;
import java.util.List;
public class Runner {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
       Student student= new Student("Muleyke","cevik", "1111", 23,34,1);
       studentList.add(student);
       Student student2= new Student("amet","cevik", "2222", 45,87,2);
       studentList.add(student2);
       Student student3= new Student("veli","cevik", "3333", 56,78,3);
       studentList.add(student3);
       Menu menu= new Menu();
       menu.menu1(studentList);
    }
}
