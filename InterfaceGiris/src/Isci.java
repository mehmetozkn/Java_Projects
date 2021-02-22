
public class Isci extends Personel implements IZamHesaplayici {

    public Isci(int id, String adSoyad, int maas, int calismaYili, String unvan) {
        super(id, adSoyad, maas, calismaYili, unvan);
    }

    @Override
   public void bilgileriYazdir() {
        System.out.println("Isci Id : " + getId());
        System.out.println("Isci Ad Soyad : " + getAdSoyad());
        System.out.println("Isci Maas : " + getMaas());
        System.out.println("Isci Calisma Yili : " + getCalismaYili());
        System.out.println("Isci Unvan : " + getUnvan());
    }

    @Override
    public void zamHesapla() {
        int yeniMaas;
        yeniMaas = (getMaas()*115)/100;
        System.out.println("Iscinin Yeni Maasi : " + yeniMaas);
        super.setMaas(yeniMaas);
        System.out.println("");
                
    }
}
