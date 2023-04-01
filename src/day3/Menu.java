package day3;
import java.util.List;
import java.util.Scanner;
public class Menu {
    Scanner scan= new Scanner(System.in);
    Student student;
    int number=1000;
    public void menu1(List<Student> studentList){
        System.out.println("""
                ============= İŞLEMLER =============
                        1-EKLEME
                        2-LİSTELEME
                        3-ARAMA
                        4-SİLME
                        Q-ÇIKIŞ
                   SEÇİMİNİZ:""".indent(1));
        char secim=scan.next().toUpperCase().charAt(0);
        switch (secim){
            case '1' : {ekleme(studentList);
            break;}
            case '2' : {
                listele(studentList);
                break;
            }
            case '3' : {
                arama(studentList);
                break;
            }
            case '4' : {
                silme(studentList);
                break;
            }
            case 'Q' : {
                System.exit(0);
            }
            default:
                System.out.println("Please enter a valid idNo");
                menu1(studentList);
        }
    }
    private void silme(List<Student> studentList) {
        int flag=0;
        System.out.println("Please enter id no you want to delete");
        String deleteId=scan.next();
        for (int i = 0; i < studentList.size(); i++) {
            if (deleteId.equals(studentList.get(i).getIdNo()));
            studentList.remove(i);
            flag=1;
            listele(studentList);
        }
        if (flag==0){
            System.out.println("Please enter a valid idNo");
            menu1(studentList);
        }
        menu1(studentList);

    }
    private void arama(List<Student> studentList) {
        int flag=0;
        System.out.println("Please enter ID of student you want to ask");
        String askId=scan.next();
        for (Student each:studentList) {
            if (askId.equals(each.getIdNo())){
                System.out.println("The student you ask : " + each);
                flag=1;
            }
        }
        if (flag==0){
            System.out.println("Please enter a valid idNo");
            menu1(studentList);
        }
        menu1(studentList);
    }
    private void listele(List<Student> studentList) {
        for (Student each:studentList) {
            System.out.println(each);
        }
        menu1(studentList);
    }
    private void ekleme(List<Student> studentList) {
        scan.nextLine();
        System.out.println("Please enter name of student: ");
        String name= scan.nextLine();
        System.out.println("Please enter surname of student: ");
        String surname= scan.nextLine();
        System.out.println("Please enter ID number: ");
        String IdNo= scan.nextLine();
        System.out.println("Please enter age of student: ");
        int age= scan.nextInt();
        System.out.println("Please enter class of student: ");
        int class1= scan.nextInt();
        student=new Student(name,surname,IdNo,age,number++,class1);
        studentList.add(student);
        listele(studentList);
    }
}
