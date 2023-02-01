package class17.homework;

public class Book {
    ///*
    //6) Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed*/

    String title;

    int pages;


    Book(String ttitle, int ppages) {

        title = ttitle;
        pages = ppages;

    }

  void printInfo(){
      System.out.println("The title of the book is: "+title+" the total number of its pages is: "+pages);
  }

    public static void main(String[] args) {
        Book book=new Book("The blue nile", 344);
book.printInfo();
    }
}
