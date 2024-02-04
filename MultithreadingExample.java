public class MultithreadingExample{
    public static void main(String args[]){
        MultithreadingExample me = new MultithreadingExample();
        MyThread1 t1 = me.new MyThread1();
        t1.start();
        MyThread2 t2 = me.new MyThread2();   
        t2.start();
    }

    public class MyThread1 extends Thread{
    public void run()
        {
            for(int i = 1;i <= 5;i++)
            {
                System.out.println("thread 1 Count : "+i);
                try {
                    sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
    public class MyThread2 extends Thread{
    public void run()
        {
            for(int i = 1;i <= 5;i++)
            {
                System.out.println("thread 2 Count : "+i);
                try {
                    sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}