class Kobokers {
    int healthKobokers;
    int attackKobokers;

    Kobokers(int attackKobokers, int healthKobokers) {
        this.attackKobokers = attackKobokers;
        this.healthKobokers = healthKobokers;
    }
}

class Kobokanaeru {
    private int subscriber;
    private int superChat;
    private Kobokers kobokers;
    private int totalLikes;
    private int health;
    private int attack;


    Kobokanaeru(int subscriber, int superChat, Kobokers kobokers, int totalLikes, int health, int attack) {
        this.subscriber = subscriber;
        this.superChat = superChat;
        this.kobokers = kobokers;
        this.totalLikes = totalLikes;
        this.health = health;
        this.attack = attack;
    }

    Kobokanaeru(int subscriber, int superChat, Kobokers kobokers, int totalLikes, int health) {
        this.subscriber = subscriber;
        this.superChat = superChat;
        this.kobokers = kobokers;
        this.totalLikes = totalLikes;
        this.health = health;
        this.attack = 100;
    }

    void saweran(int duitSaweran) {
        System.out.println("============================================");
        System.out.println("Terimakasih atas donasinya sebesar : " + duitSaweran);
        superChat += duitSaweran;
        
    }

    void subber(int subbed) {
        System.out.println("============================================");
        System.out.println("Terimakasih untuk subscribenya sebesar : " + subbed);
        subscriber += subbed;
    }

    void likers(int liked) {
        totalLikes += liked;
    }

    void showStatisctics() {
        System.out.println("============================================");
        System.out.println("Subscriber Kobokanaeru sekarang: " + subscriber);
        System.out.println("Duit kobo: " + superChat);
        System.out.println("Total like Kobokanaeru: " + totalLikes);
        System.out.println("============================================");
    }

    void requestBy1(int donasi) {
        int reqDonasi = 100000;
        if (donasi < reqDonasi) {
            System.out.println("============================================");
            System.out.println("Bukan donatur jangan ngatur ngntd");
            System.out.println("============================================");
        } else {
            System.out.println("============================================");
            System.out.println("Siap bang, apa sih yg gaboleh buat kamu");
            System.out.println("============================================");
        }
    }

    void pertarunganKobokers() {
        System.out.println("Kobokanaeru vs Kobokers");
        System.out.println("Kobokanaeru Health: " + this.health);
        System.out.println("Kobokers Health: " + kobokers.healthKobokers);
        System.out.println("============================================");

        while (this.health > 0 && kobokers.healthKobokers > 0) {
            System.out.println("Kobokanaeru menyerang Kobokers sebesar " + this.attack);
            kobokers.healthKobokers -= this.attack;
            if (kobokers.healthKobokers > 0) {
                System.out.println("Kobokers menyerang Kobokanaeru");
                health -= kobokers.attackKobokers;
            }
        }

        if (this.health <= 0) {
            System.out.println("Kobokers menang! Kobokanaeru telah kalah.");
        } else {
            System.out.println("Kobokanaeru menang! Kobokers telah kalah.");
        }
    }
}

public class TP3_1_H071231037 {

    public static void main(String[] args) {

        Kobokers kobokers = new Kobokers(100, 1000);
        Kobokanaeru kobokan = new Kobokanaeru(1000000, 1000, kobokers, 1000, 99999, 999999);
        Kobokanaeru kobokan2 = new Kobokanaeru(1000000, 1000, kobokers, 1000, 99999);

        kobokan.saweran(10000);
        kobokan.subber(1000);
        kobokan.likers(100);
        kobokan.requestBy1(100000);
        kobokan.showStatisctics();
        kobokan.pertarunganKobokers();
    }
}
