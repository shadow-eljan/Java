package loops;

public class nestedLoop {
    public static void main(String[] args) {

        //NESTED LOOP = LOOP INSIDE ANOTHER LOOP

        for(int i = 1; i<=10; i++){
            for(int j=1; j < 5; j++){
                System.out.println("\nI "+i);
                System.out.println("J " + j);
            }
        }
    }
}
