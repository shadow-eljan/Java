package Practise;

public class Time2 implements Runnable{
    @Override
    public void run(){

        for(int i =0; i<5; i++){
            try{
                Thread.sleep(1000);
//                System.out.println(Thread.currentThread()+ " :" + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(i==4){
                System.out.println("\nTime Out");
                System.exit(0);
            }
        }
    }
}
