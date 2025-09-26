package methods;

public class method1 {
    public static void main(String[] args) {

        //METHOD = REUSABLE CODE THAT EXECUTES WHEN CALLED
        // PARAMETERS = RECERIVER FOR ARGUMENTS
        // ARGUMENTS = DATA SENT FROM ONE METHOD TO ANOTHER METHOD

        String name = "Eljan";
        int age = 20 ;

        birthday(name, age);

    }
    static void birthday(String name, int age){
        System.out.printf("Happy Birthday %s.\n" , name);
        System.out.println("You are " + age +" years old.");
    }

}
