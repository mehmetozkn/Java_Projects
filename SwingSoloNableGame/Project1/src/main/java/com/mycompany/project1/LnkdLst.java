package com.mycompany.project1;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class LnkdLst<T> {

    public static ArrayList<String> possiblesLocations;
    Node<T> head;
    public static String bosluk = "     ";
    public static int rema = 0;

    public LnkdLst(T data) {
        this.head = new Node<T>(data);

    }

    public void generateLnkdLst(int size) {
// linkedlist oluşturma metodu
        Node<T> temp = head;
        Node<T> a1 = head;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                if ((i == (size / 2) - 1 || i == (size / 2)) && ((j == (size / 2) - 2 || j == (size / 2) - 1))) {
                    // ortada boşluk bırakmak için
                    Node<T> newNode = new Node(bosluk);
                    temp.child = newNode;
                    temp = temp.child;

                } else {
                    Node<T> newNode = new Node("" + (char) (65 + i) + (j + 2) + "");
                    temp.child = newNode;
                    temp = temp.child;
                }

            }

            if (i != size - 1) {
                Node<T> newNode = new Node("" + (char) (66 + i) + (1) + "");
                a1.nextNode = newNode;
                a1 = a1.nextNode;
                temp = a1;
            }

        }
        rema = (size * size) - 4;

    }

    public void arrayPrint() {
        // kullanıcı bi yer seçtikten sonra gidebileceği yerleri gösterme metodu
        System.out.println("--- Possible Hits ---");
        for (String value : possiblesLocations) {
            System.out.println(value);
        }
    }

    public void play(String suankiYer, String gidilecekYer, JLabel pos) {

        // kullanıcının hangi yeri seçtiğini ve orda nereye gidebileceğini bulmak için harflari numaraya çevirme
        // ve satır sutun numaraları belirleyerek öyle hareket etmek.
        String bulunanYerHarf = suankiYer.substring(0, 1);
        String bulunanYerSayi = suankiYer.substring(1);

        int suankiYerSutunIndex = bulunanYerHarf.hashCode() - 64;
        int suankiYerSatirIndex = Integer.parseInt(bulunanYerSayi);

        String gidilecekYerHarf = gidilecekYer.substring(0, 1);
        String gidilecekYerSayi = gidilecekYer.substring(1);

        int gidilecekYerSutunIndex = gidilecekYerHarf.hashCode() - 64;
        int gidilecekYerSatirIndex = Integer.parseInt(gidilecekYerSayi);
        Node<T> temp = head;

        if (gidilecekYerSutunIndex > suankiYerSutunIndex) { // soldan saga gitme
            if (possiblesLocations.contains(gidilecekYer)) {
                // seçtiği boş yapma
                temp = head;
                for (int i = 1; i < suankiYerSutunIndex; i++) {
                    temp = temp.nextNode;
                }
                for (int i = 1; i < suankiYerSatirIndex; i++) {
                    temp = temp.child;
                }
                T bos = (T) bosluk;
                temp.data = bos;

                // üstünden atladığı yeri boş yapma
                temp = head;
                for (int i = 1; i < suankiYerSutunIndex + 1; i++) {
                    temp = temp.nextNode;
                }
                for (int i = 1; i < suankiYerSatirIndex; i++) {
                    temp = temp.child;
                }
                T bos2 = (T) bosluk;
                temp.data = bos2;

                // gittiği yerin kordinatını gittiği yere verme
                temp = head;
                for (int i = 1; i < suankiYerSutunIndex + 2; i++) {
                    temp = temp.nextNode;
                }
                for (int i = 1; i < suankiYerSatirIndex; i++) {
                    temp = temp.child;
                }
                int suan = gidilecekYerSutunIndex;
                Character ch = (char) (suan + 64);
                temp.data = (T) (ch + "" + gidilecekYerSatirIndex);
                rema--;
                pos.setText("Successful hit!");
                possiblesLocations.clear();

            }

        }

        // ----------------------------------------------------
        if (gidilecekYerSutunIndex < suankiYerSutunIndex) { // soldan saga gitme
            if (possiblesLocations.contains(gidilecekYer)) {
                // seçtiği boş yapma
                temp = head;
                for (int i = 1; i < suankiYerSutunIndex; i++) {
                    temp = temp.nextNode;
                }
                for (int i = 1; i < suankiYerSatirIndex; i++) {
                    temp = temp.child;
                }
                T bos = (T) bosluk;
                temp.data = bos;

                // üstünden atladığı yeri boş yapma
                temp = head;
                for (int i = 1; i < suankiYerSutunIndex - 1; i++) {
                    temp = temp.nextNode;
                }
                for (int i = 1; i < suankiYerSatirIndex; i++) {
                    temp = temp.child;
                }
                T bos2 = (T) bosluk;
                temp.data = bos2;

                // gittiği yerin kordinatını gittiği yere verme
                temp = head;
                for (int i = 1; i < suankiYerSutunIndex - 2; i++) {
                    temp = temp.nextNode;
                }
                for (int i = 1; i < suankiYerSatirIndex; i++) {
                    temp = temp.child;
                }
                int suan = gidilecekYerSutunIndex;
                Character ch = (char) (suan + 64);
                temp.data = (T) (ch + "" + gidilecekYerSatirIndex);
                rema--;
                pos.setText("Successful hit!");
                possiblesLocations.clear();

            }

        }

        // ----------------------------------------------------
        if (gidilecekYerSatirIndex > suankiYerSatirIndex) { // yukardan aşağı
            if (possiblesLocations.contains(gidilecekYer)) {
                // seçtiği boş yapma
                for (int i = 1; i < suankiYerSutunIndex; i++) {
                    temp = temp.nextNode;
                }
                for (int i = 1; i < suankiYerSatirIndex; i++) {
                    temp = temp.child;
                }

                T bos = (T) bosluk;
                temp.data = bos;

                // üstünden atladığı yeri bos yapma
                temp = head;
                for (int i = 1; i < suankiYerSutunIndex; i++) {
                    temp = temp.nextNode;
                }
                for (int j = 1; j < suankiYerSatirIndex + 1; j++) {
                    temp = temp.child;
                }
                T bos2 = (T) bosluk;
                temp.data = bos;

                // gittiği yerin kordinatını gittiği yere verme
                temp = head;
                for (int i = 1; i < suankiYerSutunIndex; i++) {
                    temp = temp.nextNode;
                }

                for (int i = 1; i < suankiYerSatirIndex + 2; i++) {
                    temp = temp.child;
                }
                int suan = gidilecekYerSutunIndex;
                Character ch = (char) (suan + 64);
                temp.data = (T) (ch + "" + gidilecekYerSatirIndex);
                rema--;
                pos.setText("Successful hit!");
                possiblesLocations.clear();

            }

        }

        // ---------------------------------------------------
        if (gidilecekYerSatirIndex < suankiYerSatirIndex) { // aşağıdan yukarı
            if (possiblesLocations.contains(gidilecekYer)) {
                // seçtiği boş yapma
                for (int i = 1; i < suankiYerSutunIndex; i++) {
                    temp = temp.nextNode;
                }
                for (int i = 1; i < suankiYerSatirIndex; i++) {
                    temp = temp.child;
                }

                T bos = (T) bosluk;
                temp.data = bos;

                // üstünden atladığı taşı boş yapma
                temp = head;
                for (int i = 1; i < suankiYerSutunIndex; i++) {
                    temp = temp.nextNode;
                }
                for (int j = 1; j < suankiYerSatirIndex - 1; j++) {
                    temp = temp.child;
                }
                T bos2 = (T) bosluk;
                temp.data = bos;

                // gittiği yerin kordinatını gittiği yere verme
                temp = head;
                for (int i = 1; i < suankiYerSutunIndex; i++) {
                    temp = temp.nextNode;
                }

                for (int i = 1; i < suankiYerSatirIndex - 2; i++) {
                    temp = temp.child;
                }
                int suan = gidilecekYerSutunIndex;
                Character ch = (char) (suan + 64);
                temp.data = (T) (ch + "" + gidilecekYerSatirIndex);
                rema--;
                pos.setText("Successful hit!");
                possiblesLocations.clear();

            }

        }

    }

    public void possibleHits(String suankiYer, int size, JLabel possibles) {
        // gidilebilecek yerleri bulan metod
        boolean sectiğiYerDoluMu = false;
        boolean uzerindenAtlananYerDoluMu = false;
        boolean atlayacagiYerBosMu = false;

        String suankiyerHarf = suankiYer.substring(0, 1);
        String suankiyerSayi = suankiYer.substring(1);
        int suankiyerHarfIndex = suankiyerHarf.hashCode() - 64;
        int suankiyerSatirIndex = Integer.parseInt(suankiyerSayi);

        Node<T> temp = head;
        Node<T> perHead = head;
        possiblesLocations = new ArrayList<>();

        // Soldan Sağa atlayabilme kontrolü
        if (suankiyerHarfIndex <= size - 2) {
            while (!sectiğiYerDoluMu) {
                for (int i = 1; i < suankiyerHarfIndex; i++) {
                    temp = temp.nextNode;
                }

                for (int i = 1; i < suankiyerSatirIndex; i++) {
                    temp = temp.child;
                }

                if (temp.data.equals(suankiYer)) {
                    sectiğiYerDoluMu = true;
                } else {
                    break;
                }
            }

            while (!uzerindenAtlananYerDoluMu) {
                temp = perHead;

                for (int i = 1; i < suankiyerHarfIndex + 1; i++) {
                    temp = temp.nextNode;
                }

                for (int i = 1; i < suankiyerSatirIndex; i++) {
                    temp = temp.child;

                }

                if (!temp.data.equals(bosluk)) {
                    uzerindenAtlananYerDoluMu = true;

                } else {
                    break;
                }

            }

            while (!atlayacagiYerBosMu) {
                temp = perHead;

                for (int i = 1; i < suankiyerHarfIndex + 2; i++) {
                    temp = temp.nextNode;

                }

                for (int i = 1; i < suankiyerSatirIndex; i++) {
                    temp = temp.child;

                }

                if (temp.data.equals(bosluk)) {
                    atlayacagiYerBosMu = true;

                } else {
                    break;
                }
            }

            if (sectiğiYerDoluMu && uzerindenAtlananYerDoluMu && atlayacagiYerBosMu) {
                // System.out.println("Soldan Sağa Gidilebilir");
                int suan = suankiyerHarfIndex;
                suan += 2 + 64;
                Character charGidilecekYer = (char) suan;
                possiblesLocations.add(charGidilecekYer + "" + suankiyerSatirIndex);

            } else {
                //   System.out.println("Soldan Sağa Gidilemez");
            }

        }

        // ------------------------------------------------------------------------------
        temp = perHead;
        sectiğiYerDoluMu = false;
        uzerindenAtlananYerDoluMu = false;
        atlayacagiYerBosMu = false;

        // Sağdan Sola atlayabilme kontrolü
        if (suankiyerHarfIndex > 2) {
        }
        while (!sectiğiYerDoluMu) {
            for (int i = 1; i < suankiyerHarfIndex; i++) {
                temp = temp.nextNode;
            }

            for (int i = 1; i < suankiyerSatirIndex; i++) {
                temp = temp.child;
            }

            if (temp.data.equals(suankiYer)) {
                sectiğiYerDoluMu = true;
            } else {
                break;
            }
        }

        while (!uzerindenAtlananYerDoluMu) {
            temp = perHead;

            for (int i = 1; i < suankiyerHarfIndex - 1; i++) {
                temp = temp.nextNode;
            }

            for (int i = 1; i < suankiyerSatirIndex; i++) {
                temp = temp.child;

            }

            if (!temp.data.equals(bosluk)) {
                uzerindenAtlananYerDoluMu = true;
            } else {
                break;
            }

        }

        while (!atlayacagiYerBosMu) {
            temp = perHead;

            for (int i = 1; i < suankiyerHarfIndex - 2; i++) {
                temp = temp.nextNode;

            }
            for (int i = 1; i < suankiyerSatirIndex; i++) {
                temp = temp.child;

            }

            if (temp.data.equals(bosluk)) {
                atlayacagiYerBosMu = true;
            } else {
                break;
            }
        }

        if (sectiğiYerDoluMu && uzerindenAtlananYerDoluMu && atlayacagiYerBosMu) {
            // System.out.println("Sağdan Sola Gidilebilir");
            int suan = suankiyerHarfIndex;
            suan += -2 + 64;
            Character gidilecekYer = (char) suan;
            possiblesLocations.add(gidilecekYer + "" + (suankiyerSatirIndex));

        } else {
            // System.out.println("Sağdan Sola Gidilemez");
        }

        // --------------------------
        temp = perHead;
        sectiğiYerDoluMu = false;
        uzerindenAtlananYerDoluMu = false;
        atlayacagiYerBosMu = false;

        // Yukardan Aşağıya atlayabilme kontrolü
        if (suankiyerSatirIndex <= size - 2) {
            while (!sectiğiYerDoluMu) {
                for (int i = 1; i < suankiyerHarfIndex; i++) {
                    temp = temp.nextNode;
                }

                for (int i = 1; i < suankiyerSatirIndex; i++) {
                    temp = temp.child;
                }

                if (temp.data.equals(suankiYer)) {
                    sectiğiYerDoluMu = true;
                } else {
                    break;
                }
            }

            while (!uzerindenAtlananYerDoluMu) {
                temp = perHead;

                for (int i = 1; i < suankiyerHarfIndex; i++) {
                    temp = temp.nextNode;
                }

                for (int i = 1; i < suankiyerSatirIndex + 1; i++) {
                    temp = temp.child;

                }

                if (!temp.data.equals(bosluk)) {
                    uzerindenAtlananYerDoluMu = true;
                } else {
                    break;
                }

            }

            while (!atlayacagiYerBosMu) {
                temp = perHead;

                for (int i = 1; i < suankiyerHarfIndex; i++) {
                    temp = temp.nextNode;

                }
                for (int i = 1; i < suankiyerSatirIndex + 2; i++) {
                    temp = temp.child;

                }

                if (temp.data.equals(bosluk)) {
                    atlayacagiYerBosMu = true;
                } else {
                    break;
                }
            }

            if (sectiğiYerDoluMu && uzerindenAtlananYerDoluMu && atlayacagiYerBosMu) {
                // System.out.println("Yukardan Aşağıya Gidilebilir");
                int suan = suankiyerSatirIndex;
                suan += 2;
                Character gidilecekYer = (char) (suankiyerHarfIndex + 64);
                possiblesLocations.add(gidilecekYer + "" + suan);

            } else {
                //System.out.println("Yukardan Aşağıya Gidilemez");
            }

        }

        // ---------------------------
        temp = perHead;
        sectiğiYerDoluMu = false;
        uzerindenAtlananYerDoluMu = false;
        atlayacagiYerBosMu = false;

        // Aşağıdan Yukarıya atlayabilme kontrolü
        if (suankiyerSatirIndex > 2) {
            while (!sectiğiYerDoluMu) {
                for (int i = 1; i < suankiyerHarfIndex; i++) {
                    temp = temp.nextNode;
                }

                for (int i = 1; i < suankiyerSatirIndex; i++) {
                    temp = temp.child;
                }

                if (temp.data.equals(suankiYer)) {
                    sectiğiYerDoluMu = true;
                } else {
                    break;
                }
            }

            while (!uzerindenAtlananYerDoluMu) {
                temp = perHead;

                for (int i = 1; i < suankiyerHarfIndex; i++) {
                    temp = temp.nextNode;
                }

                for (int i = 1; i < suankiyerSatirIndex - 1; i++) {
                    temp = temp.child;

                }

                if (!temp.data.equals(bosluk)) {
                    uzerindenAtlananYerDoluMu = true;
                } else {
                    break;
                }

            }

            while (!atlayacagiYerBosMu) {
                temp = perHead;

                for (int i = 1; i < suankiyerHarfIndex; i++) {
                    temp = temp.nextNode;

                }
                for (int i = 1; i < suankiyerSatirIndex - 2; i++) {
                    temp = temp.child;

                }

                if (temp.data.equals(bosluk)) {
                    atlayacagiYerBosMu = true;
                } else {
                    break;
                }
            }

            if (sectiğiYerDoluMu && uzerindenAtlananYerDoluMu && atlayacagiYerBosMu) {
                //  System.out.println("Aşağıdan Yukarıya Gidilebilir");
                int suan = suankiyerSatirIndex;
                suan -= 2;
                Character gidilecekYer = (char) (suankiyerHarfIndex + 64);
                possiblesLocations.add(gidilecekYer + "" + suan);

            } else {
                // System.out.println("Aşağıdan Yukarıya Gidilemez");
            }

        }
        String yazi = "";
        if (possiblesLocations.isEmpty()) {
            yazi += "There is no possibles hit";
        }
        for (String possiblesLocation : possiblesLocations) {
            yazi += possiblesLocation + ", ";

        }
        possibles.setText(yazi);

    }

    public void formatPrint(int size, JTextArea yazilacakYer) {
        // oyun tahtasındaki gibi formatlı bir şekilde ekrana yazdırma metodu

        Node<T> temp = head;
        Node<T> headTemp = head;
        Node<T> perTemp = head;
        int line = 1;
        int count = 1;
        int ref = 0;
        int exit = 1;
        while (temp != null) {
            if (ref == 0) {
                yazilacakYer.append("" + temp.data + " ");
                temp = temp.nextNode;
            } else {
                temp = headTemp;
            }

            if (temp == null || ref > 0) {
                ref++;
                yazilacakYer.append("\n");

                for (int j = 1; j <= size; j++) {

                    temp = perTemp;
                    if (j != 1) {
                        for (int k = 0; k < count; k++) {
                            temp = temp.nextNode;
                        }
                        count++;
                    }
                    for (int i = 1; i <= line; i++) {
                        temp = temp.child;
                    }

                    yazilacakYer.append("" + temp.data + " ");

                }
                line++;
                count = 1;
                exit++;
                if (exit == size) {
                    break;
                }

            }

        }
    }

}
