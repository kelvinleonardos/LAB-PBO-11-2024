package LAB_PBO_2024.Praktikum.Praktikum_06;

abstract class Dog implements Move {
    int position, averageLength;

    Dog (int position, int averageLength) {
        this.position = position;
        this.averageLength = averageLength;
    }

    abstract void Describe();
}

