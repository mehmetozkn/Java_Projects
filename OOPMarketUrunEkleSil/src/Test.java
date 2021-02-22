
public class Test {

    public static void main(String[] args) {

        Satici satici_1 = new Satici("Ali", "Kaya");
        Satici satici_2 = new Satici("Ahmet", "Soylu");

        Market market_1 = new Market("Ercanlar Market", 4);

        Urun elma = new Urun(1231, "Elma", "Meyve", 4, satici_1);
        Urun armut = new Urun(1232, "Armut", "Meyve", 5, satici_2);
        Urun kola = new Urun(1233, "Kola", "Içecek", 10, satici_1);
        Urun fanta = new Urun(1234, "Fanta", "Içecek", 9, satici_1);
        Urun ekmek = new Urun(1235, "Ekmek", "Yiyecek", 2, satici_2);

        market_1.urunEkle(elma);
        market_1.urunEkle(armut);
        market_1.urunEkle(kola);
        market_1.urunEkle(fanta);
        market_1.urunEkle(ekmek);
        System.out.println("");

        market_1.urunListele();

        market_1.sayiYazdir();

        market_1.urunSil(1231);

        market_1.urunListele();

        market_1.sayiYazdir();

        market_1.urunEkle(ekmek);

        System.out.println("");

        market_1.urunListele();

        market_1.sayiYazdir();

    }

}
