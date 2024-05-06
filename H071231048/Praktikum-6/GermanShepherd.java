public class GermanShepherd extends Dog{
    public GermanShepherd(int posision, int averageLength) {
        super(posision, averageLength);
    }
    public void move(){
        this.posision += 3;
    }
    public void descibe(){
        System.out.println("\n1.German Shepherd adalah anjing besar dengan tubuh yang berotot dan kuat. Mereka memiliki moncong yang panjang dan tajam, telinga yang tegak, dan mata yang cerdas serta ekspresif. ");
        System.out.println("\n2.Anjing ini cukup besar dengan tinggi di bahu antara 55-65 cm. Berat badan mereka berkisar antara 30-40 kg untuk jantan dan 22-32 kg untuk betina.");
        System.out.println("\n3.German Shepherd memiliki naluri penjaga yang kuat, sehingga pelatihan sosialisasi yang tepat sangat penting sejak usia dini.");
    }
}
