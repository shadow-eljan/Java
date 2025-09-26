package loops;

public class useBreak {
    public static void main(String[] args) {
        //BREAK = STOP LOOP
        //CONTINUE = SKIP THE LOOP ITERATION

        int i = 0;

        for (  i = 10; i>0 ; i--){
            if(i==5){
                break;
            }else if(i == 9){
                System.out.println("We skipped loop number "+ i);
                continue;
            }
            System.out.println(i);
        }
        System.out.println("We broke the loop at " + i);
    }
}
