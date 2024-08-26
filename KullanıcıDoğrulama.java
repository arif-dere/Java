import java.util.Scanner;
import java.io.*;
public class Main {
   public static void main(String args[]) {
       Scanner input = new Scanner(System.in);
       String k_ad = "admin";
       String prl = "admin1123";

       System.out.println("İSMİNİZİ GİRİNİZ: ");
       String isim = input.next();
       System.out.println("MERHABA " + isim + " Bey Kullanıcı Bilgilerinizi Doğrulayınız...");

       System.out.println("Lütfen Kullanıcı adınızı giriniz: \n");
       String k_ad1 = input.next();

       System.out.println("Lütfen Parolanızı giriniz: \n");
       String prl1 = input.next();

       if(k_ad1.equals(k_ad) && prl1.equals(prl)){
           System.out.println("Sisteme HoşGeldiniz");
       }
       else {
           System.out.println("Kullanıcı adı veya Parola hatalı. Lütfen tekrar deneyiniz!...");
       }




   }
}
