// Nama    : MUTHYA SALSABILAH
// NM      : 255150701111013


public class main {
    public static void main(String[] args) {

        Penulis p1 = new Penulis("Baskara Mubaraq");
        Penulis p2 = new Penulis("Andi Abidin");
        Penulis p3 = new Penulis("Alfafira Medina");
        Penulis p4 = new Penulis("Gibran Susanto");
        Penulis p5 = new Penulis("Silfy Che Putri");

        Buku t1 = new Buku("Pemrograman Java",2020,new Penulis[]{p1});
        Buku t2 = new Buku("Dasar Algoritma",2019,new Penulis[]{p2});
        Buku t3 = new Buku("Artificial Intelligence",2021,new Penulis[]{p3});
        Buku t4 = new Buku("Machine Learning",2022,new Penulis[]{p4});
        Buku t5 = new Buku("Struktur Data",2018,new Penulis[]{p5});

        Kategori teknologi = new Kategori("Teknologi", new Buku[]{t1,t2,t3,t4,t5});

        Buku f1 = new Buku("Filsafat Dasar",2015,new Penulis[]{p1});
        Buku f2 = new Buku("dasar dasar logika",2016,new Penulis[]{p2});
        Buku f3 = new Buku("ilmu filsafat",2017,new Penulis[]{p3});
        Buku f4 = new Buku("Filsafat Modern",2018,new Penulis[]{p4});
        Buku f5 = new Buku("Etika dan Moral",2019,new Penulis[]{p5});

        Kategori filsafat = new Kategori("Filsafat", new Buku[]{f1,f2,f3,f4,f5});

        Buku s1 = new Buku("Sejarah peradaban Dunia",2010,new Penulis[]{p1});
        Buku s2 = new Buku("Sejarah Indonesia",2011,new Penulis[]{p2});
        Buku s3 = new Buku("WW2",2012,new Penulis[]{p3});
        Buku s4 = new Buku("Kerajaan Nusantara",2013,new Penulis[]{p4});
        Buku s5 = new Buku("Sejarah kolonialisme",2014,new Penulis[]{p5});

        Kategori sejarah = new Kategori("Sejarah", new Buku[]{s1,s2,s3,s4,s5});

        Buku a1 = new Buku("pengantar agama kristen",2015,new Penulis[]{p1});
        Buku a2 = new Buku("Sejarah Islam",2016,new Penulis[]{p2});
        Buku a3 = new Buku("Akhlak ",2017,new Penulis[]{p3});
        Buku a4 = new Buku("sejarah 25 nabi",2018,new Penulis[]{p4});
        Buku a5 = new Buku("akhir zaman",2019,new Penulis[]{p5});

        Kategori agama = new Kategori("Agama", new Buku[]{a1,a2,a3,a4,a5});

        Buku psk1 = new Buku("Psikologi Umum",2015,new Penulis[]{p1});
        Buku psk2 = new Buku("Psikologi Anak",2016,new Penulis[]{p2});
        Buku psk3 = new Buku("Psikologi Sosial",2017,new Penulis[]{p3});
        Buku psk4 = new Buku("Psikologi Kepribadian",2018,new Penulis[]{p4});
        Buku psk5 = new Buku("Pengantar psikologi",2019,new Penulis[]{p5});

        Kategori psikologi = new Kategori("Psikologi", new Buku[]{psk1,psk2,psk3,psk4,psk5});

        Buku p1b = new Buku("Politik Indonesia",2015,new Penulis[]{p1});
        Buku p2b = new Buku("Teori Politik",2016,new Penulis[]{p2});
        Buku p3b = new Buku("Demokrasi Dunia",2017,new Penulis[]{p3});
        Buku p4b = new Buku("Sistem Pemerintahan",2018,new Penulis[]{p4});
        Buku p5b = new Buku("Pemilu dan Negara",2019,new Penulis[]{p5});

        Kategori politik = new Kategori("Politik", new Buku[]{p1b,p2b,p3b,p4b,p5b});

        Buku fk1 = new Buku("Pada zaman dahulu",2015,new Penulis[]{p1});
        Buku fk2 = new Buku("putri malu",2016,new Penulis[]{p2});
        Buku fk3 = new Buku("semut dan gajah",2017,new Penulis[]{p3});
        Buku fk4 = new Buku("Kancil",2018,new Penulis[]{p4});
        Buku fk5 = new Buku("Dunia Fantasi",2019,new Penulis[]{p5});

        Kategori fiksi = new Kategori("Fiksi", new Buku[]{fk1,fk2,fk3,fk4,fk5});


        teknologi.tampilKategori();
        filsafat.tampilKategori();
        sejarah.tampilKategori();
        agama.tampilKategori();
        psikologi.tampilKategori();
        politik.tampilKategori();
        fiksi.tampilKategori();

         t1.simpanFile("dataBuku.txt");

        t1.bacaFile("dataBuku.txt");

        t1.tampilBuku();

        System.out.println("Royalti 10% : " + t1.hitungRoyalti(100000));
        System.out.println("Royalti 15% : " + t1.hitungRoyalti(100000, 15));
    }
}