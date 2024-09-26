import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dYili, yas;
        LocalDateTime yil;
        yil = LocalDateTime.now();
        while (true) {
            try {
                System.out.print("Doğum Yılınızı Girin: ");
                dYili = scanner.nextInt();
                if (dYili >= 1914) {
                    yas = yil.getYear() - dYili;
                    System.out.println("Yaşınız: " + yas);
                    break;
                } else {
                    System.out.println("Hatalı işlem Yaptınız!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Hatalı ifade girdiniz!!!");
                break;
            }

        }
    }
}