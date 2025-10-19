package Practise;

public class inheritanceTwo extends practiseInheritance{

    private double Rating;

    void dance(){
        System.out.println("We dance.");
    }

    inheritanceTwo(String Manhwa, String MainLead, double rate){
        super(Manhwa, MainLead);
        this.Rating = rate;
    }

    void Info(){
        System.out.println("Manhwa Name is : " + Manhwa);
        System.out.println("Main Character is : " + MainLead);
        System.out.println("Rating : " + this.Rating);
    }

    void setRating(double newRate){
        this.Rating = newRate;
    }

    double getRating(){
        return this.Rating;
    }

    @Override
    void sing(){
        System.out.println("We sing.");
    }

    public String toString(){
        return Manhwa + " "+ MainLead + " " + getRating();
    }

}
