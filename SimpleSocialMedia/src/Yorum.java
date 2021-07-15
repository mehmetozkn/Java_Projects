
/**
 * @file Proje 3
 * @description Sosyal Medya
 * @assignment Odev_3
 * @date 29.01.2021
 * @author Mehmet Özkan mehmet.ozkan@stu.fsm.edu.tr
 */
public class Yorum {

    private String yorum;
    private int yorumId;
    private int yorumSayisi;
    private String yorumSahibi;

    public Yorum(String yorum, int yorumId) {
        this.yorum = yorum;
        this.yorumId = yorumId;
        this.yorumSayisi = yorumSayisi;
        this.yorumSahibi = yorumSahibi;
    }

    public String getYorumSahibi() {
        return yorumSahibi;
    }

    public void setYorumSahibi(String yorumSahibi) {
        this.yorumSahibi = yorumSahibi;
    }

    public int getYorumSayisi() {
        return yorumSayisi;
    }

    public void setYorumSayisi(int yorumSayisi) {
        this.yorumSayisi = yorumSayisi;
    }

    public String getYorum() {
        return yorum;
    }

    public void setYorum(String yorum) {
        this.yorum = yorum;
    }

    public int getYorumId() {
        return yorumId;
    }

    public void setYorumId(int yorumId) {
        this.yorumId = yorumId;
    }

}
