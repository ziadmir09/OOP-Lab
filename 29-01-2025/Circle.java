import java.util.Scanner;

public class Circle {
    double radius;
    double area;
    double circumference;
    void area(double a){
        radius=a;
        area=3.1416*a*a;
    }
    void circumference(double b){
        radius=b;
        circumference=2*3.1416*b;
    }
    void display(){
        System.out.println(area);
        System.out.println(circumference);
    }
    public static void main(String[] args){
        Circle c1 = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        c1.radius=sc.nextDouble();
        c1.area(c1.radius);
        c1.circumference(c1.radius);
        c1.display();

    }
}
