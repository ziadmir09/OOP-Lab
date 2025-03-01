public class Vehicle {
    protected String brand = "Ford";
    public void honk(){
        System.out.println("TUT TUT");
    }
}

class Car extends Vehicle{
    private String modelNAme = "Mustang";

    public static void main(String[] args){
        Car c1 = new Car();
        c1.honk();
        System.out.println(c1.brand + c1.modelNAme);
    }
}
