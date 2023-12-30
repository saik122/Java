package MultiThreading;
// creating multiple threads

class Multithread extends Thread {
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            try{
            Thread.sleep(3000);
                System.out.println(i);
            }
            catch(Exception e) {
                System.out.println(e);
            }
            }
        }
}
class MultiDemo{
    public static void main(String[] args) {
        Multithread m1=new Multithread();
        Multithread m2=new Multithread();
        Multithread m3=new Multithread();
        Thread t1=new Thread(m1);
        Thread t2=new Thread(m2);
        Thread t3=new Thread(m3);
       t1.start();
       t2.start();
       t3.start();

    }

}
