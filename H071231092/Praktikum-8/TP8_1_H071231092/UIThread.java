package TP8_1_H071231092;

public class UIThread extends Thread {
    private final PemuatDataThread[] pemuatDataThreads;
    private final int totalTasks;

    public UIThread(PemuatDataThread[] pemuatDataThreads) {
        this.pemuatDataThreads = pemuatDataThreads;
        this.totalTasks = pemuatDataThreads.length;
    }

    @Override
    public void run() {
        System.out.println("Start load " + totalTasks + " Data");
        int waktuBerlalu = 0;

        while (true) {
            int completedTasks = 0;
            int failedTasks = 0;
            int successTasks = 0;

            for (PemuatDataThread pemuatDataThread : pemuatDataThreads) {
                if (pemuatDataThread.isCompleted()) {
                    if (pemuatDataThread.isSuccess()) {
                        successTasks++;
                    } else {
                        failedTasks++;
                    }
                    completedTasks++;
                }
            }

            if (completedTasks == totalTasks) {
                System.out.println("\nTask Finish.");
                System.out.println("Time Execution : " + waktuBerlalu  + "s");
                if (failedTasks >= 1) {
                    System.out.println(successTasks + " Data Sucessfully & " + failedTasks + " Data failed to load.");
                    break;
                } else {
                    System.out.println("All data is successfully loaded");
                    break;
                }
                
            } else {
                System.out.println("Loading... (" + (waktuBerlalu + 1) + "s)");
            }

            try {
                Thread.sleep(1000);
                waktuBerlalu++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            } 
        }
    }
}
