package Nabil;

// buatlah sebuah class dengan nama buku dan masukkan variabel serta tipe data
public class Buku {

    String Judulbuku;
    String Kategori;
    String pengarang;
    String penerbit;
    int jumlahhalaman;
    int tahunTerbit;
    int minimalusiapembaca;
    int jangkapinjam;
    String namapeminjam;
    String haripeminjaman;
    int tanggalpeminjaman;
    int bulanpeminjaman;
    int tahunpeminjaman;
    int usiapeminjam;

    //setelah itu saya membuat 4 construktor ,tanpa parameter 1 buah,dan dengan parameter ada 3 buah.

    Buku(){
    }
    Buku (String namapeminjam){
    }
    Buku (String judulbuku,String kategori,String pengarang,String penerbit,int jumlahhalaman,int tahunTerbit,
          int minimalusiapembaca) {
    }
    Buku (int jangkapinjam,String haripeminjaman, int tanggalpeminjaman,int bulanpeminjaman,
          int tahunpeminjaman,int usiapeminjam){
    }

    //lalu buatlah method yang dimana ada dua jenis yaitu void dan non void disini saya membuat ada 7 method


    //Method pertama ini method void sebab kita akan membuat beberapa info buku yang menjadi patokan kita
    void setInfobuku (String judulbuku,String kategori,String pengarang,String penerbit,int jumlahhalaman,int tahunTerbit,
                      int minimalusiapembaca ) {
        System.out.println("JUDUL BUKU                \t        : " + judulbuku);
        System.out.println("JUDUL KATEGORI            \t        : " + kategori);
        System.out.println("JUDUL PENGARANG           \t        : " + pengarang);
        System.out.println("JUDUL PENERBIT            \t        : " + penerbit);
        System.out.println("JUDUL JUMLAH HALAMAN      \t        : " + jumlahhalaman + " Halaman");
        System.out.println("JUDUL TAHUN TERBIT        \t        : " + tahunTerbit);
        System.out.println("JUDUL MINIMAL USIA PEMBACA\t        : " + minimalusiapembaca + " Tahun");
    }

    //selanjutnya  ada empat buah method non-void disini kita tidak menggunkan parameter dan kita langsung mengimput data yang ingin kita gunakan

    String lokasipeminjaman(){
        String  infolokasipeminjaman = "LOKASI PEMINJAMAN  \t                : Perpustakaan UIN SUSKA RIAU. ";
        System.out.println(infolokasipeminjaman);
        return infolokasipeminjaman;
    }

    String Batasbuku(){
        String  Pembatasbuku = "====================== IDENTITAS BUKU =========================";
        System.out.println(Pembatasbuku);
        return Pembatasbuku;
    }

    String Bataspinjam() {
        String Pembataspinjam = "================== IDENTITAS PEMINJAM BUKU ===========================";
        System.out.println(Pembataspinjam);
        return Pembataspinjam;
    }

    int TotalPeminjamanbuku(){
        int jumlahorangmeminjambuku= 5600;
        System.out.println("JUMLAH PEMINJAM BUKU    \t        : " + jumlahorangmeminjambuku + " Orang");
        return  jumlahorangmeminjambuku;
    }
    void identitaspeminjaman (String namapeminjam) {
        System.out.println("NAMA PEMINJAM BUKU          \t    : " + namapeminjam);
    }

    //selanjutnya kembali lagi di method void tapi disini saya mengkolaborasikan data yang akan kita input
    // di mainbuku nantik akan muncul sebaris tidak berkemlopok
    void detailpeminjaman (int jangkapinjam, String haripeminjaman, int tanggalpeminjaman,int bulanpeminjaman,
                           int tahunpeminjaman,int usiapeminjam) {
        System.out.println("JANGKA PEMINJAMAN BUKU  \t        : " + jangkapinjam   + " Hari");
        System.out.println("WAKTU PEMINJAMAN BUKU   \t        : " + haripeminjaman + "/"  + tanggalpeminjaman + "," + bulanpeminjaman + "," +tahunpeminjaman );
        System.out.println("USIA PEMINJAM BUKU      \t        : " + usiapeminjam   + " Tahun");
        System.out.print( haripeminjaman );
        System.out.print( tanggalpeminjaman);
        System.out.print( bulanpeminjaman);
        System.out.print( tahunpeminjaman);
    }


}


