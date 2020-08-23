package basic;

/**
 * <p>
 *
 * </p>
 *
 * @author goinhn
 * @version 1.0.0
 * @date 2020/8/1 17:41
 */
public class ThreadTest extends Thread{

    @Override
    public void run() {
        int count = 1000;
        while(count > 0) {
            System.out.println(Thread.currentThread().getName() + count);
            count--;
        }
    }

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
    }
}
