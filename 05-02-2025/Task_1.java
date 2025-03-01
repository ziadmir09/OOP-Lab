class Static_Var{


        static int sum(int a, int b){
            return a+b;
        }
        static int sum(int a, int b, int c){
            return a+b;
        }
        static double sum(double a, double b){
            return a+b;
        }
        static double sum(double a, double b, double c){
            return a+b;
        }
        static String sum(String a, String b){
            return a+"+"+b;
        }
        static String sum(String a, String b, String c){
            return a+"+"+b+"+"+c;
        }

    public static void main(String[] args) {
        System.out.println("Enter Parameters: ");
        System.out.println(sum(5.0,6.0));
    }

}