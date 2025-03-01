public class Employee {
    public int Id;
    public String Name;
    public String Joining_Date;

    public void display(){
        System.out.println(Id+" "+Name+" "+Joining_Date);
    }
}

class HR extends Employee{
    public double Salary;

    void displaySalary(){
        System.out.println(Salary);
    }

}
class SoftwareEngineer extends Employee{
    public double Salary;

    void displaySalary(){
        System.out.println(Salary);
    }

}
class Main{

    public static void main(String[] args){
        Employee E1 = new Employee();
        HR H1 = new HR();
        SoftwareEngineer S1 = new SoftwareEngineer();

        E1.Id = 20935; E1.Name="Ziad"; E1.Joining_Date="15/07/2001";
        E1.display();

        H1.Id = 20936; H1.Name="Mir"; H1.Joining_Date="16/07/2001"; H1.Salary=2500.00;
        H1.display(); H1.displaySalary();

        S1.Id = 20937; S1.Name="ZM"; S1.Joining_Date="16/09/2002"; S1.Salary=100000.00;
        S1.display(); S1.displaySalary();
    }
}


