package Array;

public class variableArrays {
    public static void main(String[] args) {

        //VARARGS = ALLOWS A METHOD TO ACCEPT VARYING NUMBER OF ARGUMENTS


        System.out.println(add(1, 2, 3, 4));
        System.out.println(average(1));
    }
    static int add(int... numbers){
        int sum = 0;

        for(int num: numbers){
            sum += num;
        }
        return sum;

    }
    static double average(double... Numbers){
        double sum =0;
        if(Numbers.length == 0){
            return 0;
        }

        for(double num: Numbers){
            sum+= num;
        }
        return sum/Numbers.length;
    }
}
