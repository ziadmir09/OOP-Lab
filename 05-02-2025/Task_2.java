class Ovl{
     int sum(int a, int b){
        return a+b;
    }
     int sum(int a, int b, int c){
        return a+b;
    }
     double sum(double a, double b){
        return a+b;
    }
     double sum(double a, double b, double c){
        return a+b;
    }
     String sum(String a, String b){
        return a+"+"+b;
    }
     String sum(String a, String b, String c){
        return a+"+"+b+"+"+c;
    }

    public static void main(String[] args){
         Ovl O1 = new Ovl();
         //Return type storing in a variable
         int a= O1.sum(5,6);
         System.out.println(a);
         //retrun type printing directly
        System.out.println(O1.sum("H","M"));

    }
}