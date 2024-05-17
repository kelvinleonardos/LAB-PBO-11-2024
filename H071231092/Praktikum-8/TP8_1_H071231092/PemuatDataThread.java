package TP8_1_H071231092;

public class PemuatDataThread extends Thread {
    private final String dataSource;
    private boolean success;
    private boolean completed;

    public PemuatDataThread(String dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void run() {
        int executionTime = TaskTimeHelper.getWaktuEksekusi();
        System.out.println("Loading data from " + dataSource + "(" + executionTime + "s)");

        try {
            Thread.sleep(executionTime * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (executionTime > 4) {
            System.out.println("Request Timeout");
            success = false;
        } else {
            success = true;
        }
        completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }

    public boolean isSuccess() {
        return success;
    }
}
