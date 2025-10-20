package Practise;

public class Products<U, T> {
    U item;
    T price;

    Products(U item, T price){
        this.item = item;
        this.price= price;
    }

    public T getPrice() {
        return this.price;
    }
    public U getItem(){
        return this.item;
    }
}
