public class Person {
    private String Name;
    private int age;
    Person(){
        System.out.print("This is a Constructor");
    }
    Person(String name){
        System.out.print("This constructor: " + name);
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        this.Name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }


}