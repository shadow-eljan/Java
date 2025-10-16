package Threading;

public class myRunnableTwo implements Runnable{

    private final String text;

    myRunnableTwo(String text){
        this.text = text;
    }


    @Override
    public void run(){
        for (int i=1; i<=5; i++){
            try{
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " " + text);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }

        }
    }
}
