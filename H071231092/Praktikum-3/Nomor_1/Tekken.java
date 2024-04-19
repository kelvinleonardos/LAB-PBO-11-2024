package LAB_PBO_2024.Praktikum.Praktikum_03.Nomor_1;

class Tekken {
    String name;
    Move move = new Move();
    int health = 100;
    double positions;

    public Tekken() {
    }

    public Tekken(String name) {
        this.name = name;
    }

    public Tekken(String name, String moveName) {
        this.name = name;
        this.move.setName(moveName);
    }

    public Tekken(String name, String moveName, int moveDamage) {
        this.name = name;
        this.move.setName(moveName);
        this.move.setDamage(moveDamage);
    }

    public Tekken(String name, double positions) {
        this.name = name;
        this.positions = positions;
    }

    public Tekken(String name, String moveName, int moveDamage, double positions) {
        this.name = name;
        this.move.setName(moveName);
        this.move.setDamage(moveDamage);
        this.positions = positions;
    }

    public Tekken(String name, String moveName, int moveDamage, int health, double positions) {
        this.name = name;
        this.move.setName(moveName);
        this.move.setDamage(moveDamage);
        this.health = health;
        this.positions = positions;
    }

    public void checkStatus() {
        System.out.println("===== Fighter's Status =====");
        System.out.println("Name            : " + this.getName());
        System.out.println("Move Name       : " + this.getMove().getName());
        System.out.println("Move Damage     : " + this.getMove().getDamage());
        System.out.println("Health          : " + this.getHealth());
        System.out.println("Coordinate      : " + this.getPositions());
    }

    public void Bergerak(double positions) {
        this.setPositions(positions);
        System.out.printf("%s is moving towards positions: %.1f \n", this.getName(), positions);
    }

    public void upgradeMove(String name, int damage) {
        this.move.setName(name);
        this.move.setDamage(damage);
        System.out.printf("%s has upgraded their move to %s with %d damage \n", this.getName(), name, damage);
    }

    public void attack(Tekken enemy) {
        if (this.getPositions() == enemy.getPositions()) {
            enemy.health -= this.move.getDamage();
            System.out.printf("%s attacks %s with %s ... \n", this.getName(), enemy.getName(), this.move.getName());
    
            if (enemy.getHealth() <= 0) {
                System.out.printf("%s has defeated %s \n", this.getName(), enemy.getName());
            }
        } else {
            System.out.printf("%s and %s are in different positions. The attack misses! \n", this.getName(), enemy.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getPositions() {
        return positions;
    }

    public void setPositions(double positions) {
        this.positions = positions;
    }
}
