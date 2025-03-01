import java.util.Scanner;

public class Person {
    String fname;
    String lname;
    int age;
    void insert(String a,String b,int c){
        fname=a; lname=b; age=c;
    }
    void display(){
        System.out.println(fname +" "+ lname +" "+ age);
    }
    public static void main(String[] args){
        Person p1 = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        p1.fname=sc.nextLine();
        System.out.print("Enter your last name: ");
        p1.lname=sc.nextLine();
        System.out.print("Enter your age: ");
        p1.age=sc.nextInt();
        p1.display();
        p1.insert(p1.fname,p1.lname,p1.age);






    }
}
