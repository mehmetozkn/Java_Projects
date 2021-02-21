
/**
 * @file Proje 3
 * @description Sosyal Medya
 * @assignment Odev_3
 * @date 29.01.2021
 * @author Mehmet Özkan mehmet.ozkan@stu.fsm.edu.tr
 */
public class Standart_Kullanici extends Kullanici implements IUygulama_Islemleri {

    Test test = new Test();
    private Kullanici[] sArkadasListesi;
    private int mevcutArkadasSayisi = 0;

    private Paylasim[] s_paylasimListesi;
    private int mevcutPaylasimSayisi;

    public Standart_Kullanici(String kullaniciAdi, int kullaniciId) {
        super(kullaniciAdi, kullaniciId);
        this.sArkadasListesi = new Kullanici[4]; // Normal Kullanicilar En Fazla 4 Arkadasa Sahip Olabilir.
        this.mevcutArkadasSayisi = mevcutArkadasSayisi;

        this.s_paylasimListesi = new Paylasim[2]; // Standart Kullanicilar En Fazla 2 Paylasim Yapabilir.
        this.mevcutPaylasimSayisi = mevcutPaylasimSayisi;

        kullaniciEkle();
    }

    @Override
    public void kullaniciEkle() {
        for (int i = 0; i < Test.kullaniciListesi.length; i++) {
            if (Test.kullaniciListesi[i] == null) {
                Test.kullaniciListesi[i] = this;
                break;
            }
        }

    }

    @Override
    void ozelMesajYolla(Mesaj mesaj, Kullanici kullanici) {
        boolean arkMi = false;
        if (kontrol(this.sArkadasListesi, kullanici)) {
            for (int i = 0; i < this.getMesajListesi().length; i++) {
                if (this.getMesajListesi()[i] == null) {
                    this.getMesajListesi()[i] = mesaj;
                    kullanici.getMesajListesi()[i] = mesaj;
                    mesaj.setMesajSahibi(this);
                    arkMi = true;
                    break;
                }
            }
        }
        if (!arkMi) {
            System.out.println("Arkadas Listenizide Olmayan Birine Mesaj Gonderemessiniz.");
        }
    }

    @Override
    void ozelMesajListele(Kullanici kullanici) {
        boolean mesajVarMi = false;
        if (kontrol(this.sArkadasListesi, kullanici)) {
            for (int i = 0; i < kullanici.getMesajListesi().length; i++) {
                if (kullanici.getMesajListesi()[i] != null) {
                    System.out.println(kullanici.getMesajListesi()[i].getMesajSahibi().getKullaniciAdi() + " : " + kullanici.getMesajListesi()[i].getMesaj());
                    mesajVarMi = true;
                }
            }
        } else {
            System.out.println(kullanici.getKullaniciAdi() + " Adlı Kullanici ile Arkadas Degilsiniz.");
        }
        if(!mesajVarMi){
            System.out.println("Mesaj Bulunamadı !");
        }
    }

    @Override
    void telNumarası(int a) {
        int count = 0;
        for (int i = 0; i < this.s_paylasimListesi.length; i++) {
            if (this.s_paylasimListesi[i] != null) {
                if (this.s_paylasimListesi[i].getPaylasimId() == a) {
                    for (int j = 0; j < this.s_paylasimListesi[i].getYorumListesi().length; j++) {
                        if (this.s_paylasimListesi[i].getYorumListesi()[j] != null) {
                            for (int k = 0; k < this.s_paylasimListesi[i].getYorumListesi()[j].getYorum().length(); k++) {
                                char c = this.s_paylasimListesi[i].getYorumListesi()[j].getYorum().charAt(k);
                                if (kontrol(c)) {
                                    count++;
                                } else {
                                    if (count == 11) {
                                        System.out.println("Yorumu Yapan : " + this.s_paylasimListesi[i].getYorumListesi()[j].getYorumSahibi());
                                    }
                                    count = 0;
                                }
                                if (k == this.s_paylasimListesi[i].getYorumListesi()[j].getYorum().length() - 1) {
                                    if (count == 11) {
                                        System.out.println("Yorumu Yapan : " + this.s_paylasimListesi[i].getYorumListesi()[j].getYorumSahibi());
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    boolean kontrol(char c) {
        if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9' || c == '0') {
            return true;
        }
        return false;
    }

    @Override
    public int cevir(char a) {
        int b = a - '0';
        return b;
    }

    @Override
    void arkadasEkle(Kullanici kullanici, int onayRet) {
        if (kullanici.getKullaniciAdi().equals(this.getKullaniciAdi())) { // Kullanicin Kendini Arkadas Olarak Ekleyememesi Icin Kontrol.
            System.out.println("Kendinizi Arkadas Olarak Ekleyemessiniz!");
            return;
        } else if (kontrol(this.sArkadasListesi, kullanici)) { // Arkadas Listesinde Olan Birini Tekrardan Arkadas Ekleyememek Icın Kontrol.
            // System.out.println(kullanici.getKullaniciAdi() + " Adlı Kullanici İle Zaten Arkadaşsınız");
            return;
        } else {
            if (mevcutArkadasSayisi < this.sArkadasListesi.length) {// Kullanicinin arkadas listesinde yer var mı kontrolu.
                for (int i = 0; i < this.sArkadasListesi.length; i++) {
                    if (this.sArkadasListesi[i] == null) {
                        if (istekKabulRet(onayRet)) { // Arkadaslik istegini kabul etme kontrolu.
                            this.sArkadasListesi[i] = kullanici;
                            System.out.println(kullanici.getKullaniciAdi() + " Adlı Kullanici, "
                                    + this.getKullaniciAdi() + " Adlı Kullanıcının Arkadas Listesine Eklendi.");
                            mevcutArkadasSayisi++;
                            break;
                        } else { // Arkadaslik istegini reddedildigind bu bloga girer.
                            System.out.println(kullanici.getKullaniciAdi() + ", istegi Reddetti.");
                            return;
                        }

                    }
                }

            } else {  // Arkadas listesi dolu oldugunda bu bloga girer.
                System.out.println("!!! Arkadas Listeniz Dolu Olduğundan, "
                        + kullanici.getKullaniciAdi() + " Adlı Kullanıcıyı Arkadas Olarak Ekleyemessiniz !!!");
            }
        }
        kullanici.arkadasEkle(this, onayRet);
    }

    @Override
    void arkadasSil(Kullanici kullanici) {
        for (int i = 0; i < this.getsArkadasListesi().length; i++) {
            if (this.getsArkadasListesi()[i] != null) {
                if (kullanici.getKullaniciId() == this.getsArkadasListesi()[i].getKullaniciId()) { // Parametre olarak gonderilen arkadasi listede buldugunda bu bloga girer.
                    System.out.println(this.getsArkadasListesi()[i].getKullaniciAdi() + " Adlı Kullanici, "
                            + this.getKullaniciAdi() + " Adlı Kullanıcının Arkadas Listesinden Silindi.");
                    this.getsArkadasListesi()[i] = null;
                    mevcutArkadasSayisi--;
                    kullanici.arkadasSil(this);
                    break;
                }
            }

        }
    }

    @Override
    void arkadasListesiGoruntule() {
        int toplam = 0;
        System.out.println("");
        System.out.println("*** " + this.getKullaniciAdi() + " Adlı Kullanıcının Arkadas Listesi ***");
        System.out.println("");
        for (int i = 0; i < this.getsArkadasListesi().length; i++) {
            if (this.getsArkadasListesi()[i] != null) {
                System.out.println("Kullanici Adi : " + this.getsArkadasListesi()[i].getKullaniciAdi()
                        + "\tKullanici Id : " + this.getsArkadasListesi()[i].getKullaniciId());
                toplam++;
            }

        }
        System.out.println(this.getKullaniciAdi() + " Adlı Kullanıcının Arkadas Sayisi : " + toplam);
        System.out.println("");
    }

    @Override
    public void arkPaylasimGoruntule(Kullanici k) {
        boolean arkMi = false;
        if (kontrol(this.sArkadasListesi, k)) {
            System.out.println("");
            System.out.println(k.getKullaniciAdi() + " Adlı Kullanicinin Paylasimlari ");
            System.out.println("");
            if (k instanceof Standart_Kullanici) {
                for (int i = 0; i < ((Standart_Kullanici) k).getS_paylasimListesi().length; i++) {
                    if (((Standart_Kullanici) k).getS_paylasimListesi()[i] != null) {
                        System.out.println((i + 1) + ".Paylasim : " + ((Standart_Kullanici) k).getS_paylasimListesi()[i].getPaylasim());
                        arkMi = true;
                    }
                }
            }
            if (k instanceof Premium_Kullanici) {
                for (int i = 0; i < ((Premium_Kullanici) k).getP_paylasimListesi().length; i++) {
                    if (((Premium_Kullanici) k).getP_paylasimListesi()[i] != null) {
                        System.out.println((i + 1) + ".Paylasim : " + ((Premium_Kullanici) k).getP_paylasimListesi()[i].getPaylasim());
                        arkMi = true;
                    }
                }
            }

        }
        if (!arkMi) {
            System.out.println("Standart Kullanicilar Sadece Arkadas Listesindeki Kullanicilarin Paylasimlarini Goruntuleyebilir.");
        }

    }

    @Override
    boolean kontrol(Kullanici[] liste, Kullanici k) { // Arkadas Listesinde Olan Birini Tekrardan Arkadas Ekleyememek icin kontrol metodu.
        for (int i = 0; i < liste.length; i++) {
            if (liste[i] == k) {
                return true;
            }
        }
        return false;
    }

    @Override
    boolean istekKabulRet(int onayRet) { // Arkadaslik istegini kabul edip etmeme metodu.
        if (onayRet == 1) {
            return true;
        } else if (onayRet == 0) {
            return false;
        } else {
            return false;
        }
    }

    @Override
    public void paylasimYap(Paylasim paylasim) {
        if (mevcutPaylasimSayisi < this.s_paylasimListesi.length) { //Kullanicinin paylasim listesinde yer olup olmadigini kontrol eder.
            for (int i = 0; i < this.s_paylasimListesi.length; i++) {
                if (this.s_paylasimListesi[i] == null) {
                    this.s_paylasimListesi[i] = paylasim;
                    paylasim.setPaylasimSahibi(this.getKullaniciAdi()); // Paylasimin sahibini belirler.
                    System.out.println(this.getKullaniciAdi() + " Adlı Kullanici "
                            + this.s_paylasimListesi[i].getPaylasimId() + " Id'li " + paylasim.getPaylasim() + " Paylasimini Yapti.");
                    mevcutPaylasimSayisi++;
                    break;
                }
            }
        } else { // Maximum paylasim sayisina ulastiginda bu bloga girer.
            System.out.println(this.getKullaniciAdi() + " Adlı Kullanici Maximum Paylasim Sayisina Ulasti.");
        }

        for (int i = 0; i < paylasim.getGenelPaylasimListesi().length; i++) { // Paylasimi genel paylasim listesine ekleme dongusu.
            
            if (paylasim.getGenelPaylasimListesi()[i] == null) {
                paylasim.getGenelPaylasimListesi()[i] = paylasim;
                break;
            }
           

        }
    }

    @Override
    public void paylasimSil(Paylasim paylasim) {
        for (int i = 0; i < this.s_paylasimListesi.length; i++) {
            if (this.s_paylasimListesi[i] != null) {
                if (this.s_paylasimListesi[i].getPaylasimId() == paylasim.getPaylasimId()) {
                    this.s_paylasimListesi[i] = null;
                    System.out.println(paylasim.getPaylasimId() + " Id'li Paylasim, "
                            + this.getKullaniciAdi() + " Adlı Kullanicinin Paylasim Listesinden Silindi.");
                    mevcutPaylasimSayisi--;
                    break;
                } else {
                    continue;
                }
            }

        }
        for (int i = 0; i < paylasim.getGenelPaylasimListesi().length; i++) { // Paylasimi genel paylasim listesinden sile dongusu.
            if (paylasim.getGenelPaylasimListesi()[i] != null) {
                if (paylasim.getGenelPaylasimListesi()[i].getPaylasimId() == paylasim.getPaylasimId()) {
                    paylasim.getGenelPaylasimListesi()[i] = null;
                }
            }
        }
    }

    @Override
    public void paylasimGuncelle(int guncellencekPaylasimId, String yeniPaylasim) {
        for (int i = 0; i < this.s_paylasimListesi.length; i++) {
            if (this.s_paylasimListesi[i] != null) {
                if (guncellencekPaylasimId == this.s_paylasimListesi[i].getPaylasimId()) { // Guncellenecek paylasimin id'si ile yeni paylasim id'si esit oldugunda bu bloga girer.
                    this.s_paylasimListesi[i].setPaylasim(yeniPaylasim); // Parametre olarak gelen paylasimi set edip gunceller.
                    System.out.println(guncellencekPaylasimId + "Id'li Paylasim, " + yeniPaylasim + " Olarak Guncellendi.");

                }
            }
        }
    }

    public boolean p_kontrol(Paylasim p) { // Boyle bir paylasim olup olmadigini kontrol eden metod.
        for (int i = 0; i < p.getGenelPaylasimListesi().length; i++) {
            if (p.getGenelPaylasimListesi()[i] != null) {
                if (p.getGenelPaylasimListesi()[i] == p) {
                    return true;

                }
            }

        }
        return false;
    }

    @Override
    public boolean kontrol(Paylasim p) { // Paylasimi yapan kullanici standart kullanicinin kullanici listesinde mi kontrolunu saglayan metod.
        for (int i = 0; i < sArkadasListesi.length; i++) {
            if (sArkadasListesi[i] != null) {
                if (sArkadasListesi[i].getKullaniciAdi().equals(p.getPaylasimSahibi())) {
                    return true;
                }
            }

        }
        return false;
    }

    @Override
    public void yorumYap(Paylasim paylasim, Yorum yorum) {
        if (p_kontrol(paylasim)) {
            if (kontrol(paylasim)) {
                for (int i = 0; i < paylasim.getYorumListesi().length; i++) {
                    if (paylasim.getYorumListesi()[i] == null) {
                        paylasim.getYorumListesi()[i] = yorum;
                        System.out.println(this.getKullaniciAdi() + ", " + paylasim.getPaylasim() + " Adlı Paylasima "
                                + yorum.getYorumId() + " Id'li, " + yorum.getYorum() + ", Adlı Yorumu Yapti.");
                        test.yorum_idler++;
                        paylasim.setYorumSayisi(paylasim.getYorumSayisi() + 1);
                        yorum.setYorumSahibi(this.getKullaniciAdi());
                        break;
                    }
                }
            } else {
                System.out.println(this.getKullaniciAdi() + ", " + paylasim.getPaylasimSahibi() + " ile Arkadas Olmadigindan " + paylasim.getPaylasim() + " Adlı Paylasima Yorum Yapamaz!");
            }

        } else {
            System.out.println(paylasim.getPaylasim() + " Adlı Bir Paylasım Bulunmamaktadır.");
        }

    }

    @Override
    public void yorumSil(Paylasim paylasim, Yorum yorum) {
        if (p_kontrol(paylasim)) {
            for (int i = 0; i < paylasim.getYorumListesi().length; i++) {
                if (paylasim.getYorumListesi()[i] != null) {
                    if (paylasim.getYorumListesi()[i] == yorum) {
                        System.out.println(yorum.getYorum() + " Adlı Yorum Silindi.");
                        paylasim.getYorumListesi()[i] = null;
                    }
                }

            }
        } else {
            System.out.println(paylasim.getPaylasim() + " Adlı Bir Paylasim Bulunmamaktadır.");
        }

    }

    @Override
    public void yorumListele(Paylasim paylasim) {
        if (p_kontrol(paylasim)) {
            if (arkKontrol(sArkadasListesi, this.getKullaniciAdi())) {
                System.out.println("");
                System.out.println("*** " + paylasim.getPaylasim() + " Yorum Listesi ***");
                System.out.println("");
                for (int i = 0; i < paylasim.getYorumListesi().length; i++) {
                    if (paylasim.getYorumListesi()[i] != null) {
                        System.out.print((i + 1) + ". Yorum : " + paylasim.getYorumListesi()[i].getYorum() + "  Yorum Sahibi : " + paylasim.getYorumListesi()[i].getYorumSahibi());
                        System.out.println("");
                    }
                }
                System.out.println("");
            } else {
                System.out.println(this.getKullaniciAdi() + ", " + paylasim.getPaylasimSahibi() + " ile Arkadas Olmadigindan Paylasimlarini Listeleyemez!");
            }

        } else {
            System.out.println(paylasim.getPaylasim() + " Adlı Bir Paylasim Bulunmamaktadır.");
        }
    }

   public boolean arkKontrol(Kullanici[] liste, String kullanici) { // Standart kullanicilar arkadas listesinde olmayan bir kullanicinin 
        //  paylasimini göremeyecegi icin bunun kontrolunu saglayan metod.
        for (int i = 0; i < liste.length; i++) {
            if (liste[i] != null) {
                if (liste[i].getKullaniciAdi().equals(kullanici)) {
                    return true;
                }
            }

        }
        return false;
    }

    @Override
    public void paylasimiBegen(Paylasim paylasim) {
        if (p_kontrol(paylasim)) { // Paylasim listesinde, parametre olarak gelen paylasim varsa bu bloga girer.
            if (arkKontrol(this.sArkadasListesi, paylasim.getPaylasimSahibi())) { // Standart Kullanici arkadas listesinde olmayan birinin paylasimini gormez ve begenemez.
                for (int i = 0; i < paylasim.getBegenenlerListesi().length; i++) {
                    if (paylasim.getBegenenlerListesi()[i] == null) {
                        paylasim.getBegenenlerListesi()[i] = this.getKullaniciAdi(); // Paylasimi begenen kullanciyi begenenler listesin ekler.
                        System.out.println(this.getKullaniciAdi() + ", " + paylasim.getPaylasim() + " Adlı Paylasimi Begendi.");
                        paylasim.setBegeniSayisi(paylasim.getBegeniSayisi() + 1);
                        break;
                    }
                }
            } else {
                System.out.println(this.getKullaniciAdi() + " ile " + paylasim.getPaylasimSahibi() + " Arkadas Olmadıgı Icın Paylasimi Begenemez.");
            }

        } else {  // Paylasim listesinde, parametre olarak gelen paylasim yoksa bu bloga girer.
            System.out.println(paylasim.getPaylasim() + " Adlı Bir Paylasim Bulunmamaktadır.");
        }

    }

    @Override
    public void paylasimListele() {
        System.out.println("");
        System.out.println(this.getKullaniciAdi() + " Adlı Kullanicinin Paylasimlari Goruntuleniyor...");
        System.out.println("");
        boolean varMi = false;
        for (int i = 0; i < this.s_paylasimListesi.length; i++) {
            if (this.s_paylasimListesi[i] != null) {
                System.out.println("Paylasim Id : " + this.s_paylasimListesi[i].getPaylasimId()
                        + "\t\tPaylasim : " + this.s_paylasimListesi[i].getPaylasim()
                        + "\tBegeni Sayisi : " + this.s_paylasimListesi[i].getBegeniSayisi()
                        + "\tYorum Sayisi : " + this.s_paylasimListesi[i].getYorumSayisi()
                        + "\tBegenenler : " + begenenler(this.s_paylasimListesi[i])
                        + "\t  Yorum Yapanlar : " + yorumYapanlar(this.s_paylasimListesi[i])
                        + "\t Yorum : " + yorum_icerigi(this.s_paylasimListesi[i]));
                varMi = true;
            }
        }
        if (!varMi) {
            System.out.println("Paylasim Bulunamadı !");
        }
    }

    @Override
    public String yorum_icerigi(Paylasim p) {
        String a = "[";
        for (int i = 0; i < p.getYorumListesi().length; i++) {
            if (p.getYorumListesi()[i] != null) {
                if (p.getYorumListesi()[i].getYorum() != null) {
                    a += p.getYorumListesi()[i].getYorum() + (p.getYorumListesi()[i].getYorum() != null ? ", " : "]");
                }

            }
        }
        return a + "\t";
    }

    @Override
    public String yorumYapanlar(Paylasim paylasim) {
        String a = "[";
        for (int i = 0; i < paylasim.getYorumListesi().length; i++) {
            if (paylasim.getYorumListesi()[i] != null) {
                a += paylasim.getYorumListesi()[i].getYorumSahibi() + (paylasim.getYorumListesi()[i + 1] != null ? ", " : "]");

            }
        }
        return a;
    }

    @Override
    String begenenler(Paylasim paylasim) { // Paylasimi begenen kullanicilari belli bir formatta donduren metod.
        String a = "[";
        String b = "";
        for (int i = 0; i < paylasim.getBegenenlerListesi().length; i++) {
            if (paylasim.getBegenenlerListesi()[i] != null) {
                a += paylasim.getBegenenlerListesi()[i] + ((paylasim.getBegenenlerListesi()[i + 1] != null) ? ", " : "]");

            }

        }
        return a + "\t";
    }

    @Override
    public boolean kontrol(Paylasim[] liste) { // Paylasim listesinde herhangi bir paylasim varmi yokmu kontrol.
        for (int i = 0; i < liste.length; i++) {
            if (liste[i] != null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void enCokBegenilenPaylasim() {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        boolean varMi = false;
        if (kontrol(this.s_paylasimListesi)) { // Paylasim listesinde paylasim varsa bu bloga girer.
            for (int i = 0; i < this.s_paylasimListesi.length; i++) {
                if (this.s_paylasimListesi[i] != null) {
                    if (this.s_paylasimListesi[i].getBegeniSayisi() > max) {
                        maxIndex = i;
                        max = this.s_paylasimListesi[i].getBegeniSayisi();
                        varMi = true;
                    }
                }

            }
        }

        if (varMi) {
            System.out.println("Paylasim : " + this.getS_paylasimListesi()[maxIndex].getPaylasim()
                    + "\tBegeni Sayisi : " + this.getS_paylasimListesi()[maxIndex].getBegeniSayisi());
        } else {
            System.out.println("Paylasim Yok !");
        }
    }

    @Override
    public void enAzBegenilenPaylasim() {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        boolean varMi = false;
        if (kontrol(s_paylasimListesi)) { // Paylasim listesinde paylasim varsa bu bloga girer.
            for (int i = 0; i < this.s_paylasimListesi.length; i++) {
                if (this.s_paylasimListesi[i] != null) {
                    if (this.s_paylasimListesi[i].getBegeniSayisi() <= min) {
                        minIndex = i;
                        min = this.s_paylasimListesi[i].getBegeniSayisi();
                        varMi = true;
                    }
                }

            }
        }

        if (varMi) {
            System.out.println("Paylasim : " + this.getS_paylasimListesi()[min].getPaylasim()
                    + "\tBegeni Sayisi : " + this.getS_paylasimListesi()[min].getBegeniSayisi());
        } else {
            System.out.println("Paylasim Yok !");
        }
    }

    @Override
    public void enCokYorumYapilanPaylasim() {
        int max = 0;
        int maxIndex = 0;
        boolean varMi = false;
        if (kontrol(this.s_paylasimListesi)) { // Paylasim listesinde paylasim varsa bu bloga girer.
            for (int i = 0; i < this.s_paylasimListesi.length; i++) {
                if (this.s_paylasimListesi[i] != null) {
                    if (this.s_paylasimListesi[i].getYorumSayisi() > max) {
                        maxIndex = i;
                        max = this.s_paylasimListesi[i].getYorumSayisi();
                        varMi = true;
                    }
                }
            }
        }
        if (varMi) {
            System.out.println("Paylasim : " + this.getS_paylasimListesi()[maxIndex].getPaylasim()
                    + "\tYorum Sayisi : " + this.getS_paylasimListesi()[maxIndex].getYorumSayisi());
        } else {
            System.out.println("Paylasim Yok !");
        }
    }

    @Override
    public void enAzYorumYapilanPaylasim() {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        boolean varMi = false;
        if (kontrol(this.getS_paylasimListesi())) { // Paylasim listesinde paylasim varsa bu bloga girer.
            for (int i = 0; i < this.getS_paylasimListesi().length; i++) {
                if (this.getS_paylasimListesi()[i] != null) {
                    if (this.getS_paylasimListesi()[i].getYorumSayisi() <= min) {
                        minIndex = i;
                        min = this.getS_paylasimListesi()[i].getYorumSayisi();
                        varMi = true;
                    }
                }

            }
        }

        if (varMi) {
            System.out.println("Paylasim : " + this.getS_paylasimListesi()[min].getPaylasim()
                    + "\tYorum Sayisi : " + this.getS_paylasimListesi()[min].getYorumSayisi());
        } else {
            System.out.println("Paylasim Yok !");
        }
    }

    public int getMevcutArkadasSayisi() {
        return mevcutArkadasSayisi;
    }

    public void setMevcutArkadasSayisi(int mevcutArkadasSayisi) {
        this.mevcutArkadasSayisi = mevcutArkadasSayisi;
    }

    public Paylasim[] getS_paylasimListesi() {
        return s_paylasimListesi;
    }

    public void setS_paylasimListesi(Paylasim[] s_paylasimListesi) {
        this.s_paylasimListesi = s_paylasimListesi;
    }

    public Kullanici[] getsArkadasListesi() {
        return sArkadasListesi;
    }

    public void setsArkadasListesi(Kullanici[] sArkadasListesi) {
        this.sArkadasListesi = sArkadasListesi;
    }

    public int getMevcutPaylasimSayisi() {
        return mevcutPaylasimSayisi;
    }

    public void setMevcutPaylasimSayisi(int mevcutPaylasimSayisi) {
        this.mevcutPaylasimSayisi = mevcutPaylasimSayisi;
    }

}
