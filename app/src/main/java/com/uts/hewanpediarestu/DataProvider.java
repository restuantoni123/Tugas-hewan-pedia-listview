package com.uts.hewanpediarestu;

import android.content.Context;

import com.uts.hewanpediarestu.model.Hewan;
import com.uts.hewanpediarestu.model.Kucing;
import com.uts.hewanpediarestu.model.Katak;
import com.uts.hewanpediarestu.model.Anjing;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kucing> initDataKucing(Context ctx) {
        List<Kucing> kucings = new ArrayList<>();
        kucings.add(new Kucing("Angora", "Turki",
                "Aslinya berasal dari Ankara, Turki dengan ciri khas berbulu panjang dan lembut", R.drawable.cat_angora));
        kucings.add(new Kucing("Bengal", "Inggris",
                "Merupakan hasil persilangan antara Kucing Leopard Asia dengan kucing domestik Inggris", R.drawable.cat_bengal));
        kucings.add(new Kucing("Birmani", "Birma/Myanmar",
                "Konon awalnya merupakan ras kucing yand biasa menemani para biksu yang menetap pada kuil di Birma", R.drawable.cat_birman));
        kucings.add(new Kucing("Persia", "Iran",
                "Kucing berbulu panjang dengan wajah bundar dan hidung pesek. Awalnya berasal dari Iran kemudian diimpor ke Italia", R.drawable.cat_persia));
        kucings.add(new Kucing("Siam", "Thailand",
                "Kucing hasil turunan dari Wichian Maat (Kucing Thailand) dengan ciri khas berbadan panjang dan langsing, wajah lonjong, telinga lebar, dan mata kebiruan", R.drawable.cat_siam));
        kucings.add(new Kucing("Siberia", "Rusia",
                "Kucing domestik Rusia dengan bulu lebat dan badan besar tapi sangat lincah dan terkenal dengan kemampuan melompatnya ", R.drawable.cat_siberian));
        return kucings;
    }

    private static List<Anjing> initDataAnjing(Context ctx) {
        List<Anjing> anjings = new ArrayList<>();
        anjings.add(new Anjing("Bulldog", "Inggris",
                "Anjing populer yang dikenal dengan badan yang gemuk berotot, wajah seperti kain kusut, dan hidung yang pesek", R.drawable.dog_bulldog));
        anjings.add(new Anjing("Husky", "Alaska,Siberia,Finlandia (daerah bersalju) ",
                "Anjing jenis khusus yang awalnya digunakan untuk menarik kereta salju", R.drawable.dog_husky));
        anjings.add(new Anjing("Kintamani", "Indonesia",
                "Ras anjing asli pulau Bali ", R.drawable.dog_kintamani));
        anjings.add(new Anjing("Samoyed", "Rusia",
                "Anjing yang berasal dari Siberia yang awalnya biasa digunakan untuk menjaga ternak oleh suku Samoyed", R.drawable.dog_samoyed));
        anjings.add(new Anjing("Shepherd", "Jerman",
                "Anjing pintar dan kuat, sekarang banyak digunakan sebagai anjing penjaga, pengawal, dan anjing polisi (K9)", R.drawable.dog_shepherd));
        anjings.add(new Anjing("Shiba", "Jepang",
                "Anjing dari daerah Shiba ini gesit dan lincah sehingga awalnya banyak digunakan untuk berburu ", R.drawable.dog_shiba));
        return anjings;
    }

    private static List<Katak> initDataKatak(Context ctx) {
        List<Katak> kataks = new ArrayList<>();
        kataks.add(new Katak("Katak panah beracun biru", "Brazil dan selatan Suriname",
                "katak ini mengandung cukup racun untuk menyebabkan bahaya atau kematian pada manusia.", R.drawable.katak1));
        kataks.add(new Katak("Katak fantasmal beracun", "Ekuador",
                "Melansir Welsh Mountain Zoo, di alam liar, toksinnya dibuat dari makanan yang mereka konsumsi seperti semut atau serangga beracun..", R.drawable.katak2));
        kataks.add(new Katak("Katak panah beracun stroberi", "Nikaragua dan Kosta Rika",
                "paling beracun dari genusnya. Seperti katak panah lain, katak ini mendapatkan toksisitasnya dari makanan, yaitu rayap dan semut.", R.drawable.katak3));
        kataks.add(new Katak("Katak racun golfodulcean", "Amerika Tengah",
                "satu katak memiliki cukup racun untuk membunuh 13 manusia dewasa! Namun, untuk mendapat efek mematikan, racun ini harus dikonsumsi, bukan disuntikkan.", R.drawable.katak4));
        kataks.add(new Katak("Katak panah racun kokoe", "Kolombia",
                "Menyentuh katak dewasa bisa menyebabkan gejala neurologis serius dan mengancam jiwa. Gejalanya termasuk demam tinggi, kehilangan kendali otot, kejang, hingga kelumpuhan. Efeknya akan lebih fatal jika katak ini dimakan.", R.drawable.katak5));
        kataks.add(new Katak("Katak racun punggung merah", "Ekuador dan Peru",
                "Racunnya bisa membunuh predator kecil seperti burung dan menyebabkan cedera serius pada manusia..", R.drawable.katak6));
        return kataks;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKucing(ctx));
        hewans.addAll(initDataAnjing(ctx));
        hewans.addAll(initDataKatak(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
