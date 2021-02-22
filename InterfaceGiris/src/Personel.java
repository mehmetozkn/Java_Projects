
public abstract class Personel implements IZamHesaplayici{
    private int id;
    private String adSoyad;
    private int maas;
    private int calismaYili;
    private String unvan;
    

    public Personel(int id, String adSoyad, int maas, int calismaYili, String unvan) {
        this.id = id;
        this.adSoyad = adSoyad;
        this.maas = maas;
        this.calismaYili = calismaYili;
        this.unvan = unvan;
    }
    
   public abstract void bilgileriYazdir();
   
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public int getCalismaYili() {
        return calismaYili;
    }

    public void setCalismaYili(int calismaYili) {
        this.calismaYili = calismaYili;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
    
    
    
    
}
