
import java.util.ArrayList;

public class Fabrika {

    private int id;
    private String ad;
    private ArrayList<Personel> personelListesi;

    public Fabrika(int id, String ad) {
        this.id = id;
        this.ad = ad;
        this.personelListesi = new ArrayList<>();
    }

    public void personelEkle(Personel personel) {
        personelListesi.add(personel);
    }

    public void yillikZamYap() {
        System.out.println("*** Yillik Zam Sonrasi ***");
        for (int i = 0; i < personelListesi.size(); i++) {
            personelListesi.get(i).zamHesapla();
        }
    }

    public void bilgileriYazdir() {
        System.out.println("*** Tüm Personellerin Bilgileri ***");
        for (int i = 0; i < personelListesi.size(); i++) {
            personelListesi.get(i).bilgileriYazdir();
            System.out.println("-----------------");

        }
    }

    public void personelSay() {
        int muhendisSayisi = 0;
        int isciSayisi = 0;
        int stajyerSayisi = 0;
        ArrayList<Integer> personelSayisiListesi = new ArrayList<>();
        
        for (int i = 0; i < personelListesi.size(); i++) {
            if (personelListesi.get(i) instanceof Muhendis) {
                muhendisSayisi++;
            }
            if (personelListesi.get(i) instanceof Isci) {
                isciSayisi++;
            }
            if (personelListesi.get(i) instanceof Stajyer) {
                stajyerSayisi++;
            }

        }
        personelSayisiListesi.add(muhendisSayisi);
        personelSayisiListesi.add(isciSayisi);
        personelSayisiListesi.add(stajyerSayisi);

        System.out.println("Personel Sayilari : "+personelSayisiListesi);
    }

}
