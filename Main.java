import java.util.ArrayList;
import javafx.util.Pair;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main {

/*

(((((((((((((((((((((LOOK AT THIS ONE LATER !!!!!!)))))))))))))))))))))))
    static class Edge {
        int source;
        int destination;
        int weight;



        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Graph {
        int vertices;
        LinkedList<DijkstraPQ.Edge>[] adjacencylist;

        Graph(int vertices) {
            this.vertices = vertices;
            adjacencylist = new LinkedList[vertices];
            //initialize adjacency lists for all the vertices
            for (int i = 0; i <vertices ; i++) {
                adjacencylist[i] = new LinkedList<>();
            }
        }

        public void addEdge(int source, int destination, int weight) {
            DijkstraPQ.Edge edge = new DijkstraPQ.Edge(source, destination, weight);
            adjacencylist[source].addFirst(edge);

            edge = new DijkstraPQ.Edge(destination, source, weight);
            adjacencylist[destination].addFirst(edge); //for undirected graph
        }
*/
    public static void main(String[] args) {

        /* 777 Numaralı Otobüs Hattı Durakları */
        Node a1 = new Node(1,"Doğal_Yaşam_Parkı");
        Node a2 = new Node(2,"Sasalı_Anadolu_Ögretmen_Lisesi");
        Node a3 = new Node(3,"Neşeli");
        Node a4 = new Node(4,"Manolya");
        Node a5 = new Node(5,"Çiçek");
        Node a6 = new Node(6,"Sasalı_Meydanı");
        Node a7 = new Node(7,"Sasalı_Giriş");
        Node a8 = new Node(8,"Sasalı_Doğal_YaşamParkı");
        Node a9 = new Node(9,"Çakabey");
        Node a10 = new Node(10,"AnaJet_Üssü");
        Node a11 = new Node(11,"Sasalı_PiknikAlanı");
        Node a12 = new Node(12,"Kaklıç_Kavşağı");
        Node a13 = new Node(13,"Kutup_Yıldızı");
        Node a14 = new Node(14,"Atık_Su");
        Node a15 = new Node(15,"Bankalar");
        Node a16 = new Node(16,"Eltaş");
        Node a17 = new Node(17,"Organize_Sanayi");
        Node a18 = new Node(18,"Aktaş");
        Node a19 = new Node(19,"Atakent_Anadolu_Lisesi");
        Node a20 = new Node(20,"Beşikçioğlu_Cami");
        Node a21 = new Node(21,"Bostanlı_Pazaryeri");
        Node a22 = new Node(22,"Bostanlı_Market");
        Node a23 = new Node(23,"Bostanlı_Aktarma_Merkezi");
        Node a24 = new Node(24,"Osmanbey_Parkı");
        Node a25 = new Node(25,"Karşıyaka_İskele");

        /* 969 Numaralı Otobüs Hattı Durakları */
        Node b1 = new Node(1,"Balçova_Son_Durak");
        Node b2 = new Node(2,"Teleferik");
        Node b3 = new Node(3,"Ekonomi");
        Node b4 = new Node(4,"Salih_Dede_Anadolu_Lisesi");
        Node b5 = new Node(5,"Çifte_Selviler");
        Node b6 = new Node(6,"Gümüş");
        Node b7 = new Node(7,"Merkez_Cami");
        Node b8 = new Node(8,"Asmaaltı");
        Node b9 = new Node(9,"Tatbikat_Cami");
        Node b10 = new Node(10,"Duygu");
        Node b11 = new Node(11,"Kabristan");
        Node b12 = new Node(12,"Balçova_Lisesi");
        Node b13 = new Node(13,"Barış");
        Node b14 = new Node(14,"Fahrettin_Altay_Aktarma_Merkezi");

        /* 551 Numaralı Otobüs Hattı Durakları*/
        Node c1 = new Node(1,"Narlıdere");
        Node c2 = new Node(2,"Subay_Gazinosu");
        Node c3 = new Node(3,"Lojmanlar");
        Node c4 = new Node(4,"Pertev_Bey");
        Node c5 = new Node(5,"İstihkam_Okulu");
        Node c6 = new Node(6,"Narlıdere_Kaymakamlık");
        Node c7 = new Node(7,"Narlıdere_Belediye");
        Node c8 = new Node(8,"Şehitlik");
        Node c9 = new Node(9,"Siteler");
        Node c10 = new Node(10,"Köprübaşı");
        Node c11 = new Node(11,"Uludağ");
        Node c12 = new Node(12,"Narlıdere_Cami");
        Node c13 = new Node(13,"Narlıdere_İtfaiye");
        Node c14 = new Node(14,"Balcı");
        Node c15 = new Node(15,"Güzel_Sanatlar_Fakültesi");
        Node c16 = new Node(16,"İzsu");
        Node c17 = new Node(17,"Kantar");
        Node c18 = new Node(18,"Dokuz_Eylül");
        Node c19 = new Node(19,"Dörtyol");
        Node c20 = new Node(20,"Hoca");
        Node c21 = new Node(21,"Teleferik");
        Node c22 = new Node(22,"İşbankası_Evleri");
        Node c23 = new Node(23,"Molla_Kuyusu");
        Node c24 = new Node(24,"Balçova_Kahveler");
        Node c25 = new Node(25,"Beyaz");
        Node c26 = new Node(26,"Fahrettin_Altay_Aktarma_Merkezi");
        Node c27 = new Node(27,"Mehmetçik");
        Node c28 = new Node(28,"Ordu_Pazarı");
        Node c29 = new Node(29,"2.Oyak_Sitesi");
        Node c30 = new Node(30,"Fahrettin_Altay_Son_Durak");


        /* 681 Numaralı Otobüs Hattı Durakları*/
        Node d1 = new Node(1,"Fahrettin_Altay_Son_Durak");
        Node d2 = new Node(2,"2.Oyak_Sitesi");
        Node d3 = new Node(3,"Ordu_Pazarı");
        Node d4 = new Node(4,"Mehmetçik");
        Node d5 = new Node(5,"Fahrettin_Altay_Aktarma_Merkezi");
        Node d6 = new Node(6,"Göztepe_Stadı");
        Node d7 = new Node(7,"Denizmen");
        Node d8 = new Node(8,"Hıfzı_Sıhha");
        Node d9 = new Node(9,"Amerikan_Koleji");
        Node d10 = new Node(10,"Susuz_Dede");
        Node d11 = new Node(11,"Hakim_Evleri");
        Node d12 = new Node(12,"Nokta");
        Node d13 = new Node(13,"Çeşme");
        Node d14 = new Node(14,"Şoförler_Lokalı");
        Node d15 = new Node(15,"İzmirspor");
        Node d16 = new Node(16,"Altıntaş");
        Node d17 = new Node(17,"Bayramyeri");
        Node d18 = new Node(18,"Koruluk");
        Node d19 = new Node(19,"Kestelli");
        Node d20 = new Node(20,"Mezarlıkbaşı");
        Node d21 = new Node(21,"Montrö");

        /* 963 Numaralı Otobüs Hattı Durakları*/
        Node e1 = new Node(1,"Evka_3_Aktarma_Merkezi");
        Node e2 = new Node(2,"Ege_Üniversitesi_Lojmanları");
        Node e3 = new Node(3,"Suphi_Koyuncuoğlu");
        Node e4 = new Node(4,"Ata");
        Node e5 = new Node(5,"Hükümet_Konağı");
        Node e6 = new Node(6,"Bornova_İzsu");
        Node e7 = new Node(7,"Çınar");
        Node e8 = new Node(8,"Bornova_Stadı");
        Node e9 = new Node(9,"Çağdaş");
        Node e10 = new Node(10,"Mustafa_Kemal_Lisesi");
        Node e11 = new Node(11,"Çamkıran");
        Node e12 = new Node(12,"Şehit_Murat_Aslantürk");
        Node e13 = new Node(13,"Şehit_Hakan_Ünal");
        Node e14 = new Node(14,"Adalet_Mahallesi");
        Node e15 = new Node(15,"Halide_Edip_Adıvar");
        Node e16 = new Node(16,"Adliye");
        Node e17 = new Node(17,"Yeni_Kent");
        Node e18 = new Node(18,"Liman");
        Node e19 = new Node(19,"Alsancak_Garı");

        /* 302 Numaralı Otobüs Hattı Durakları*/
        Node f1 = new Node(1,"Otogar_Yeni");
        Node f2 = new Node(2,"Otogar");
        Node f3 = new Node(3,"Otogar_Benzinlik");
        Node f4 = new Node(4,"Mimar_Sinan_ML");
        Node f5 = new Node(5,"Şehitler_İÖO");
        Node f6 = new Node(6,"Altındağ_Belediye");
        Node f7 = new Node(7,"Havuzlu_Kahve");
        Node f8 = new Node(8,"Şehitler");
        Node f9 = new Node(9,"Kokluca_Mezarlığı");
        Node f10 = new Node(10,"Evrenosoğlu_iöo");
        Node f11 = new Node(11,"Meriç_Mahallesi_Çeşme");
        Node f12 = new Node(12,"MTK_1.Giriş");
        Node f13 = new Node(13,"Halkapınar_İzsu");
        Node f14 = new Node(14,"Yenişehir_Ptt");
        Node f15 = new Node(15,"Doğum_Hastanesi");
        Node f16 = new Node(16,"Ziya_Gökalp_İÖO");
        Node f17 = new Node(17,"Eşrefpaşa_Hastane");
        Node f18 = new Node(18,"Kemer");
        Node f19 = new Node(19,"Basmane_Gar");
        Node f20 = new Node(20,"Çardak");
        Node f21 = new Node(21,"İskele");
        Node f22 = new Node(22,"Konak_Aktarma_Merkezi");

        /* 304 Numaralı Otobüs Hattı Durakları*/
        Node g1 = new Node(1,"Tınaztepe");
        Node g2 = new Node(2,"Begos");
        Node g3 = new Node(3,"Papatya");
        Node g4 = new Node(4,"Eski_Mezarlık");
        Node g5 = new Node(5,"Hasanağa_Bahçesi");
        Node g6 = new Node(6,"Buca_üçkuyular_Meydan");
        Node g7 = new Node(7,"Sağlık_Ocağı");
        Node g8 = new Node(8,"Buca_Devlet_Hastanesi");
        Node g9 = new Node(9,"Dokuz_Eylül_Eğitim_Fakültesi");
        Node g10 = new Node(10,"Buca_SGK");
        Node g11 = new Node(11,"Öğretmen_Evleri");
        Node g12 = new Node(12,"Buca_Belediye_Sarayı");
        Node g13 = new Node(13,"Ceza_Evi");
        Node g14 = new Node(14,"Yeni_Mahalle");
        Node g15 = new Node(15,"Şirinyer_PTT");
        Node g16 = new Node(16,"Şirinyer_Bankalar");
        Node g17 = new Node(17,"Fabrika");
        Node g18 = new Node(18,"Yeniyol");
        Node g19 = new Node(19,"Konak_Aktarma_Merkezi");

        /* 470 Numaralı Otobüs Hattı Durakları*/
        Node h1 = new Node(1,"Tınaztepe");
        Node h2 = new Node(2,"Begos");
        Node h3 = new Node(3,"Papatya");
        Node h4 = new Node(4,"Eski_Mezarlık");
        Node h5 = new Node(5,"İktsadi_Bilimler_Fakültesi");
        Node h6 = new Node(6,"Buca_üçkuyular_Meydan");
        Node h7 = new Node(7,"Sağlık_Ocağı");
        Node h8 = new Node(8,"Buca_Devlet_Hastanesi");
        Node h9 = new Node(9,"Dokuz_Eylül_Eğitim_Fakültesi");
        Node h10 = new Node(10,"Buca_SGK");
        Node h11 = new Node(11,"Öğretmen_Evleri");
        Node h12 = new Node(12,"Buca_Belediye_Sarayı");
        Node h13 = new Node(13,"Ceza_Evi");
        Node h14 = new Node(14,"Yeni_Mahalle");
        Node h15 = new Node(15,"Şirinyer_PTT");
        Node h16 = new Node(16,"Şirinyer_Karakol");
        Node h17 = new Node(17,"Nato");
        Node h18 = new Node(18,"Şelale_Parkı");
        Node h19 = new Node(19,"Konak_Anadolu_Lisesi");
        Node h20 = new Node(20,"Yağhaneler_2");
        Node h21 = new Node(21,"Yağhaneler");
        Node h22 = new Node(22,"Eşrefpaşa");
        Node h23 = new Node(23,"Koruluk");
        Node h24 = new Node(24,"Kestelli");
        Node h25 = new Node(25,"Mezarlıkbaşı");
        Node h26 = new Node(26,"Montrö");

        /* 921 Numaralı Otobüs Hattı Durakları*/
        Node i1 = new Node(1,"Bostanlı_Aktarma_Merkezi");
        Node i2 = new Node(2,"Osmanbey_Parkı");
        Node i3 = new Node(3,"Karşıyaka_İskele");
        Node i4 = new Node(4,"Muammer_Aksoy_Parkı");
        Node i5 = new Node(5,"Selçuk_Yaşar_İÖO");
        Node i6 = new Node(6,"Tersane");
        Node i7 = new Node(7,"Turan");
        Node i8 = new Node(8,"Bayraklı_Üst_Geçit");
        Node i9 = new Node(9,"Liman");
        Node i10 = new Node(10,"Alsancak_Garı");

        /* 912 Numaralı Otobüs Hattı Durakları*/
        Node j1 = new Node(1,"Atakent_Aktarma_Merkezi");
        Node j2 = new Node(2,"Tüvturk");
        Node j3 = new Node(3,"Balatçık_Kahveler");
        Node j4 = new Node(4,"Ata");
        Node j5 = new Node(5,"Küçük_Çiğli");
        Node j6 = new Node(6,"Santral");
        Node j7 = new Node(7,"Şaraphane");
        Node j8 = new Node(8,"Çiğli_Belediye");
        Node j9 = new Node(9,"Eğitim_Gönüllüleri");
        Node j10 = new Node(10,"Çiğli_itfaiye");
        Node j11 = new Node(11,"Karşıyaka_Anadolu_Lisesi");
        Node j12 = new Node(12,"Ayyıldız");
        Node j13 = new Node(13,"Karşıyaka_Jandarma");
        Node j14 = new Node(14,"Kayalar_Mezarlığı");
        Node j15 = new Node(15,"Serinkuyu");
        Node j16 = new Node(16,"Dedebaşı");
        Node j17 = new Node(17,"Soğukkuyu_Trafik");
        Node j18 = new Node(18,"Öztürk");
        Node j19 = new Node(19,"Naldöken");
        Node j20 = new Node(20,"Turan");
        Node j21 = new Node(21,"Bayraklı_üst_Geçit");
        Node j22 = new Node(22,"Liman");
        Node j23 = new Node(23,"Alsancak_Garı");

        /* 543 Numaralı Otobüs Hattı Durakları*/
        Node k1 = new Node(1,"Bostanlı_Aktarma_Merkezi");
        Node k2 = new Node(2,"Osmanbey_Parkı");
        Node k3 = new Node(3,"Karşıyaka_İskele");
        Node k4 = new Node(4,"Muammer_Aksoy_Parkı");
        Node k5 = new Node(5,"Selçuk_Yaşar_İÖO");
        Node k6 = new Node(6,"Tersane");
        Node k7 = new Node(7,"Turan");
        Node k8 = new Node(8,"Bayraklı_Üst_Geçit");
        Node k9 = new Node(9,"Piyale");
        Node k10 = new Node(10,"Smyrna");
        Node k11 = new Node(11,"Manas");
        Node k12 = new Node(12,"Bayraklı_Depo");
        Node k13 = new Node(13,"Halide_E.Adıvar");
        Node k14 = new Node(14,"Adliye");
        Node k15 = new Node(15,"Üçüncü_Sanayi");
        Node k16 = new Node(16,"Tarım_Kredi_Koop.");
        Node k17 = new Node(17,"Stadyum_İstasyon");
        Node k18 = new Node(18,"Mersinli");
        Node k19 = new Node(19,"Çamdibi_Sağ.Ocağı");
        Node k20 = new Node(20,"Atatürk_Stadı");
        Node k21 = new Node(21,"Halkapınar_Tramvay");
        Node k22 = new Node(22,"Halkapınar_Aktarma_Merkezi");


        /* 680 Numaralı Otobüs Hattı Durakları*/
        Node n1 = new Node(1,"Yeşilyurt");
        Node n2 = new Node(2,"Yadigar_Sitesi");
        Node n3 = new Node(3,"Yadigar_Cami");
        Node n4 = new Node(4,"Egzoscu");
        Node n5 = new Node(5,"Ülkü");
        Node n6 = new Node(6,"Seniye_Hasan_İÖO");
        Node n7 = new Node(7,"Yıkık_Cami_2");
        Node n8 = new Node(8,"Kuyu");
        Node n9 = new Node(9,"Bayram_Kahya");
        Node n10 = new Node(10,"Kara_Selvi");
        Node n11 = new Node(11,"Bozkaya_Cami");
        Node n12 = new Node(12,"Kestelli");
        Node n13 = new Node(13,"Zincirlikuyu");
        Node n14 = new Node(14,"Narlık");
        Node n15 = new Node(15,"Kilimcitepe");
        Node n16 = new Node(16,"Yağhaneler_3");
        Node n17 = new Node(17,"Yağhaneler");
        Node n18 = new Node(18,"Eşrefpaşa");
        Node n19 = new Node(19,"Koruluk");
        Node n20 = new Node(20,"Kestelli");
        Node n21 = new Node(21,"Mezarlıkbaşı");
        Node n22 = new Node(22,"Montrö");

        /* 691 Numaralı Otobüs Hattı Durakları*/
        Node m1 = new Node(1,"Sosyal_Konutlar");
        Node m2 = new Node(2,"Özcan_Sitesi");
        Node m3 = new Node(3,"Gaziemir_İMKB");
        Node m4 = new Node(4,"Şehit_Polis_Ahmet_Atilla_İÖO");
        Node m5 = new Node(5,"Şehit_Üsteğmen_Hakan_Özkaner");
        Node m6 = new Node(6,"Birinci_Nizamiye");
        Node m7 = new Node(7,"İkinci_Nizamiye");
        Node m8 = new Node(8,"Halit_Tan_Parkı");
        Node m9 = new Node(9,"Yeşil_Mah._Muhtarlık");
        Node m10 = new Node(10,"Gaziemir_Trafo");
        Node m11 = new Node(11,"Gaziemir_Trafo");
        Node m12 = new Node(12,"Gaziemir_Merkez_Cami");
        Node m13 = new Node(13,"Gaziemir_Belediye");
        Node m14 = new Node(14,"Gaziemir_Ptt");
        Node m15 = new Node(15,"Büyükşehir_Kurs_Merkezi");
        Node m16 = new Node(16,"Ulaştırma");
        Node m17 = new Node(17,"Leylak");
        Node m18 = new Node(18,"Ege_Serbest_Bölge_2");
        Node m19 = new Node(19,"Aktepe");
        Node m20 = new Node(20,"Gaziemir_Semt_Garajı");
        Node m21 = new Node(21,"Sinem");
        Node m22 = new Node(22,"Karabağlar");
        Node m23 = new Node(23,"Paşa_Köprüsü");
        Node m24 = new Node(24,"Kızılcık");
        Node m25 = new Node(25,"Söğüt");
        Node m26 = new Node(26,"Cumhuriyet_Lisesi");
        Node m27 = new Node(27,"Kaymakkuyu");
        Node m28 = new Node(28,"Çitlembik");
        Node m29 = new Node(29,"Orcaner");
        Node m30 = new Node(30,"Hasan_Hüseyinler");
        Node m31 = new Node(31,"Elka");
        Node m32 = new Node(32,"Yağhaneler_3");
        Node m33 = new Node(33,"Yağhaneler");
        Node m34 = new Node(34,"Eşrefpaşa");
        Node m35 = new Node(35,"Koruluk");
        Node m36 = new Node(36,"Kestelli");
        Node m37 = new Node(37,"Mezarlıkbaşı");
        Node m38 = new Node(38,"Montrö");

        /* Karşıyaka Tramvay Hattı Durakları*/
        Node x1 = new Node(1,"Mavişehir");
        Node x2 = new Node(2,"Çevre_Yolu");
        Node x3 = new Node(3,"Mavişehir");
        Node x4 = new Node(4,"Mustafa_Kemal_Spor_Salonu");
        Node x5 = new Node(5,"Bilim_Müzesi");
        Node x6 = new Node(6,"Atakent");
        Node x7 = new Node(7,"Selçuk_Yaşar");
        Node x8 = new Node(8,"Vilayet_Evleri");
        Node x9 = new Node(9,"Çarşı");
        Node x10 = new Node(10,"Bostanlı_Aktarma_Merkezi");
        Node x11 = new Node(11,"Yunuslar");
        Node x12 = new Node(12,"Nikah_Sarayı");
        Node x13 = new Node(13,"Karşıyaka_İskele");
        Node x14 = new Node(14,"Alaybey");

        /* Konak Tramvay Hattı Durakları */
        Node y1 = new Node(1,"Halkapınar_Aktarma_Merkezi");
        Node y2 = new Node(2,"Alsancak_Garı");
        Node y3 = new Node(3,"Atatürk_Spor_Salonu");
        Node y4 = new Node(4,"Hocazede_Cami");
        Node y5 = new Node(5,"Kültürpark_Atatürk_Lisesi");
        Node y6 = new Node(6,"Gazi_Bulvarı");
        Node y7 = new Node(7,"Konak_Aktarma_Merkezi");
        Node y8 = new Node(8,"Karataş");
        Node y9 = new Node(9,"Karantina");
        Node y10 = new Node(10,"Köprü");
        Node y11 = new Node(11,"Sadıkbey");
        Node y12 = new Node(12,"Göztepe");
        Node y13 = new Node(13,"Güzelyalı");
        Node y14 = new Node(14,"Adnan_Saygun_Sanat_Merkezi");
        Node y15 = new Node(15,"Üçkuyular_Meydanı");
        Node y16 = new Node(16,"Fahrettin_Altay_Aktarma_Merkezi");

        /* Metro Durakları */
        Node w1 = new Node(1,"Evka_3");
        Node w2 = new Node(2,"Ege_Üniversitesi");
        Node w3 = new Node(3,"Bornova_Hastane");
        Node w4 = new Node(4,"Bölge");
        Node w5 = new Node(5,"Sanayi");
        Node w6 = new Node(6,"Stadyum");
        Node w7 = new Node(7,"Halkapınar_Aktarma_Merkezi");
        Node w8 = new Node(8,"Hilal");
        Node w9 = new Node(9,"Basmane_Gar");
        Node w10 = new Node(10,"Çankaya");
        Node w11 = new Node(11,"Konak_Aktarma_Merkezi");
        Node w12 = new Node(12,"Üçyol");
        Node w13 = new Node(13,"İzmirspor");
        Node w14 = new Node(14,"Hatay");
        Node w15 = new Node(15,"Göztepe");
        Node w16 = new Node(16,"Poligon");
        Node w17 = new Node(17,"Fahrettin_Altay_Aktarma_Merkezi");

        /* İzban Durakları */
        Node p1 = new Node(1,"Selçuk");
        Node p2 = new Node(2,"Belevi");
        Node p3 = new Node(3,"Sağlık");
        Node p4 = new Node(4,"Tepeköy");
        Node p5 = new Node(5,"Torbalı");
        Node p6 = new Node(6,"Kuşçuburun");
        Node p7 = new Node(7,"Pancar");
        Node p8 = new Node(8,"Tekeli");
        Node p9 = new Node(9,"Develi");
        Node p10 = new Node(10,"Cumaovası");
        Node p11 = new Node(11,"Adnan_Menderes_Havalimanı");
        Node p12 = new Node(12,"Sarnıç");
        Node p13 = new Node(13,"Gaziemir");
        Node p14 = new Node(14,"Erbaş");
        Node p15 = new Node(15,"Semt_Garajı");
        Node p16 = new Node(16,"İnkılap");
        Node p17 = new Node(17,"Koşu");
        Node p18 = new Node(18,"Şirinyer");
        Node p19 = new Node(19,"Kemer");
        Node p20 = new Node(20,"Hilal");
        Node p21 = new Node(21,"Alsancak_Garı");
        Node p22 = new Node(22,"Halkapınar_Aktarma_Merkezi");
        Node p23 = new Node(23,"Salhane");
        Node p24 = new Node(24,"Bayraklı");
        Node p25 = new Node(25,"Turan");
        Node p26 = new Node(26,"Naldöken");
        Node p27 = new Node(27,"Alaybey");
        Node p28 = new Node(28,"Karşıyaka");
        Node p29 = new Node(29,"Nergiz");
        Node p30 = new Node(30,"Demirköprü");
        Node p31 = new Node(31,"Şemikler");
        Node p32 = new Node(32,"Mavişehir");
        Node p33 = new Node(33,"Çiğli");
        Node p34 = new Node(34,"Ata_Sanayi");
        Node p35 = new Node(35,"Egekent");
        Node p36 = new Node(36,"Ulukent");
        Node p37 = new Node(37,"Egekent2t");
        Node p38 = new Node(38,"Menemen");
        Node p39 = new Node(39,"Hatundere");
        Node p40 = new Node(40,"Biçerova");
        Node p41 = new Node(41,"Aliağa");

        /* Vapur İskeleleri*/
        Node v1 = new Node(1,"Üçkuyular_Vapur_İskelesi");
        Node v2 = new Node(2,"Güzelyalı_Vapur_İskelesi");
        Node v3 = new Node(3,"Konak_Vapur_İskelesi");
        Node v4 = new Node(4,"Pasaport_Vapur_İskelesi");
        Node v5 = new Node(5,"Alsancak_Vapur_İskelesi");
        Node v6 = new Node(6,"Bayraklı_Vapur_İskelesi");
        Node v7 = new Node(7,"Karşıyaka_Vapur_İskelesi");
        Node v8 = new Node(8,"Bostanlı_Vapur_İskelesi");

        System.out.println(a1.getNodeName());
        System.out.println(a1.getID());




    }

}
