import java.awt.*;

public class Worker extends Thread {
    @Override
    public void run() {
        while (true) {

            Toolkit.getDefaultToolkit().beep();
            try {
                Thread.sleep(120000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}
