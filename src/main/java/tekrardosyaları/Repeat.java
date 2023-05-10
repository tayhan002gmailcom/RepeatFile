package tekrardosyaları;

public class Repeat {

    public static void main(String[] args) {

        //Örnek 1: Öğrenci ismi için variable oluşturup değer olarak Burak atayınız.
        //Note1: İsimler için non-primitive data type kullanılır. ve atanacak isim çit tırnak içinde yazılır.
        String nameOfStudent = "Burak";
        // Örnek 2: Bir ismin ilk harfi olarak bir variable oluşturunuz ve bir değer atayını.
        //Note2: Tek karekterli variable ler için kullanılır. atanacak karekter tek tırnak içinde yaılır.
        char firstLetterOfName = 'B';
        //Örnek 3: Zengin misin sorusu için bir variable  oluşturun ve false değerini atayın.
        //Note3: Eğer bir sorunun cevabı true veya false ise bu data kullanılır ve adlandırma is ile başlar.
        boolean isRich = false;
        //Örnek 4:Öğrenci yaşı için bir variable oluşturun ve değer atayın.
        //Note4: Eğer atanacak değer -128 ile 127 arasında ise byte kullanılır.
        byte ageOfStudent = 15;
        //Örnek 5: Site nüfusu için bir variable oluşturun ve değer atayınız.
        short populationOfVillage = 28000;
        //Örnek 6: Türkiyenin nufusu için bir variable oluştur ve değer atayınız
        int populationOfTurkey = 83000000;
        //Örnek 7: İnsan vücüdündaki hücre sayısı için variable oluştur ve bir değer ataması yapınız.
        long cellInHumanBody = 750000000000L;
        //Örnek 8: Gömlek ve ayyakkabı fiyatları için iki tane variable oluşturup bir değer atayınız.
        float shirtPrice = 15.95F;
        float shoesPrice = 17.99f;
        //Örnek 9: Hücre ağırlı ve Amip'in ağırlığı için bir variable oluştur ve değer ataması yap.
        double weightCell = 0.14532288;
        double weightAmip = 1.0000456;
        /*Not: Oluşturduğumu veriyi ekrana yazdırmak için
        System.out.println();
        komutu kullanılır. print in sonundaki ln sonraki satırdan başlamayı sağlar.
        Eğer konulmazsa aynı satırdan devam edilir.
         */
        //Örnek 10: Öğrenci notları için iki adet variable oluşturunuz ve toplamalarını ekrana yazdırınız.
        byte note1 = 63;
        byte note2 = 75;
        System.out.println(note1+note2);

        //Örnek1: Şehir için bir variable oluşturun ve önce Ankara sonrada İzmir değerlerini atayıp ekrana yazdırın.
        String cityName = "Ankara";
        System.out.println(cityName);
        cityName = "İzmir";
        System.out.println(cityName);
        cityName ="İstanbul";
        System.out.println(cityName);
        //Örnek2: Şehir plaka kodu için bir variable oluşturun önce 34 sonra da 35 değeri atayıp console yazdırın.
        String plakaKodu = "02";
        System.out.println(plakaKodu);
        plakaKodu = "72";
        System.out.println(plakaKodu);
        //Örnek3: Başarılımı sorusu için bir variable oluşturun ve önce false sonra da true atayıp console yazdırın
        boolean isSuccessful = false;
        System.out.println(isSuccessful);
        isSuccessful = true;
        System.out.println(isSuccessful);
        //Örnek4: Şehir telefon kodu için bir variable oluşturun önce 0416 sonra da 0488 değeri atayıp console yazdırın.
        String telefonKodu ="0416";
        System.out.println(telefonKodu);
        telefonKodu = "0488";
        System.out.println(telefonKodu);
        int sonuc = toplamaYap(7,36);
        System.out.println(sonuc);
        long multiplyResult = multiply(12,25);
        System.out.println(multiplyResult);
        System.out.println(firstTwoMultiplyAddThird(1.25,1.75,2.5));

    }
    //Örnek1: Toplama işlemi yapan bir method oluşturun ve kullanınız
    public static int toplamaYap(int a,int b){
        return a+b;
    }
    //Örnek2:2 sayıyı çarpma işlemi yapan bir method oluşturun ve kullanınız.
    protected static long multiply(int a,int b){
        return a*b;
    }
    //Örnek3: Verilen 3 sayıdan ilk ikisini çarpan ve üçüncü sayı ile sonucu toplayan methodu oluşturunuz ve kullanınız.
    private static double firstTwoMultiplyAddThird(double a, double b, double c){
        return a*b+c;
    }

}
