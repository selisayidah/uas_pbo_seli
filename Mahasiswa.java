public class Mahasiswa {
  String nama,NIM,jurusan;
  float IPK;

  public Mahasiswa(String nama, String NIM, String jurusan, float IPK){
    this.nama = nama;
    this.NIM = NIM;
    this.jurusan = jurusan;
    this.IPK = IPK;
  }

  public void ubahNama(String nama){
    this.nama = nama;
  }

  public void tampilInformasi() {
    System.out.println("Informasi Mahasiswa:");
    System.out.println("Nama Mahasiswa: " + nama);
    System.out.println("NIM: " + NIM);
    System.out.println("Jurusan: " + jurusan);
    System.out.println("IPK: " + IPK);
}
public static void main(String[] args) {
  Mahasiswa mahasiswa1 = new Mahasiswa("SeliSayidah","C2083207029","PTI",3.52f);

  mahasiswa1.tampilInformasi();
  mahasiswa1.tampilInformasi();



  
}
}