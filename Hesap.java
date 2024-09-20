import java.util.Scanner;

public class Hesap {

    public static void main(String[] args) {
        
        //DEĞİŞKENLERİMİZİ TANIMLADIK

        int num1,num2,select,top=1,çıkartma=2,çarpma=3,bölme=4;

        Scanner inp =new Scanner(System.in);
        //KULLANICIYA ÇIKTI VERDİK

            System.out.print("İLK SAYIYI GİRİNİZ:");
            num1= inp.nextInt();
            System.out.print("İKİNCİ SAYIYI GİRİNİZ:");
            num2= inp.nextInt();
            System.out.println("1-TOPLAMA \n 2-ÇIKARMA \n 3-ÇARPMA \n 4-BÖLME\n" );
            System.out.print("SEÇİNİZ:");
                select= inp.nextInt();
         //SWİTCH KODUYLA KOŞULUMUZU SAĞLADIK
                switch (select){
                    case 1 :
                        System.out.print("SONUÇ :"+(num1+num2));
                        break;

                    case  2 :
                        System.out.print("SONUÇ"+(num1-num2));
                        break;

                    case  3 :
                        System.out.print("SONUÇ:"+(num1*num2));
                        break;

                    case 4 :
                        System.out.print("SONUÇ:"+num1/num2);
                        break;

                    default:
                        System.out.print("HATALI GİRİŞ YAPTINIZ LÜTFEN TEKRAR DENENEYİNİZ");
                }




    }
}
