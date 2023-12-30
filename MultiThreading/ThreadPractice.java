package MultiThreading;

public class ThreadPractice  extends Thread {
    @Override
    public void run() {
        System.out.println("run method is excuted by jvm");
    }

    public static void main(String[] args) {
        ThreadPractice obj=new ThreadPractice();
        Thread t=new Thread(obj);
        t.start();
    }
}
