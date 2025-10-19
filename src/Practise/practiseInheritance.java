package Practise;

public class practiseInheritance {

    //Getter, Setter, Constructor, Super, Overriding, toString(), Inheritance,

    String Manhwa;
    String MainLead;

    practiseInheritance(String Manhwa, String MC){
        this.Manhwa = Manhwa;
        this.MainLead = MC;
    }
     void dance(){
        System.out.println("I Dance.");
    }
    void sing(){
        System.out.println("I sing");
    }

    public static void main(String[] args) {
        inheritanceTwo two = new inheritanceTwo("Greatest Estate Developer", "Lloyd Fontera", 10.00);

        two.setRating(100.00);
        two.Info();
        System.out.println(two.getRating());
        System.out.println(two);


    }
}
