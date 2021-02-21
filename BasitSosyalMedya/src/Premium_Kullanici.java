
/**
 * @file Proje 3
 * @description Sosyal Medya
 * @assignment Odev_3
 * @date 29.01.2021
 * @author Mehmet Özkan mehmet.ozkan@stu.fsm.edu.tr
 */
public class Premium_Kullanici extends Kullanici implements IUygulama_Islemleri {

    Test test = new Test();

    private Kullanici[] pArkadasListesi;
    private int mevcutArkadasSayisi = 0;

    private Paylasim[] p_paylasimListesi;
    private int mevcutPaylasimSayisi;

    public Premium_Kullanici(String kullaniciAdi, int kullaniciId) {
        super(kullaniciAdi, kullaniciId);
        this.pArkadasListesi = new Kullanici[8]; // Premium Kullanicilar En Fazla 8 Arkadasa Sahip Olabilir.
        this.mevcutArkadasSayisi = mevcutArkadasSayisi;
        this.p_paylasimListesi = new Paylasim[4]; // Premium Kullanıcılar En Fazla 4 Paylasim Yapabilir.
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
        if (kontrol(this.pArkadasListesi, kullanici)) {
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
        if (kontrol(this.pArkadasListesi, kullanici)) {
            for (int i = 0; i < kullanici.getMesajListesi().length; i++) {
                if (kullanici.getMesajListesi()[i] != null) {
                    System.out.println(kullanici.getMesajListesi()[i].getMesajSahibi().getKullaniciAdi() + " : " + kullanici.getMesajListesi()[i].getMesaj());
                    mesajVarMi = true;
                }
            }
        } else {
            System.out.println(kullanici.getKullaniciAdi() + " Adlı Kullanici ile Arkadas Degilsiniz.");
        }
        if (!mesajVarMi) {
            System.out.println("Mesaj Bulunamadı !");
        }
    }

    @Override
    void telNumarası(int a) {
        boolean varMi = false;
        int count = 0;
        for (int i = 0; i < this.p_paylasimListesi.length; i++) {
            if (this.p_paylasimListesi[i] != null) {
                if (this.p_paylasimListesi[i].getPaylasimId() == a) {
                    for (int j = 0; j < this.p_paylasimListesi[i].getYorumListesi().length; j++) {
                        if (this.p_paylasimListesi[i].getYorumListesi()[j] != null) {
                            for (int k = 0; k < this.p_paylasimListesi[i].getYorumListesi()[j].getYorum().length(); k++) {
                                char c = this.p_paylasimListesi[i].getYorumListesi()[j].getYorum().charAt(k);
                                if (kontrol(c)) {
                                    count++;
                                } else {
                                    if (count == 11) {
                                        System.out.println("Yorumu Yapan : " + this.p_paylasimListesi[i].getYorumListesi()[j].getYorumSahibi());
                                        varMi = true;
                                    }
                                    count = 0;
                                }
                                if (k == this.p_paylasimListesi[i].getYorumListesi()[j].getYorum().length() - 1) {
                                    if (count == 11) {
                                        System.out.println("Yorumu Yapan : " + this.p_paylasimListesi[i].getYorumListesi()[j].getYorumSahibi());
                                        varMi = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!varMi) {
            System.out.println("11 Haneli Telefon Numarası Yorumunu Yapan Yok.");
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
        } else if (Premium_Kullanici.this.kontrol(this.pArkadasListesi, kullanici)) { // Arkadas Listesinde Olan Birini Tekrardan Arkadas Ekleyememek Icın Kontrol.
            //    System.out.println(kullanici.getKullaniciAdi() + " Adlı Kullanici İle Zaten Arkadaşsınız");
            return;
        } else {
            if (mevcutArkadasSayisi < this.pArkadasListesi.length) { // Kullanicinin arkadas listesinde yer var mı kontrolu.
                for (int i = 0; i < this.pArkadasListesi.length; i++) {
                    if (this.pArkadasListesi[i] == null) {
                        if (istekKabulRet(onayRet)) { // Arkadaslik istegini kabul etme kontrolu.
                            this.pArkadasListesi[i] = kullanici;
                            System.out.println(kullanici.getKullaniciAdi() + " Adlı Kullanici, "
                                    + this.getKullaniciAdi() + " Adlı Kullanıcının Arkadas Listesine Eklendi.");
                            mevcutArkadasSayisi++;
                            break;
                        } else { // Arkadaslik istegini reddedildigind bu bloga girer.
                            System.out.println(kullanici.getKullaniciAdi() + ", Istegi Reddetti.");
                            return;
                        }

                    }
                }

            } else { // Arkadas listesi dolu oldugunda bu bloga girer.
                System.out.println("!!! Arkadas Listeniz Dolu Olduğundan, "
                        + kullanici.getKullaniciAdi() + " Adlı Kullanıcıyı Arkadas Olarak Ekleyemessiniz !!!");
            }

        }
        kullanici.arkadasEkle(this, onayRet);

    }

    @Override
    void arkadasSil(Kullanici kullanici) {
        for (int i = 0; i < this.getPArkadasListesi().length; i++) {
            if (this.getPArkadasListesi()[i] != null) {
                if (kullanici.getKullaniciId() == this.getPArkadasListesi()[i].getKullaniciId()) { // Parametre olarak gonderilen arkadasi listede buldugunda bu bloga girer.
                    System.out.println(this.getPArkadasListesi()[i].getKullaniciAdi() + " Adlı Kullanici, "
                            + this.getKullaniciAdi() + " Adlı Kullanıcının Arkadas Listesinden Silindi.");
                    this.getPArkadasListesi()[i] = null;
                    mevcutArkadasSayisi--;
                    kullanici.arkadasSil(this);
                    break;
                }
            }

        }
    }

    @Override
    public void arkPaylasimGoruntule(Kullanici k) {
        System.out.println("");
        System.out.println(k.getKullaniciAdi() + " Adlı Kullanicinin Paylasimlari ");
        System.out.println("");
        if (k instanceof Premium_Kullanici) {
            for (int i = 0; i < ((Premium_Kullanici) k).getP_paylasimListesi().length; i++) {
                if (((Premium_Kullanici) k).getP_paylasimListesi()[i] != null) {
                    System.out.println((i + 1) + ".Paylasim : " + ((Premium_Kullanici) k).getP_paylasimListesi()[i].getPaylasim());
                }
            }
        }
        if (k instanceof Standart_Kullanici) {
            for (int i = 0; i < ((Standart_Kullanici) k).getS_paylasimListesi().length; i++) {
                if (((Standart_Kullanici) k).getS_paylasimListesi()[i] != null) {
                    System.out.println((i + 1) + ".Paylasim : " + ((Standart_Kullanici) k).getS_paylasimListesi()[i].getPaylasim());
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
        for (int i = 0; i < this.getPArkadasListesi().length; i++) {
            if (this.getPArkadasListesi()[i] != null) {
                System.out.println("Kullanici Adi : " + this.getPArkadasListesi()[i].getKullaniciAdi()
                        + "\tKullanici Id : " + this.getPArkadasListesi()[i].getKullaniciId());
                toplam++;
            }

        }
        System.out.println(this.getKullaniciAdi() + " Adlı Kullanıcının Arkadas Sayisi : " + toplam);
        System.out.println("");
    }

    @Override
    boolean kontrol(Kullanici[] liste, Kullanici k) { // Arkadas Listesinde Var mı Yok mu kontrolu.
        for (int i = 0; i < liste.length; i++) {
            if (liste[i] == k) {
                return true;
            }
        }
        return false;
    }

    @Override
    boolean istekKabulRet(int onayRet) {
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
        if (mevcutPaylasimSayisi < this.p_paylasimListesi.length) { // Kullanicinin paylasim listesinde yer olup olmadigini kontrol eder.
            for (int i = 0; i < this.p_paylasimListesi.length; i++) {
                if (this.p_paylasimListesi[i] == null) {
                    this.p_paylasimListesi[i] = paylasim;
                    paylasim.setPaylasimSahibi(this.getKullaniciAdi()); // Paylasimin sahibini belirler.
                    System.out.println(this.getKullaniciAdi() + " Adlı Kullanici, " + this.p_paylasimListesi[i].getPaylasimId()
                            + " Id'li '" + paylasim.getPaylasim() + "' Paylasimini Yapti.");
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
        for (int i = 0; i < this.p_paylasimListesi.length; i++) {
            if (this.p_paylasimListesi[i] != null) {
                if (this.p_paylasimListesi[i].getPaylasimId() == paylasim.getPaylasimId()) {
                    this.p_paylasimListesi[i] = null;
                    System.out.println(paylasim.getPaylasim() + " Adlı Paylasim, "
                            + this.getKullaniciAdi() + " Adlı Kullanicinin Paylasim Listesinden Silindi");
                    mevcutPaylasimSayisi--;
                    break;
                } 
            }
        }
        for (int i = 0; i < paylasim.getGenelPaylasimListesi().length; i++) { // Paylasimi genel paylasim listesinden silme dongusu.
            if (paylasim.getGenelPaylasimListesi()[i] != null) {
                if (paylasim.getGenelPaylasimListesi()[i].getPaylasimId() == paylasim.getPaylasimId()) {
                    paylasim.getGenelPaylasimListesi()[i] = null;
                }
            }
        }

    }

    @Override
    public void paylasimGuncelle(int guncellencekPaylasimId, String yeniPaylasim) {
        for (int i = 0; i < this.p_paylasimListesi.length; i++) {
            if (this.p_paylasimListesi[i] != null) {
                if (guncellencekPaylasimId == this.p_paylasimListesi[i].getPaylasimId()) { // Guncellenecek paylasimin id'si ile yeni paylasim id'si esit oldugunda bu bloga girer.
                    this.p_paylasimListesi[i].setPaylasim(yeniPaylasim);  // Parametre olarak gelen paylasimi set edip gunceller.
                    System.out.println(guncellencekPaylasimId + " Id'li Paylasim, " + yeniPaylasim + " Olarak Guncellendi.");
                }
            }
        }
    }

    @Override
    public boolean kontrol(Paylasim p) {// Boyle bir paylasimin olup olmadigini kontrol eden metod.
        for (int i = 0; i < p.getGenelPaylasimListesi().length; i++) {
            if (p.getGenelPaylasimListesi()[i] == p) {
                return true;

            }
        }
        return false;
    }

    @Override
    public void yorumYap(Paylasim paylasim, Yorum yorum) {
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
            System.out.println(paylasim.getPaylasim() + " Adlı Bir Paylasim Bulunmamaktadır.");
        }
    }

    @Override
    public void yorumSil(Paylasim paylasim, Yorum yorum) {
        if (kontrol(paylasim)) {
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
    public void yorumListele(Paylasim paylasim) { // Premium kullanici istedigi yorumu listeleyebilir.
        if (kontrol(paylasim)) {
            System.out.println("");
            System.out.println("*** " + paylasim.getPaylasim() + " Yorum Listesi ***");
            System.out.println("");
            for (int i = 0; i < paylasim.getYorumListesi().length; i++) {
                if (paylasim.getYorumListesi()[i] != null) {
                    System.out.print((i + 1) + ". Yorum : " + paylasim.getYorumListesi()[i].getYorum() + "\tYorum Sahibi : " + paylasim.getYorumListesi()[i].getYorumSahibi());
                    System.out.println("");
                }
            }
            System.out.println("");
        } else {
            System.out.println(paylasim.getPaylasim() + " Adlı Bir Paylasim Bulunmamaktadır.");
        }
    }

    @Override
    public void paylasimiBegen(Paylasim paylasim) {
        if (Premium_Kullanici.this.kontrol(paylasim)) {// Paylasim listesinde, parametre olarak gelen paylasim varsa bu bloga girer.
            if (kontrol(pArkadasListesi, this)) {

            }

            for (int i = 0; i < paylasim.getBegenenlerListesi().length; i++) {
                if (paylasim.getBegenenlerListesi()[i] == null) {
                    paylasim.getBegenenlerListesi()[i] = this.getKullaniciAdi(); // Paylasimi begenen kullanciyi begenenler listesin ekler.
                    System.out.println(this.getKullaniciAdi() + ", " + paylasim.getPaylasim() + "\tAdlı Paylasimi Begendi.");
                    paylasim.setBegeniSayisi(paylasim.getBegeniSayisi() + 1);
                    break;
                }
            }

        } else { // Paylasim listesinde, parametre olarak gelen paylasim yoksa bu bloga girer.
            System.out.println(paylasim.getPaylasim() + " Adlı Bir Paylasim Bulunmamaktadır.");
        }

    }

    @Override
    public void paylasimListele() {
        System.out.println("");
        System.out.println(this.getKullaniciAdi() + " Adlı Kullanicinin Paylasimlari Goruntuleniyor...");
        System.out.println("");
        boolean varMi = false;
        for (int i = 0; i < this.p_paylasimListesi.length; i++) {
            if (this.p_paylasimListesi[i] != null) {
                System.out.println("Paylasim Id : " + this.p_paylasimListesi[i].getPaylasimId()
                        + "\t\tPaylasim : " + this.p_paylasimListesi[i].getPaylasim()
                        + "\tBegeni Sayisi : " + this.p_paylasimListesi[i].getBegeniSayisi()
                        + "\tYorum Sayisi : " + this.p_paylasimListesi[i].getYorumSayisi()
                        + "\tBegenenler : " + begenenler(this.p_paylasimListesi[i])
                        + "\t  Yorum Yapanlar : " + yorumYapanlar(this.p_paylasimListesi[i])
                        + "\t Yorum : " + yorum_icerigi(this.p_paylasimListesi[i]));
                varMi = true;

            }
        }
        if (!varMi) {
            System.out.println("Paylasim Bulunamadı !");
        }
    }

    @Override
    public String yorum_icerigi(Paylasim p) { // Paylasima yapilan yorumların icerigi belli bir formatta donduren metod
        String a = "[";
        for (int i = 0; i < p.getYorumListesi().length; i++) {
            if (p.getYorumListesi()[i] != null) {
                a += p.getYorumListesi()[i].getYorum() + (p.getYorumListesi()[i].getYorum() != null ? ", " : "]");

            }
        }
        return a + "\t";
    }

    @Override
    public String yorumYapanlar(Paylasim paylasim) { // Paylasima yorum yapan kullanicilari belli bir formatta donduren metod.
        String a = "[";
        for (int i = 0; i < paylasim.getYorumListesi().length; i++) {
            if (paylasim.getYorumListesi()[i] != null) {
                a += paylasim.getYorumListesi()[i].getYorumSahibi() + (paylasim.getYorumListesi()[i + 1] != null ? ", " : "]");

            }
        }
        return a;
    }

    @Override
    public String begenenler(Paylasim paylasim) { // Paylasimi begenen kullanicilari belli bir formatta donduren metod.
        String a = "[";
        for (int i = 0; i < paylasim.getBegenenlerListesi().length; i++) {
            if (paylasim.getBegenenlerListesi()[i] != null) {
                a += paylasim.getBegenenlerListesi()[i] + (paylasim.getBegenenlerListesi()[i + 1] != null ? ", " : "]");
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
        int max = 0;
        int maxIndex = 0;
        boolean varMi = false;
        if (kontrol(this.getP_paylasimListesi())) { // Paylasim listesinde paylasim varsa bu bloga girer.
            for (int i = 0; i < this.getP_paylasimListesi().length; i++) {
                if (this.getP_paylasimListesi()[i] != null) {
                    if (this.getP_paylasimListesi()[i].getBegeniSayisi() > max) {
                        maxIndex = i;
                        max = this.getP_paylasimListesi()[i].getBegeniSayisi();
                        varMi = true;
                    }
                }

            }
        }
        if (varMi) {
            System.out.println("Paylasim : " + this.getP_paylasimListesi()[maxIndex].getPaylasim()
                    + "\tBegeni Sayisi : " + this.getP_paylasimListesi()[maxIndex].getBegeniSayisi());
        } else {
            System.out.println("Paylasim Yok !");
        }

    }

    @Override
    public void enAzBegenilenPaylasim() {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        boolean varMi = false;
        if (kontrol(this.getP_paylasimListesi())) { // Paylasim listesinde paylasim varsa bu bloga girer.
            for (int i = 0; i < this.getP_paylasimListesi().length; i++) {
                if (this.getP_paylasimListesi()[i] != null) {
                    if (this.getP_paylasimListesi()[i].getBegeniSayisi() <= min) {
                        minIndex = i;
                        min = this.getP_paylasimListesi()[i].getBegeniSayisi();
                        varMi = true;
                    }
                }

            }
        }

        if (varMi) {
            System.out.println("Paylasim : " + this.getP_paylasimListesi()[min].getPaylasim()
                    + "\tBegeni Sayisi : " + this.getP_paylasimListesi()[min].getBegeniSayisi());
        } else {
            System.out.println("Paylasim Yok !");
        }
    }

    @Override
    public void enCokYorumYapilanPaylasim() {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        boolean varMi = false;
        if (kontrol(this.p_paylasimListesi)) { // Paylasim listesinde paylasim varsa bu bloga girer.
            for (int i = 0; i < this.p_paylasimListesi.length; i++) {
                if (this.p_paylasimListesi[i] != null) {
                    if (this.p_paylasimListesi[i].getYorumSayisi() > max) {
                        maxIndex = i;
                        max = this.p_paylasimListesi[i].getYorumSayisi();
                        varMi = true;
                    }
                }
            }
        }
        if (varMi) {
            System.out.println("Paylasim : " + this.getP_paylasimListesi()[maxIndex].getPaylasim()
                    + "\tYorum Sayisi : " + this.getP_paylasimListesi()[maxIndex].getYorumSayisi());
        } else {
            System.out.println("Paylasim Yok !");
        }
    }

    @Override
    public void enAzYorumYapilanPaylasim() {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        boolean varMi = false;
        if (kontrol(this.getP_paylasimListesi())) { // Paylasim listesinde paylasim varsa bu bloga girer.
            for (int i = 0; i < this.getP_paylasimListesi().length; i++) {
                if (this.getP_paylasimListesi()[i] != null) {
                    if (this.getP_paylasimListesi()[i].getYorumSayisi() <= min) {
                        minIndex = i;
                        min = this.getP_paylasimListesi()[i].getYorumSayisi();
                        varMi = true;
                    }
                }

            }
        }

        if (varMi) {
            System.out.println("Paylasim : " + this.getP_paylasimListesi()[min].getPaylasim()
                    + "\tYorum Sayisi : " + this.getP_paylasimListesi()[min].getYorumSayisi());
        } else {
            System.out.println("Paylasim Yok !");
        }
    }

    public Kullanici[] getPArkadasListesi() {
        return pArkadasListesi;
    }

    public void setPArkadasListesi(Kullanici[] arkadasListesi) {
        this.pArkadasListesi = arkadasListesi;
    }

    public int getMevcutArkadasSayisi() {
        return mevcutArkadasSayisi;
    }

    public void setMevcutArkadasSayisi(int mevcutArkadasSayisi) {
        this.mevcutArkadasSayisi = mevcutArkadasSayisi;
    }

    public Paylasim[] getP_paylasimListesi() {
        return p_paylasimListesi;
    }

    public void setP_paylasimListesi(Paylasim[] p_paylasimListesi) {
        this.p_paylasimListesi = p_paylasimListesi;
    }

    public int getMevcutPaylasimSayisi() {
        return mevcutPaylasimSayisi;
    }

    public void setMevcutPaylasimSayisi(int mevcutPaylasimSayisi) {
        this.mevcutPaylasimSayisi = mevcutPaylasimSayisi;
    }

}
