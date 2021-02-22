
public class Telefon  extends Urun {
    private int hatSayisi;

    public Telefon(String ad, String kategori, int fiyat,int hatSayisi) {
        super(ad, kategori, fiyat);
        this.hatSayisi = hatSayisi;
    }

    @Override
    public int indirimUygula() {
        int yeniFiyat;
        yeniFiyat = (getFiyat()*90)/100;
        if(hatSayisi >1){
            yeniFiyat = (yeniFiyat*95)/100;
        }
       return yeniFiyat;
    }

    public int getHatSayisi() {
        return hatSayisi;
    }

    public void setHatSayisi(int hatSayisi) {
        this.hatSayisi = hatSayisi;
    }
    
}
