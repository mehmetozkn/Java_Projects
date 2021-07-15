
/**
 * @file Proje 3
 * @description Sosyal Medya
 * @assignment Odev_3
 * @date 29.01.2021
 * @author Mehmet Özkan mehmet.ozkan@stu.fsm.edu.tr
 */
public interface IUygulama_Islemleri {

    void paylasimYap(Paylasim paylasim);

    void paylasimSil(Paylasim paylasim);

    void paylasimListele();

    void paylasimGuncelle(int guncellencekPaylasimId, String yeniPaylasim);

    void paylasimiBegen(Paylasim paylasim);

    void enCokBegenilenPaylasim();

    void enAzBegenilenPaylasim();

    void enCokYorumYapilanPaylasim();

    void enAzYorumYapilanPaylasim();

    void yorumYap(Paylasim paylasim, Yorum yorum);

    void yorumSil(Paylasim paylasim, Yorum yorum);

    void yorumListele(Paylasim paylasim);
}
