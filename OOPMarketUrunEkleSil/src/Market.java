
public class Market {

    private String ad;
    private Urun[] urunListesi;
    private int maxUrunMiktari;
    private int mevcutUrunMiktari;

    public Market(String ad, int maxUrunMiktari) {
        this.ad = ad;
        this.maxUrunMiktari = maxUrunMiktari;
        urunListesi = new Urun[maxUrunMiktari];

    }

    public void urunEkle(Urun urun) {

        if (mevcutUrunMiktari < maxUrunMiktari) {
            for (int i = 0; i < maxUrunMiktari; i++) {
                if (urunListesi[i] == null) {
                    urunListesi[i] = urun;
                    System.out.println("+" + urunListesi[i].getAd() + " Ürün Listesine Eklendi.");
                    break;
                }
            }
            mevcutUrunMiktari++;
        } else {
            System.out.println("*Ürün Listesi Dolu!");
        }

    }

    public void urunSil(int silinecekÜrünId) {

        for (int i = 0; i < mevcutUrunMiktari; i++) {

            if (silinecekÜrünId == (urunListesi[i].getId())) {
                System.out.println("-" + urunListesi[i].getAd() + " Ürün Listesinden Silindi.");
                urunListesi[i] = null;
                mevcutUrunMiktari--;
            } else {
                continue;
            }

        }
        System.out.println("");
    }

    public void urunListele() {
        int toplam =0;
        System.out.println("**** Market Ürün Listesi ***");
        for (int i = 0; i < maxUrunMiktari; i++) {
            if (urunListesi[i] != null) {
                System.out.println(urunListesi[i].getAd() + " Ürününün Satıcısı : "
                        + urunListesi[i].getSatici().getAd() + " " + urunListesi[i].getSatici().getSoyad());
                System.out.println("Ürün ID : " + urunListesi[i].getId() + "  Ürün Aciklama : " + urunListesi[i].getAciklama()
                        + "  Ürün Fiyat : " + urunListesi[i].getFiyat() + "TL");
                System.out.println("");
                toplam += urunListesi[i].getFiyat();
                
            }

        }
        System.out.println("Toplam = " + toplam);
    }

    public void sayiYazdir() {

        System.out.println("Mevcut Ürün Sayısı : " + mevcutUrunMiktari);
        System.out.println("");
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Urun[] getUrunListesi() {
        return urunListesi;
    }

    public void setUrunListesi(Urun[] urunListesi) {
        this.urunListesi = urunListesi;
    }

    public int getMaxUrunMiktari() {
        return maxUrunMiktari;
    }

    public void setMaxUrunMiktari(int maxUrunMiktari) {
        this.maxUrunMiktari = maxUrunMiktari;
    }

}
