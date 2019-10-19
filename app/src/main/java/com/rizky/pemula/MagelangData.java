package com.rizky.pemula;

import java.util.ArrayList;

public class MagelangData {
    private static String[] wisataNames = {
            "Gunung Andong",
            "Candi Borobudur",
            "Pemandian Candi Umbul",
            "Ketep Pass",
            "Sendang Mudal",
            "Bukit Rema",
            "Candi Selogriyo",
            "Punthuk Setumbu",
            "Gardu Pandang Silancur",
            "Curug Silawe",
            "Goa Slandak"
    };

    private static String[] wisataDetails = {
            "Gunung yang memiliki ketinggian 1.726 mdpl ini terbilang mungil jika disbanding dengan gunung-gunung lain disekitarnya. Tetapi, meskipun mungil gunung ini pun tak kalah seru untuk dijelajahi.\n +Karena tak terlalu tinggi, maka waktu pendakian pun terbilang lebih singkat hanya sekitar 2 jam saja. Itulah mengapa gunung ini cocok untuk Anda yang sedang belajar naik gunung.\n Meski mungil, tetapi jangan remehkan pesona yang ditawarkan. Sepanjang jalan Anda akan ditemani ladang bambu, hijaunya hutan pinus dengan udaranya yang sejuk serta kicauan burung yang terbang bebas. Jangan lupa selalu berhati-hati di jalur pendakian karena jalurnya yang cukup menantang.\n",
            "Siapa yang ngga tahu tempat ini? Candi Borobudur merupakan salah satu peninggalan sejarah yang dikenal luas. Ngga cuma di Indonesia, tapi juga di manca negara. Candi ini merupakan salah satu candi terbesar di dunia. ",
            "Ingin merasakan sensasi mandi di tempat pemandian air hangat tertua di Indonesia? Maka Anda harus meluangkan waktu sejenak untuk mampir ke Candi Umbul dan merasakannya sendiri.\n Di sekitar kolam pemandian terdapat stupa serta banyak bebatuan yang diukir dengan corak tanaman dan binatang yang membuat tempat pemandian ini begitu unik.\n Tempat wisata di Magelang ini memiliki dua kolam pemandian dengan suhu air yang berbeda, satu kolam dingin dan yang kedua kolam air hangat. Air dalam kolam air hangat mengandung belerang sehingga dipercaya mampu menyembuhkan berbagai macam penyakit, misalnya penyakit kulit, terapi tulang hingga melancarkan peredaran darah.\n",
            "Ketep Pass adalah salah satu tempat yang paling tepat untuk menikmati keindahan gunung Merapi dan Merbabu. Dari sini, anda bisa melihat lepas ke arah kedua gunung tersebut.\n Ngga cuma itu, di Ketep Pass juga terdapat berbagai fasilitas penunjang yang lengkap lho. Selain itu, cukup mudah untuk dikunjungi.\n",
            "Sendang yang berlokasi di wilayah Kecamatan Sawangan Magelang ini memiliki air jernih sebening Kristal. Saking beningnya, Anda bahkan bisa melihat dasarnya yang berpasir secara langsung dari luar kolam. Itulah mengapa tempat wisata di Magelang ini belakangan jadi ngehits di kalangan pecinta selfie underwater.\n Jangan salah meski terlihat tenang namun air di sendang ini selalu mengalir sehingga kebersihan sendang selalu terjaga. Tak heran jika airnya selalu terlihat sebening Kristal.\n",
            "Ada hal yang unik ketika mendengar nama tempat wisata di Magelang yang satu ini, karena pasti akan selalu tertuju pada bangunan gereja dengan arsitektur mirip ayam yang berdiri kokoh di atas bukit. Ya, di atas Bukit Rhema terdapaat sebuah gereja tua yang ikonik sekali dengan arsitektur ayamnya hingga membuatnya terkenal hingga ke mancanegara. \n Bangunan ini memiliki beberapa lantai, misalnya basement yang diperuntukkan sebagai tempat berdoa. Lalu di lantai kedua dan ketiga bisa Anda jelajahi untuk menikmati panorama indahnya pegunungan menorah yang memukau.",
            "Meski tak sepopuler dan semegah Candi Borobudur, Candi Selogriyo tetap memiliki pesona dan keunikannya tersendiri. Untuk dapat mencapainya Anda perlu mengeluarkan tenaga ekstra dengan menelusuri jalur trekking sepanjang 2 km yang melintasi persawahan dan nukit-bukit hijau yang menawan. \n Sesampainya di area tempat wisata di Magelang ini Anda akan disambut dengan arsitektur candi yang unik dengan pelataran yang cukup luas. Serta panorama pegunungan yang memukau dengan udaranya yang menyejukkan. \n Tak jauh dari area candi terdapat sumber mata air yang kabarnya mampu membuat seseorang awet muda.",
            "Salah satu tempat baru untuk menikmati keindahan kota Magelang dari ketinggian, Puntuk Setumbu. Dari sini, anda juga dapat menikmati keindahan Candi Borobudur dari kejauhan.",
            "Tempat wisata di Magelang yang selanjutnya ini menawarkan keindahan alam yang tak ada habisnya. Juga spot foto kece yang instagramable banget dengan latar panorama kota Magelang yang seolah berada di balik awan. Dari pagi hingga senja, pemandangan yang terlihat dari Gardu Pandang Silancur ini akan selalu memikat. \n Destinasi ini menyuguhkan beberapa gardu pandang dengan tema dan ketinggian yang berbeda, dan tentunya dengan latar panorama yang berbeda pula.",
            "Air terjun ini memiliki ketinggian 50 meter, tak heran jika air yang jatuh seolah bergemuruh dengan begitu kerasnya, Jalur untuk mencapai tempat wisata di Magelang ini cukup berliku dan menantang tapi tak perlu khawatir karena sudah di semen sehingga tak terlalu licin dan mudah dilewati.",
            "Berlokasi di kawasan perbukitan yang dipenuhi pohon pinus, Goa Slandak memiliki banyak hal seru yang menarik untuk dijelajahi. Ada banyak patung yang berbenuk seperti gorilla dan landak raksasa yang akan Anda temui di sekitar pintu masuk hutan pinus sebelum mencapai goa. Anda juga bisa mengambil foto selfie dengan penunggu hutan tersebut lho. \n Di sekitarnya juga terdapat gardu pandang berukuran mini yang bisa digunakan untuk mengambil foto selfie juga sekaligus untuk bersantai sejenak. Setelah selesai seru-seruan dengan para penunggu hutan pinus dan berselfie di gardu pandang, Anda akan menemukan Goa Slandak yang berdampingan dengan air terjun yang menawan. \n Tak jauh dari air terjun di bibir goa, ada Kedung Sembrani dengan kolamnya yang tenang dan air terjun kecilnya yang memikat."
    };

    private static int[] wisataImages = {
            R.drawable.andong,
            R.drawable.borobudur,
            R.drawable.candi_umbul,
            R.drawable.ketep,
            R.drawable.mudal,
            R.drawable.rema,
            R.drawable.selogriyo,
            R.drawable.setumbu,
            R.drawable.silancur,
            R.drawable.silawe,
            R.drawable.slandak
    };

    static ArrayList<Magelang> getListData() {
        ArrayList<Magelang> list = new ArrayList<>();
        for (int position = 0; position < wisataNames.length; position++) {
            Magelang magelang = new Magelang();
            magelang.setName(wisataNames[position]);
            magelang.setDetail(wisataDetails[position]);
            magelang.setPhoto(wisataImages[position]);
            list.add(magelang);
        }
        return list;
    }
}

