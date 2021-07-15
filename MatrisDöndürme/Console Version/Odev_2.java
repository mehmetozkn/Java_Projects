
import java.util.Scanner;

/**
 * @file Proje 2
 * @description Matrisi İstenilen Yön ve Sayıda Döndürme
 * @assignment Odev_2
 * @date 17.12.2020
 * @author Mehmet Özkan mehmet.ozkan@stu.fsm.edu.tr
 */
public class Odev_2 {

    public static int[][] createMatrix(int[] p_array, int satir, int sutun) { // Döndürülecek Matrisi Olusturan Metod.
        int[][] matrix = new int[p_array[0]][p_array[1]];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                matrix[i][j] = (int) (Math.random() * p_array[3]);
            }
        }

        return matrix;
    }

    public static void myPrint(int[][] p_matris, int satir, int sutun) { // Döndürülecek Matrisi Yaziıran Metod.
        System.out.println("");
        System.out.println("******** Döndürülecek Matris ********");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(p_matris[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("************************************");
        System.out.println("");

    }

    public static void yazdir(int[][] p_dizi, int satir, int sutun) { // Döndürülmüş Matrisi Yazdiran Metod.

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(p_dizi[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("************************************");
    }

    public static void dondur(int[][] p_dizi, int satir, int sutun, int kacKere) { // Matrısı Istenilen Yon ve Sayıda Donduren Metod.
        System.out.println("******** Döndürülmüş Matris ********");
        if (kacKere < 0) { // Direction'a -1 Girilmis Ise Dondurulme Adediyle -1'i Carpar ve Bu Bloga Girer.
            for (int i = 0; i > kacKere; i--) {
                y_dondur(p_dizi, satir, sutun, 1);
            }
        } else { // Direction'a 1 Girilmis Ise Dondurulme Adediyle 1'i Carpar ve Bu Bloga Girer.
            for (int i = 0; i > (kacKere * -1); i--) {
                y_dondur(p_dizi, satir, sutun, -1);
            }
        }
    }

    public static void y_dondur(int[][] p_dizi, int satir, int sutun, int direction) { // Matrisi Istenilen Yonde 1 Kere Döndüren Metod.

        int[][] dizi = new int[satir][sutun];
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                dizi[i][j] = p_dizi[i][j];
            }
        }

        if (direction == 1) {
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    // Ortadaysa devam eder.
                    if (i != 0 && i != satir - 1) {
                        if (j != 0 && j != sutun - 1) {
                            continue;
                        }
                    }

                    if (i == 0 && j != sutun - 1) {
                        dizi[i][j + 1] = p_dizi[i][j];
                    } else if (i != satir - 1 && j == sutun - 1) {
                        dizi[i + 1][j] = p_dizi[i][j];
                    } else if (i == satir - 1 && j != 0) {
                        dizi[i][j - 1] = p_dizi[i][j];
                    } else {
                        dizi[i - 1][j] = p_dizi[i][j];
                    }

                }
            }
        } else {
            for (int i = 0; i < satir; i++) {
                for (int j = 0; j < sutun; j++) {
                    //Ortadaysa devam eder.
                    if (i != 0 && i != satir - 1) {
                        if (j != 0 && j != sutun - 1) {
                            continue;
                        }
                    }

                    if (i == 0 && j != 0) {
                        dizi[i][j - 1] = p_dizi[i][j];
                    } else if (j == 0 && i != satir - 1) {
                        dizi[i + 1][j] = p_dizi[i][j];
                    } else if (i == satir - 1 && j != sutun - 1) {
                        dizi[i][j + 1] = p_dizi[i][j];
                    } else {
                        dizi[i - 1][j] = p_dizi[i][j];
                    }
                }
            }
        }

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                p_dizi[i][j] = dizi[i][j];
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {5, 5, -1, 100, 2};
        int[][] matrix;
        matrix = createMatrix(array, array[0], array[1]);

        String islemler = "1.Uygulamayı Calistir\n"
                + "2.Matris Olustur\n"
                + "3.Direction\n"
                + "4.Step Number\n"
                + "5.Exit";

        System.out.println(islemler);
        int islem;
        while (true) {
            System.out.print("Islem : ");
            if (sc.hasNextInt()) { // Islem Sayi Ise Bu Bloga Girer.
                islem = sc.nextInt();
                if (islem < 0 || islem > 5) { // Islemin Menu'deki Sayiların Disina Cıkmamasını Saglar.
                    System.out.println("Geçersiz İşlem Numarası !!! Ana Menüye Yönlendiriliyorsunuz...");
                    continue;
                }
                if (islem == 1) { // Islem 1 ise Bu Bloga Girer.
                    if (array[0] == 0 || array[1] == 0) {
                        System.out.println("Henüz Bir Matris Oluşturmadınız ! Ana Menüye Yönlendiriliyorsunuz.");
                        continue;
                    }
                    if (array[0] == 1 || array[1] == 1) { // Matrisin Satır ve Sutun Sayisi 0 Olamayacagigından Bunu Kontrol Eder.
                        System.out.println("Matris 1 Satırdan Veya 1 Sutundan OLuşamaz ! Ana Menüye Yönlendiriliyorsunuz.");
                        continue;
                    } else { // Matrisin Satir Ve Sutun Sayisi Uygun Ise Bu Bloga Girer.
                        String b = "["; // Olusturulan Arrayi Guzel Bir Format Haline Getirir.
                        for (int i = 0; i < array.length; i++) {
                            b += array[i] + (i < array.length - 1 ? ", " : "]"); // Olusturulan Arrayi Guzel Bir Format Haline Getirir.
                        }
                        System.out.println("Array = " + b); // Olusturulan Arrayi Gösterir.
                        myPrint(matrix, array[0], array[1]);// Döndürülecek Matrisi Yazdırır.
                        dondur(matrix, array[0], array[1], (array[2] * array[4])); // Matrisi Döndürür.
                        yazdir(matrix, array[0], array[1]); // Döndürülmüs Matrisi Yazdirir.
                        System.out.println("");
                        sc.nextLine();
                    }

                }
                if (islem == 2) {
                    System.out.print("Row Size Of The Matrix : "); // Matrisin Satir Boyutu.
                    if (sc.hasNextInt()) { // Array[0] Bir Sayi Ise Bu Bloga Girer.
                        array[0] = sc.nextInt();
                        if (array[0] <= 0) { // Matrisin Satir Boyutu 0 ve 0'dan Kucuk Olamaz.
                            System.out.println("Hatalı Giriş ! Ana Menuye Yonlendiriliyorsunuz.");
                            continue;
                        }
                    } else { // Array[0] Bir Sayi Degilse Bu Bloga Girer.
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("Hatalı Giriş ! Ana Menüye Yönlendiriliyorsunuz.");
                        continue;

                    }

                    System.out.print("Column Size Of The Matrix : "); // Matrisin Sutun Boyutu.
                    if (sc.hasNextInt()) { // Array[1] Bir Sayi Ise Bu Bloga Girer.
                        array[1] = sc.nextInt();
                        if (array[1] <= 0) { // Matrisin Sutun Boyutu 0 ve 0'dan Kucuk Olamaz.
                            sc.nextLine();
                            System.out.println("Hatalı Giriş ! Ana Menuye Yonlendiriliyorsunuz.");
                            continue;

                        }
                    } else { // Array[1] Bir Sayi Degilse Bu Bloga Girer.
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("Hatalı Giriş ! Ana Menüye Yönlendiriliyorsunuz.");
                        continue;
                    }

                    System.out.print("Matris elemanlarının 0 ile kaç değerleri arası : ");
                    if (sc.hasNextInt()) {  // Array[3] Bir Sayi Ise Bu Bloga Girer.
                        array[3] = sc.nextInt();
                    } else { // Array[3] Bir Sayi Degilse Bu Bloga Girer.
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("Hatalı Giriş ! Ana Menuye Yonlendiriliyorsunuz.");
                        continue;
                    }
                    if (array[4] == 2) { // Kullanıcı Baslangictaki Matris Ozelliklerinin Sadece Satir Sutun ve Sayi Araligini 
                        // Degistirmek İsteyip Digerlerini Aynı Bırakmak Isterse Istedigi Sekilde Matris Olusturabilmek Icin.
                        matrix = createMatrix(array, array[0], array[1]);
                    }

                }

                if (islem == 3) {
                    System.out.print("Direction (-1, 1) : "); // Saat Yonu icin -1, Saatin Ters Yonu icin 1.
                    if (sc.hasNextInt()) {  // Array[2] Bir Sayi Ise Bu Bloga Girer.
                        array[2] = sc.nextInt();
                        if (array[2] != -1 && array[2] != 1) { // Direction'ın -1 ve 1 den Baska Bir Sayı Olmaması Icın.
                            System.out.println("Hatalı Giriş !!! Ana Menuye Yonlendiriliyorsunuz.");
                            continue;
                        }
                    } else { // Array[2] Bir Sayi Degilse Bu Bloga Girer.
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("Hatali Giriş ! Ana Menüye Yönlendiriliyorsunuz.");
                        continue;
                    }

                }
                if (islem == 4) {
                    System.out.print("Step Number : "); // Oluşturulan Matrisin Döndürülme Adedi.
                    if (sc.hasNextInt()) { // Array[4] Bir Sayi Ise Bu Bloga Girer.
                        array[4] = sc.nextInt();
                        if (array[4] < 0) { // Matrisin Kac Kere Dondurulecegi 0'dan Kucuk Olamaz.
                            System.out.println("Hatalı Giriş !!! Ana Menuye Yonlendiriliyorsunuz...");
                            continue;
                        } else {

                            matrix = createMatrix(array, array[0], array[1]);
                        }
                    } else { // Array[4] Bir Sayi Degilse Bu Bloga Girer.
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("Hatalı Giriş !!! Ana Menuye Yonlendiriliyorsunuz...");
                        continue;
                    }

                }
                if (islem == 5) { // Islem = 5 Ise Program Sonlanır.
                    System.out.println("Çıkış Yapiyorsunuz...");
                    break; // Islem  = 5 Oldugu Icın Dongu Biter Program Sonlanır.
                }

            } else { // Islem Sayi Degilse Bu Bloga Girer. 
                sc.nextLine();
                System.out.println("Hatalı Giriş ! Ana Menüye Yönlendiriliyorsunuz.");
                System.out.println("");
                continue;

            }

        }
    }
}
