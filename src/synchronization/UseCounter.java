package synchronization;

public class UseCounter {
    public static void main(String[] args) {
        Counter count = new Counter();
        Thread t1= new Thread(()-> {
            for (int i=0; i<10;i++) {
                System.out.println("T1");
                count.inc();
            }
        });
        Thread t2= new Thread(()-> {
            for (int i=0; i<10;i++) {
                System.out.println("T2");
                count.inc();
            }
        });
        System.out.println(count.get());
        try{
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Counter :"+ count.get());
    }
}
