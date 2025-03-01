import java.util.Scanner;

public class Employee {
    String Name;
    String Job_Title;
    int Salary;
    void Display(){
        System.out.println(Name +" "+ Job_Title +" "+ Salary);
    }
    void incrementSalary(int a){
        Salary=a;
        System.out.println("Incremented Salary: " + (Salary+5000) );
    }
    void calculateYearlySalary(int a){
        Salary=a;
        System.out.println("Yearly Salary: " + (Salary*12) );
    }
    public static void main(String[] args){
        Employee e1 = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        e1.Name=sc.nextLine();
        System.out.print("Enter your Job Title: ");
        e1.Job_Title=sc.nextLine();
        System.out.print("Enter your Salary: ");
        e1.Salary=sc.nextInt();

        e1.Display();
        e1.incrementSalary(e1.Salary);
        e1.calculateYearlySalary(e1.Salary);

    }
}
