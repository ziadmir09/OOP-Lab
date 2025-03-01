class Book {
    String Title;
    String Author;
    int Price;

    Book(){
        Title = "Harry";
        Author = "JKR";
        Price = 1850;
    }

    Book(String title, String author){
        Title = title;
        Author = author;
    }
    Book(String title, String author, int price){
        Title = title;
        Author = author;
        Price = price;
    }

    public static void main(String[] args) {
        Book Obj1 = new Book("Himu", "HM");
        Book Obj2 = new Book("Boltu", "HM", 920);
        Book Obj3 = new Book();

        System.out.println(Obj1.Title+" "+ Obj1.Author);
        System.out.println(Obj2.Title +" "+Obj2.Author+" "+ Obj2.Price);
        System.out.println(Obj3.Title +" "+Obj3.Author+" "+ Obj3.Price);


    }
}