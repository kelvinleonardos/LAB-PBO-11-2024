public class Keluarga {
    String jumlahAnak;

    public Keluarga(String jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public void Status (){
        System.out.println("Status : " + jumlahAnak);
    }

    public String getJumlahAnak() {
        return jumlahAnak;
    }
}
