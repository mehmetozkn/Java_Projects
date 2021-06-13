
public class Urun extends Magaza {

    private String alt_üst;
    private String urun_adi;
    private int urun_fiyati;
    private int stok_adeti;

    public Urun(String magaza_adi, String urun_adi, String alt_üst, int urun_fiyati, int stok_adeti) {
        super(magaza_adi);
        this.alt_üst = alt_üst;
        this.urun_adi = urun_adi;
        this.urun_fiyati = urun_fiyati;
        this.stok_adeti = stok_adeti;
    }

    public String getAlt_üst() {
        return alt_üst;
    }

    public void setAlt_üst(String alt_üst) {
        this.alt_üst = alt_üst;
    }

    public String getUrun_adi() {
        return urun_adi;
    }

    public void setUrun_adi(String urun_adi) {
        this.urun_adi = urun_adi;
    }

    public int getUrun_fiyati() {
        return urun_fiyati;
    }

    public void setUrun_fiyati(int urun_fiyati) {
        this.urun_fiyati = urun_fiyati;
    }

    public int getStok_adeti() {
        return stok_adeti;
    }

    public void setStok_adeti(int stok_adeti) {
        this.stok_adeti = stok_adeti;
    }

}
