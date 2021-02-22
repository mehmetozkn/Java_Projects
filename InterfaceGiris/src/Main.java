
public class Main {

    public static void main(String[] args) {
        Fabrika f1 = new Fabrika(1967, "Microsof");

        Personel p1 = new Muhendis(10, "Mehmet Özkan", 5000, 5, "Senior");
        Personel p2 = new Isci(11, "Eren Ilık", 2500, 3, "Junior");
        Personel p3 = new Stajyer(12, "Talat Yel", 3500, 10, "Senior");

        Muhendis m1 = new Muhendis(1, "Murat Kurt", 4000, 2, "Junior");
        Isci i1 = new Isci(2, "Ahmet Bozkurt", 3000, 2, "Junior");
        Stajyer s1 = new Stajyer(3, "Mustafa Kemal", 15000, 10, "Senior");

        f1.personelEkle(p1);
        f1.personelEkle(p2);
        f1.personelEkle(p3);
        f1.bilgileriYazdir();
        f1.personelSay();
        f1.yillikZamYap();

        m1.personelEkle(i1);
        m1.personelEkle(s1);

        System.out.println("*** EKİP LİSTESİ ***");
        m1.bilgileriYazdir();

    }

}
