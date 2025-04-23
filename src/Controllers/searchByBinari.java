package Controllers;
import Models.Book;
public class searchByBinari {
    
    public Book searchByName(Book[] books, String name){
        int inicio=0;
        int fin=books.length-inicio;
        while(inicio<fin){
            int medio=(fin-inicio)/2;
            if(books[medio].getName().equalsIgnoreCase(name)){
                return books[medio];
            } else if(books[medio].getName().compareTo(name) = 1){
                inicio+=1;
            }
            else{
                fin-=1;
            }
            return null;
            }
        }
    }
