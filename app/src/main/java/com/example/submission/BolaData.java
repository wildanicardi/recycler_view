package com.example.submission;

import java.util.ArrayList;

public class BolaData {
    public static String[][] data = new String[][]{
            {"Mesut Ozil","Saya selalu melakukan itu sebelum saya pergi (di lapangan). Saya berdoa dan rekan tim saya tahu bahwa mereka tidak dapat berbicara dengan saya selama periode singkat ini", "https://awsimages.detik.net.id/visual/2019/05/13/dd511e3b-4cfc-46c2-ba39-c522453d993b_169.jpeg"},
            {"Paul Pogba","Pesepak bola asal Prancis ini juga merupakan satu dari sekian pesepak bola yang dengan gamblang menyatakan agamanya.\n" +
                    "\n" +
                    "Lewat unggahan Instgramnya, Pogba kerap diketahui melakukan ibadah umroh dan sebagainya yang menjelaskan ia memeluk islam.", "https://i2.wp.com/metro.co.uk/wp-content/uploads/2019/08/GettyImages-1158659347.jpg"},
            {"Zinedine ZIdan", "Tak banyak terlihat, Zidane yang merupakan satu dari pesepak bola terbaik dunia ini juga ternyata seorang muslim.\n" +
                    "\n" +
                    "Zidane sukses menjadi pemain dan pelatih yang luar biasa selama kariernya.\n" +
                    "\n" +
                    "Selama masih aktif menjadi pesepak bola, Zidane menjadi salah satu pemain terbaik yang dimilik Real Madrid.\n" +
                    "\n" +
                    "Saat menjadi pelatih, Zidane juga berhasil membawa Los Blancos meraih 3 trofi Liga Champions, juga menjuarai Piala Dunia Antarklub 2016, 2017, Piala Super Eropa 2016,2-16 hungga Piala Super Spanyol 2017 silam.","https://images2.minutemediacdn.com/image/upload/c_fill,w_912,h_516,f_auto,q_auto,g_auto/shape/cover/sport/fc-bayern-v-real-madrid-2019-international-champions-cup-5d402732709c990186000001.jpg"},
            {"Karim Benzema","Benzema sempat mengunggah foto khusu di Instagramnya untum mengucapkan selamat berbuka pada bulan ramadhan.", "https://www.football5star.com/wp-content/uploads/2019/08/Karim-Benzema-Real-Madrid-Football5star.jpg"},
            {"Emanuel AdeBayor","Satu dari sekian pesepak bola besar asal Afrika, Emanuel Adebayor memiliki karier sukses di berbagai klub papan atas Eropa seperti, Real Madrid, Manchester City, Tottenham Hotspurs dan Arsenal ini ternyata memeluk islam.\n" +
                    "\n", "https://startingeleven.id/wp-content/uploads/2019/02/adebayor.jpg"},
            {"Marouene Fellaini" ,"Pemain Manchester United yang sempat viral karena meme wajahnya yang terkena bola ini juga memeluk islam.", "https://cdn0-production-images-kly.akamaized.net/z77cwpOI9g50a5Zk5UxG2q96Xug=/1231x710/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/1673335/original/013336800_1502253601-20170808-Mimik-Aneh-Fellaini-Viral-di-Media-Sosial-AP-1.jpg"},
            {"Sadio Mane","\"Agama sangat penting bagi saya. Saya menghormati aturan-aturan Islam dan saya berdoa lima kali sehari, selalu. Saya tidak akan menyentuh alkohol. Tidak ada konflik antara agama dan kenyataan bahwa saya ingin bermain sepakbola. Saya dibesarkan dengan benar dan dengan cara yang benar dan orang tua saya bangga dengan fakta bahwa saya seorang pemain bola\".", "https://gilabola.com/wp-content/uploads/2019/08/Liga-Inggris-Liverpool-Sadio-Mane-1024x621.jpg"},
            {"Eric Abidal","Semua kemajuan alami. Pilihan masuk ke Islam bukan karena istri saya, tetapi hadiah yang tiba-tiba muncul. Itu benar-benar terjadi di sana. Mengalir dan membuatku merasa bahagia. Saya memeluk Islam dengan penuh keyakinan,", "https://www.irishtimes.com/polopoly_fs/1.3554090.1530727057!/image/image.jpg_gen/derivatives/box_620_330/image.jpg"},
            {"Miralem Pjianic","Pemain yang dikabarkan direkrut sebagai pengganti Paul Pogba yang hengkan ke Manchester United ini juga ternyata seorang muslim.", "https://img.maximummedia.ie/joe_co_uk/eyJkYXRhIjoie1widXJsXCI6XCJodHRwOlxcXC9cXFwvbWVkaWEtam9lY291ay5tYXhpbXVtbWVkaWEuaWUuczMuYW1hem9uYXdzLmNvbVxcXC93cC1jb250ZW50XFxcL3VwbG9hZHNcXFwvMjAxNVxcXC8xMlxcXC8wMzA5MTEzOFxcXC9hZGVjaGVsLmpwZ1wiLFwid2lkdGhcIjo3NjcsXCJoZWlnaHRcIjo0MzEsXCJkZWZhdWx0XCI6XCJodHRwczpcXFwvXFxcL3d3dy5qb2UuY28udWtcXFwvYXNzZXRzXFxcL2ltYWdlc1xcXC9qb2Vjb3VrXFxcL25vLWltYWdlLnBuZz9pZD00M2JjYTlkZTdlYjI2OTczN2EwZlwiLFwib3B0aW9uc1wiOltdfSIsImhhc2giOiJlMzRjZDY0NmUyZWUwN2UzZTI5MDlmYzkwNzE4OWEwYzhhNmQ4NDFmIn0=/adechel.jpg"},
            {"Mohammed Salah","Pesepak bola berjuku King of Egypt ini juga seorang muslim.", "https://static.independent.co.uk/s3fs-public/thumbnails/image/2019/06/27/11/Mohamed-Salah-0.jpg"},
    };
    public static ArrayList<Bola> getListData(){
        ArrayList<Bola> list = new ArrayList<>();
        for (String[] aData : data) {
            Bola bola = new Bola();
            bola.setName(aData[0]);
            bola.setDesc(aData[1]);
            bola.setPhoto(aData[2]);
            list.add(bola);
        }
        return list;
    }
}
