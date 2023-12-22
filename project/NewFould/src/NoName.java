import java.util.Scanner;
public class NoName {
    public static void main(String[] args) {
        int f ,dongu = 0 , i, sonuc ,toplam = 0   ;

       Scanner inp = new Scanner(System.in);


        System.out.print ("Sayınızı Giriniz !!! : ");
        f = inp.nextInt();

        for (i = 0 ; i <= f ; ++i){
            if (i%3==0&&i%4==0){
                dongu++;
                toplam += i ;

            }


        }sonuc = toplam / dongu ;
        System.out.println("cevabınız  : "  +sonuc);



    }
}
