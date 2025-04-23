package Controllers;
import Models.Book;
public class sortByBoobleSort {

    public void sortByNameDes(Book[] books){
        for(int i=0; i<books.length; i++){
            for(int j=i+1; j<books.length - 1; j++){
                Book aux=books[i];
                if (books[i].getName()){
                    books[i]=books[j];
                    books[j]=aux;
                }

            }

        }

    }
    
}
