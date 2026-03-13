package ObjectOrientedProgramming;

public class Car {
    private String name;
    private int price;


    public Car () {};

    public Car(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    static void main(String[] args) {
        Car car = new Car();
        car.setName("AUDI");
        car.setPrice(200000);
        //System.out.println(car.name);
       //System.out.println(car.price);

        System.out.println(car.getName());
        System.out.println(car.getPrice());


    }
}
