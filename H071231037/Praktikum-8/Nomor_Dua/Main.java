package Nomor_Dua;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("|| Text To Type || ");
        System.out.println( typeRacer.getWordstoType() );

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Bot Mansur", 80, typeRacer);
        typers[1] = new Typer("Bot Toku", 70, typeRacer);
        typers[2] = new Typer("Bot Yukiao", 50, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }
}
