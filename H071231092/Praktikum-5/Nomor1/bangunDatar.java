package LAB_PBO_2024.Praktikum.Praktikum_05.Nomor1;

public class bangunDatar {
    double sisi, panjang, lebar, jari2, tinggi;

    double jumlahLuas() {
        return 0;
    }

    double jumlahKeliling() {
        return 0;
    }
}

class persegi extends bangunDatar {
    
    persegi(double sisi) {
        this.sisi = sisi;
    }

    double jumlahLuas() {
        return sisi * sisi;
    }

    double jumlahKeliling() {
        return 4 * sisi;
    }
}

class persegiPanjang extends bangunDatar {

    persegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double jumlahLuas() {
        return panjang * lebar;
    }

    double jumlahKeliling() {
        return 2 * (panjang + lebar);
    }
}

class Lingkaran extends bangunDatar {
    
    Lingkaran(double jari2)  {
        this.jari2 = jari2;
    }

    double jumlahLuas() {
        return Math.PI * jari2 * jari2;
    }

    double jumlahKeliling() {
        return 2 * Math.PI * jari2;
    }
}

class trapesium extends bangunDatar {
    double sisi1, sisi2, sisi3, sisi4;

    trapesium(double sisi1, double sisi2, double sisi3, double sisi4, double tinggi) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
        this.sisi4 = sisi4;
        this.tinggi = tinggi;
    }

    double jumlahLuas() {
        return ((sisi1 + sisi2) * tinggi);
    }

    double jumlahKeliling() {
        return sisi1 + sisi2 + sisi3 + sisi4;
    }
}
