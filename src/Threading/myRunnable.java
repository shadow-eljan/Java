package Threading;

public class myRunnable implements Runnable{

    @Override
    public void run(){
        for(int i=1; i<=5; i++){

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread was Interrupted.");
            }
            if (i==5){
                System.out.println("\nTimes up.");
                System.exit(0);
            }
        }
    }
}
