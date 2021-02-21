
import java.util.Scanner;

/**
 * @file Proje 3
 * @description Sosyal Medya
 * @assignment Odev_3
 * @date 29.01.2021
 * @author Mehmet Özkan mehmet.ozkan@stu.fsm.edu.tr
 */
public class Test {

    public static Kullanici[] kullaniciListesi = new Kullanici[1000];
    public static Paylasim[] paylasimListesi = new Paylasim[1000];
    public static int yorum_idler = 1;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Premium_Kullanici p1 = new Premium_Kullanici("Mehmet", 10);
        Premium_Kullanici p2 = new Premium_Kullanici("Osman", 11);
        Premium_Kullanici p3 = new Premium_Kullanici("Berk", 12);
        Premium_Kullanici p4 = new Premium_Kullanici("Ali", 13);
        Premium_Kullanici p5 = new Premium_Kullanici("Yusuf", 14);

        Standart_Kullanici s1 = new Standart_Kullanici("Murat", 15);
        Standart_Kullanici s2 = new Standart_Kullanici("Enes", 16);
        Standart_Kullanici s3 = new Standart_Kullanici("Burak", 17);
        Standart_Kullanici s4 = new Standart_Kullanici("Ahmet", 18);
        Standart_Kullanici s5 = new Standart_Kullanici("Gökhan", 19);

        System.out.println("**** SOSYAL MEDYA UYGULAMASİNA HOSGELDİNİZ ****");
        String islemler = "-1.Cikis Yap\n"
                + "0.Şuan Hangi Hesaptayım\n"
                + "1.Hesap Degistir.\n"
                + "2.Arkadas Ekle.\n"
                + "3.Arkadas Sil.\n"
                + "4.Arkadas Listele.\n"
                + "5.Paylasim Yap\n"
                + "6.Paylasim Sil\n"
                + "7.Paylasimlarimi Listele\n"
                + "8.Paylasim Guncelle\n"
                + "9.Paylasim Begen\n"
                + "10.En Cok Begenilen Paylasim Bilgileri\n"
                + "11.En Az Begenilen Paylasim Bilgileri\n"
                + "12.En Cok Yorum Yapilan Paylasim\n"
                + "13.En Az Yorum Yapilan Paylasim\n"
                + "14.Yorum Yap\n"
                + "15.Yorum Sil\n"
                + "16.Yorum Listele\n"
                + "17.Ozel Mesaj Yolla\n"
                + "18.Ozel Mesaj Listele\n"
                + "19.11 Haneli Telefon Numarası Yapilan Paylasim\n"
                + "20.Arkadasinin Paylasimlarini Gor";

        System.out.println(islemler);
        int islem;
        int paylasim_idler = 1;

        Kullanici hesap = p1;
        while (true) {
            boolean kullaniciVarMi = false;
            System.out.print("Islem : ");
            if (sc.hasNextInt()) { // Islem sayi ise bu bloga girer.
                islem = sc.nextInt();
                if (islem < -2 || islem > 21) {
                    System.out.println("Gecerli Bir Islem Numarası Giriniz");
                }
                if (islem == 1) { // Hesap Degitir.
                    System.out.print("Geçmek Istediginiz Hesap Id : ");
                    if (sc.hasNextInt()) { // Id sayi ise bu bloga girer.
                        int gecilecek_id = sc.nextInt();
                        for (int i = 0; i < Test.kullaniciListesi.length; i++) {
                            if (Test.kullaniciListesi[i] != null) {
                                if (gecilecek_id == Test.kullaniciListesi[i].getKullaniciId()) {
                                    hesap = Test.kullaniciListesi[i];
                                    System.out.println(Test.kullaniciListesi[i].getKullaniciId() + " Id'li " + Test.kullaniciListesi[i].getKullaniciAdi() + " Hesabına Gecildi.");
                                    kullaniciVarMi = true;
                                    continue;
                                }
                            }
                        }
                        if (!kullaniciVarMi) {
                            System.out.println("Boyle Bir Kullanici Yok !");
                        }
                    } else { // Id sayi degilse bu bloga girer.
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("Hatalı Giriş ! Ana Menüye Yönlendiriliyorsunuz.");
                        System.out.println("");
                        continue;
                    }

                }
                if (islem == 2) { // Arkadas Ekle.
                    boolean arkVarMi = false;
                    System.out.print("Eklemek Istediginiz Kullanici Id : ");
                    if (sc.hasNextInt()) { // Id sayi ise bu bloga girer.
                        int eklenecek_id = sc.nextInt();
                        int onay_red;
                        for (int i = 0; i < Test.kullaniciListesi.length; i++) {
                            if (Test.kullaniciListesi[i] != null) {
                                if (eklenecek_id == Test.kullaniciListesi[i].getKullaniciId()) {
                                    System.out.print(hesap.getKullaniciAdi() + "'in Arkadaslik Istegini Kabul Edilsin Mi ? (Onay icin 1, Red icin 0)  : ");
                                    arkVarMi = true;
                                    sc.nextLine();
                                    if (sc.hasNextInt()) { // onay_red sayi ise bu bloga girer.
                                        onay_red = sc.nextInt();
                                        hesap.arkadasEkle(Test.kullaniciListesi[i], onay_red);
                                        continue;
                                    } else {
                                        System.out.println("Hatalı Giris ! (Onay icin 1, Red icin 0)");
                                        sc.nextLine();
                                    }

                                }
                            }

                        }
                    } else { // Id sayi değilse bu bloga girer.
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("Hatalı Giriş ! Ana Menüye Yönlendiriliyorsunuz.");
                        System.out.println("");
                        continue;
                    }
                    if (!arkVarMi) {
                        System.out.println("Böyle Bir Kullanici Yok.");
                    }

                }
                if (islem == 3) { // Arkadas Sil.
                    System.out.print("Silmek Istediginiz Kullanici Id : ");
                    if (sc.hasNextInt()) { // Id sayi ise bu bloga girer.
                        int silinecek_id = sc.nextInt();
                        boolean arkVarMi = false;
                        if (hesap instanceof Premium_Kullanici) {
                            for (int i = 0; i < ((Premium_Kullanici) hesap).getPArkadasListesi().length; i++) {
                                if (((Premium_Kullanici) hesap).getPArkadasListesi()[i] != null) {
                                    if (silinecek_id == ((Premium_Kullanici) hesap).getPArkadasListesi()[i].getKullaniciId()) {
                                        ((Premium_Kullanici) hesap).arkadasSil(((Premium_Kullanici) hesap).getPArkadasListesi()[i]);
                                        arkVarMi = true;
                                        continue;
                                    }
                                }
                            }
                        }
                        if (hesap instanceof Standart_Kullanici) {
                            for (int i = 0; i < ((Standart_Kullanici) hesap).getsArkadasListesi().length; i++) {
                                if (((Standart_Kullanici) hesap).getsArkadasListesi()[i] != null) {
                                    if (silinecek_id == ((Standart_Kullanici) hesap).getsArkadasListesi()[i].getKullaniciId()) {
                                        ((Standart_Kullanici) hesap).arkadasSil(((Standart_Kullanici) hesap).getsArkadasListesi()[i]);
                                        arkVarMi = true;
                                        continue;
                                    }
                                }
                            }
                        }
                        if (!arkVarMi) {
                            System.out.println("Boyle Bir Arkadas Bulunamadi.");
                        }

                    } else { // Id sayi degilse bu bloga girer.
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("Hatalı Giriş ! Ana Menüye Yönlendiriliyorsunuz.");
                        System.out.println("");
                        continue;
                    }

                }
                if (islem == 4) { // Arkadas Listele.
                    System.out.print("Listesini Goruntulemek Istediginiz Kullanici Id : ");
                    if (sc.hasNextInt()) { // Id sayi ise bu bloga girer.
                        int listelenecek_id = sc.nextInt();
                        boolean bulunduMu = false;
                        for (int i = 0; i < Test.kullaniciListesi.length; i++) {
                            if (Test.kullaniciListesi[i] != null) {
                                if (listelenecek_id == Test.kullaniciListesi[i].getKullaniciId()) {
                                    Test.kullaniciListesi[i].arkadasListesiGoruntule();
                                    bulunduMu = true;
                                }
                            }

                        }
                        if (!bulunduMu) { // Listesi goruntulenmek istenen kullanici yoksa bu bloga girer.
                            System.out.println("Boyle Biri Yok !");
                        }
                    } else { // Id sayi degilse bu bloga girer.
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("Hatalı Giriş ! Ana Menüye Yönlendiriliyorsunuz.");
                        System.out.println("");
                        continue;
                    }

                }
                if (islem == 5) { // Paylasim Yap.
                    System.out.print("Paylasim : ");
                    sc.nextLine();
                    String p = sc.nextLine();
                    Paylasim pa1 = new Paylasim(p, paylasim_idler);
                    if (hesap instanceof Premium_Kullanici) {
                        ((Premium_Kullanici) hesap).paylasimYap(pa1);
                    }
                    if (hesap instanceof Standart_Kullanici) {
                        ((Standart_Kullanici) hesap).paylasimYap(pa1);
                    }
                    paylasim_idler++;

                }
                if (islem == 6) { // Paylasim Sil.
                    boolean paylasimVarMi = false;
                    System.out.print("Silmek Istediginiz Paylasim Id : ");
                    if (sc.hasNextInt()) { // Id sayi ise bu bloga girer.
                        int silinecek_id = sc.nextInt();
                        if (hesap instanceof Premium_Kullanici) {
                            for (int i = 0; i < ((Premium_Kullanici) hesap).getP_paylasimListesi().length; i++) {
                                if (((Premium_Kullanici) hesap).getP_paylasimListesi()[i] != null) {
                                    if (((Premium_Kullanici) hesap).getP_paylasimListesi()[i].getPaylasimId() == silinecek_id) {
                                        ((Premium_Kullanici) hesap).paylasimSil(((Premium_Kullanici) hesap).getP_paylasimListesi()[i]);
                                        paylasimVarMi = true;
                                    }
                                }

                            }
                        }
                        if (hesap instanceof Standart_Kullanici) {
                            for (int i = 0; i < ((Standart_Kullanici) hesap).getS_paylasimListesi().length; i++) {
                                if (((Standart_Kullanici) hesap).getS_paylasimListesi()[i] != null) {
                                    if (((Standart_Kullanici) hesap).getS_paylasimListesi()[i].getPaylasimId() == silinecek_id) {
                                        ((Standart_Kullanici) hesap).paylasimSil(((Standart_Kullanici) hesap).getS_paylasimListesi()[i]);
                                        paylasimVarMi = true;
                                    }
                                }
                            }

                        }
                        if (!paylasimVarMi) {
                            System.out.println("Böyle Bir Paylasim Yok!");
                        }
                    } else { // Id sayi degilse bu bloga girer.
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("Hatalı Giriş ! Ana Menüye Yönlendiriliyorsunuz.");
                        System.out.println("");
                        continue;
                    }

                }
                if (islem == 7) { // Paylasimlarimi Listele.
                    if (hesap instanceof Premium_Kullanici) {
                        ((Premium_Kullanici) hesap).paylasimListele();

                    }
                    if (hesap instanceof Standart_Kullanici) {
                        ((Standart_Kullanici) hesap).paylasimListele();

                    }

                }
                if (islem == 8) { // Paylasim Guncelle.
                    System.out.print("Guncellemek Istediginiz Paylasim Id : ");
                    if (sc.hasNextInt()) { // Id sayi ise bu bloga girer.
                        int guncellenecek_paylasim_id = sc.nextInt();
                        boolean paylasimVarMi = false;
                        if (hesap instanceof Premium_Kullanici) {
                            for (int i = 0; i < ((Premium_Kullanici) hesap).getP_paylasimListesi().length; i++) {
                                if (((Premium_Kullanici) hesap).getP_paylasimListesi()[i] != null) {
                                    if (((Premium_Kullanici) hesap).getP_paylasimListesi()[i].getPaylasimId() == guncellenecek_paylasim_id) {
                                        System.out.print("Yeni Paylasim : ");
                                        sc.nextLine();
                                        String yeni_paylasim = sc.nextLine();
                                        ((Premium_Kullanici) hesap).paylasimGuncelle(guncellenecek_paylasim_id, yeni_paylasim);
                                        paylasimVarMi = true;
                                    }
                                }

                            }
                        }
                        if (hesap instanceof Standart_Kullanici) {
                            for (int i = 0; i < ((Standart_Kullanici) hesap).getS_paylasimListesi().length; i++) {
                                if (((Standart_Kullanici) hesap).getS_paylasimListesi()[i] != null) {
                                    if (((Standart_Kullanici) hesap).getS_paylasimListesi()[i].getPaylasimId() == guncellenecek_paylasim_id) {
                                        System.out.print("Yeni Paylasim : ");
                                        String yeni_paylasim = sc.next();
                                        ((Standart_Kullanici) hesap).paylasimGuncelle(guncellenecek_paylasim_id, yeni_paylasim);
                                        paylasimVarMi = true;
                                    }
                                }

                            }
                        }
                        if (!paylasimVarMi) {
                            System.out.println("Böyle Bir Paylasim Yok!");
                        }
                    } else { // Id sayi degilse bu bloga girer.
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("Hatalı Giriş ! Ana Menüye Yönlendiriliyorsunuz.");
                        System.out.println("");
                        continue;
                    }

                }
                if (islem == 9) { // Paylasim Begen.
                    System.out.print("Begenilecek Paylasim Id : ");
                    if (sc.hasNextInt()) { // Id sayi ise bu bloga girer.
                        int begenilecek_paylasim_id = sc.nextInt();
                        boolean paylasimVarMi = false;
                        if (hesap instanceof Premium_Kullanici) {
                            for (int i = 0; i < Test.paylasimListesi.length; i++) {
                                if (Test.paylasimListesi[i] != null) {
                                    if (Test.paylasimListesi[i].getPaylasimId() == begenilecek_paylasim_id) {
                                        ((Premium_Kullanici) hesap).paylasimiBegen(Test.paylasimListesi[i]);
                                        paylasimVarMi = true;
                                    }
                                }

                            }
                        }
                        if (hesap instanceof Standart_Kullanici) {
                            for (int i = 0; i < Test.paylasimListesi.length; i++) {
                                if (Test.paylasimListesi[i] != null) {
                                    if (Test.paylasimListesi[i].getPaylasimId() == begenilecek_paylasim_id) {
                                        ((Standart_Kullanici) hesap).paylasimiBegen(Test.paylasimListesi[i]);
                                        paylasimVarMi = true;
                                    }
                                }

                            }

                        }
                        if (!paylasimVarMi) {
                            System.out.println("Boyle Bir Paylasim Yok.");
                        }
                    } else { // Id sayi degilse bu bloga girer.
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("Hatalı Giriş ! Ana Menüye Yönlendiriliyorsunuz.");
                        System.out.println("");
                        continue;
                    }

                }
                if (islem == 10) { // En Cok Begenilen Paylasim.
                    if (hesap instanceof Premium_Kullanici) {
                        ((Premium_Kullanici) hesap).enCokBegenilenPaylasim();

                    }
                    if (hesap instanceof Standart_Kullanici) {
                        ((Standart_Kullanici) hesap).enCokBegenilenPaylasim();
                    }
                }

                if (islem == 11) { // En Az Begenilen Paylasim.
                    if (hesap instanceof Premium_Kullanici) {
                        ((Premium_Kullanici) hesap).enAzBegenilenPaylasim();

                    }
                    if (hesap instanceof Standart_Kullanici) {
                        ((Standart_Kullanici) hesap).enAzBegenilenPaylasim();

                    }
                }

                if (islem == 12) { // En Cok Yorum Yapilan Paylasim 
                    if (hesap instanceof Premium_Kullanici) {
                        ((Premium_Kullanici) hesap).enCokYorumYapilanPaylasim();

                    }
                    if (hesap instanceof Standart_Kullanici) {
                        ((Standart_Kullanici) hesap).enCokYorumYapilanPaylasim();
                    }
                }
                if (islem == 13) { // En Az Yorum Yapilan Paylasim.
                    if (hesap instanceof Premium_Kullanici) {
                        ((Premium_Kullanici) hesap).enAzYorumYapilanPaylasim();

                    }
                    if (hesap instanceof Standart_Kullanici) {
                        ((Standart_Kullanici) hesap).enAzYorumYapilanPaylasim();
                    }
                }
                if (islem == 14) { // Yorum Yap.
                    System.out.print("Yorum Yapilacak Paylasim Id : ");
                    if (sc.hasNextInt()) { // Id sayi ise bu bloga girer.
                        int yorum_yapilacak_paylasim_id = sc.nextInt();
                        boolean paylasimVarMi = false;
                        if (hesap instanceof Premium_Kullanici) {
                            for (int i = 0; i < Test.paylasimListesi.length; i++) {
                                if (Test.paylasimListesi[i] != null) {
                                    if (Test.paylasimListesi[i].getPaylasimId() == yorum_yapilacak_paylasim_id) {
                                        System.out.print("Yorum : ");
                                        sc.nextLine();
                                        String yorum = sc.nextLine();
                                        Yorum yo = new Yorum(yorum, yorum_idler);
                                        ((Premium_Kullanici) hesap).yorumYap(Test.paylasimListesi[i], yo);
                                        paylasimVarMi = true;
                                        continue;
                                    }
                                }
                            }
                        }
                        if (hesap instanceof Standart_Kullanici) {
                            for (int i = 0; i < Test.paylasimListesi.length; i++) {
                                if (Test.paylasimListesi[i] != null) {
                                    if (Test.paylasimListesi[i].getPaylasimId() == yorum_yapilacak_paylasim_id) {
                                        System.out.print("Yorum : ");
                                        String yorum = sc.next();
                                        Yorum yo = new Yorum(yorum, yorum_idler);
                                        ((Standart_Kullanici) hesap).yorumYap(Test.paylasimListesi[i], yo);
                                        sc.nextLine();
                                        paylasimVarMi = true;
                                        continue;
                                    }
                                }
                            }
                        }
                        if (!paylasimVarMi) {
                            System.out.println("Böyle Bir Paylasim Yok!");
                            continue;
                        }
                    } else { // Id sayi degilse bu bloga girer.
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("Hatalı Giriş ! Ana Menüye Yönlendiriliyorsunuz.");
                        System.out.println("");
                        continue;
                    }

                }
                if (islem == 15) { // Yorum Sil.
                    System.out.print("Yorum Silinecek Paylasim Id : ");
                    if (sc.hasNextInt()) { // Id sayi ise bu bloga girer.
                        int silinecek_yorumun_paylasim_id = sc.nextInt();
                        boolean paylasimVarMi = false;
                        if (hesap instanceof Premium_Kullanici) {
                            for (int i = 0; i < ((Premium_Kullanici) hesap).getP_paylasimListesi().length; i++) {
                                if (((Premium_Kullanici) hesap).getP_paylasimListesi()[i] != null) {
                                    if (((Premium_Kullanici) hesap).getP_paylasimListesi()[i].getPaylasimId() == silinecek_yorumun_paylasim_id) {
                                        for (int j = 0; j < ((Premium_Kullanici) hesap).getP_paylasimListesi()[i].getYorumListesi().length; j++) {
                                            paylasimVarMi = true;
                                            if (((Premium_Kullanici) hesap).getP_paylasimListesi()[i].getYorumListesi()[j] != null) {
                                                System.out.print("Silinecek Yorum Id : ");
                                                if (sc.hasNextInt()) { // Id sayi ise bu bloga girer.
                                                    int silinecek_yorum_id = sc.nextInt();
                                                    if (((Premium_Kullanici) hesap).getP_paylasimListesi()[i].getYorumListesi()[j].getYorumId() == silinecek_yorum_id) {
                                                        ((Premium_Kullanici) hesap).yorumSil(((Premium_Kullanici) hesap).getP_paylasimListesi()[i], ((Premium_Kullanici) hesap).getP_paylasimListesi()[i].getYorumListesi()[j]);

                                                    }
                                                } else { // Id sayi degilse bu bloga girer.
                                                    sc.nextLine();
                                                    sc.nextLine();
                                                    System.out.println("Hatalı Giriş ! Ana Menüye Yönlendiriliyorsunuz.");
                                                    System.out.println("");
                                                    continue;
                                                }

                                            }
                                        }
                                    }

                                }

                            }

                        }
                        if (hesap instanceof Standart_Kullanici) {
                            for (int i = 0; i < ((Standart_Kullanici) hesap).getS_paylasimListesi().length; i++) {
                                if (((Standart_Kullanici) hesap).getS_paylasimListesi()[i] != null) {
                                    if (((Standart_Kullanici) hesap).getS_paylasimListesi()[i].getPaylasimId() == silinecek_yorumun_paylasim_id) {
                                        for (int j = 0; j < ((Standart_Kullanici) hesap).getS_paylasimListesi()[i].getYorumListesi().length; j++) {
                                            paylasimVarMi = true;
                                            if (((Standart_Kullanici) hesap).getS_paylasimListesi()[i].getYorumListesi()[j] != null) {
                                                System.out.print("Silinecek Yorum Id : ");
                                                if (sc.hasNextInt()) { // Id sayi ise bu bloga girer.
                                                    int silinecek_yorum_id = sc.nextInt();
                                                    if (((Standart_Kullanici) hesap).getS_paylasimListesi()[i].getYorumListesi()[j].getYorumId() == silinecek_yorum_id) {

                                                        ((Standart_Kullanici) hesap).yorumSil(((Standart_Kullanici) hesap).getS_paylasimListesi()[i], ((Standart_Kullanici) hesap).getS_paylasimListesi()[i].getYorumListesi()[j]);

                                                    }
                                                } else { // Id sayi degilse bu bloga girer.
                                                    sc.nextLine();
                                                    sc.nextLine();
                                                    System.out.println("Hatalı Giriş ! Ana Menüye Yönlendiriliyorsunuz.");
                                                    System.out.println("");
                                                    continue;
                                                }

                                            }
                                        }
                                    }

                                }

                            }

                        }
                        if (!paylasimVarMi) {
                            System.out.println("Boyle Bir Paylasim Yok!");
                            continue;
                        }

                    } else { // Id sayi degilse bu bloga girer.
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("Hatalı Giriş ! Ana Menüye Yönlendiriliyorsunuz.");
                        System.out.println("");
                        continue;
                    }

                }
                if (islem == 16) { // Yorum Listele.
                    System.out.print("Yorumlari Listelenecek Paylasim Id : ");
                    if (sc.hasNextInt()) { // Id sayi ise bu bloga girer.
                        int yorumlari_listelenecek_paylasim_id = sc.nextInt();
                        boolean paylasimVarMi = false;
                        if (hesap instanceof Premium_Kullanici) {
                            for (int i = 0; i < Test.paylasimListesi.length; i++) {
                                if (Test.paylasimListesi[i] != null) {
                                    if (Test.paylasimListesi[i].getPaylasimId() == yorumlari_listelenecek_paylasim_id) {
                                        ((Premium_Kullanici) hesap).yorumListele(Test.paylasimListesi[i]);
                                        paylasimVarMi = true;

                                    }
                                }

                            }
                        }
                        if (hesap instanceof Standart_Kullanici) {
                            for (int i = 0; i < Test.paylasimListesi.length; i++) {
                                if (Test.paylasimListesi[i] != null) {
                                    if (Test.paylasimListesi[i].getPaylasimId() == yorumlari_listelenecek_paylasim_id) {
                                        ((Standart_Kullanici) hesap).yorumListele(Test.paylasimListesi[i]);
                                        paylasimVarMi = true;

                                    }
                                }

                            }

                        }
                        if (!paylasimVarMi) {
                            System.out.println("Boyle Bir Paylasim Yok.");

                        }
                    } else { // Id sayi degilse bu bloga girer.
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("Hatalı Giriş ! Ana Menüye Yönlendiriliyorsunuz.");
                        System.out.println("");
                        continue;
                    }

                }
                if (islem == 17) { // Ozel Mesaj Yolla
                    System.out.print("Ozel Mesaj Yollamak Istediginiz Kullanici Id : ");
                    if (sc.hasNextInt()) {
                        int id = sc.nextInt();
                        if (hesap instanceof Premium_Kullanici) {
                            for (int i = 0; i < kullaniciListesi.length; i++) {
                                if (kullaniciListesi[i] != null) {
                                    if (kullaniciListesi[i].getKullaniciId() == id) {
                                        System.out.print("Mesaj : ");
                                        sc.nextLine();
                                        String mesaj = sc.nextLine();
                                        Mesaj m = new Mesaj(mesaj);
                                        ((Premium_Kullanici) hesap).ozelMesajYolla(m, kullaniciListesi[i]);

                                    }
                                }
                            }
                        }
                        if (hesap instanceof Standart_Kullanici) {
                            for (int i = 0; i < kullaniciListesi.length; i++) {
                                if (kullaniciListesi[i] != null) {
                                    if (kullaniciListesi[i].getKullaniciId() == id) {
                                        System.out.print("Mesaj : ");
                                        sc.nextLine();
                                        String mesaj = sc.nextLine();
                                        Mesaj m = new Mesaj(mesaj);
                                        ((Standart_Kullanici) hesap).ozelMesajYolla(m, kullaniciListesi[i]);
                                    }
                                }
                            }
                        }

                    } else { // Islem Sayi Degilse Bu Bloga Girer. 
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("Hatalı Giriş ! Ana Menüye Yönlendiriliyorsunuz.");
                        System.out.println("");
                        continue;

                    }

                }
                if (islem == 18) { // Ozel Mesaj Listele
                    System.out.print("Ozel Mesajlarınızı Listelemek Istediginiz Kullanici Id : ");
                    if (sc.hasNextInt()) {
                        int id = sc.nextInt();
                        if (hesap instanceof Premium_Kullanici) {
                            for (int i = 0; i < kullaniciListesi.length; i++) {
                                if (kullaniciListesi[i] != null) {
                                    if (kullaniciListesi[i].getKullaniciId() == id) {
                                        ((Premium_Kullanici) hesap).ozelMesajListele(kullaniciListesi[i]);
                                    }
                                }
                            }
                        }
                        if (hesap instanceof Standart_Kullanici) {
                            for (int i = 0; i < kullaniciListesi.length; i++) {
                                if (kullaniciListesi[i] != null) {
                                    if (kullaniciListesi[i].getKullaniciId() == id) {
                                        ((Standart_Kullanici) hesap).ozelMesajListele(kullaniciListesi[i]);
                                    }
                                }
                            }
                        }

                    } else { // Islem Sayi Degilse Bu Bloga Girer. 
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("Hatalı Giriş ! Ana Menüye Yönlendiriliyorsunuz.");
                        System.out.println("");
                        continue;

                    }

                }
                if (islem == 19) { // 11 Haneli Telefon Numarası Yorumu Paylaşan Kullanici Goruntule.
                    System.out.print("Yorumlar Arasinda 11 Haneli Tel. Numarası Paylasan Kullaniciları Goruntülemek Istediginiz Paylasim Id : ");
                    if (sc.hasNextInt()) { // Id Sayi ise Bu Bloga Girer.
                        int id = sc.nextInt();
                        if (hesap instanceof Premium_Kullanici) {
                            hesap.telNumarası(id);
                        }
                        if (hesap instanceof Standart_Kullanici) {
                            hesap.telNumarası(id);
                        }
                    } else { // Islem Sayi Degilse Bu Bloga Girer. 
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("Hatalı Giriş ! Ana Menüye Yönlendiriliyorsunuz.");
                        System.out.println("");
                        continue;

                    }

                }
                if (islem == 20) {
                    boolean varMi = false;
                    System.out.print("Paylasimlarini Goruntulemek Istediginiz Kullanici Id : ");
                    if (sc.hasNextInt()) { // Id sayi ise bu bloga girer.
                        int id = sc.nextInt();
                        Kullanici k;
                        for (int i = 0; i < kullaniciListesi.length; i++) {
                            if (kullaniciListesi[i] != null) {
                                if (kullaniciListesi[i].getKullaniciId() == id) {
                                    k = kullaniciListesi[i];
                                    if (hesap instanceof Premium_Kullanici) {
                                        ((Premium_Kullanici) hesap).arkPaylasimGoruntule(k);
                                        varMi = true;
                                    }
                                    if (hesap instanceof Standart_Kullanici) {
                                        ((Standart_Kullanici) hesap).arkPaylasimGoruntule(k);
                                        varMi = true;
                                    }
                                }
                            }

                        }
                    } else { // Islem Sayi Degilse Bu Bloga Girer. 
                        sc.nextLine();
                        sc.nextLine();
                        System.out.println("Hatalı Giriş ! Ana Menüye Yönlendiriliyorsunuz.");
                        System.out.println("");
                        continue;

                    }
                    if (!varMi) {
                        System.out.println("Böyle Bir Kullanici Yok!");
                    }

                }
                if (islem == 0) {
                    System.out.println("Şuan " + hesap.getKullaniciAdi() + " Adlı Hesaptasınız.");
                }
                if (islem == -1) {
                    System.out.println("Cikis Yapıyorsunuz...");
                    break;
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
