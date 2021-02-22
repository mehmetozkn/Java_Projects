
import java.util.ArrayList;


public class Kullanici {
    private String adSoyad;
    private ArrayList<Urun> kullaniciUrunListesi;
    
     public Kullanici(String adSoyad) {
        this.adSoyad = adSoyad;
        this.kullaniciUrunListesi = new ArrayList<Urun>();
    }
     
     public void kullanıcıListesineUrunEkle(ArrayList<Urun> urunListei){
         kullaniciUrunListesi.addAll(urunListei);
     }
    
    public void urunListele(){
        System.out.println(adSoyad + "ın Ürün Listesi");
        for (int i = 0; i < kullaniciUrunListesi.size(); i++) {
            System.out.println("Ad : " + kullaniciUrunListesi.get(i).getAd() +"\nKategori : " + kullaniciUrunListesi.get(i).getKategori()+"\nFiyat : " + kullaniciUrunListesi.get(i).getFiyat());
            System.out.println("");
                   
        }
    }

   
    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public ArrayList<Urun> getKullaniciUrunListesi() {
        return kullaniciUrunListesi;
    }

    public void setKullaniciUrunListesi(ArrayList<Urun> kullaniciUrunListesi) {
        this.kullaniciUrunListesi = kullaniciUrunListesi;
    }

    
    
    
}
