
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BookReport {
    public static void main(String[] args) throws FileNotFoundException {
        BookDA book = new BookDA();
        AuthorDA Author1= new AuthorDA();
        Author author = new Author();

        HashMap<String, Book> bookMap = book.getBookMap();
        HashMap<String, Author> authorMap = Author1.getAuthorMap();


        for(Map.Entry<String, Book> bookEntry : bookMap.entrySet()){
            System.out.println(bookEntry.getValue().getIsbn() + " " + bookEntry.getValue().getTitle());
            System.out.println(authorEntry.getValue().getName() + " " + authorEntry.getValue().getBio());

            }
        }
    }
