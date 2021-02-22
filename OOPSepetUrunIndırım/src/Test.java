
public class Test {

    public static void main(String[] args) {
        Kullanici k1 = new Kullanici("Mehmet Özkan");
        Kullanici k2 = new Kullanici("Ali Ata");
        Kullanici k3 = new Kullanici("Ayse Yildiz");

        Sepet sepet1 = new Sepet();
        Sepet sepet2 = new Sepet();
        Sepet sepet3 = new Sepet();

        Urun bilgisayar1 = new Bilgisayar("Casper", "Dizustu", 8000);
        Urun bilgisayar2 = new Bilgisayar("Asus", "Dizustu", 7000);
        Urun bilgisayar3 = new Bilgisayar("Macbook", "Dizustu", 10000);

        Urun telefon1 = new Telefon("Iphone", "Akilli", 8000, 2);
        Urun telefon2 = new Telefon("Samsung", "Akilli", 5000, 1);
        Urun telefon3 = new Telefon("Huawei", "Akilli", 4000, 5);

        sepet1.urunEkle(telefon3);
        sepet1.urunEkle(telefon2);
        sepet1.urunEkle(bilgisayar1);
        sepet1.urunEkle(bilgisayar3);
        System.out.println("****** Seper 1 Ürünleri ******");
        sepet1.urunListele();
        sepet1.satinAl(k1);
        k1.urunListele();
        System.out.println("");
        System.out.println(bilgisayar3.getAd() + " İndirimli Fiyati : " + bilgisayar3.indirimUygula());
        System.out.println(telefon2.getAd() + " İndirimli Fiyati : " + telefon2.indirimUygula());
        System.out.println(telefon3.getAd() + " İndirimli Fiyati : " + telefon3.indirimUygula());
        System.out.println(bilgisayar1.getAd() + " Normal Fiyatıi : " + bilgisayar2.getFiyat());
        sepet1.urunSayisi(k1);

    }

}
