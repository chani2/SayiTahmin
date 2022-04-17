import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(20);
        System.out.println(number);
        Scanner input = new Scanner (System.in);
        int right = 0;
        int selected;
        boolean isWin = false;
        boolean isWrong = false;
        int[] wrong = new int[5];
        for ( int i = 0; i < 5; i++){
            System.out.println("Lutfen tahmini giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99){
                System.out.println("Lutfen 0-100 arasinda bir deger giriniz.");
                if(isWrong){
                    right++;
                    System.out.println("Cok fazla hatali giris yaptiniz. Kalan hak : " + (5 - right));

                }else {
                    isWrong = true;
                    System.out.println("Bir daha hatali girisinizde hakkinizdan silinecektir. ");
                }
                continue;
            }
            if (selected == number){
                System.out.println("Tebrikler dogru tahmin : Tahmin ettiginiz sayi : " + number );
                break;
            }else{
                wrong[right] = selected;
                right++;
                System.out.println("Hatali bir sai girdiniz : ");
                if (selected > number){
                    System.out.println(selected + "sayisi, gizli sayidan buyuktur");
                }else{
                    System.out.println(selected + "sayisi, gizli sayidan kucuktur");
                }
                System.out.println("Kalan hakki : " + (5 - right));
            }


        }
        if (!isWin){
            System.out.println("Kaybettiniz ! ");
            if(!isWrong){
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }







    }
}
