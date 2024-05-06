abstract class Dog {
    int posision;
    int averageLength;

    public Dog(int posision, int averageLength) {
        this.posision = posision;
        this.averageLength = averageLength;
    }

    public int getPosision(){
        return this.posision;
    }

    abstract void move();
    abstract void descibe();
}