
public class Oyuncu {
    private String ad;
    private int dogruSayisi;
    private int yanlisSayisi;
    private int gecenSure;

    public Oyuncu(String ad, int dogruSayisi, int yanlisSayisi, int gecenSure) {
        this.ad = ad;
        this.dogruSayisi = dogruSayisi;
        this.yanlisSayisi = yanlisSayisi;
        this.gecenSure = gecenSure;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getDogruSayisi() {
        return dogruSayisi;
    }

    public void setDogruSayisi(int dogruSayisi) {
        this.dogruSayisi = dogruSayisi;
    }

    public int getYanlisSayisi() {
        return yanlisSayisi;
    }

    public void setYanlisSayisi(int yanlisSayisi) {
        this.yanlisSayisi = yanlisSayisi;
    }

    public int getGecenSure() {
        return gecenSure;
    }

    public void setGecenSure(int gecenSure) {
        this.gecenSure = gecenSure;
    }
    
    
}
