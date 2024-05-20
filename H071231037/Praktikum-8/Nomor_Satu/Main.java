import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main extends Soal01{

public static void main(String[] args) {
    int backgroundThreads = 1; // pekerja
    int uiThreads = 1;
    ExecutorService executorForBackgroundThread = Executors.newFixedThreadPool(backgroundThreads);
    ExecutorService executorForUIThread = Executors.newFixedThreadPool(uiThreads);

    System.out.println("Start load " + data + " Data");

    executorForUIThread.execute(uiThread);
    for (int i = 0; i < data; i++) {
        executorForBackgroundThread.execute(backgroundThread);
    }
    executorForBackgroundThread.shutdown();
    executorForUIThread.shutdown();
    }
}
    

