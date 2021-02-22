
public class Stajyer extends Personel implements IZamHesaplayici{

    public Stajyer(int id, String adSoyad, int maas, int calismaYili, String unvan) {
        super(id, adSoyad, maas, calismaYili, unvan);
    }

    @Override
   public void bilgileriYazdir() {
        System.out.println("Stajyer Id : " + getId());
        System.out.println("Stajyer Ad Soyad : " + getAdSoyad());
        System.out.println("Stajyer Maas : " + getMaas());
        System.out.println("Stajyer Calisma Yili : " + getCalismaYili());
        System.out.println("Stajyer Unvan : " + getUnvan());
    }

    @Override
    public void zamHesapla() {
        System.out.println("Stajyer Maasi : " +getMaas());
        System.out.println("");
    }
    
}
