
public class Bilgisayar extends Urun {

    public Bilgisayar(String ad, String kategori, int fiyat) {
        super(ad, kategori, fiyat);
    }

    @Override
    public int indirimUygula() {
        int yeniFiyat;
        yeniFiyat = (getFiyat() * 80) / 100;
       return yeniFiyat;
    }

}
