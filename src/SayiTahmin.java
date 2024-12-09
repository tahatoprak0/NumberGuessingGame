import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();
        int number = randomNumber.nextInt(100);
        int right = 5;
        System.out.println(number);
        int wrong[] = new int[5];

        while (right > 0) {
            System.out.print("Sayıyı Tahmin Edin: ");
            int select = input.nextInt();
            if (select < 0 || select > 100) {
                System.out.println("Girdiğiniz sayı 0 ile 100 arasında olmalı");
                right--;
                wrong[right] = select;
                System.out.println("Kalan hakkınız: " + right);
            } else if (select < number) {
                System.out.println(select + " gizli sayıdan küçük");
                right--;
                wrong[right] = select;
                System.out.println("kalan hakkınız: " + right);
            } else if (select > number) {
                System.out.println(select + " gizli sayıdan büyük");
                right--;
                wrong[right] = select;
                System.out.println("kalan hakkınız: " + right);
            } else {
                System.out.println("Tebrikler Gizli Numarayı Buldunuz");
                System.out.println("Yaptığınız tahminler");
                System.out.print("[");
                for (int i=0 ; i< wrong.length; i++){
                    if (wrong[i]==0){
                        continue;
                    }
                    System.out.print(wrong[i]+", ");
                }
                System.out.println("]");

                break;
            }
        }
        if (right == 0) {
            System.out.println("KAYBETTİNİZ");
            System.out.println(Arrays.toString(wrong));
        }
    }
}