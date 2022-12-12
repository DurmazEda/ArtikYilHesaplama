import java.util.Scanner;

public class artikYilHesaplama {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);
        System.out.printf("Lütfen yıl giriniz:");
        yil = input.nextInt();

        if(yil % 100 ==0){
            if(yil % 400 ==0){
                System.out.println(yil + "Bir Artık Yıldır!");

            }else{
                System.out.println(yil + "Bir Artık Yıl Değildir!!");
            }
        }else if(yil % 4 == 0){
            System.out.println(yil+ "Bir Artık Yıldır!");
        }
        else{
            System.out.println(yil + "Bir Artık Yıl Değildir!!");
        }


    }
}
