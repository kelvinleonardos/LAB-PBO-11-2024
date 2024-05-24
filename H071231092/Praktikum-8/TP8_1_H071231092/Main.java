package TP8_1_H071231092;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        String[] dataSources = {
            "source1",
            "source2",
            "source3",
            "source4",
            "source5"
        };

        PemuatDataThread[] pemuatDataThreads = new PemuatDataThread[dataSources.length];
        ExecutorService executor = Executors.newFixedThreadPool(7);

        for (int i = 0; i < dataSources.length; i++) {
            pemuatDataThreads [i] = new PemuatDataThread(dataSources[i]);
            executor.submit(pemuatDataThreads[i]);
        }

        UIThread uiThread = new UIThread(pemuatDataThreads);
        uiThread.start();

        executor.shutdown();
    }
}
