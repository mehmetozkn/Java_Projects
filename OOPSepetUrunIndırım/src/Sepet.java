
import java.util.ArrayList;

public class Sepet {

    private Kullanici sepetSahibi;
    private ArrayList<Urun> urunListesi;

    public Sepet() {
        this.sepetSahibi = sepetSahibi;
        this.urunListesi = new ArrayList<Urun>();
    }

    public void urunEkle(Urun urun) {
        urunListesi.add(urun);
    }

    public void satinAl(Kullanici sepetSahibi) {
        sepetSahibi.kullanıcıListesineUrunEkle(urunListesi);
        urunListesi.clear();
    }

    public void urunListele() {
        for (int i = 0; i < urunListesi.size(); i++) {
            if (urunListesi.get(i) != null) {
                System.out.println("Ürün Adı : " + urunListesi.get(i).getAd());
                System.out.println("Ürünün Kategorisi : " + urunListesi.get(i).getKategori());
                System.out.println("Ürünün Fiyatı : " + urunListesi.get(i).getFiyat());

                System.out.println("");
            } else {
                System.out.println("Sepette Ürün Yok !");
            }
        }
    }

    public void urunSayisi(Kullanici kullanici) {
        int telefonSayisi = 0;
        int bilgisayarSayisi = 0;
        for (int i = 0; i < kullanici.getKullaniciUrunListesi().size(); i++) {
            if (kullanici.getKullaniciUrunListesi().get(i) instanceof Telefon) {
                telefonSayisi++;
            }
            if(kullanici.getKullaniciUrunListesi().get(i) instanceof Bilgisayar){
                bilgisayarSayisi++;
            }
        }
        
        System.out.println("Telefon Sayısı : " + telefonSayisi);
        System.out.println("Bilgisayar Sayısı : " + bilgisayarSayisi);

    }

}
