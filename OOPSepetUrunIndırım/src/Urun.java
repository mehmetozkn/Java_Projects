
public class Urun {

    private String ad;
    private String kategori;
    private int fiyat;
   

    public Urun(String ad, String kategori, int fiyat) {
        this.ad = ad;
        this.kategori = kategori;
        this.fiyat = fiyat;
    }

    public int indirimUygula() {
        fiyat = (fiyat * 95) * 100;
        return fiyat;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

}
