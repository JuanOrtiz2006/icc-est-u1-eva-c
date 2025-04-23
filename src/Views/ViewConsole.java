package Views;
import Models.Book;
public class ViewConsole {

    public void printBooks(Book[] books){
        for (int i=0; i<books.length; i++){
            System.out.print(books[i] + " ");
        }
    } 
}
