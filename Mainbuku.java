package Nabil;

//buat class terlebih dahulu
public class Mainbuku {

    // lalu buat lah psvm sebagai code yang akan membuat file ini bisa menampikan output atau bisa kita run

    public static void main(String[] args) {

        //lalu disini kita memanggil file class yang sudah kita buat sebelum nya
        Buku pinjam= new Buku ();

        //lalu pada tahap ini kita memanggil data method di class sebelumnya/ class buku , lalu mengimput data agar
        //bisa ditampilkan ketika kita run data yang dimput ada lah method yang void sedangkan non void kita hanya memanggil dengan parameter kosong

        pinjam.Batasbuku();
        pinjam.setInfobuku("BICARA ITU ADA SENINYA","SELF IMPROVEMENT","OH SU HYANG",
                "GRAMEDIA",238,2016,16);
        pinjam.TotalPeminjamanbuku();
        pinjam.Bataspinjam();
        pinjam.lokasipeminjaman();
        pinjam.identitaspeminjaman("M.NABIL DAWAMI");
        pinjam.detailpeminjaman(7,"JUMAT",17,3,
                2023,19);

    }
    //jangan lupa diakhiri tanda kurung kurawal sebagai penutup, lalu di run
}
