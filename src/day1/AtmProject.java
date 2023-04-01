package day1;

import java.util.Scanner;

public class AtmProject {
    //ATM
    //Kullanicidan giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
    //Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
    //Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,
    //
    //
    //Menu listesinde Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis islemleri olacaktır.
    //
    //
    //Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
    //
    //Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekraninageri donsun.
    //
    //Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
    static String cardNo="123456";
    static String password="1234";
    static double balance=100.000;
    static double addingSumOfMoney;
    static double drawingSumOfMoney;
    static String iban;
    static String enterCardNo;
    static String enterPassword;
    static int actNumber;
    static double amountOfTransfer;
    static String newPassword;
    static String secondPassword;
    static boolean controller=true;
    static boolean controller2=true;
   static Scanner scan= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter your credit/bank card number");
        enterCardNo = scan.nextLine();
        enterCardNo = enterCardNo.replace(" ", "");
        while (controller) {
            if (!enterCardNo.equals(cardNo)) {
                System.out.println("Wrong card number. Please enter your card number");
                controller=true;
            } else {
                controller=false;

                while (controller2){
                    enterPassword = scan.next();
                    if (!enterPassword.equals(password)) {
                        System.out.println("Wrong password. Please enter your card number");
                    } else {
                        controller2=false;
                        menu();

            }
            }}
        }
    }
    public static void menu(){
        System.out.println("""
                Please enter a number what would you like to do.
                1- Balance inquiry\s
                2- Investment \s
                3- Withdrawal\s
                4- EFT\s
                5- Password change\s
                6- Exit""");
        actNumber=scan.nextInt();
        switch (actNumber) {
            case 1 -> {
                balanceInquiry();
                menu();
            }
            case 2 -> investment();
            case 3 -> withdrawal();
            case 4 -> eft();
            case 5 -> passwordChange();
            case 6 -> exit();
            default -> {
                System.out.println("Please enter a number to 1-6");
                menu();
            }
        }
    }
    private static void exit() {
        System.out.println("Have a nice day");
        System.exit(0);
    }
    private static void passwordChange() {
        System.out.println("Please enter your old password");
        secondPassword=scan.next();
        if (!secondPassword.equals(password)){
            passwordChange();
        } else {
            System.out.println("Please enter your new password");
            newPassword=scan.next();
            System.out.println("Your password has been changed succesfully. New password is " + newPassword);
        }

    }
    private static void eft() {
        System.out.println("Please enter IBAN");
        iban=scan.next();
        if (!iban.startsWith("TR") && iban.length()<26){
            System.out.println("IBAN should be start with TR and should have 26 character");
            eft();
        } else {
            System.out.println("Please enter amount of money you want to transfer");
            amountOfTransfer = scan.nextDouble();
            balance-=amountOfTransfer;
            System.out.println(amountOfTransfer+ "has been sent" + "Your current balance : " + balance);
            menu();
        }
    }
    private static void withdrawal() {

        System.out.println("Please enter amount of money you want to withdraw");
        drawingSumOfMoney=scan.nextDouble();
        if (drawingSumOfMoney>balance){
            System.out.println("Unsufficient balance.Please try again.");
            withdrawal();
        } else {
            balance-=drawingSumOfMoney;
            System.out.println(drawingSumOfMoney + "has been withrawn from your account." + "Your current balance" + balance);
        }
    }
    private static void investment() {
        System.out.println("Please enter amount of money you want to add");
        addingSumOfMoney=scan.nextDouble();
        if (addingSumOfMoney>balance){
            System.out.println("Unsufficient balance.Please try again.");
            investment();
        } else {
            balance+=addingSumOfMoney;
            System.out.println(addingSumOfMoney + "has been added from your account." + "Your current balance" + balance);
            menu();
        }
    }
    private static void balanceInquiry() {
        System.out.println("Your current balanca : " + balance);
        menu();
    }
}
