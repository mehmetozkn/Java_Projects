
/**
 * @file Proje 3
 * @description Sosyal Medya
 * @assignment Odev_3
 * @date 29.01.2021
 * @author Mehmet Özkan mehmet.ozkan@stu.fsm.edu.tr
 */
public class Paylasim {

    private String paylasim;
    private int paylasimId;
    private int begeniSayisi;
    private String paylasimSahibi;
    private String[] begenenlerListesi;
    private Paylasim[] genelPaylasimListesi;

    private String yorumSahibi;
    private Yorum[] yorumListesi;
    private Kullanici[] yorumYapanlarınListesi;
    private int yorumSayisi;

    public Paylasim(String paylasim, int paylasimId) {
        this.paylasim = paylasim;
        this.paylasimId = paylasimId;
        this.begeniSayisi = begeniSayisi;
        this.begenenlerListesi = new String[1000];
        this.paylasimSahibi = paylasimSahibi;
        this.genelPaylasimListesi = new Paylasim[1000];
        this.yorumSayisi = yorumSayisi;
        this.yorumListesi = new Yorum[1000];
        this.yorumYapanlarınListesi = new Kullanici[1000];
        this.yorumSahibi = yorumSahibi;

        paylasimEkle();
    }

    public void paylasimEkle() {
        for (int i = 0; i < Test.paylasimListesi.length; i++) {
            if (Test.paylasimListesi[i] == null) {
                Test.paylasimListesi[i] = this;
                break;
            }
        }
    }

    public int getYorumSayisi() {
        return yorumSayisi;
    }

    public void setYorumSayisi(int yorumSayisi) {
        this.yorumSayisi = yorumSayisi;
    }

    public String getYorumSahibi() {
        return yorumSahibi;
    }

    public void setYorumSahibi(String yorumSahibi) {
        this.yorumSahibi = yorumSahibi;
    }

    public Yorum[] getYorumListesi() {
        return yorumListesi;
    }

    public void setYorumListesi(Yorum[] yorumListesi) {
        this.yorumListesi = yorumListesi;
    }

    public Kullanici[] getYorumYapanlarınListesi() {
        return yorumYapanlarınListesi;
    }

    public void setYorumYapanlarınListesi(Kullanici[] yorumYapanlarınListesi) {
        this.yorumYapanlarınListesi = yorumYapanlarınListesi;
    }

    public Paylasim[] getGenelPaylasimListesi() {
        return genelPaylasimListesi;
    }

    public void setGenelPaylasimListesi(Paylasim[] genelPaylasimListesi) {
        this.genelPaylasimListesi = genelPaylasimListesi;
    }

    public String getPaylasimSahibi() {
        return paylasimSahibi;
    }

    public void setPaylasimSahibi(String paylasimSahibi) {
        this.paylasimSahibi = paylasimSahibi;
    }

    public String[] getBegenenlerListesi() {
        return begenenlerListesi;
    }

    public void setBegenenlerListesi(String[] begenenlerListesi) {
        this.begenenlerListesi = begenenlerListesi;
    }

    public int getBegeniSayisi() {
        return begeniSayisi;
    }

    public void setBegeniSayisi(int begeniSayisi) {
        this.begeniSayisi = begeniSayisi;
    }

    public int getPaylasimId() {
        return paylasimId;
    }

    public void setPaylasimId(int paylasimId) {
        this.paylasimId = paylasimId;
    }

    public String getPaylasim() {
        return paylasim;
    }

    public void setPaylasim(String paylasim) {
        this.paylasim = paylasim;
    }

}
