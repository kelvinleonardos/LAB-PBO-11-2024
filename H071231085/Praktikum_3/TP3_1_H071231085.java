class UFC { 

    // 3 Atribut
    private String namaPetarung;
    private int damage;
    private boolean hasilTanding = false;

    // 2 Konstruktor
    public UFC(String namaPetarung, int damage) {
        this.namaPetarung = namaPetarung;
        this.damage = damage; // Default belum bertanding
    }

    // 2 Konstruktor
    public UFC(String namaPetarung) {
        this.namaPetarung = namaPetarung;
        this.damage = 0; // Default belum bertanding
    }

    // public UFC(String namaPetarung, int damage, boolean hasilTanding) {
    //     this.namaPetarung = namaPetarung;
    //     this.damage = damage;
    //     this.hasilTanding = hasilTanding;
    // }

    // 2 Method
    public void bertanding(UFC lawan) {
        // Rumus tanding
        if (this.damage > lawan.getDamage()) {
            this.hasilTanding = true;
            lawan.setHasilTanding(false);
        } else {
            this.hasilTanding = false;
            lawan.setHasilTanding(true);
        }

        System.out.println("Pertandingan antara " + this.namaPetarung + " vs " + lawan.getNamaPetarung() + "!");
        System.out.println(this.namaPetarung + " dengan damage " + this.damage + " bertanding melawan " +
               lawan.getNamaPetarung() + " dengan damage " + lawan.getDamage() + ".");

        if (this.hasilTanding) {
            System.out.println(this.namaPetarung + " MENANG!");
        } else {
            System.out.println(lawan.getNamaPetarung() + " MENANG!");
        }
    }

    public void setNamaPetarung(String namaPetarung) {
        this.namaPetarung = namaPetarung;
    }

    public String getNamaPetarung() {
        return namaPetarung;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setHasilTanding(boolean hasilTanding) {
        this.hasilTanding = hasilTanding;
    }

    public boolean isHasilTanding() {
        return hasilTanding;
    }
}

public class TP3_1_H071231085 {

    public static void main(String[] args) {
        UFC petarung1 = new UFC("Islam Makhachev", 100);
        UFC petarung2 = new UFC("Alexander Volkanovski", 50);

        petarung1.bertanding(petarung2);

        System.out.println("Nama: " + petarung1.getNamaPetarung());
        System.out.println("Damage: " + petarung1.getDamage());
        System.out.println("Hasil Tanding: " + (petarung1.isHasilTanding() ? "Menang" : "Kalah"));

        System.out.println();

        System.out.println("Nama: " + petarung2.getNamaPetarung());
        System.out.println("Damage: " + petarung2.getDamage());
        System.out.println("Hasil Tanding: " + (petarung2.isHasilTanding() ? "Menang" : "Kalah"));
    }
}