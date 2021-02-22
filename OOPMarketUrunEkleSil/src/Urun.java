
public class Urun {

    private int id;
    private int fiyat;
     private String ad;
    private String aciklama;
    private Satici satici;

    

    public Urun(int id, String ad, String aciklama,int fiyat, Satici satici) {
        this.id = id;
        this.ad = ad;
        this.aciklama = aciklama;
        this.satici = satici;
        this.fiyat = fiyat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public Satici getSatici() {
        return satici;
    }

    public void setSatici(Satici satici) {
        this.satici = satici;
    }
    
    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
   
}
