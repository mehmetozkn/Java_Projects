
/**
 * @file Proje 3
 * @description Sosyal Medya
 * @assignment Odev_3
 * @date 29.01.2021
 * @author Mehmet Özkan mehmet.ozkan@stu.fsm.edu.tr
 */
public class Mesaj {

    private String mesaj;
    private Kullanici mesajSahibi;

    public Mesaj(String mesaj) {
        this.mesaj = mesaj;
        this.mesajSahibi = mesajSahibi;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    public Kullanici getMesajSahibi() {
        return mesajSahibi;
    }

    public void setMesajSahibi(Kullanici mesajSahibi) {
        this.mesajSahibi = mesajSahibi;
    }

}
