package Array;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        //2D ARRAY = AN ARRAY WHERE EACH ELEMENT IS AN ARRAY

        String[] fruits = {"apple", "banana", "mango"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "buff", "pork"};

        String[][] groceries = {fruits, vegetables, meats};

        groceries[1][0]="apple";

        for(String[] foods: groceries){
            for(String food: foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
