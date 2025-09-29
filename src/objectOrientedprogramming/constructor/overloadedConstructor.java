package objectOrientedprogramming.constructor;

public class overloadedConstructor {

    //OVERLOADED CONSTRUCTOR = Allow a class to have multiple
    // constructors with different parameter lists.

    public static void main(String[] args) {
        User user1 = new User("Eljan Rai");

        User user2 = new User("Eljan Rai",
                "dummy123@gmail.com");

        User user3 = new User("Eljan Rai",
                "dummy123@gmail.com", 20);
        User user4 = new User();


        System.out.println("Single data");
        user1.showInfo();

        System.out.println("\n2 Data");
        user2.showInfo();

        System.out.println("\nall data");
        user3.showInfo();

        System.out.println("\nNo data");
        user4.showInfo();

    }


}
