import java.util.Random;

class EvenTask implements Runnable {
    public int x;

    public EvenTask(int x) {
        this.x = x;
    }

    public void run() {
        System.out.println("New Thread " + x + " is EVEN and Square of " + x + " is: " + x * x);
    }
}

class OddTask implements Runnable {
    public int x;

    public OddTask(int x) {
        this.x = x;
    }

    public void run() {
        System.out.println("New Thread " + x + " is ODD and Cube of " + x + " is: " + x * x * x);
    }
}

class GeneratorThread extends Thread {
    public void run() {
        int num;
        Random r = new Random();
        try {
            for (int i = 0; i < 5; i++) {
                num = r.nextInt(100);
                System.out.println("Main Thread and Generated Number is " + num);
                if (num % 2 == 0) {
                    Thread t1 = new Thread(new EvenTask(num));
                    t1.start();
                } else {
                    Thread t2 = new Thread(new OddTask(num));
                    t2.start();
                }
                Thread.sleep(1000);
                System.out.println(" ");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

public class ThreadProgram {
    public static void main(String[] args) {
        GeneratorThread g = new GeneratorThread();
        g.start();
    }
}
