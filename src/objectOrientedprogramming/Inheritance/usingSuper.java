package objectOrientedprogramming.Inheritance;

public class usingSuper {
    public static void main(String[] args) {

        //SUPER = refers to parent class (subclass <- superclass)
        // Used in constructors and method overwriting
        // Calls the parent constructor to initialize attributes


        subClass sub = new subClass("Lloyd", "Fontera");

        sub.showInfo();

        subSuper subsuper = new subSuper("Javier", "Something", 9000);

        subsuper.showgpa();

    }
}
