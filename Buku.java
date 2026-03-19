import java.io.*;

class Buku {
    String JudulBuku;
    int TahunTerbit;
    Penulis[] penulis;
    String sinopsis;

    Buku(String JudulBuku, int TahunTerbit, Penulis[] penulis, String sinopsis){
        this.JudulBuku = JudulBuku;
        this.TahunTerbit = TahunTerbit;
        this.penulis = penulis;
        this.sinopsis = sinopsis;
    }

    Buku(String JudulBuku, int TahunTerbit, Penulis[] penulis){
        this.JudulBuku = JudulBuku;
        this.TahunTerbit = TahunTerbit;
        this.penulis = penulis;
        this.sinopsis = "Sinopsis default minimal sepuluh kata untuk memenuhi tugas praktikum";
    }

    void tampilBuku(){
        System.out.println("Judul Buku : " + JudulBuku);
        System.out.println("Tahun : " + TahunTerbit);
        System.out.print("Penulis : ");

        for(Penulis p : penulis){
            System.out.print(p.NamaPenulis + " ");
        }

        System.out.println("\nSinopsis : " + sinopsis);
        System.out.println("Jumlah kata sinopsis : " + hitungJumlahKata());
        System.out.println();
    }

    int hitungJumlahKata(){
        String[] kata = sinopsis.split(" ");
        return kata.length;
    }

    double cekKesamaan(Buku bukuLain){
        int sama = 0;
        int total = 3;

        if(this.JudulBuku.equals(bukuLain.JudulBuku)){
            sama++;
        }

        if(this.TahunTerbit == bukuLain.TahunTerbit){
            sama++;
        }

        if(this.sinopsis.equals(bukuLain.sinopsis)){
            sama++;
        }

        return (sama * 100.0) / total;
    }

    Buku copy(){
        return new Buku(this.JudulBuku, this.TahunTerbit, this.penulis, this.sinopsis);
    }

 
    void bacaFile(String pathFile){
        try{
            BufferedReader br = new BufferedReader(new FileReader(pathFile));
            String data = br.readLine();

            String[] isi = data.split(";");

            this.JudulBuku = isi[0];
            this.penulis = new Penulis[]{ new Penulis(isi[1]) };

            br.close();
        }catch(Exception e){
            System.out.println("Error baca file: " + e.getMessage());
        }
    }


    void simpanFile(String namaFile){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(namaFile));

            bw.write(JudulBuku + ";" + penulis[0].NamaPenulis);

            bw.close();

            System.out.println("Data berhasil disimpan ke file");
        }catch(Exception e){
            System.out.println("Error simpan file: " + e.getMessage());
        }
    }

    double hitungRoyalti(double hargaBuku){
        return hargaBuku * 0.1;
    }

    double hitungRoyalti(double hargaBuku, double persen){
        return hargaBuku * (persen / 100);
    }
}