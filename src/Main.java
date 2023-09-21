import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy,kilo,vkindex;
        Scanner input = new Scanner(System.in);
        System.out.print("Kilo (kg): ");
        kilo = input.nextDouble();

        System.out.print("Boy (m): ");
        boy = input.nextDouble();

        vkindex = (kilo / (boy*boy));
        System.out.println("Vücut Kitle İndeksiniz: " + vkindex );

            if (vkindex < 24 && vkindex > 18 ){
            System.out.println("Sağlıklısınız :)");
            }
            else {
                System.out.println("Sağlıklı Değilsiniz.");
            }
    }
}