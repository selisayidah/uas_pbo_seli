public class Buku {
    String judul,penulis;
    int tahunTerbit,jmlHalaman;
  
    public Buku(String judul, String penulis, int tahunTerbit, int jmlHalaman){
      this.judul = judul;
      this.penulis = penulis;
      this.tahunTerbit = tahunTerbit;
      this.jmlHalaman = jmlHalaman;
    }
  
    public void tambahHalaman(int jmlHalaman){
      this.jmlHalaman += jmlHalaman;
    }
  
    public void tampilInformasi() {
      System.out.println("Informasi Buku:");
      System.out.println("Judul Buku: " + judul);
      System.out.println("Penulis: " + penulis);
      System.out.println("Tahun Terbit: " + tahunTerbit);
      System.out.println("Jumlah Halaman: " + jmlHalaman);
  }
  public static void main(String[] args) {
    Buku buku1 = new Buku("CantikItuLuka","EkaKurniawan",2002,481);
  
    buku1.tampilInformasi();
    buku1.tampilInformasi();
  
  
  
    
  }
  }