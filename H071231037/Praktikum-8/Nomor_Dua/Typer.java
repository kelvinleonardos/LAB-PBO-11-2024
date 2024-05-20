package Nomor_Dua;

public class Typer extends Thread {
    private String botName;
    private String wordsTyped;
    private double wpm;
    private TypeRacer typeRacer;

    public Typer(String botName, double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wordsTyped = "";
        this.wpm = wpm;
        this.typeRacer = typeRacer;
    }

    public String getBotName() {
        return botName;
    }

    public String getWordsTyped() {
        return wordsTyped;
    }

    public void addWordTyped(String newWordsTyped) {
        this.wordsTyped += newWordsTyped + " ";
    }

    public double getWpm() {
        return wpm;
    }

    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordstoType().split(" ");
        int howLongToType = (int) (60000 / wpm); 

        long startTime = System.currentTimeMillis();

        for (String word : wordsToType) {
            try {
                Thread.sleep(howLongToType);
                this.addWordTyped(word);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.addWordTyped("Selesai.");

        long finishTime = System.currentTimeMillis();
        long totalTime =  (finishTime - startTime) / 1000; 

        typeRacer.addResult(this);
    }
}
