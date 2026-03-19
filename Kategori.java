class Kategori {
    String NamaKategori;
    Buku[] DaftarBuku;

    Kategori(String NamaKategori, Buku[] DaftarBuku){
        this.NamaKategori = NamaKategori;
        this.DaftarBuku = DaftarBuku;
    }

    void tampilKategori(){
        System.out.println("Kategori : " + NamaKategori);
        System.out.println();

        for(Buku b : DaftarBuku){
            b.tampilBuku();
        }
    }
}