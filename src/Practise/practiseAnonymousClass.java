package Practise;

public class practiseAnonymousClass {
    public static void main(String[] args) {

        practiseEnum prac = new practiseEnum();
        practiseEnum prac2 = new practiseEnum(){
            @Override
            public void speak(){
                System.out.println("We speak.");
            }
        };

        prac.speak();
        prac2.speak();
    }
}
