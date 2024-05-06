package LAB_PBO_2024.Praktikum.Praktikum_05.Nomor1;

public class bangunRuang {
    double sisi, panjang, lebar, jari2, tinggi;

    double jumlahLuasPermukaan() {
        return 0;
    }

    double jumlahVolume() {
        return 0;
    }
}

class kubus extends bangunRuang {

    kubus(double sisi) {
        this.sisi = sisi;
    }

    double jumlahLuasPermukaan() {
        return 6 * sisi * sisi;
    }

    double jumlahVolume() {
        return sisi * sisi * sisi;
    }
}

class balok extends bangunRuang {
    
    balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    double jumlahLuasPermukaan() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    double jumlahVolume() {
        return panjang * lebar * tinggi;
    }
}

class bola extends bangunRuang {

    bola(double jari2) {
        this.jari2 = jari2;
    }

    double jumlahLuasPermukaan() {
        return 4 * Math.PI * jari2 * jari2;
    }

    double jumlahVolume() {
        return (4 * Math.PI * jari2 * jari2 * jari2) / 3;
    }
}

class tabung extends bangunRuang {

    tabung(double jari2, double tinggi) {
        this.jari2 = jari2;
        this.tinggi = tinggi;
    }

    double jumlahLuasPermukaan() {
        return 2 * Math.PI * jari2 * (jari2 + tinggi);
    }

    double jumlahVolume() {
        return Math.PI * jari2 * jari2 * tinggi;
    }
}
