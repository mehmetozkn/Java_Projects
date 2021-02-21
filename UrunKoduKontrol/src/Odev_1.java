
import java.util.Scanner;

/**
 * @file Proje 1
 * @description Ürün Numarası Kontrol Etme
 * @assignment Odev_1
 * @date 19.11.2020
 * @author Mehmet Özkan mehmet.ozkan@stu.fsm.edu.tr
 */
public class Odev_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String islemler1 = "**********Urun Numarasi Kontrol Etme Uygulamasina Hosgeldiniz**********\n"
                + "Urun Numarasi Test Et (T) : \n"
                + "Cikis (C) : ";
        System.out.println(islemler1);
        while (true) {
            System.out.print("Secenek : ");
            String islem1 = scanner.nextLine();

            if (islem1.equals("C")) {
                System.out.println("Cikis Yapiyorsunuz...");
                break;
            } else if (islem1.equals("T")) {
                System.out.print("Urun Numarasi Giriniz : ");
                String urunNum = scanner.nextLine();

                int kontrol = kontrol(urunNum);
                while (true) {
                    if (kontrol == 0) {
                        break;
                    }
                    System.out.print("Urun Numarasi Giriniz : ");
                    urunNum = scanner.nextLine();
                    kontrol = kontrol(urunNum);
                }

                int sayi1 = 0, sayi2 = 0, sayi3 = 0, sayi4 = 0, j = 0, temp = 0, k = 1;
                for (int i = 0; i < urunNum.length(); i++) {
                    int a = cevir(urunNum.charAt(i));
                    temp = temp * 10;
                    temp += a;
                    j++;

                    if (j % 4 == 0) {
                        if (k == 1) {
                            sayi1 = temp;
                        } else if (k == 2) {
                            sayi2 = temp;
                        } else if (k == 3) {
                            sayi3 = temp;
                        } else {
                            sayi4 = temp;
                        }
                        k++;
                        temp = 0;
                        j = 0;
                        i++;
                    }
                }

                int yeniSayi1 = carp(sayi1);
                int yeniSayi2 = carp(sayi2);
                int yeniSayi3 = carp(sayi3);
                int yeniSayi4 = carp(sayi4);

                System.out.print("Digitlerin iki katinin hesaplanmis hali : ");

                if (sayi1 < 1000) {
                    System.out.print("0" + yeniSayi1);
                    System.out.print(" ");

                } else {
                    System.out.print(yeniSayi1);
                    System.out.print(" ");
                }
                if (sayi2 < 1000) {
                    System.out.print(" 0" + yeniSayi2);
                    System.out.print(" ");
                } else {
                    System.out.print(yeniSayi2);
                    System.out.print(" ");
                }
                if (sayi3 < 1000) {
                    System.out.print(" 0" + yeniSayi3);
                    System.out.print(" ");
                } else {
                    System.out.print(yeniSayi3);
                    System.out.print(" ");
                }
                if (sayi4 < 1000) {
                    System.out.print(" 0" + yeniSayi4);
                    System.out.print(" ");
                } else {
                    System.out.print(yeniSayi4);
                    System.out.print(" ");
                }
                System.out.println("");

                System.out.print("Diğitlerin toplami : ");

                int yeniSayiTop1 = topla(yeniSayi1);
                System.out.print("+");
                int yeniSayiTop2 = topla(yeniSayi2);
                System.out.print("+");
                int yeniSayiTop3 = topla(yeniSayi3);
                System.out.print("+");
                int yeniSayiTop4 = topla(yeniSayi4);

                int anaToplam = (yeniSayiTop1 + yeniSayiTop2 + yeniSayiTop3 + yeniSayiTop4);

                System.out.println(" = " + anaToplam);

                if (anaToplam % 10 == 0) {
                    System.out.println(anaToplam + " 10'a Tam Bolünmektedir.Girdiğiniz Urun Numarası Doğru");
                } else {
                    System.out.println(anaToplam + " sayisi 10'a tam bölünemediği için urun numarasi gecersizdir !");
                }
                String islemler2 = "Ana Menü icin (A)\n"
                        + "Cikis icin (C)";
                System.out.println(islemler2);
                System.out.print("Secenek : ");
                String islem2 = scanner.nextLine();
                if (islem2.equals("A")) {
                    continue;
                } else if (islem2.equals("C")) {
                    System.out.println("İyi Günler...");
                    break;
                } else {
                    System.out.println("Geçersiz Seçenek !!!");

                }
            } else {
                System.out.println("Geçersiz Seçenek !!!");
            }

        }
    }

    public static int kontrol(String b) {
        if (b.length() != 19) {
            return 1;
        } else {
            for (int i = 0; i < 19; i++) {
                char a = ' ';

                if (b.charAt(i) != '1' && b.charAt(i) != '2' && b.charAt(i) != '3' && b.charAt(i) != '4' && b.charAt(i) != '5' && b.charAt(i) != '6' && b.charAt(i) != '7' && b.charAt(i) != '8' && b.charAt(i) != '9' && b.charAt(i) != '0' && b.charAt(i) != a) {

                    return 1;

                }

            }
        }
        return 0;
    }

    public static int cevir(char a) {
        int b = a - '0';
        return b;
    }

    public static int carp(int sayi) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        a = sayi % 10;
        sayi = sayi / 10;
        b = sayi % 10;
        sayi = sayi / 10;
        c = sayi % 10;
        sayi = sayi / 10;
        d = sayi;

        sayi = 0;

        d = d * 2;
        b = b * 2;

        if (d >= 10) {
            d = d - 9;
        }
        if (b >= 10) {
            b = b - 9;
        }

        sayi = sayi * 10 + d;
        sayi = sayi * 10 + c;
        sayi = sayi * 10 + b;
        sayi = sayi * 10 + a;

        return sayi;

    }

    public static int topla(int sayi) {
        int temp = sayi;
        int sonuc = 0;
        int a = 0;
        while (temp > 0) { // 1234
            a = temp % 10;
            sonuc += a;
            if (temp >= 10) {
                System.out.print(a + "+");
            } else {
                System.out.print(a);
            }
            temp = temp / 10;

        }

        return sonuc;

    }
}
