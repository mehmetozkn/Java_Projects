
/**
 * @file Proje 3
 * @description Sosyal Medya
 * @assignment Odev_3
 * @date 29.01.2021
 * @author Mehmet Özkan mehmet.ozkan@stu.fsm.edu.tr
 */
public abstract class Kullanici {

    private String kullaniciAdi;
    private int kullaniciId;
    private Mesaj[] mesajListesi;

    public Kullanici(String kullaniciAdi, int kullaniciId) {
        this.kullaniciAdi = kullaniciAdi;
        this.kullaniciId = kullaniciId;
        this.mesajListesi = new Mesaj[100];

    }

    abstract void kullaniciEkle();

    abstract void arkadasEkle(Kullanici kullanici, int onayRet);

    abstract void arkadasSil(Kullanici kullanici);

    abstract void arkadasListesiGoruntule();

    abstract boolean kontrol(Kullanici[] liste, Kullanici k);

    abstract boolean kontrol(char a);

    abstract int cevir(char a);

    abstract boolean kontrol(Paylasim[] liste);

    abstract boolean kontrol(Paylasim p);

    abstract boolean istekKabulRet(int onayRet);

    abstract String begenenler(Paylasim paylasim);

    abstract void ozelMesajYolla(Mesaj mesaj, Kullanici kullanici);

    abstract void ozelMesajListele(Kullanici kullanici);

    abstract void telNumarası(int a);

    abstract String yorum_icerigi(Paylasim p);

    abstract String yorumYapanlar(Paylasim paylasim);

    abstract void enCokBegenilenPaylasim();

    abstract void enAzBegenilenPaylasim();

    abstract void enCokYorumYapilanPaylasim();

    abstract void enAzYorumYapilanPaylasim();

    abstract void arkPaylasimGoruntule(Kullanici k);

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public int getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(int kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public Mesaj[] getMesajListesi() {
        return mesajListesi;
    }

    public void setMesajListesi(Mesaj[] mesajListesi) {
        this.mesajListesi = mesajListesi;
    }

}
