
import java.util.ArrayList;

public class Muhendis extends Personel implements IZamHesaplayici, IYetki {

    private ArrayList<Personel> ekipListesi;

    public Muhendis(int id, String adSoyad, int maas, int calismaYili, String unvan) {
        super(id, adSoyad, maas, calismaYili, unvan);
        this.ekipListesi = new ArrayList<>();
    }

    @Override
    public void bilgileriYazdir() {
        int isciSayisi = 0;
        int stajyerSayisi = 0;
        
        for (int i = 0; i < ekipListesi.size(); i++) {
            System.out.println("Id : " + ekipListesi.get(i).getId());
            System.out.println("Ad Soyad : " + ekipListesi.get(i).getAdSoyad());
            System.out.println("Maas : " + ekipListesi.get(i).getMaas());
            System.out.println("Calisma Yili : " + ekipListesi.get(i).getCalismaYili());
            System.out.println("Unvan : " + ekipListesi.get(i).getUnvan());

            if (ekipListesi.get(i) instanceof Isci) {
                isciSayisi++;
            }
            if (ekipListesi.get(i) instanceof Stajyer) {
                stajyerSayisi++;

            }
            System.out.println("-----------------------");
        }
        
    }

    

    @Override
    public void zamHesapla() {
        int yeniMaas;
        yeniMaas = (getMaas() * 120) / 100;
        System.out.println("Muhendisin Yeni Maasi : " + yeniMaas);
        super.setMaas(yeniMaas);
        System.out.println("");
    }

    @Override
    public void personelEkle(Personel p) {
         if (p instanceof Isci) {
            ekipListesi.add(p);

        } if (p instanceof Stajyer) {
            ekipListesi.add(p);

        } 
    }

}
