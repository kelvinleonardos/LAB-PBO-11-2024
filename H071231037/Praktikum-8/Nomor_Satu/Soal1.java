
import java.util.Random;


class TaskTimeHelper {
    private static final Random random = new Random();

    public static int getRandomExecutionTime() {
        return random.nextInt(6) + 1;
    }
}

class Soal01 {
     static int dataLoadedCount = 0;
     static int dataFailedCount = 0;
     static boolean isSuccess = true;
     static long startTime;
     static int data = 4; // tugas
     static long time;

    static Runnable uiThread = new Runnable() {
        @Override
        public void run() {
            startTime = System.currentTimeMillis();
            while (true) {
                time = (System.currentTimeMillis() - startTime) / 1000;
                if (time > 0) {
                    System.out.println("Loading... (" + time + "s)");
                    if (!isSuccess) {
                        System.out.println("Request Timeout");
                    }
                    if (dataLoadedCount + dataFailedCount == data) {
                        System.out.println();
                        System.out.println("Task Finish.");
                        System.out.println("Time Execution : " + time + "s");
                        if (dataFailedCount > 0) {
                            System.out.println(dataLoadedCount + " Data Succesfully loaded & " + dataFailedCount
                                    + " Data failed to load");
                        } else {
                            System.out.println("All data is successfully loaded");
                        }
                        break;
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };

    static Runnable backgroundThread = new Runnable() {
        public void run() {
            int executionTime = TaskTimeHelper.getRandomExecutionTime();
            
            try {
                if (executionTime > 4) {
                    Thread.sleep(5000);
                    
                    isSuccess = false;
                } else {
                    Thread.sleep(executionTime * 1000);
                    isSuccess = true;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Soal01.class) {
                if (isSuccess) {
                    dataLoadedCount++;
                } else {
                    dataFailedCount++;
                }
            }
        }
    };

}




